package org.dsaProblems.pattern;

public class HalfDiamond implements PatternInterface{
    @Override
    public void design(int size) {
        for(int i=0;i<2*size-1;i++){
            if(i<size)
                System.out.print("*".repeat(i+1));
            else
                System.out.print("*".repeat(2*size-i-1));
            System.out.println();
        }
    }

    @Override
    public void reverseDesign(int size) {
        for(int i=0;i<2*size-1;i++){
            if(i<size) {
                System.out.print(" ".repeat(size-i-1));
                System.out.print("*".repeat(i + 1));
            }
            else {
                System.out.print(" ".repeat(i+1-size));
                System.out.print("*".repeat(2 * size - i-1));
            }
            System.out.println();
        }
    }
}
