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
import model.chitiethoadon;

/**
 *
 * @author Admin
 */
public class ChitiethoadonImpt implements ChitiethoadonDao{

    @Override
    public void themchitiethoadon(chitiethoadon cthd) {
       Connection conn = Database.KetnoiConnection();
     String sql ="INSERT INTO chi_tiet_hoa_don VALUE (NULL,?,?,?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1,cthd.getHoa_don().getMa_hoa_don());
            ps.setString(2, cthd.getSan_pham().getMa_san_pham());
            ps.setInt(3, cthd.getSo_luong());
            ps.setDouble(4, cthd.getDon_gia());
            ps.setInt(5, cthd.getGiam_gia());
            ps.executeUpdate();
            conn.close();
        } 
        catch (SQLException e) {
            Logger.getLogger(ChitiethoadonImpt.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
}
