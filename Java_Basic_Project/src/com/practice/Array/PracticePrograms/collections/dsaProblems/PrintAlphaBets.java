package com.practice.Array.PracticePrograms.collections.dsaProblems;

import java.util.Stack;

public class PrintAlphaBets {

//    input = "2[a]3[b]" ---> output= aabbb,
//    input = "2[a2[b]]" ---> output= abbabb

    public static String decodeString(String s) {

        Stack<Integer> count= new Stack<>();
        Stack<String> alphabet= new Stack<>();
        StringBuilder current =new StringBuilder();
        int n=0;
        for(char c: s.toCharArray()){
            if(Character.isDigit(c)){
                n=n*10+(c-'0');
            } else if (c=='[') {
                count.push(n);
                alphabet.push(current.toString());
                current= new StringBuilder();
                n=0;
            } else if (Character.isAlphabetic(c)) {
                current.append(c);

            } else if (c==']') {
                int repeat=count.pop();
                StringBuilder decode=new StringBuilder(alphabet.pop());
                for (int i=0;i<repeat;i++){
                    decode.append(current);
                }
            current=decode;

            }
        }
       return current.toString();
    }

    public static void main(String[] args) {
//        String input1 = "2[a]3[b]4[c]";
        String input2 = "2[a3[b2[c]]]";

//        System.out.println("Decoded: " + decodeString(input1));  // Output: aabbb
        System.out.println("Decoded: " + decodeString(input2));  // Output: abbabb
    }
}
