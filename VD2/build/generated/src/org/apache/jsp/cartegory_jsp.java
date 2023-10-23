package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import dao.DanhMucDaoImpt;
import model.Danhmuc;

public final class cartegory_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/font-awesome.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/prettyPhoto.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/price-range.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/animate.css\" rel=\"stylesheet\"> \n");
      out.write("        <link href=\"css/main.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/responsive.css\" rel=\"stylesheet\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"col-sm-3\">\n");
      out.write("            ");

                DanhMucDaoImpt danhmucdao = new DanhMucDaoImpt();
            
      out.write("\n");
      out.write("\t\t\t\t\t<div class=\"left-sidebar\">\n");
      out.write("\t\t\t\t\t\t<h2>Danh mục</h2>\n");
      out.write("\t\t\t\t\t\t<div class=\"panel-group category-products\" id=\"accordian\"><!--category-productsr-->\n");
      out.write("                                                    ");

                                                        for(Danhmuc danh_muc_cha : danhmucdao.getListDanhMucCha()){
                                                    
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<div class=\"panel panel-default\">\n");
      out.write("                                                            \n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"panel-heading\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<h4 class=\"panel-title\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<span class=\"badge pull-right\"><i class=\"fa fa-plus\"></i></span>\n");
      out.write("                                                                                        ");
      out.print(danh_muc_cha.getTen_danh_muc() );
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t</h4>\n");
      out.write("                                                                </div>\n");
      out.write("                                                                    \n");
      out.write("                                                                       \n");
      out.write("                                                                           \n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"panel-body\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<ul>\n");
      out.write("                                                                                    ");
for(Danhmuc danh_muc_con : danhmucdao.getListDanhMucCon(danh_muc_cha.getMa_danh_muc())){
      out.write("\n");
      out.write("                                                                                    <li><a href=\"index.jsp?ma_danh_muc=");
      out.print(danh_muc_con.getMa_danh_muc());
      out.write('"');
      out.write('>');
      out.print(danh_muc_con.getTen_danh_muc());
      out.write(" </a></li>\n");
      out.write("                                                                                    ");
 } 
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("                                                                                    \n");
      out.write("                                                                       \n");
      out.write("                                                                                    \n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("                                                    ");
 } 
      out.write("\t\n");
      out.write("                                                </div><!--/category-products-->\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<div class=\"brands_products\"><!--brands_products-->\n");
      out.write("\t\t\t\t\t\t\t<h2>Brands</h2>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"brands-name\">\n");
      out.write("\t\t\t\t\t\t\t\t<ul class=\"nav nav-pills nav-stacked\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"#\"> <span class=\"pull-right\">(50)</span>Acne</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"#\"> <span class=\"pull-right\">(56)</span>Grüne Erde</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"#\"> <span class=\"pull-right\">(27)</span>Albiro</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"#\"> <span class=\"pull-right\">(32)</span>Ronhill</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"#\"> <span class=\"pull-right\">(5)</span>Oddmolly</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"#\"> <span class=\"pull-right\">(9)</span>Boudestijn</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"#\"> <span class=\"pull-right\">(4)</span>Rösch creative culture</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div><!--/brands_products-->\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<div class=\"price-range\"><!--price-range-->\n");
      out.write("\t\t\t\t\t\t\t<h2>Price Range</h2>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"well text-center\">\n");
      out.write("\t\t\t\t\t\t\t\t <input type=\"text\" class=\"span2\" value=\"\" data-slider-min=\"0\" data-slider-max=\"600\" data-slider-step=\"5\" data-slider-value=\"[250,450]\" id=\"sl2\" ><br />\n");
      out.write("\t\t\t\t\t\t\t\t <b class=\"pull-left\">$ 0</b> <b class=\"pull-right\">$ 600</b>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div><!--/price-range-->\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<div class=\"shipping text-center\"><!--shipping-->\n");
      out.write("\t\t\t\t\t\t\t<img src=\"images/home/shipping.jpg\" alt=\"\" />\n");
      out.write("\t\t\t\t\t\t</div><!--/shipping-->\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("        <script src=\"js/jquery.js\"></script>\n");
      out.write("\t<script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("\t<script src=\"js/jquery.scrollUp.min.js\"></script>\n");
      out.write("\t<script src=\"js/price-range.js\"></script>\n");
      out.write("        <script src=\"js/jquery.prettyPhoto.js\"></script>\n");
      out.write("        <script src=\"js/main.js\"></script>\n");
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
