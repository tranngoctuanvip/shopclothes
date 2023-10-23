/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;


/**
 *
 * @author Admin
 */
public class taikhoan {
    private String ma_tai_khoan;
    private String ten_tai_khoan;
    private String ten_dang_nhap;
    private String mat_khau;
    private int quyen_try_cap;
    private int tinh_trang;

    public taikhoan() {
    }

    public taikhoan(String ma_tai_khoan, String ten_tai_khoan, String ten_dang_nhap, String mat_khau, int quyen_try_cap, int tinh_trang) {
        this.ma_tai_khoan = ma_tai_khoan;
        this.ten_tai_khoan = ten_tai_khoan;
        this.ten_dang_nhap = ten_dang_nhap;
        this.mat_khau = mat_khau;
        this.quyen_try_cap = quyen_try_cap;
        this.tinh_trang = tinh_trang;
    }

    public String getMa_tai_khoan() {
        return ma_tai_khoan;
    }

    public void setMa_tai_khoan(String ma_tai_khoan) {
        this.ma_tai_khoan = ma_tai_khoan;
    }

    public String getTen_tai_khoan() {
        return ten_tai_khoan;
    }

    public void setTen_tai_khoan(String ten_tai_khoan) {
        this.ten_tai_khoan = ten_tai_khoan;
    }

    public String getTen_dang_nhap() {
        return ten_dang_nhap;
    }

    public void setTen_dang_nhap(String ten_dang_nhap) {
        this.ten_dang_nhap = ten_dang_nhap;
    }

    public String getMat_khau() {
        return mat_khau;
    }

    public void setMat_khau(String mat_khau) {
        this.mat_khau = mat_khau;
    }

    public int getQuyen_try_cap() {
        return quyen_try_cap;
    }

    public void setQuyen_try_cap(int quyen_try_cap) {
        this.quyen_try_cap = quyen_try_cap;
    }

    public int getTinh_trang() {
        return tinh_trang;
    }

    public void setTinh_trang(int tinh_trang) {
        this.tinh_trang = tinh_trang;
    }

    
}
