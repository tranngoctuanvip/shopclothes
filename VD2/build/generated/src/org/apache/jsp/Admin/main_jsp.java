package org.apache.jsp.Admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import model.sanpham;
import dao.productDaoImpt;

public final class main_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       ");
 productDaoImpt sanphamdao = new productDaoImpt();
        ArrayList<sanpham> list = sanphamdao.getlist();
       
      out.write("\n");
      out.write("                <main>\n");
      out.write("                    <div class=\"container-fluid px-4\">\n");
      out.write("                        <h1 class=\"mt-4\">Dashboard</h1>\n");
      out.write("                        <ol class=\"breadcrumb mb-4\">\n");
      out.write("                            <li class=\"breadcrumb-item active\">Dashboard</li>\n");
      out.write("                        </ol>\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-xl-3 col-md-6\">\n");
      out.write("                                <div class=\"card bg-primary text-white mb-4\">\n");
      out.write("                                    <div class=\"card-body\">Primary Card</div>\n");
      out.write("                                    <div class=\"card-footer d-flex align-items-center justify-content-between\">\n");
      out.write("                                        <a class=\"small text-white stretched-link\" href=\"#\">View Details</a>\n");
      out.write("                                        <div class=\"small text-white\"><i class=\"fas fa-angle-right\"></i></div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-xl-3 col-md-6\">\n");
      out.write("                                <div class=\"card bg-warning text-white mb-4\">\n");
      out.write("                                    <div class=\"card-body\">Warning Card</div>\n");
      out.write("                                    <div class=\"card-footer d-flex align-items-center justify-content-between\">\n");
      out.write("                                        <a class=\"small text-white stretched-link\" href=\"#\">View Details</a>\n");
      out.write("                                        <div class=\"small text-white\"><i class=\"fas fa-angle-right\"></i></div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-xl-3 col-md-6\">\n");
      out.write("                                <div class=\"card bg-success text-white mb-4\">\n");
      out.write("                                    <div class=\"card-body\">Success Card</div>\n");
      out.write("                                    <div class=\"card-footer d-flex align-items-center justify-content-between\">\n");
      out.write("                                        <a class=\"small text-white stretched-link\" href=\"#\">View Details</a>\n");
      out.write("                                        <div class=\"small text-white\"><i class=\"fas fa-angle-right\"></i></div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-xl-3 col-md-6\">\n");
      out.write("                                <div class=\"card bg-danger text-white mb-4\">\n");
      out.write("                                    <div class=\"card-body\">Danger Card</div>\n");
      out.write("                                    <div class=\"card-footer d-flex align-items-center justify-content-between\">\n");
      out.write("                                        <a class=\"small text-white stretched-link\" href=\"#\">View Details</a>\n");
      out.write("                                        <div class=\"small text-white\"><i class=\"fas fa-angle-right\"></i></div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-xl-6\">\n");
      out.write("                                <div class=\"card mb-4\">\n");
      out.write("                                    <div class=\"card-header\">\n");
      out.write("                                        <i class=\"fas fa-chart-area me-1\"></i>\n");
      out.write("                                        Area Chart Example\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"card-body\"><canvas id=\"myAreaChart\" width=\"100%\" height=\"40\"></canvas></div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-xl-6\">\n");
      out.write("                                <div class=\"card mb-4\">\n");
      out.write("                                    <div class=\"card-header\">\n");
      out.write("                                        <i class=\"fas fa-chart-bar me-1\"></i>\n");
      out.write("                                        Bar Chart Example\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"card-body\"><canvas id=\"myBarChart\" width=\"100%\" height=\"40\"></canvas></div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"card mb-4\">\n");
      out.write("                            <div class=\"card-header\">\n");
      out.write("                                <i class=\"fas fa-table me-1\"></i>\n");
      out.write("                                DataTable Example\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"card-body\">\n");
      out.write("                                <table id=\"datatablesSimple\">\n");
      out.write("                                    <tr>\n");
      out.write("                                            <th>Mã Sản phẩm</th>\n");
      out.write("                                            <th>Mã danh mục</th>\n");
      out.write("                                            <th>Tên sản phẩm</th>\n");
      out.write("                                            <th>Hình ảnh</th>\n");
      out.write("                                            <th>Số lượng</th>\n");
      out.write("                                            <th>Mô tả</th>\n");
      out.write("                                            <th>Đơn giá</th>\n");
      out.write("                                            <th>Giảm giá</th>\n");
      out.write("                                        </tr>\n");
      out.write("                                   \n");
      out.write("                                    ");
 for(sanpham sp : list){
                                        
      out.write("\n");
      out.write("                                        \n");
      out.write("                                        <tr>\n");
      out.write("                                            <td>");
      out.print(sp.getMa_san_pham());
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print(sp.getDanhmuc().getMa_danh_muc());
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print(sp.getTen_san_pham());
      out.write("</td>\n");
      out.write("                                            <td><img width=\"80\" src=\"images/home/");
      out.print(sp.getHinh_anh());
      out.write("\" alt=\"\"/></td>\n");
      out.write("                                            <td>");
      out.print(sp.getSo_luong());
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print(sp.getMo_ta());
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print(sp.getDon_gia());
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print(sp.getGiam_gia());
      out.write("</td>\n");
      out.write("                                        </tr>\n");
      out.write("                                    \n");
      out.write("                                    ");
 
                                                    }
                                    
      out.write("\n");
      out.write("                                </table>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </main>\n");
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
