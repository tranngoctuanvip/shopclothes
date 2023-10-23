/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.ChitiethoadonImpt;
import dao.HoadonImpt;
import dao.TaiKhoanDaoImpt;
import java.io.IOException;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.TreeMap;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Giohang;
import model.chitiethoadon;
import model.hoadon;
import model.sanpham;
import model.taikhoan;

/**
 *
 * @author Admin
 */
public class ThanhtoanServlet extends HttpServlet {

        private  HoadonImpt hdDao = new HoadonImpt();
        private  ChitiethoadonImpt cthdDao = new ChitiethoadonImpt();
        private  TaiKhoanDaoImpt tkDao = new TaiKhoanDaoImpt();
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        String dia_chi_giao_hang = request.getParameter("dia_chi_giao_hang");
        String phuong_thuc_thanh_toan = request.getParameter("phuong_thuc_thanh_toan");
        String ma_tai_khoan = request.getParameter("ma_tai_khoan");
        HttpSession session = request.getSession();
        Giohang cart = (Giohang) session.getAttribute("cart");
        try {
            Date id = new Date(0);
            String mhd = "" +id.getTime();
            taikhoan tk = new taikhoan();
          //  tk.setMa_tai_khoan(tkDao.getTaikhoan(tai_khoan).getMa_tai_khoan());
         tk.setMa_tai_khoan(ma_tai_khoan);
            hoadon hd = new hoadon(mhd, tk, dia_chi_giao_hang,
                    phuong_thuc_thanh_toan, new Timestamp(new Date(0).getTime()) , 1);
            hdDao.Themhoadon(hd);
            TreeMap<sanpham, Integer> list = cart.getList();
            list.entrySet().forEach((ds) -> {
                sanpham sp = new sanpham();
                sp.setMa_san_pham(ds.getKey().getMa_san_pham());
                cthdDao.themchitiethoadon(new chitiethoadon(""+id.getTime(), hd, sp, ds.getValue(), ds.getKey().getDon_gia(), ds.getKey().getGiam_gia()));
            });
            response.sendRedirect("/VD2/list.jsp");
        } 
        catch (Exception e) {
        }
    }
}
