/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import model.Danhmuc;

/**
 *
 * @author Admin
 */
public interface DanhMucDao {

    /**
     *
     * @return
     */
    public ArrayList<Danhmuc> getListDanhMucCha();

    public ArrayList<Danhmuc> getListDanhMucCon(String ma_danh_muc);
    public ArrayList<Danhmuc> getList();
}
