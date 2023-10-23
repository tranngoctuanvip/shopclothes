<%-- 
    Document   : khachhang
    Created on : Jul 15, 2021, 10:47:20 AM
    Author     : Admin
--%>

<%@page import="model.Danhmuc"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.sanpham"%>
<%@page import="dao.productDaoImpt"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8" />
        <meta http-equiv="X-UA-Compatible" content="IE=edge" />
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
        <meta name="description" content="" />
        <meta name="author" content="" />
        <title>Tables - SB Admin</title>
        <link href="https://cdn.jsdelivr.net/npm/simple-datatables@latest/dist/style.css" rel="stylesheet" />
        <link href="css/styles.css" rel="stylesheet" />
        <script src="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/js/all.min.js" crossorigin="anonymous"></script>
    </head>
    <body class="sb-nav-fixed">
        <%
            productDaoImpt sanphDao = new productDaoImpt();
            ArrayList<sanpham> list = sanphDao.getlist();
        %>
        <jsp:include page="header.jsp"></jsp:include>
        <div id="layoutSidenav">
            <div id="layoutSidenav_content">
                <jsp:include page="category.jsp"></jsp:include>
                <main>
                    <div class="container-fluid px-4">
                        <h1 class="mt-4">Sản phẩm</h1>
                        <ol class="breadcrumb mb-4">
                            <li class="breadcrumb-item"><a href="index.jsp">Thống kê</a></li>
                            <li class="breadcrumb-item active">Sản phẩm</li>
                        </ol>
                        <div class="card mb-4">
                            <div class="card-body">
                                DataTables is a third party plugin that is used to generate the demo table below. For more information about DataTables, please visit the
                                <a target="_blank" href="https://datatables.net/">official DataTables documentation</a>
                                .
                            </div>
                        </div>
                        <div class="card mb-4">
                            <div class="card-header">
                                <i class="fas fa-table me-1"></i>
                                Sản phẩm
                            </div>
                            <div class="card-body">
                                <table id="datatablesSimple">
                                    
                                        <tr>
                                            <th style="text-align: center">Mã sản phẩm</th>
                                            <th style="text-align: center">Mã danh mục</th>
                                            <th style="text-align: center">Tên sản phẩm</th>
                                            <th style="text-align: center">Hình ảnh</th>
                                            <th style="text-align: center">Số lượng</th>
                                            <th style="text-align: center">Đơn giá</th>
                                            <th style="text-align: center">Giảm giá</th>
                                            <th style="text-align: center">Thao tác</th>
                                        </tr>
                                <%
                                    for(sanpham sp : list){
                                %>
                                        <tr>
                                            <td style="text-align: center"><%=sp.getMa_san_pham()%></td>
                                            <td style="text-align: center"><%=sp.getDanhmuc().getMa_danh_muc()%></td>
                                            <td style="text-align: center"><%=sp.getTen_san_pham()%></td>
                                            <td style="text-align: center"><img width="80" src="/VD2/images/home/<%=sp.getHinh_anh()%>"/></td>
                                            <td style="text-align: center"><%=sp.getSo_luong()%></td>
                                            <td style="text-align: center"><%=sp.getDon_gia()%></td>
                                            <td style="text-align: center"><%=sp.getGiam_gia()%></td>
                                            <td style="text-align: center">
                                                <a href="Suasanpham?ma_san_pham">Sửa</a> -
                                                <a href="xoaSPS?ma_san_pham=<%=sp.getMa_san_pham()%>"> Xóa </a>
                                            </td>
                                        </tr>
                                        <%
                                            }
                                        %>
                                </table>
                            </div>
                        </div>
                    </div>
                </main>
                <jsp:include page="footer.jsp"></jsp:include>
            </div>
        </div>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js" crossorigin="anonymous"></script>
        <script src="js/scripts.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/simple-datatables@latest" crossorigin="anonymous"></script>
        <script src="js/datatables-simple-demo.js"></script>
    </body>
</html>


