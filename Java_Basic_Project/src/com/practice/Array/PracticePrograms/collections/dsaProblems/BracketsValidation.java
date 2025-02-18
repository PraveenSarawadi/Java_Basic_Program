package com.practice.Array.PracticePrograms.collections.dsaProblems;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class DSAProblems {

    /* input String as "{}[]()" braces you are supposed to check whether braces closed in sequence as they have opened
    write a algorithm in such way
    */
// as below method does not the best option for memory constraint and time complexity so better way is to go with either using Stack or recursive or normal do while loop
    public static boolean isValidBraces(String braces) {
        char[] chars = braces.toCharArray();
        List<Character> bracesList = new ArrayList<>();
        Map<Character, Character> bracketMaps= new HashMap<>();
        bracketMaps.put('(',')');
        bracketMaps.put('[',']');
        bracketMaps.put('{','}');
        boolean intialized = false;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '(' || chars[i] == '[' || chars[i] == '{') {
                bracesList.add(chars[i]);
                intialized = true;
            } else {
                int size = bracesList.size() - 1;
                if (bracesList.isEmpty() && !intialized)
                    return false;
                else if (chars[i] == bracketMaps.get(bracesList.get(size))) {
                    bracesList.remove(size);

                }
            }
        }
        return bracesList.isEmpty();
    }
}
public class BracketsValidation {
    public static void main(String[] args) {
        String input = "[{(){}[(){[]}]}]";
        System.out.println("is a valid Input : "+DSAProblems.isValidBraces(input));
    }
}
