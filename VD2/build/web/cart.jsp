<%-- 
    Document   : cart
    Created on : Jun 30, 2021, 11:01:17 AM
    Author     : Admin
--%>


<%@page import="java.util.TreeMap"%>
<%@page import="model.Giohang"%>
<%@page import="java.util.Map"%>
<%@page import="model.sanpham"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cart</title>
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
            Giohang cart = (Giohang) session.getAttribute("cart");
            if(cart==null){
                cart = new Giohang();
                session.setAttribute("cart", cart);
            }
            TreeMap<sanpham, Integer> list = cart.getList();
        %>
        <jsp:include page="header.jsp"></jsp:include>    
    <session>
        <div class="container">
            <div class="row">
                <section id="cart_items">
		<div class="container">
			<div class="table-responsive cart_info">
				<table class="table table-condensed">
					<thead>
						<tr class="cart_menu">
							<td class="image">Hình ảnh</td>
							<td class="description">Tên sản phẩm</td>
							<td class="price">Gía</td>
							<td class="quantity">Số lượng</td>
							<td class="total">Tổng</td>
							<td></td>
						</tr>
					</thead>
					<tbody>
                                        <%
                                            for(Map.Entry<sanpham, Integer> ds : list.entrySet()){
                                        %>
						<tr>
							<td class="cart_product">
                                                            <a href=""><img src="images/home/<%=ds.getKey().getHinh_anh()%>" alt=""/></a>
							</td>
							<td class="cart_description">
                                                            <h4><a href=""><%=ds.getKey().getTen_san_pham()%></a></h4>
								<p>Mã sản phẩm: <%=ds.getKey().getMa_san_pham()%></p>
							</td>
							<td class="cart_price">
								<p><%=ds.getKey().getDon_gia()%></p>
							</td>
							<td class="cart_quantity">
								<div class="cart_quantity_button">
                                                                    <a class="cart_quantity_up" href="GioHangServlet?command=insert&ma_san_pham=<%=ds.getKey().getMa_san_pham()%>&cartID=<%=System.currentTimeMillis()%>"> + </a>
                                                                        <input class="cart_quantity_input" type="text" value="<%=ds.getValue()%>" autocomplete="off" size="2">
									<a class="cart_quantity_down" href="GioHangServlet?command=sub&ma_san_pham=<%=ds.getKey().getMa_san_pham()%>&cartID=<%=System.currentTimeMillis()%>"> - </a>
								</div>
							</td>
							<td class="cart_total">
								<p class="cart_total_price"><%=ds.getValue() * ds.getKey().getDon_gia()%></p>
							</td>
							<td class="cart_delete">
								<a class="cart_quantity_delete" href="GioHangServlet?command=remove&ma_san_pham=<%=ds.getKey().getMa_san_pham()%>&cartID=<%=System.currentTimeMillis()%>"><i class="fa fa-times"></i></a>
							</td>
						</tr>
                                                <%
                                                    }
                                                %>
					</tbody>
				</table>
			</div>
		</div>
	</section> <!--/#cart_items-->
        <section id="do_action">
		<div class="container">
			<div class="heading">
				<h3>What would you like to do next?</h3>
				<p>Choose if you have a discount code or reward points you want to use or would like to estimate your delivery cost.</p>
			</div>
			<div class="row">
				<div class="col-sm-6">
					<div class="chose_area">
						<ul class="user_option">
							<li>
								<input type="checkbox">
								<label>Use Coupon Code</label>
							</li>
							<li>
								<input type="checkbox">
								<label>Use Gift Voucher</label>
							</li>
							<li>
								<input type="checkbox">
								<label>Estimate Shipping & Taxes</label>
							</li>
						</ul>
						<ul class="user_info">
							<li class="single_field">
								<label>Country:</label>
								<select>
									<option>United States</option>
									<option>Bangladesh</option>
									<option>UK</option>
									<option>India</option>
									<option>Pakistan</option>
									<option>Ucrane</option>
									<option>Canada</option>
									<option>Dubai</option>
								</select>
								
							</li>
							<li class="single_field">
								<label>Region / State:</label>
								<select>
									<option>Select</option>
									<option>Dhaka</option>
									<option>London</option>
									<option>Dillih</option>
									<option>Lahore</option>
									<option>Alaska</option>
									<option>Canada</option>
									<option>Dubai</option>
								</select>
							
							</li>
							<li class="single_field zip-field">
								<label>Zip Code:</label>
								<input type="text">
							</li>
						</ul>
						<a class="btn btn-default update" href="">Get Quotes</a>
						<a class="btn btn-default check_out" href="">Continue</a>
					</div>
				</div>
				<div class="col-sm-6">
					<div class="total_area">
						<ul>
							<li>Cart Sub Total <span>$59</span></li>
							<li>Eco Tax <span>$2</span></li>
							<li>Shipping Cost <span>Free</span></li>
							<li>Total <span>$61</span></li>
						</ul>
							<a class="btn btn-default update" href="">Hủy đơn hàng</a>
							<a class="btn btn-default check_out" href="checkout.jsp">Thanh toán</a>
					</div>
				</div>
			</div>
		</div>
	</section><!--/#do_action-->
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
