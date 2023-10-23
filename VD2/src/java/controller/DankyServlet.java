/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.TaiKhoanDaoImpt;
import java.io.IOException;
import java.sql.Date;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.taikhoan;
import tools.mahoa;

/**
 *
 * @author Admin
 */
public class DankyServlet extends HttpServlet {
    private  TaiKhoanDaoImpt taikhoanDao = new TaiKhoanDaoImpt();
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException { 
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        String ten_tai_khoan = request.getParameter("ten_tai_khoan");
        String ten_dang_nhap = request.getParameter("ten_dang_nhap");
        String mat_khau = request.getParameter("mat_khau");
        String ten_tai_khoan_err = "", ten_dang_nhap_err ="", mat_khau_err="";
                if(ten_tai_khoan.equals("")){
                    ten_tai_khoan_err = "Vui lòng nhập họ tên của bạn !";
                }
                if(ten_tai_khoan_err.length()>0){
                    request.setAttribute("ten_tai_khoan_err", ten_tai_khoan_err);
                }
                if(ten_dang_nhap.equals("")){
                    ten_dang_nhap_err = "Vui lòng nhập email đăng ký !";
                }
                else if (taikhoanDao.KiemtraTaiKhoan(ten_dang_nhap)==true){
                        ten_dang_nhap_err = " Địa chỉ email đã được đăng ký !";
                    }
                if(ten_dang_nhap_err.length()>0){
                    request.setAttribute("ten_dang_nhap_err", ten_dang_nhap_err);
                }
                if(mat_khau.equals("")){
                    mat_khau_err =  "Vui lòng nhập mật khẩu !";
                }
                if(mat_khau_err.length()>0){
                    request.setAttribute("mat_khau_err", mat_khau_err);
                }
                request.setAttribute("ten_tai_khoan", ten_tai_khoan);
                request.setAttribute("ten_dang_nhap", ten_dang_nhap);
                request.setAttribute("mat_khau",mat_khau);
                String url="/account.jsp";
                try {
                    if(mat_khau_err.length()==0 && ten_dang_nhap_err.length()==0 && ten_tai_khoan_err.length()==0){
                        Date id = new Date(0);
                        taikhoan tk = new taikhoan("" +id.getTime(), ten_tai_khoan, ten_dang_nhap,mahoa.mahoaMD5(mat_khau), 0, 0);
                        taikhoanDao.ThemTaikhoan(tk);
                        url="/list.jsp";
                    }
                    else{
                        url="/account.jsp";
                    }
                    RequestDispatcher rd = getServletContext().getRequestDispatcher(url);
                    rd.forward(request, response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
