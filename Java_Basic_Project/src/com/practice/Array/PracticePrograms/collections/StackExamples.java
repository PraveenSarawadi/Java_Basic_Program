package com.practice.Array.PracticePrograms.collections;

import java.util.Stack;

// validate the brackets
public class StackExamples {

    public static void main(String[] args) {
        String input= "{}[()]{()[]}{}[][{}]";
        System.out.println("is the provided String is valid : "+isValidInput(input));
    }

    private static Boolean isValidInput(String input) {
        Stack<Character> brackets=new Stack<>();
        boolean visited=false;
        if(input.isEmpty())
            return false;
        for(Character ch:input.toCharArray()){
            if(ch=='('||ch=='{'||ch=='['){
                brackets.add(ch);
                visited=true;
            }
            else
                if (brackets.isEmpty()&&!visited) {
                    return false;
            } else  {
                    char top= brackets.pop();
                    if(ch=='}'&&top=='{'||ch==']'&&top=='['||ch==')'&&top=='(')
                        continue;
                    else
                        return false;

                }
        }
return brackets.isEmpty();
    }
}
