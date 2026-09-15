/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.giaolang.mathutil.test.core;

import com.giaolang.mathutil.core.MathUtil;
import junit.framework.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author Admin
 */

//câu l?nh này c?a JUnit báo hieu rang se can loop qua tap data de
//lay cac cap data input/expected nhoi vao ham test
@RunWith(value = Parameterized.class)
public class MathUtilDDTTest {
    
//    public MathUtilDDTTest() {
//    }
    // không can constructor vi do la class binh thuong
    //trong lap t?nh huong doi tuong static chi choi voi static
    
    //hàm này ta se tra ve mang 2 chieu gom nhieu cap ExpectedInput
    @Parameterized.Parameters //JUnit se ngam chay loop qua tung dong
                               //cua mang de lay ra cap data input/Expeccted
    //tên hàm k quan trong, quan trong là @
    public static Object[][] initData() {
        return new Integer[][] {
            {0, 1},
            {1, 1},
            {2, 2},
            {3, 6},
            {4, 24},
            {6, 720},
        };
        
    } 
    
    
    //gia su loop qua duoc tung dong cua mang, ta van can gan tung value vao bien
    //tuong ung input, expected de lay hoi feed cho ham da co du dai dien chua!!!
    
    @Parameterized.Parameter(value = 0) //value = 0 là map voi mang data
    public int n; //bien map voi value cua cot 0 cua mang
    
    @Parameterized.Parameter(value = 1)
    public long expected; //kieu lonh vi gia tri tra ve cua ham getF()
                          //la long
    
    //public co nghia la set value ma k can getter va setter
    
    @Test
    public void testGetFactorialGivenRightArgumentReturnsWell() {
        Assert.assertEquals(expected, MathUtil.getFactorial(n));
    }
}
