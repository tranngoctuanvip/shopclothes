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
public class chitiethoadon {
    private String ma_chi_tiet_hoa_don;
    private hoadon hoa_don;
    private sanpham san_pham;
    private int so_luong;
    private double don_gia;
    private int giam_gia;

    public chitiethoadon() {
    }

    public chitiethoadon(String ma_chi_tiet_hoa_don, hoadon hoa_don, sanpham san_pham, int so_luong, double don_gia, int giam_gia) {
        this.ma_chi_tiet_hoa_don = ma_chi_tiet_hoa_don;
        this.hoa_don = hoa_don;
        this.san_pham = san_pham;
        this.so_luong = so_luong;
        this.don_gia = don_gia;
        this.giam_gia = giam_gia;
    }

    public String getMa_chi_tiet_hoa_don() {
        return ma_chi_tiet_hoa_don;
    }

    public void setMa_chi_tiet_hoa_don(String ma_chi_tiet_hoa_don) {
        this.ma_chi_tiet_hoa_don = ma_chi_tiet_hoa_don;
    }

    public hoadon getHoa_don() {
        return hoa_don;
    }

    public void setHoa_don(hoadon hoa_don) {
        this.hoa_don = hoa_don;
    }

    public sanpham getSan_pham() {
        return san_pham;
    }

    public void setSan_pham(sanpham san_pham) {
        this.san_pham = san_pham;
    }

    public int getSo_luong() {
        return so_luong;
    }

    public void setSo_luong(int so_luong) {
        this.so_luong = so_luong;
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
    
}
