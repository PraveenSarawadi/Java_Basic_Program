package com.practice.Array.PracticePrograms.collections.dsaProblems;

import java.util.Arrays;
import java.util.Scanner;

public class Matrix0Problem {

    /*
    Problem: You are given a matrix 'MATRIX' of dimension 'N' x 'M'. Your task is to make all the elements of row 'i' and column 'j' equal to 0 if any element in the ith row or jth column of the matrix is 0.
    Note:
        1) The number of rows should be at least 1.
        2) The number of columns should be at least 1.
        ex: 3*3
           1 2 3        1 0 3
           3 0 8   ---> 0 0 0
           4 5 7        4 0 7
     */

    public static void main(String[] args) {
        int row=3;
        int col=3;
        int[][] matrixInput= {{1,2,3},
                              {3,0,9},
                              {4,5,7}};
//        below methodology is defining a new array approach
        int[][] matrixOutput=new int[row][col];

//        for(int i=0;i<row;i++){
//            for(int j=0;j<col;j++){
//                if(matrixInput[i][j]==0){
//                    for(int k=0;k<row;k++)
//                        matrixOutput[k][j]=-1;
//                    for(int l=0;l<col;l++)
//                        matrixOutput[i][l]=-1;
//                }
//
//            }
//        }
//        for(int i=0;i<row;i++){
//            for(int j=0;j<col;j++){
//                if(matrixOutput[i][j]<0){
//                    matrixInput[i][j]=0;
//                }
//
//            }
//        }
//
//    Arrays.stream(matrixInput).map(Arrays::toString).forEach(System.out::println);

        // declare 2 new array as row array with size row and column array with size col
        int[] rowArray= new int[row];
        int[] colArray= new int[col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(matrixInput[i][j]==0){
                    rowArray[i]=-1;
                    colArray[j]=-1;
                }

            }
        }
        for(int i=0;i<row;i++){
            if(rowArray[i]<0)
                for (int j=0;j<col;j++)
                matrixInput[i][j]=0;
        }
        for(int j=0;j<col;j++){
            if(colArray[j]<0)
                for (int i=0;i<row;i++)
                    matrixInput[i][j]=0;
        }
        Arrays.stream(matrixInput).map(Arrays::toString).forEach(System.out::println);
    }
}
