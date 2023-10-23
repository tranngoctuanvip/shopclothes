<%-- 
    Document   : checkout
    Created on : Jul 11, 2021, 10:23:22 AM
    Author     : Admin
--%>

<%@page import="java.util.Map"%>
<%@page import="java.util.TreeMap"%>
<%@page import="model.sanpham"%>
<%@page import="model.Giohang"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Check-out</title>
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
            if(session.getAttribute("username")==null){
                response.sendRedirect("/VD2/account.jsp");
        }
            else{
                Giohang cart = (Giohang) session.getAttribute("cart");
            if(cart==null){
                cart = new Giohang();
                session.setAttribute("cart", cart);
            }
            TreeMap<sanpham, Integer> list = cart.getList();
        %>
        <jsp:include page="header.jsp"></jsp:include>
        <section id="cart_items">
		<div class="container">
                    <div class="review-payment">
				<h2>Thông tin đơn hàng</h2>
			</div>
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
								<a href=""><img src="images/home/<%=ds.getKey().getHinh_anh()%>" alt=""></a>
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

						
						
						<tr>
							<td colspan="4">&nbsp;</td>
							<td colspan="2">
								<table class="table table-condensed total-result">
									<tr>
										<td>Cart Sub Total</td>
										<td>$59</td>
									</tr>
									<tr>
										<td>Exo Tax</td>
										<td>$2</td>
									</tr>
									<tr class="shipping-cost">
										<td>Shipping Cost</td>
										<td>Free</td>										
									</tr>
									<tr>
										<td>Total</td>
										<td><span>$61</span></td>
									</tr>
								</table>
							</td>
						</tr>
					</tbody>
				</table>
			</div>
			<div class="shopper-informations">
				<div class="row">
					<div class="col-sm-3">
						<div class="shopper-info">
							<p>Thông tin thanh toán</p>
                                                        <form action="ThanhtoanServlet" method="post">
                                                            <p>Địa chỉ giao hàng:</p>
                                                                <textarea name="dia_chi_giao_hang"  placeholder="" rows="5"></textarea>
                                                                <p>Phương thức thanh toán: </p>
                                                                <input type="text" placeholder="Display Name">
								<input type="text" placeholder="User Name">
                                                                <select>
                                                                    <option value="Thanh toán khi giao hàng">-- Thanh toán khi giao hàng --</option>
                                                                    <option value="Chuyển khoản ngân hàng">Chuyển khoản ngân hàng</option>
								</select>
                                                                <input type="hiddien"value="<%=session.getAttribute("username")%>"/>
								<input type="submit" value="Xác nhận thanh toán" class="btn btn-primary">
							</form>
						</div>
					</div>
                                </div>
                        </div>   
			

			
		</div>
	</section> <!--/#cart_items-->
        <jsp:include page="footer.jsp"></jsp:include>
        <%
        }
        %>
        <script src="js/jquery.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<script src="js/jquery.scrollUp.min.js"></script>
	<script src="js/price-range.js"></script>
        <script src="js/jquery.prettyPhoto.js"></script>
        <script src="js/main.js"></script>
    </body>
</html>
