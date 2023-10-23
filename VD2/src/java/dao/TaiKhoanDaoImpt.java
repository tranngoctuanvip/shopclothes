/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;


import connect.Database;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.taikhoan;


/**
 *
 * @author Admin
 */
public class TaiKhoanDaoImpt implements TaikhoanDao{

    @Override
    public boolean KiemtraTaiKhoan(String ten_dang_nhap) {
      Connection conn = Database.KetnoiConnection();
      String sql ="SELECT ten_dang_nhap FROM taikhoan WHERE ten_dang_nhap ='"+ten_dang_nhap+"' ";      
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery();
             while(rs.next()){
                  return true;
             }
             conn.close();
        }   
        catch (SQLException e) {
               Logger.getLogger(TaiKhoanDaoImpt.class.getName()).log(Level.SEVERE, null, e);
        }
        return false;
      }

    @Override
    public void ThemTaikhoan(taikhoan tk) {
     Connection conn = Database.KetnoiConnection();
     String sql ="INSERT INTO taikhoan VALUE (NULL,?,?,?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1,tk.getTen_tai_khoan());
            ps.setString(2, tk.getTen_dang_nhap());
            ps.setString(3, tk.getMat_khau());
            ps.setInt(4, tk.getQuyen_try_cap());
            ps.setInt(5,tk.getTinh_trang());
            ps.executeUpdate();
            conn.close();
        } 
        catch (SQLException e) {
            Logger.getLogger(TaiKhoanDaoImpt.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    @Override
    public boolean KiemtraDangNhap(String ten_dang_nhap, String mat_khau) {
         Connection conn = Database.KetnoiConnection();
         String sql="SELECT * FROM taikhoan WHERE  ten_dang_nhap = '"+ten_dang_nhap+"' AND mat_khau = '"+ mat_khau+"' ";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                return true;
            }
            conn.close();
        } 
        catch (SQLException ex) {
            Logger.getLogger(TaiKhoanDaoImpt.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false; 
    }

    @Override
    public taikhoan getTaikhoan(String ma_tai_khoan) {
       Connection conn = Database.KetnoiConnection();
         String sql="SELECT * FROM taikhoan WHERE  ma_tai_khoan = '"+ma_tai_khoan+"' ";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                taikhoan tk = new taikhoan();
                tk.setMa_tai_khoan(rs.getString("ma_tai_khoan"));
                return tk;
            }
        } 
        catch (SQLException ex) {
            Logger.getLogger(TaiKhoanDaoImpt.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
    
