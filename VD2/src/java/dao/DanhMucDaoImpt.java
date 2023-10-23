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

/**
 *
 * @author Admin
 */
public class DanhMucDaoImpt implements DanhMucDao{

    @Override
    public ArrayList<Danhmuc> getListDanhMucCha() {
        Connection conn = Database.KetnoiConnection();
        String sql="SELECT * FROM danhmuc WHERE danh_muc_cha='null'";
        ArrayList<Danhmuc> arr = new ArrayList<>();
            try{
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
            Danhmuc dm= new Danhmuc();
            dm.setMa_danh_muc(rs.getString("ma_danh_muc"));
            dm.setTen_danh_muc(rs.getString("ten_danh_muc"));
            dm.setDanh_muc_cha(rs.getString("danh_muc_cha"));
            arr.add(dm);
        }
            conn.close();
        }   
            catch(SQLException e){
                Logger.getLogger(DanhMucDaoImpt.class.getName()).log(Level.SEVERE,null,e);
            }
        return arr;
        }      
    @Override
    public ArrayList<Danhmuc> getListDanhMucCon(String ma_danh_muc) {
        Connection conn = Database.KetnoiConnection();
        String sql="SELECT * FROM danhmuc WHERE danh_muc_cha = '"+ma_danh_muc+"'";
        ArrayList<Danhmuc> arr = new ArrayList<>();
            try{
            PreparedStatement ps= conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
            Danhmuc dm= new Danhmuc();
            dm.setMa_danh_muc(rs.getString("ma_danh_muc"));
            dm.setTen_danh_muc(rs.getString("ten_danh_muc"));
            dm.setDanh_muc_cha(rs.getString("danh_muc_cha"));
            arr.add(dm);
        }
            conn.close();
        }   
            catch(SQLException e){
                Logger.getLogger(DanhMucDaoImpt.class.getName()).log(Level.SEVERE,null,e);
            }
        return arr;
        }

    @Override
    public ArrayList<Danhmuc> getList() {
        Connection conn = Database.KetnoiConnection();
        String sql="SELECT * FROM danhmuc ";
        ArrayList<Danhmuc> arr = new ArrayList<>();
            try{
            PreparedStatement ps= conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
            Danhmuc dm= new Danhmuc();
            dm.setMa_danh_muc(rs.getString("ma_danh_muc"));
            dm.setTen_danh_muc(rs.getString("ten_danh_muc"));
            dm.setDanh_muc_cha(rs.getString("danh_muc_cha"));
            arr.add(dm);
        }
            conn.close();
        }   
            catch(SQLException e){
                Logger.getLogger(DanhMucDaoImpt.class.getName()).log(Level.SEVERE,null,e);
            }
        return arr;
        }
}