/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import model.sanpham;

/**
 *
 * @author Admin
 */
public interface productDao {
    public ArrayList<sanpham> getListProductByCartegory(String ma_danh_muc);
    public sanpham getChitietsanpham(String ma_san_pham);
    public ArrayList<sanpham> getlist();
    public ArrayList<sanpham> getListByPage(ArrayList<sanpham> arr,int start, int end);
}
