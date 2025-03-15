package org.dsaProblems.pattern;

public class VCutPattern implements PatternInterface{
    @Override
    public void design(int size) {
//        int n=size;
        for (int i =1;i<=size;i++){
            for (int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.print(" ".repeat(2*(size-i)));
            for (int j=i;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    @Override
    public void reverseDesign(int size) {

    }
}
