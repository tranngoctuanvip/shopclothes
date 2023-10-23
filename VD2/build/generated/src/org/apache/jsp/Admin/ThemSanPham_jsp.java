package org.apache.jsp.Admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ThemSanPham_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" />\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\" />\n");
      out.write("        <meta name=\"description\" content=\"\" />\n");
      out.write("        <meta name=\"author\" content=\"\" />\n");
      out.write("        <link href=\"css/style1.css\" rel=\"stylesheet\"/>\n");
      out.write("        <title>Dashboard - SB Admin</title>\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/simple-datatables@latest/dist/style.css\" rel=\"stylesheet\" />\n");
      out.write("        <link href=\"css/styles.css\" rel=\"stylesheet\" />\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/js/all.min.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("    </head>\n");
      out.write("        <body class=\"sb-nav-fixed\">\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("        <div id=\"layoutSidenav\">\n");
      out.write("            <div id=\"layoutSidenav_content\">\n");
      out.write("                ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "category.jsp", out, false);
      out.write("\n");
      out.write("                <div class=\"d1\">\n");
      out.write("                <form class=\"cls \" action=\"\" method=\"POST\">    \n");
      out.write("                    <table border=\"0\">\n");
      out.write("                        <tbody>\n");
      out.write("                            <tr>\n");
      out.write("                                <td>Tên sản phẩm:</td>\n");
      out.write("                                <td><input type=\"text\" name=\"ten_san_pham\" value=\"\" /></td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td>Danh mục sản phẩm:</td>\n");
      out.write("                                <td><select name=\"danh_muc\">\n");
      out.write("                                        <option>Điện thoại</option>\n");
      out.write("                                        <option>Máy tính</option>\n");
      out.write("                                    </select></td>\n");
      out.write("                                \n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td>Giá:</td>\n");
      out.write("                                <td><input type=\"text\" name=\"gia\" value=\"\" /></td>\n");
      out.write("                                \n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td>Số lượng:</td>\n");
      out.write("                                <td><input type=\"text\" name=\"so_luong\" value=\"\" /></td>\n");
      out.write("                                \n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td>Hình ảnh:</td>\n");
      out.write("                                <td><input type=\"file\" name=\"hinh_anh\" value=\"\" /></td>\n");
      out.write("                                \n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td> Mô tả: </td>\n");
      out.write("                                <td><textarea name=\"mo_ta\" rows=\"4\" cols=\"20\">\n");
      out.write("                                    </textarea></td>           \n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td><input type=\"submit\" value=\"Đồng ý\" /></td>           \n");
      out.write("                            </tr>\n");
      out.write("                        </tbody>\n");
      out.write("                    </table>\n");
      out.write("\n");
      out.write("                </form>\n");
      out.write("</div>\n");
      out.write("                ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"js/scripts.js\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.8.0/Chart.min.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"assets/demo/chart-area-demo.js\"></script>\n");
      out.write("        <script src=\"assets/demo/chart-bar-demo.js\"></script>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/simple-datatables@latest\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"js/datatables-simple-demo.js\"></script>\n");
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
