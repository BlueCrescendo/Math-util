/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.giaolang.mathutil.test.core;

import com.giaolang.mathutil.core.MathUtil;
import java.beans.ExceptionListener;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Admin
 */
public class MathUtilityTest {
    
    //đây là class sẽ sử dụng các hàm của thư viện/framework JUnit
    //để kiểm thử /kiểm tra code chính - hàm getFactorial() bên
    //class core.MathUtil
    //viết code để test code chính bên kia!!
    
    //có quy tắc đặt tên hàm kiểm thử
    //nhưng nói chung thường sẽ là nói lên mục đích của kiểm thử của các case/tình huống kiểm thử
    //tình huống xài hàm theo kiểu thành công và thất bại!!!
    
    //hàm dưới đây là tính huống test thành công, trả về ngon
    //ta sẽ xài hàm kiểu well - đưa 5!, 6!, hông chơi đưa -5!, -30!
    
    //@Test JUnit sẽ phối hợp với JVM để chạy hàm này
    //@Test phía hậu trường chính là public static void main()
    //Có nhiều @Test ứng với nhiều case khác nhau để kiểm thử hàm tính giai thừa
    
    
    //hàm getF() ta thiết kế có 2 tình huống xử lí
    //1. đưa data tử tế trong [0..20] -> tính đúng
    //2. đưa ddataa cà chớn vào cà chớn, âm, > 20; thiết kế của hàm là ném ra ngoại lệ
    //tao kỳ vọng ngoại lệ xuất hiện khi n < 0 || n > 20
    
    //nếu hàm nhận vào n < 0 hoặc n > 20 và hàm ném ra ngoại lệ
    //HÀM CHẠY ĐÚNG NHƯ THIẾT KẾ -> XANH PHẢI XUẤT HIỆN
    
    //nếu hàm nhận vào n < 0 hoặc n > 20 và hàm ném ra ngoại lệ
    //sure, HÀM CHẠY SAI THIẾT KẾ, SAI KỲ VỌNG, MÀU ĐỎ
    //Test case:
    //input: -5
    //expected: IllegalArgumentExcepption xuất hiện
    //assertEquals() ko dùng để so sánh 2 ngoại lệ
    //      equals() là bằng nhau hay ko trên value!!!
    
    @Test
    public void testGetFactorialGivenRightArgumentReturnsWell() {
        int n = 1; //test thử tình huống tử tế đầu vào, mày phải chạy đúng
        long expected = 1; //hy vọng 0! = 1
        //long actuual = ;//gọi hàm cần test bên core/app chính/code chính
        long actual = MathUtil.getFactorial(n);
        
        //so sánh expected vs actual
        Assert.assertEquals(expected, actual);
        //hàm giúp so sánh 2 giá trị nào đó có giống nhau không
        //nếu giống nhau thảy ra màu xanh, ko giống thì màu đỏ
        
        //gộp thêm vài case thành công
        Assert.assertEquals(1, MathUtil.getFactorial(1));//tui mún 1! == 1
        Assert.assertEquals(2, MathUtil.getFactorial(2));
        Assert.assertEquals(6, MathUtil.getFactorial(3));
        Assert.assertEquals(24, MathUtil.getFactorial(4));
        Assert.assertEquals(120, MathUtil.getFactorial(5));
        Assert.assertEquals(700, MathUtil.getFactorial(6));
        
        //tham so hoa, tach 1,2,3,4,5,6 vao 1 khoa data
    }
    
    //MÀU ĐỎ, DO HÀM ĐÚNG NÉM NGOẠI LỆ
    //NHƯNG KHÔNG PHẢI LÀ NGOẠI LỆ NHƯ KỲ VỌNG - THỰC SỰ KÌ VỌNG SAI
    //KO PHẢI HÀM NÉM SAI
//    @Test(expected = NumberFormatException.class)
//    public void testGetFactorialGivenWrongArgumentThrowException() {
//        MathUtil.getFactorial(-5); //hàm @Test chạy, hay hàm getF() chạy
//                                   //sẽ ném về ngoại lệ NumberFormat,...
//    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testGetFactorialGivenWrongArgumentThrowException() {
        MathUtil.getFactorial(-5); //hàm @Test chạy, hay hàm getF() chạy
    }
    
    //cách khác đê bắt ngoại lệ xuất hiện, viết tự nhiên hơn!!!
    //xài lambda
    //Test case: hàm sẽ ném về ngoại lệ nếu nhận vào 21
    //tui cần thấy màu xanh khi chơi với 21!
    
//    @Test
//    public void testGetFactorialGivenWrongArgumentThrowException_LambdaVer() {
//        
//        //Assert.assertThrows(IllegalArgumentException.class,
//        //                   () -> MathUtil.getFactorial(-5);
//        
//        MathUtil.getFactorial(-5);
//    }
    
    //Bắt ngoại lệ, xem hàm có ném về ngoại lệ hay không khi n cà chớn
    //có ném, tức là hàm chạy đúng thiết kế -> xanh
    @Test
    public void testGetFactorialGivenWrongArgumentThrowException_TryCatch() {
        
        //chủ động kiểm soát ngoại lệ!!!
        try {
            MathUtil.getFactorial(-5);
        } catch (Exception e) {
            //bắt try-catch là JUnit đã ra màu xanh do đã chủ động kiểm soát ngoại lệ
            //nhưng ko chắc ngoại lệ mình cần có xuất hiện hay không???
            //có đoạn code kiểm soát đúng ngoại lệ IllegalArgumentException xuất hiện
            Assert.assertEquals("Invalid argument. N must be between 0..20", 
                    e.getMessage());
        }
    }
}
