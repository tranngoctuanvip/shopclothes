package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.Giohang;
import java.text.NumberFormat;
import model.sanpham;
import dao.productDaoImpt;
import dao.productDao;

public final class product_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            productDaoImpt sanphamDao = new productDaoImpt();
            NumberFormat nf = NumberFormat.getCurrencyInstance();
            nf.setMinimumIntegerDigits(0);
           Giohang cart = (Giohang) session.getAttribute("cart");
           if(cart == null){
              cart = new Giohang();
              session.setAttribute("cart", cart);
           }
        
      out.write("\n");
      out.write("        <div class=\"col-sm-9 padding-right\">\n");
      out.write("\t\t\t\t\t<div class=\"features_items\"><!--features_items-->\n");
      out.write("\t\t\t\t\t\t<h2 class=\"title text-center\">Sản Phẩm</h2>\n");
      out.write("                                                \n");
      out.write("                                                ");
 
                                                    for(sanpham pr : sanphamDao.getListProductByCartegory(request.getParameter("ma_danh_muc"))){
                                                
      out.write("\n");
      out.write("\t\t\t\t\t\t<div class=\"col-sm-4\">\n");
      out.write("                                                    <div class=\"product-image-wrapper\">\n");
      out.write("                                                        <div class=\"single-products\">\n");
      out.write("                                                            <div class=\"productinfo text-center\">\n");
      out.write("                                                                <img src=\"images/home/");
      out.print(pr.getHinh_anh());
      out.write("\" alt=\"\" />\n");
      out.write("                                                                <h2>");
      out.print(pr.getDon_gia());
      out.write("</h2>\n");
      out.write("                                                                <p>Mã sản phẩm: ");
      out.print(pr.getMa_san_pham());
      out.write("</p>\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"GioHangServlet?command=insert&ma_san_pham=");
      out.print(pr.getMa_san_pham());
      out.write("&cartID=");
      out.print(System.currentTimeMillis());
      out.write("\" class=\"btn btn-default add-to-cart\"><i class=\"fa fa-shopping-cart\"></i>Thêm vào giỏ hàng</a>\n");
      out.write("                                                            </div>\n");
      out.write("                                                                <div class=\"product-overlay\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"overlay-content\">\n");
      out.write("                                                                                            <h2>");
      out.print(nf.format(pr.getDon_gia()));
      out.write(" VNĐ</h2>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<p>");
      out.print(pr.getTen_san_pham());
      out.write("</p>\n");
      out.write("                                                                                                <a href=\"GioHangServlet?command=insert&ma_san_pham=");
      out.print(pr.getMa_san_pham());
      out.write("&cartID=");
      out.print(System.currentTimeMillis());
      out.write("\" class=\"btn btn-default add-to-cart\"><i class=\"fa fa-shopping-cart\"></i>Thêm vào giỏ hàng</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"choose\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<ul class=\"nav nav-pills nav-justified\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\"><i class=\"fa fa-plus-square\"></i>So sánh</a></li>\n");
      out.write("                                                                                <li><a href=\"detail.jsp?ma_san_pham=");
      out.print(pr.getMa_san_pham());
      out.write("\"><i class=\"fa fa-plus-square\"></i>Xem chi tiết</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("                                                ");
 } 
      out.write("\n");
      out.write("                                        </div><!--features_items-->\t\n");
      out.write("\t</div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
