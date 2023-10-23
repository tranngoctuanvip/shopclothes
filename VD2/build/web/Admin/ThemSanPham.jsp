<%-- 
    Document   : ThemSanPham
    Created on : Jul 17, 2021, 2:45:36 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="X-UA-Compatible" content="IE=edge" />
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
        <meta name="description" content="" />
        <meta name="author" content="" />
        <link href="css/style1.css" rel="stylesheet"/>
        <title>Dashboard - SB Admin</title>
        <link href="https://cdn.jsdelivr.net/npm/simple-datatables@latest/dist/style.css" rel="stylesheet" />
        <link href="css/styles.css" rel="stylesheet" />
        <script src="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/js/all.min.js" crossorigin="anonymous"></script>
    </head>
        <body class="sb-nav-fixed">
        <jsp:include page="header.jsp"></jsp:include>
        <div id="layoutSidenav">
            <div id="layoutSidenav_content">
                <jsp:include page="category.jsp"></jsp:include>
                <div class="d1">
                <form class="cls " action="" method="POST">    
                    <table border="0">
                        <tbody>
                            <tr>
                                <td>Tên sản phẩm:</td>
                                <td><input type="text" name="ten_san_pham" value="" /></td>
                            </tr>
                            <tr>
                                <td>Danh mục sản phẩm:</td>
                                <td><select name="danh_muc">
                                        <option>Điện thoại</option>
                                        <option>Máy tính</option>
                                    </select></td>
                                
                            </tr>
                            <tr>
                                <td>Giá:</td>
                                <td><input type="text" name="gia" value="" /></td>
                                
                            </tr>
                            <tr>
                                <td>Số lượng:</td>
                                <td><input type="text" name="so_luong" value="" /></td>
                                
                            </tr>
                            <tr>
                                <td>Hình ảnh:</td>
                                <td><input type="file" name="hinh_anh" value="" /></td>
                                
                            </tr>
                            <tr>
                                <td> Mô tả: </td>
                                <td><textarea name="mo_ta" rows="4" cols="20">
                                    </textarea></td>           
                            </tr>
                            <tr>
                                <td><input type="submit" value="Đồng ý" /></td>           
                            </tr>
                        </tbody>
                    </table>

                </form>
</div>
                <jsp:include page="footer.jsp"></jsp:include>
            </div>
        </div>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js" crossorigin="anonymous"></script>
        <script src="js/scripts.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.8.0/Chart.min.js" crossorigin="anonymous"></script>
        <script src="assets/demo/chart-area-demo.js"></script>
        <script src="assets/demo/chart-bar-demo.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/simple-datatables@latest" crossorigin="anonymous"></script>
        <script src="js/datatables-simple-demo.js"></script>
    </body>
</html>
