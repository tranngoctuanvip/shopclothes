<%-- 
    Document   : cartegory
    Created on : Jun 30, 2021, 11:18:11 AM
    Author     : Admin
--%>

<%@page import="dao.DanhMucDaoImpt"%>
<%@page import="model.Danhmuc"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
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
        <div class="col-sm-3">
            <%
                DanhMucDaoImpt danhmucdao = new DanhMucDaoImpt();
            %>
					<div class="left-sidebar">
						<h2>Danh mục</h2>
						<div class="panel-group category-products" id="accordian"><!--category-productsr-->
                                                    <%
                                                        for(Danhmuc danh_muc_cha : danhmucdao.getListDanhMucCha()){
                                                    %>
							<div class="panel panel-default">
                                                            
								<div class="panel-heading">
									<h4 class="panel-title">
										<a>
											<span class="badge pull-right"><i class="fa fa-plus"></i></span>
                                                                                        <%=danh_muc_cha.getTen_danh_muc() %>
										</a>
									</h4>
                                                                </div>
                                                                    
                                                                       
                                                                           
									<div class="panel-body">
										<ul>
                                                                                    <%for(Danhmuc danh_muc_con : danhmucdao.getListDanhMucCon(danh_muc_cha.getMa_danh_muc())){%>
                                                                                    <li><a href="index.jsp?ma_danh_muc=<%=danh_muc_con.getMa_danh_muc()%>"><%=danh_muc_con.getTen_danh_muc()%> </a></li>
                                                                                    <% } %>
										</ul>
									</div>
                                                                                    
                                                                       
                                                                                    
							</div>
                                                    <% } %>	
                                                </div><!--/category-products-->
					
						<div class="brands_products"><!--brands_products-->
							<h2>Brands</h2>
							<div class="brands-name">
								<ul class="nav nav-pills nav-stacked">
									<li><a href="#"> <span class="pull-right">(50)</span>Acne</a></li>
									<li><a href="#"> <span class="pull-right">(56)</span>Grüne Erde</a></li>
									<li><a href="#"> <span class="pull-right">(27)</span>Albiro</a></li>
									<li><a href="#"> <span class="pull-right">(32)</span>Ronhill</a></li>
									<li><a href="#"> <span class="pull-right">(5)</span>Oddmolly</a></li>
									<li><a href="#"> <span class="pull-right">(9)</span>Boudestijn</a></li>
									<li><a href="#"> <span class="pull-right">(4)</span>Rösch creative culture</a></li>
								</ul>
							</div>
						</div><!--/brands_products-->
						
						<div class="price-range"><!--price-range-->
							<h2>Price Range</h2>
							<div class="well text-center">
								 <input type="text" class="span2" value="" data-slider-min="0" data-slider-max="600" data-slider-step="5" data-slider-value="[250,450]" id="sl2" ><br />
								 <b class="pull-left">$ 0</b> <b class="pull-right">$ 600</b>
							</div>
						</div><!--/price-range-->
						
						<div class="shipping text-center"><!--shipping-->
							<img src="images/home/shipping.jpg" alt="" />
						</div><!--/shipping-->
					
					</div>
				</div>
        <script src="js/jquery.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<script src="js/jquery.scrollUp.min.js"></script>
	<script src="js/price-range.js"></script>
        <script src="js/jquery.prettyPhoto.js"></script>
        <script src="js/main.js"></script>
    </body>
</html>
