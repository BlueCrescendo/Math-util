/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.giaolang.mathutil.main;

import com.giaolang.mathutil.core.MathUtil;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {

        
        long expected = 120; //tao kỳ vọng hàm ói về 120 nếu tính 5!
        int n = 5;           //input
        long actual = MathUtil.getFactorial(n);
        System.out.println("5! = " + expected +  " expected");
        System.out.println("5! = " + actual + " actual");
        
        long expectedV1 = 120; //tao kỳ vọng hàm ói về 120 nếu tính 5!
        int m = 0;           //input
        long actualV1 = MathUtil.getFactorial(m);
        System.out.println("21! = " + expectedV1 +  " expected");
        System.out.println("21! = " + actualV1 + " actual");
    }
}
