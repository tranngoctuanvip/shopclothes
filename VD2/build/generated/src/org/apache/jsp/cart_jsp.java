package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.TreeMap;
import model.Giohang;
import java.util.Map;
import model.sanpham;

public final class cart_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Cart</title>\n");
      out.write("        <link rel=\"shortcut icon\" type=\"image/x-icon\" href=\"images/favicon/favicon.ico\">\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"css/font-awesome.min.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"css/prettyPhoto.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"css/price-range.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"css/animate.css\" rel=\"stylesheet\"> \n");
      out.write("    <link href=\"css/main.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"css/responsive.css\" rel=\"stylesheet\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            Giohang cart = (Giohang) session.getAttribute("cart");
            if(cart==null){
                cart = new Giohang();
                session.setAttribute("cart", cart);
            }
            TreeMap<sanpham, Integer> list = cart.getList();
        
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("    \n");
      out.write("    <session>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <section id=\"cart_items\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"table-responsive cart_info\">\n");
      out.write("\t\t\t\t<table class=\"table table-condensed\">\n");
      out.write("\t\t\t\t\t<thead>\n");
      out.write("\t\t\t\t\t\t<tr class=\"cart_menu\">\n");
      out.write("\t\t\t\t\t\t\t<td class=\"image\">Hình ảnh</td>\n");
      out.write("\t\t\t\t\t\t\t<td class=\"description\">Tên sản phẩm</td>\n");
      out.write("\t\t\t\t\t\t\t<td class=\"price\">Gía</td>\n");
      out.write("\t\t\t\t\t\t\t<td class=\"quantity\">Số lượng</td>\n");
      out.write("\t\t\t\t\t\t\t<td class=\"total\">Tổng</td>\n");
      out.write("\t\t\t\t\t\t\t<td></td>\n");
      out.write("\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t</thead>\n");
      out.write("\t\t\t\t\t<tbody>\n");
      out.write("                                        ");

                                            for(Map.Entry<sanpham, Integer> ds : list.entrySet()){
                                        
      out.write("\n");
      out.write("\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t<td class=\"cart_product\">\n");
      out.write("                                                            <a href=\"\"><img src=\"images/home/");
      out.print(ds.getKey().getHinh_anh());
      out.write("\" alt=\"\"></a>\n");
      out.write("\t\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t\t\t<td class=\"cart_description\">\n");
      out.write("                                                            <h4><a href=\"\">");
      out.print(ds.getKey().getTen_san_pham());
      out.write("</a></h4>\n");
      out.write("\t\t\t\t\t\t\t\t<p>Mã sản phẩm: ");
      out.print(ds.getKey().getMa_san_pham());
      out.write("</p>\n");
      out.write("\t\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t\t\t<td class=\"cart_price\">\n");
      out.write("\t\t\t\t\t\t\t\t<p>");
      out.print(ds.getKey().getDon_gia());
      out.write("</p>\n");
      out.write("\t\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t\t\t<td class=\"cart_quantity\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"cart_quantity_button\">\n");
      out.write("                                                                    <a class=\"cart_quantity_up\" href=\"GioHangServlet?command=insert&ma_san_pham=");
      out.print(ds.getKey().getMa_san_pham());
      out.write("&cartID=");
      out.print(System.currentTimeMillis());
      out.write("\"> + </a>\n");
      out.write("                                                                        <input class=\"cart_quantity_input\" type=\"text\" value=\"");
      out.print(ds.getValue());
      out.write("\" autocomplete=\"off\" size=\"2\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<a class=\"cart_quantity_down\" href=\"GioHangServlet?command=sub&ma_san_pham=");
      out.print(ds.getKey().getMa_san_pham());
      out.write("&cartID=");
      out.print(System.currentTimeMillis());
      out.write("\"> - </a>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t\t\t<td class=\"cart_total\">\n");
      out.write("\t\t\t\t\t\t\t\t<p class=\"cart_total_price\">");
      out.print(ds.getValue() * ds.getKey().getDon_gia());
      out.write("</p>\n");
      out.write("\t\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t\t\t<td class=\"cart_delete\">\n");
      out.write("\t\t\t\t\t\t\t\t<a class=\"cart_quantity_delete\" href=\"GioHangServlet?command=remove&ma_san_pham=");
      out.print(ds.getKey().getMa_san_pham());
      out.write("&cartID=");
      out.print(System.currentTimeMillis());
      out.write("\"><i class=\"fa fa-times\"></i></a>\n");
      out.write("\t\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t\t</tr>\n");
      out.write("                                                ");

                                                    }
                                                
      out.write("\n");
      out.write("\t\t\t\t\t</tbody>\n");
      out.write("\t\t\t\t</table>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</section> <!--/#cart_items-->\n");
      out.write("        <section id=\"do_action\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"heading\">\n");
      out.write("\t\t\t\t<h3>What would you like to do next?</h3>\n");
      out.write("\t\t\t\t<p>Choose if you have a discount code or reward points you want to use or would like to estimate your delivery cost.</p>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t<div class=\"col-sm-6\">\n");
      out.write("\t\t\t\t\t<div class=\"chose_area\">\n");
      out.write("\t\t\t\t\t\t<ul class=\"user_option\">\n");
      out.write("\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"checkbox\">\n");
      out.write("\t\t\t\t\t\t\t\t<label>Use Coupon Code</label>\n");
      out.write("\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"checkbox\">\n");
      out.write("\t\t\t\t\t\t\t\t<label>Use Gift Voucher</label>\n");
      out.write("\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"checkbox\">\n");
      out.write("\t\t\t\t\t\t\t\t<label>Estimate Shipping & Taxes</label>\n");
      out.write("\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t<ul class=\"user_info\">\n");
      out.write("\t\t\t\t\t\t\t<li class=\"single_field\">\n");
      out.write("\t\t\t\t\t\t\t\t<label>Country:</label>\n");
      out.write("\t\t\t\t\t\t\t\t<select>\n");
      out.write("\t\t\t\t\t\t\t\t\t<option>United States</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t<option>Bangladesh</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t<option>UK</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t<option>India</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t<option>Pakistan</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t<option>Ucrane</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t<option>Canada</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t<option>Dubai</option>\n");
      out.write("\t\t\t\t\t\t\t\t</select>\n");
      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t<li class=\"single_field\">\n");
      out.write("\t\t\t\t\t\t\t\t<label>Region / State:</label>\n");
      out.write("\t\t\t\t\t\t\t\t<select>\n");
      out.write("\t\t\t\t\t\t\t\t\t<option>Select</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t<option>Dhaka</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t<option>London</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t<option>Dillih</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t<option>Lahore</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t<option>Alaska</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t<option>Canada</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t<option>Dubai</option>\n");
      out.write("\t\t\t\t\t\t\t\t</select>\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t<li class=\"single_field zip-field\">\n");
      out.write("\t\t\t\t\t\t\t\t<label>Zip Code:</label>\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\">\n");
      out.write("\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t<a class=\"btn btn-default update\" href=\"\">Get Quotes</a>\n");
      out.write("\t\t\t\t\t\t<a class=\"btn btn-default check_out\" href=\"\">Continue</a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"col-sm-6\">\n");
      out.write("\t\t\t\t\t<div class=\"total_area\">\n");
      out.write("\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t<li>Cart Sub Total <span>$59</span></li>\n");
      out.write("\t\t\t\t\t\t\t<li>Eco Tax <span>$2</span></li>\n");
      out.write("\t\t\t\t\t\t\t<li>Shipping Cost <span>Free</span></li>\n");
      out.write("\t\t\t\t\t\t\t<li>Total <span>$61</span></li>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t<a class=\"btn btn-default update\" href=\"\">Hủy đơn hàng</a>\n");
      out.write("\t\t\t\t\t\t\t<a class=\"btn btn-default check_out\" href=\"checkout.jsp\">Thanh toán</a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</section><!--/#do_action-->\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </session>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
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
