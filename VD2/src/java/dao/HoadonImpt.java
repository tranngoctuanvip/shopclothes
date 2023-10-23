/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import connect.Database;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.hoadon;
/**
 *
 * @author Admin
 */
public class HoadonImpt implements HoadonDao{

    @Override
    public void Themhoadon(hoadon hd) {
         Connection conn = Database.KetnoiConnection();
     String sql ="INSERT INTO hoadon VALUE (NULL,?,?,?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1,hd.getTai_khoan().getMa_tai_khoan());
            ps.setString(2, hd.getDia_chi_giao_hang());
            ps.setString(3, hd.getPhuong_thuc_thanh_toan());
            ps.setTimestamp(4, hd.getNgay_mua_hang());
            ps.setInt(5, hd.getTinh_trang_don_hang());
            ps.executeUpdate();
            conn.close();
        } 
        catch (SQLException e) {
            Logger.getLogger(HoadonImpt.class.getName()).log(Level.SEVERE, null, e);
        }
    }
}
