package com.dataStructure.Array;
import java.util.Stack;

public class SpiralPrint {
    Stack<Integer> st = new Stack<>();

    public void printNormal(int[][] a){
        for(int i=0; i<a.length; i++){
            for(int j=0; j<a[i].length; j++){
                System.out.print(a[i][j]);
            }
            System.out.println("");
        }
    }

    public void printSpiral(int[][] a){
        int currentRow = 0;
        int currentCol = 0;
        int lengthRow = a.length-1;
        int lengthCol = a[0].length-1;

        while(currentRow < lengthRow && currentCol < lengthCol){
            for(int i= currentCol; i<=lengthCol; i++){
                System.out.print(a[currentRow][i]);
            }
            System.out.println("");
            ++currentRow;
            for(int i=currentRow; i<=lengthRow; i++){
                System.out.print(a[i][lengthCol]);
            }
            System.out.println("");
            --lengthCol;
            for(int i=lengthCol; i>=currentCol; i--){
                System.out.print(a[lengthRow][i]);
            }
            System.out.println("");
            --lengthRow;
            for(int i=lengthRow; i>=currentRow; i--){
                System.out.print(a[i][currentCol]);
            }
            ++currentCol;
            System.out.println("");
            //break;
        }
    }
    public void printSpiralRec(int[][] a){
        int startRow = 0;
        int endRow = a.length-1;
        int startCol = 0;
        int endCol = a[0].length-1;
        printSpiralRecHelper(a, endRow, endCol, startRow, startCol);
        //printAntiSpiralHelper(a, endRow, endCol, startRow, startCol);
    }

    public void printAnitSpiralRec(int[][] a){
        int startRow = 0;
        int endRow = a.length-1;
        int startCol = 0;
        int endCol = a[0].length-1;
        //printSpiralRecHelper(a, endRow, endCol, startRow, startCol);
        printAntiSpiralHelper(a, endRow, endCol, startRow, startCol);
    }

    public void printSpiralRecHelper(int[][] a, int rowEnd, int colEnd, int rowStart, int colStrat){
        if(rowStart > rowEnd || colStrat > colEnd){
            System.out.println("Done");
        }else{
            for(int i=colStrat; i<=colEnd; i++){
                System.out.print(a[rowStart][i]);
            }
            ++rowStart;
            for(int i=rowStart; i<=rowEnd;i++){
                System.out.print(a[i][colEnd]);
            }
            --colEnd;
            for(int i=colEnd;i>=colStrat; i--){
                System.out.print(a[rowEnd][i]);
            }
            --rowEnd;
            for(int i=rowEnd;i>=rowStart;i--){
                System.out.print(a[i][colStrat]);
            }
            ++colStrat;
            printSpiralRecHelper(a, rowEnd, colEnd, rowStart, colStrat);
        }
    }

    public void printAntiSpiralHelper(int[][] a, int rowEnd, int colEnd, int rowStart, int colStrat){
        if(rowStart > rowEnd || colStrat > colEnd){
            while(!st.isEmpty()){
                System.out.print(st.pop());
            }
        }else{

            for(int i=colStrat; i<=colEnd; i++){
                st.push(a[rowStart][i]);
            }
            ++rowStart;
            for(int i=rowStart; i<=rowEnd;i++){
                st.push(a[i][colEnd]);
            }
            --colEnd;
            for(int i=colEnd;i>=colStrat; i--){
                st.push(a[rowEnd][i]);
            }
            --rowEnd;
            for(int i=rowEnd;i>=rowStart;i--){
                st.push(a[i][colStrat]);
            }
            ++colStrat;
            printAntiSpiralHelper(a, rowEnd, colEnd, rowStart, colStrat);
        }
    }

    public static void main (String[] args){
        int[][] a = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16}};
        SpiralPrint sp = new SpiralPrint();
        sp.printSpiralRec(a);
        sp.printAnitSpiralRec(a);
    }
}
