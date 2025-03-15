package org.dsaProblems;

import org.dsaProblems.pattern.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int r= (int) Math.log10(1234);
        int value=1234;
        char[] arr=String.valueOf(1234).toCharArray();
        System.out.println("size:"+arr.length);
        System.out.println("dogits:"+r);
//        EquiLateralTriangle equi=new EquiLateralTriangle();
//        equi.design(3);
//        equi.reverseDesign(3);
//        HalfDiamond dia=new HalfDiamond();
//        dia.design(4);
//        dia.reverseDesign(5);
//        FullDiamond fullDiamond= new FullDiamond();
//        fullDiamond.design(10);
        RightAngleTriangle rght= new RightAngleTriangle();
//        rght.design(5);
//        rght.reverseDesign(5);
//        rght.printNumbers(5);
        rght.printAlpha(5);
        VCutPattern cut=new VCutPattern();
        cut.design(3);
        }
    }
