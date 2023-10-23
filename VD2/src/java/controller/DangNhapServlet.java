/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.TaiKhoanDaoImpt;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.taikhoan;
import tools.mahoa;

/**
 *
 * @author Admin
 */
public class DangNhapServlet extends HttpServlet {
    private final  TaiKhoanDaoImpt taikhoandao = new TaiKhoanDaoImpt();
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        if(request.getParameter("command").equals("logout")){
            HttpSession session = request.getSession();
            session.invalidate();
            response.sendRedirect("./list.jsp");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        String ten_dang_nhap = request.getParameter("ten_dang_nhap");
        String mat_khau = request.getParameter("mat_khau"); 
        String err = "";
        taikhoan tk = new taikhoan();
        if(ten_dang_nhap.equals("") || mat_khau.equals("")){
            err = "Vui lòng nhập đầy đủ thông tin!";
        }
        if(taikhoandao.KiemtraDangNhap(ten_dang_nhap, mahoa.mahoaMD5(mat_khau)) == false){
            err = "Email hoặc mật khẩu chưa chính xác!";
        }
        if(err.length()>0){
            request.setAttribute("err", err);      
        }
        String url="/account.jsp";
        try {
             if(tk.getTinh_trang()==0 && tk.getQuyen_try_cap()==0){
                 HttpSession session = request.getSession();
                 session.setAttribute("username", ten_dang_nhap);
                 url="/list.jsp";
             }
             else{
                 
                 url="/account.jsp";
             }
            RequestDispatcher rd = getServletContext().getRequestDispatcher(url);
            rd.forward(request, response);     
            }  
        catch (IOException | ServletException e) {
        }
}
}
