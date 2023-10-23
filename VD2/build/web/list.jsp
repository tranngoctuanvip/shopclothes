<%-- 
    Document   : list
    Created on : Jul 12, 2021, 4:05:45 PM
    Author     : Admin
--%>

<%@page import="model.Giohang"%>
<%@page import="model.sanpham"%>
<%@page import="java.util.ArrayList"%>
<%@page import="dao.productDaoImpt"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Shop Tuan Tran</title>
        <link rel="shortcut icon" type="image/x-icon" href="images/favicon/favicon.ico">
        <link href="css/bootstrap.min.css" rel="stylesheet">
        <link href="css/font-awesome.min.css" rel="stylesheet">
        <link href="css/prettyPhoto.css" rel="stylesheet">
        <link href="css/price-range.css" rel="stylesheet">
        <link href="css/animate.css" rel="stylesheet"> 
        <link href="css/main.css" rel="stylesheet">
        <link href="css/responsive.css" rel="stylesheet">
    </head>
    <body>
        <%
            productDaoImpt sanphamDao = new productDaoImpt();
            ArrayList<sanpham> arr = sanphamDao.getlist();
            int start = 0, end = 8;
            if(arr.size() < 8){
                end = arr.size();
            }
            if(request.getParameter("start")!=null){
                start = Integer.parseInt(request.getParameter("start"));
            }
            if(request.getParameter("end")!=null){
                end = Integer.parseInt(request.getParameter("end"));
            }
            ArrayList<sanpham> list = sanphamDao.getListByPage(arr, start, end);
             Giohang cart = (Giohang) session.getAttribute("cart");
           if(cart == null){
              cart = new Giohang();
              session.setAttribute("cart", cart);
           }
        %>
        <jsp:include page="header.jsp"></jsp:include>
        <jsp:include page="slider.jsp"></jsp:include>
    <session>
        <div class="container">
            <div class="row">
                <jsp:include page="cartegory.jsp"></jsp:include>
                <div class="col-sm-9 padding-right">
					<div class="features_items"><!--features_items-->
                                        <%
                                            for(sanpham sp : list){
                                        %>
						<div class="col-sm-4">
							<div class="product-image-wrapper">
								<div class="single-products">
									<div class="productinfo text-center">
										<img src="images/home/<%=sp.getHinh_anh()%>" alt="" />
										<h2><%=sp.getDon_gia()%></h2>
                                                                                <p><%=sp.getTen_san_pham()%></p>
										<a href="GioHangServlet?command=insert&ma_san_pham=<%=sp.getMa_san_pham()%>&cartID=<%=System.currentTimeMillis()%>" class="btn btn-default add-to-cart"><i class="fa fa-shopping-cart"></i>Thêm vào giỏ hàng</a>
									</div>
									<div class="product-overlay">
										<div class="overlay-content">
											<h2><%=sp.getDon_gia()%></h2>
											<p><%=sp.getTen_san_pham()%></p>
											<a href="GioHangServlet?command=insert&ma_san_pham=<%=sp.getMa_san_pham()%>&cartID=<%=System.currentTimeMillis()%>" class="btn btn-default add-to-cart"><i class="fa fa-shopping-cart"></i>Thêm vào giỏ hàng</a>
										</div>
									</div>
								</div>
								<div class="choose">
									<ul class="nav nav-pills nav-justified">
										<li><a href=""><i class="fa fa-plus-square"></i>So sánh</a></li>
										<li><a href="detail.jsp?ma_san_pham=<%=sp.getMa_san_pham()%>"><i class="fa fa-plus-square"></i>Xem chi tiết</a></li>
									</ul>
								</div>
							</div>
						</div>
                                        <%
                                            }
                                        %>
						<ul class="pagination">
                                                    <%
                                                        int a, b;
                                                        int limit = arr.size() / 8;
                               
                                                        if(limit * 8 < arr.size()){
                                                            limit +=1;
                                                        }
                                                    for(int i = 1; i<=limit; i++){
                                                        a = (i-1) * 8;
                                                        b = i * 8;
                                                        if(b > arr.size()){
                                                            b = arr.size();
                                                        } 
                                                    %>
                                                    <li class="active"><a href="list.jsp?start=<%=a%>&end=<%=b%>"><%=i%></a></li>
                                                    <%
                                                        }
                                                    %>
						</ul>
					</div><!--features_items-->
				</div>
            </div>
        </div>
    </session>
        <jsp:include page="footer.jsp"></jsp:include>
        <script src="js/jquery.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<script src="js/jquery.scrollUp.min.js"></script>
	<script src="js/price-range.js"></script>
        <script src="js/jquery.prettyPhoto.js"></script>
        <script src="js/main.js"></script>
    </body>
</html>
