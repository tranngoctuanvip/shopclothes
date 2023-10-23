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
public class sanpham implements Comparable<sanpham>{
    private String ma_san_pham;
    private Danhmuc danhmuc;
    private String ten_san_pham;
    private String hinh_anh;
    private int so_luong;
    private String mo_ta;
    private double don_gia;
    private int giam_gia;

    public sanpham() {
    }

    public sanpham(String ma_san_pham, Danhmuc danhmuc, String ten_san_pham, String hinh_anh, int so_luong, String mo_ta, double don_gia, int giam_gia) {
        this.ma_san_pham = ma_san_pham;
        this.danhmuc = danhmuc;
        this.ten_san_pham = ten_san_pham;
        this.hinh_anh = hinh_anh;
        this.so_luong = so_luong;
        this.mo_ta = mo_ta;
        this.don_gia = don_gia;
        this.giam_gia = giam_gia;
    }    
    public String getMa_san_pham() {
        return ma_san_pham;
    }

    public void setMa_san_pham(String ma_san_pham) {
        this.ma_san_pham = ma_san_pham;
    }

    public Danhmuc getDanhmuc() {
        return danhmuc;
    }

    public void setDanhmuc(Danhmuc danhmuc) {
        this.danhmuc = danhmuc;
    }

    
        public String getTen_san_pham() {
        return ten_san_pham;
    }

    public void setTen_san_pham(String ten_san_pham) {
        this.ten_san_pham = ten_san_pham;
    }

    public String getHinh_anh() {
        return hinh_anh;
    }

    public void setHinh_anh(String hinh_anh) {
        this.hinh_anh = hinh_anh;
    }

    public int getSo_luong() {
        return so_luong;
    }

    public void setSo_luong(int so_luong) {
        this.so_luong = so_luong;
    }

    public String getMo_ta() {
        return mo_ta;
    }

    public void setMo_ta(String mo_ta) {
        this.mo_ta = mo_ta;
    }

    public double getDon_gia() {
        return don_gia;
    }

    public void setDon_gia(double don_gia) {
        this.don_gia = don_gia;
    }

    public int getGiam_gia() {
        return giam_gia;
    }

    public void setGiam_gia(int giam_gia) {
        this.giam_gia = giam_gia;
    }    

    @Override
    public int compareTo(sanpham sp) {
        return Integer.parseInt(this.ma_san_pham) - Integer.parseInt(sp.ma_san_pham);
    }
}
