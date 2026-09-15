/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.giaolang.mathutil.core;

/**
 *
 * @author Admin
 */
public class MathUtil {
    
    //trong class này cung cấp cho ai đó nhiều hàm xử lý toán học
    //clone class Math của JDK
    //hàm thư viện xài chung cho ai đó, ko cần lưu lại trạng thái/giá trị
    //chọn thiết kế là hàm static
    
    //hàm tính giai thừa!!!
    //n! = 1.2.3.4.5...n
    //ko có giai thừa âm
    //0! = 1! = 1 quy ước
    //giai thừa hàm đồ thị dốc đứng, tăng nhanh về giá trị
    //20 giai thừa trong 18 con sốn 0, vừa kịp đủ cho kiểu long của Java
    //21 giai thừa tràn kiểu long
    //bài này quy ước tính n! trong khoảng từ 0..20
    public static long getFactorial(int n) {
        if (n < 0 || n > 20)
            throw new IllegalArgumentException("Invalid argument. N must be between 0..20");
        if(n == 0 || n == 1)
            return 1; //kết thúc cuộc chơi sớm, nếu biết những đầu vào đặc biệt
        
        long product = 1; //tích nhân dồn
        for (int i = 2; i <= n; i++) 
            product *= i;
        return product;
        
        
    }
}
