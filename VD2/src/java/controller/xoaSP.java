/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Admin
 */
@WebServlet(name = "xoaSPS", urlPatterns = {"/xoaSPS"})
public class xoaSP extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            request.setCharacterEncoding("UTF-8");
            out.println("<h3>xử lý xóa</h3>");
            int ma_san_pham = Integer.parseInt(request.getParameter("ma_san_pham"));
            //lấy id chuyển từ string về id
            int ketqua = dao.productDaoImpt.getDeleteSP(ma_san_pham);
            String thongbao="";
            if(ketqua ==-1)
                thongbao = "<H3> LỖI KẾT NỐI CSDL</H3>";
            else if(ketqua==-2)
                thongbao = "<H3> LỖI SQL XOÁ SẢN PHẨM</H3>";
            else
                thongbao = "<H3> XÓA THÀNH CÔNG</H3>";
            request.setAttribute("tb", thongbao);//lưu thongbao vào biến tb để trang kế tiếp gọi ra
            request.getRequestDispatcher("thongbao.jsp").forward(request, response);
            //out.println(thongbao);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

}
