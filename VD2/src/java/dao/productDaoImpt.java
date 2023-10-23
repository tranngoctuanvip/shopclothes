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
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Danhmuc;
import model.sanpham;

/**
 *
 * @author Admin
 */
public class productDaoImpt implements productDao{

    @Override
    public ArrayList<sanpham> getListProductByCartegory(String ma_danh_muc) {
       Connection conn = Database.KetnoiConnection();
        String sql="SELECT * FROM tblsanpham WHERE ma_danh_muc = '"+ma_danh_muc+"'";
        ArrayList<sanpham> arr = new ArrayList<>();
            try{
            PreparedStatement ps= conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
            sanpham sp= new sanpham();
            sp.setMa_san_pham(rs.getString("ma_san_pham"));
            Danhmuc dm = new  Danhmuc("ma_danh_muc","","");
            sp.setDanhmuc(dm);
            sp.setTen_san_pham(rs.getString("ten_san_pham"));
            sp.setHinh_anh(rs.getString("hinh_anh"));
            sp.setSo_luong(rs.getInt("so_luong"));
            sp.setMo_ta(rs.getString("mo_ta"));
            sp.setDon_gia(rs.getDouble("don_gia"));
            sp.setGiam_gia(rs.getInt("giam_gia"));
            arr.add(sp);
        }
            conn.close();
        }   
            catch(SQLException e){
                Logger.getLogger(productDaoImpt.class.getName()).log(Level.SEVERE, null, e);
            }
        return arr;
        }    

    @Override
    public sanpham getChitietsanpham(String ma_san_pham) {
        Connection conn = Database.KetnoiConnection();
        sanpham sp = new sanpham(); 
        String sql="SELECT * FROM tblsanpham WHERE ma_san_pham ='"+ma_san_pham+"'";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){    
                sp.setMa_san_pham(rs.getString("ma_san_pham"));
                Danhmuc dm = new  Danhmuc("ma_danh_muc","","");
                sp.setDanhmuc(dm);
                sp.setTen_san_pham(rs.getString("ten_san_pham"));
                sp.setHinh_anh(rs.getString("hinh_anh"));
                sp.setMo_ta(rs.getString("mo_ta"));
                sp.setSo_luong(rs.getInt("so_luong"));
                sp.setDon_gia(rs.getDouble("don_gia"));
                sp.setGiam_gia(rs.getInt("giam_gia"));
            }                
        } 
        catch (SQLException ex) {
            Logger.getLogger(productDaoImpt.class.getName()).log(Level.SEVERE, null, ex);
        }
        return sp;
    }

    @Override
    public ArrayList<sanpham> getlist() {
        Connection conn = Database.KetnoiConnection();
        String sql="SELECT * FROM tblsanpham";
        ArrayList<sanpham> arr = new ArrayList<>();
            try{
            PreparedStatement ps= conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
            sanpham sp= new sanpham();
            sp.setMa_san_pham(rs.getString("ma_san_pham"));
            Danhmuc dm = new  Danhmuc("ma_danh_muc","","");
            sp.setDanhmuc(dm);
            sp.setTen_san_pham(rs.getString("ten_san_pham"));
            sp.setHinh_anh(rs.getString("hinh_anh"));
            sp.setSo_luong(rs.getInt("so_luong"));
            sp.setMo_ta(rs.getString("mo_ta"));
            sp.setDon_gia(rs.getDouble("don_gia"));
            sp.setGiam_gia(rs.getInt("giam_gia"));
            arr.add(sp);
        }
            conn.close();
        }   
            catch(SQLException e){
                Logger.getLogger(productDaoImpt.class.getName()).log(Level.SEVERE, null, e);
            }
        return arr;
        }    

    @Override
    public ArrayList<sanpham> getListByPage(ArrayList<sanpham> arr, int start, int end) {
    ArrayList<sanpham> list = new ArrayList<>();
    for(int i = start; i<=end; i++){
        list.add(arr.get(i));
        
    }
        return list;
    }
    public static int getDeleteSP(int ma_san_pham) {
       Connection cnn = Database.KetnoiConnection();
        if(cnn==null)
            return -1;//nếu lỗi kết nối CSDL thì trả về -1
        //String sql = "INSERT INTO tbSanpham(tensp,giasp) VALUES(?,?)";
        String sql = "DELETE FROM tblsanpham WHERE ma_san_pham ="+ma_san_pham+"";
        try {
            PreparedStatement stm = cnn.prepareStatement(sql);
            stm.setInt(1,ma_san_pham);//gán Chuỗi vào vị trí dấu ? số 1
            int n = stm.executeUpdate();//thực thi lệnh cập nhật dữ liệu
            return n;//trả về số bản ghi được cập nhật (thêm/sửa/xóa)
        } catch (SQLException ex) {
            Logger.getLogger(productDaoImpt.class.getName()).log(Level.SEVERE, null, ex);
            return -2;
        }
}

    public static int getThemsanpham(sanpham sp) {
        Connection conn = Database.KetnoiConnection(); 
        if(conn==null)
            return -1;
     String sql ="INSERT INTO tblsanpham VALUE (NULL,?,?,?,?,?,?,?)";    
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1,sp.getDanhmuc().getMa_danh_muc());
            ps.setString(2,sp.getTen_san_pham());
            ps.setString(3, sp.getHinh_anh());
            ps.setInt(4, sp.getSo_luong());
            ps.setString(5, sp.getMo_ta());
            ps.setDouble(6, sp.getDon_gia());
            ps.setInt(7,sp.getGiam_gia());
            int n = ps.executeUpdate();//thực thi lệnh cập nhật dữ liệu
            return n;
        } catch (SQLException e) {
            Logger.getLogger(productDaoImpt.class.getName()).log(Level.SEVERE, null, e);
            return -2;
        }
 }
}