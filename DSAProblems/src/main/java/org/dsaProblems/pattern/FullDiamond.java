package org.dsaProblems.pattern;

public class FullDiamond implements PatternInterface{
    @Override
    public void design(int size) {
        for(int i=0;i<size;i++){
            if(i<size/2){
                System.out.print(" ".repeat(size/2-i-1));
                System.out.print("*".repeat(2*i+1));

            } else {
                System.out.print(" ".repeat(i-size/2));
                System.out.print("*".repeat(2*(size-i)-1));
            }
            System.out.println();
        }
    }

    @Override
    public void reverseDesign(int size) {

    }
}
