<%-- 
    Document   : prouct
    Created on : Jun 30, 2021, 11:27:41 AM
    Author     : Admin
--%>

<%@page import="model.Giohang"%>
<%@page import="java.text.NumberFormat"%>
<%@page import="model.sanpham"%>
<%@page import="dao.productDaoImpt"%>
<%@page import="dao.productDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="shortcut icon" type="image/x-icon" href="images/favicon/favicon.ico">
    </head>
    <body>
        <%
            productDaoImpt sanphamDao = new productDaoImpt();
            NumberFormat nf = NumberFormat.getCurrencyInstance();
            nf.setMinimumIntegerDigits(0);
           Giohang cart = (Giohang) session.getAttribute("cart");
           if(cart == null){
              cart = new Giohang();
              session.setAttribute("cart", cart);
           }
        %>
        <div class="col-sm-9 padding-right">
					<div class="features_items"><!--features_items-->
						<h2 class="title text-center">Sản Phẩm</h2>
                                                
                                                <% 
                                                    for(sanpham pr : sanphamDao.getListProductByCartegory(request.getParameter("ma_danh_muc"))){
                                                %>
						<div class="col-sm-4">
                                                    <div class="product-image-wrapper">
                                                        <div class="single-products">
                                                            <div class="productinfo text-center">
                                                                <img src="images/home/<%=pr.getHinh_anh()%>" alt="" />
                                                                <h2><%=pr.getDon_gia()%></h2>
                                                                <p>Mã sản phẩm: <%=pr.getMa_san_pham()%></p>
								<a href="GioHangServlet?command=insert&ma_san_pham=<%=pr.getMa_san_pham()%>&cartID=<%=System.currentTimeMillis()%>" class="btn btn-default add-to-cart"><i class="fa fa-shopping-cart"></i>Thêm vào giỏ hàng</a>
                                                            </div>
                                                                <div class="product-overlay">
											<div class="overlay-content">
                                                                                            <h2><%=nf.format(pr.getDon_gia())%> VNĐ</h2>
												<p><%=pr.getTen_san_pham()%></p>
                                                                                                <a href="GioHangServlet?command=insert&ma_san_pham=<%=pr.getMa_san_pham()%>&cartID=<%=System.currentTimeMillis()%>" class="btn btn-default add-to-cart"><i class="fa fa-shopping-cart"></i>Thêm vào giỏ hàng</a>
											</div>
										</div>
								</div>
								<div class="choose">
									<ul class="nav nav-pills nav-justified">
										<li><a href="#"><i class="fa fa-plus-square"></i>So sánh</a></li>
                                                                                <li><a href="detail.jsp?ma_san_pham=<%=pr.getMa_san_pham()%>"><i class="fa fa-plus-square"></i>Xem chi tiết</a></li>
									</ul>
								</div>
							</div>
						</div>
                                                <% } %>
                                        </div><!--features_items-->	
	</div>
    </body>
</html>
