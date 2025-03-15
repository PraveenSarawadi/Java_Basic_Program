package org.dsaProblems.pattern;

public class RightAngleTriangle implements PatternInterface{
    @Override
    public void design(int size) {
        boolean flag=true;
        for (int i=0;i<size;i++){
            flag= i % 2 == 0;
            for (int j=0;j<=i;j++){
                System.out.print(flag?1:0);
                flag=!flag;
            }
            System.out.println();
        }
    }

    @Override
    public void reverseDesign(int size) {
        boolean flag=true;
        for (int i=size-1;i>=0;i--){
            flag= i % 2 == 0;
            for (int j=0;j<=i;j++){
                System.out.print(flag?1:0);
                flag=!flag;
            }
            System.out.println();
        }
    }
    public void printNumbers(int size){
        int n=1;
        for(int i=0;i<size;i++){
            for(int j=0;j<=i;j++){
                System.out.print(n);
                System.out.print(" ");
                n++;
            }
            System.out.println();
        }
    }
    public void printAlpha(int size){
        char a='A';
        for(int i=0;i<size;i++){
            /*A
              A B
              A B c
             */
//            for(char ch='A';ch<='A'+i;ch++){
//                System.out.print(ch+" ");
//            }
            /*
              A
              B C
              D E F
             */
            for (int j=0;j<=i;j++) {
                System.out.print(a + " ");
                a++;
            }
            System.out.println();
        }
    }

}
