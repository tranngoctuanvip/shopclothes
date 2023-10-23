///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package controller;
//
//import dao.productDaoImpt;
//import java.io.IOException;
//import java.io.PrintWriter;
//import static java.lang.System.out;
//import java.util.List;
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import model.Uploads;
//import model.sanpham;
//
///**
// *
// * @author Admin
// */
//public class ThemSP extends HttpServlet {
//
//    /**
//     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
//     * methods.
//     *
//     * @param request servlet request
//     * @param response servlet response
//     * @throws ServletException if a servlet-specific error occurs
//     * @throws IOException if an I/O error occurs
//     */
//    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        response.setContentType("text/html;charset=UTF-8");
//        try (PrintWriter out = response.getWriter()) {
//            /* TODO output your page here. You may use following sample code. */
//            out.println("<!DOCTYPE html>");
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>Servlet ThemSP</title>");            
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h1>Servlet ThemSP at " + request.getContextPath() + "</h1>");
//            out.println("</body>");
//            out.println("</html>");
//        }
//    }
//
//    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
//    /**
//     * Handles the HTTP <code>GET</code> method.
//     *
//     * @param request servlet request
//     * @param response servlet response
//     * @throws ServletException if a servlet-specific error occurs
//     * @throws IOException if an I/O error occurs
//     */
//    @Override
//    protected void doGet(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//       List FieldItems = Uploads.getFieldItems(request,"images\\home\\");
//       out.println("<h3>xu ly them</h3>");
//            try {
//                String tensp = Uploads.getInput(FieldItems,"ten_san_pham");
//            String tensp = Uploads.getFieldItems(FieldItems,"ten_san_pham");
//            float giasp = Float.parseFloat(Uploads.getInput(FieldItems, "giasp"));
//            int soluong = Integer.parseInt(Uploads.getInput(FieldItems, "soluong"));
//            String hinhanh = Uploads.getInput(FieldItems,"hinhanh");
//            String tomtat = Uploads.getInput(FieldItems,"tomtat");
//            String mota = Uploads.getInput(FieldItems,"mota");
//            //Xử lý lấy checkbox từ form, nếu input == null là chưa check
//            int manhom = Integer.parseInt(Uploads.getInput(FieldItems,"manhom"));
//                sanpham sp = new sanpham(hinhanh, danhmuc, tensp, hinhanh, soluong, mota, manhom, manhom);
//            int ketqua = productDaoImpt.getThemsanpham(sp);
//            String thongbao="";
//            if(ketqua ==-1)
//                thongbao = "<H3> LỖI KẾT NỐI CSDL</H3>";
//            else if(ketqua==-2)
//                thongbao = "<H3> LỖI SQL THÊM SẢN PHẨM</H3>";
//            else if(ketqua==0)
//                thongbao = "<H3> KHÔNG THÊM ĐƯỢC SẢN PHẨM</H3>";
//            else
//                thongbao = "<H3> THÊM THÀNH CÔNG</H3>";
//            request.setAttribute("tb", thongbao);//lưu thongbao vào biến tb để trang kế tiếp gọi ra
//            request.getRequestDispatcher("thongbao.jsp").forward(request, response);
//            //out.println(thongbao);
//            }
//            catch(Exception e){
//            out.println("LỖI XỬ LÝ FORM THÊM");
//        }
//        }
//        
//
//    /**
//     * Handles the HTTP <code>POST</code> method.
//     *
//     * @param request servlet request
//     * @param response servlet response
//     * @throws ServletException if a servlet-specific error occurs
//     * @throws IOException if an I/O error occurs
//     */
//    @Override
//    protected void doPost(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        processRequest(request, response);
//    }
//
//    /**
//     * Returns a short description of the servlet.
//     *
//     * @return a String containing servlet description
//     */
//    @Override
//    public String getServletInfo() {
//        return "Short description";
//    }// </editor-fold>
//
//}
