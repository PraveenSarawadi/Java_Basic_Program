package org.dsaProblems.pattern;

public class EquiLateralTriangle implements PatternInterface{

    @Override
    public void design(int size) {
        for (int i=0;i<size;i++){
//            for(int j=0;j<size-i-1;j++)
//                System.out.print(" ");
//            for (int j=0;j<2*i+1;j++)
//                System.out.print("*");


//            better solution than above O(N^2) -> O(N) instead of inner loops
            System.out.print(" ".repeat(size-i-1));
            System.out.print("*".repeat(2*i+1));
            System.out.println();
        }
    }

    @Override
    public void reverseDesign(int size) {
        for (int i=size;i>0;i--){
//            for(int j=0;j<size-i;j++)
//                System.out.print(" ");
//            for (int j=0;j<2*i-1;j++)
//                System.out.print("*");

            //            better solution than above O(N^2) -> O(N) instead of inner loops
            System.out.print(" ".repeat(size-i));
            System.out.print("*".repeat(2*i-1));
            System.out.println();
        }
    }
}
