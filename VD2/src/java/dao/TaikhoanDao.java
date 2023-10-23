/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import model.taikhoan;

/**
 *
 * @author Admin
 */
public interface TaikhoanDao {
    //Kiểm tra tên tài khoản tồn tại chưa
    public boolean KiemtraTaiKhoan(String ten_dang_nhap);
   // Thêm tài khoản
    public void ThemTaikhoan(taikhoan tk);
    //Kiểm tra đăng nhâp
    public boolean KiemtraDangNhap(String ten_dang_nhap, String mat_khau);
    
    public taikhoan getTaikhoan(String ma_tai_khoan);
}
