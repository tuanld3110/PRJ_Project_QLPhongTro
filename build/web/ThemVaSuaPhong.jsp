<%-- 
    Document   : Home
    Created on : Feb 21, 2022, 9:47:14 AM
    Author     : crrtt
--%>

<%@page import="DTO.KhachHang"%>
<%@page import="javax.xml.ws.Holder"%>
<%@page import="DTO.PhongTro"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>

        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta name="description" content="">
        <meta name="author" content="">

        <title>Quản Lý Phòng Trọ</title>

        <!-- Custom fonts for this template -->
        <link href="vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
        <link
            href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i"
            rel="stylesheet">

        <!-- Custom styles for this template -->
        <link href="css/sb-admin-2.min.css" rel="stylesheet">

        <!-- Custom styles for this page -->
        <link href="vendor/datatables/dataTables.bootstrap4.min.css" rel="stylesheet">
        <style>
            select[readonly]{
                pointer-events: none;
                touch-action: none;
            }
        </style>

    </head>

    <body id="page-top">

        <!-- Page Wrapper -->
        <div id="wrapper">

            <!-- Sidebar -->
            <ul class="navbar-nav bg-gradient-primary sidebar sidebar-dark accordion" id="accordionSidebar">

                <!-- Sidebar - Brand -->
                <a class="sidebar-brand d-flex align-items-center justify-content-center" href="QLPhong.jsp">
                    <div class="sidebar-brand-icon rotate-n-15">
                        <i class="fas fa-laugh-wink"></i>
                    </div>
                    <div class="sidebar-brand-text mx-3">Quản Lý Phòng Trọ</div>
                </a>

                <!-- Nav Item - Pages Collapse Menu -->
                <li class="nav-item">
                    <a class="nav-link collapsed" href="#" data-toggle="collapse" data-target="#collapseTwo"
                       aria-expanded="true" aria-controls="collapseTwo">
                        <i class="fas fa-fw fa-cog"></i>
                        <span>Thêm Dữ Liệu</span>
                    </a>
                    <div id="collapseTwo" class="collapse" aria-labelledby="headingTwo" data-parent="#accordionSidebar">
                        <div class="bg-white py-2 collapse-inner rounded">
                            <a class="collapse-item" href="buttons.html">Khách Hàng</a>
                            <a class="collapse-item" href="cards.html">Dịch Vụ</a>
                            <a class="collapse-item" href="cards.html">Phòng trọ</a>
                        </div>
                    </div>
                </li>

                <!-- Divider -->
                <hr class="sidebar-divider">

                <!-- Nav Item - Pages Collapse Menu -->
                <li class="nav-item">
                    <a class="nav-link collapsed" href="#" data-toggle="collapse" data-target="#collapsePages"
                       aria-expanded="true" aria-controls="collapsePages">
                        <i class="fas fa-fw fa-folder"></i>
                        <span>Quản Lý</span>
                    </a>
                    <div id="collapsePages" class="collapse" aria-labelledby="headingPages" data-parent="#accordionSidebar">
                        <div class="bg-white py-2 collapse-inner rounded">
                            <h6 class="collapse-header">Dịch Vụ:</h6>
                            <a class="collapse-item" href="login.html">Nước và Điện</a>
                            <div class="collapse-divider"></div>
                            <h6 class="collapse-header">Phòng Trọ:</h6>
                            <a class="collapse-item" href="404.html">Phòng trọ</a>
                            <a class="collapse-item" href="blank.html">Tiền thuê phòng</a>
                            <div class="collapse-divider"></div>
                            <h6 class="collapse-header">Khách Hàng:</h6>
                            <a class="collapse-item" href="404.html">Khách hàng</a>
                        </div>
                    </div>
                </li>

                <!-- Divider -->
                <hr class="sidebar-divider d-none d-md-block">

                <!-- Sidebar Toggler (Sidebar) -->
                <div class="text-center d-none d-md-inline">
                    <button class="rounded-circle border-0" id="sidebarToggle"></button>
                </div>

            </ul>
            <!-- End of Sidebar -->

            <!-- Content Wrapper -->
            <div id="content-wrapper" class="d-flex flex-column">

                <!-- Main Content -->
                <div id="content">

                    <!-- Topbar -->
                    <nav class="navbar navbar-expand navbar-light bg-white topbar mb-4 static-top shadow">

                        <!-- Sidebar Toggle (Topbar) -->
                        <form class="form-inline">
                            <button id="sidebarToggleTop" class="btn btn-link d-md-none rounded-circle mr-3">
                                <i class="fa fa-bars"></i>
                            </button>
                        </form>

                        <!-- Topbar Navbar -->
                        <ul class="navbar-nav ml-auto">

                            <!-- Nav Item - User Information -->
                            <li class="nav-item dropdown no-arrow">
                                <a class="nav-link dropdown-toggle" href="#" id="userDropdown" role="button"
                                   data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                    <span class="mr-2 d-none d-lg-inline text-gray-600 small"><%=session.getAttribute("username")%></span>
                                    <img class="img-profile rounded-circle"
                                         src="img/undraw_profile.svg">
                                </a>
                                <!-- Dropdown - User Information -->
                                <div class="dropdown-menu dropdown-menu-right shadow animated--grow-in"
                                     aria-labelledby="userDropdown">
                                    <a class="dropdown-item" href="" data-toggle="modal" data-target="#logoutModal">
                                        <i class="fas fa-sign-out-alt fa-sm fa-fw mr-2 text-gray-400"></i>
                                        Logout
                                    </a>
                                </div>
                            </li>

                        </ul>

                    </nav>
                    <!-- End of Topbar -->

                    <!-- Begin Page Content -->
                    <div class="container-fluid">

                        <!-- DataTales Example -->
                        <div class="card shadow mb-4">
                            <div class="card-header py-3">
                                <h6 class="m-0 font-weight-bold text-primary">Quản Lý Phòng Trọ</h6>
                            </div>
                            <div class="card-body">
                                <div class="table-responsive">
                                    <form action="CRUDPhongTroServlet" method="GET">
                                        <%
                                            String type = "";
                                            request.setAttribute("manage", "phongtro");
                                            try {
                                                type = request.getAttribute("type").toString();
                                            } catch (Exception e) {
                                                type = "add";
                                            }
                                            if (type == "edit") {

                                                ArrayList<PhongTro> a3 = DAO.Home.getPhongTroByID(Integer.parseInt(request.getAttribute("id").toString()));
                                                for (PhongTro dtophongtro : a3) {
                                        %>

                                        <h3 class="mb-5">Thay đổi thông tin</h3>
                                        <div class="form-outline mb-4">
                                            <h6 class="m-0 font-weight-bold text-primary">Mã phòng</h6>
                                            <select name="idPhong" class="form-control form-control-lg" readonly>
                                                <option value="<%=  dtophongtro.getIdPhong()%>"><%=  dtophongtro.getIdPhong()%></option>
                                            </select>
                                        </div>
                                        <h6 class="m-0 font-weight-bold text-primary">Người thuê</h6>
                                        <div class="form-outline mb-4">
                                            <select name="idKH" class="form-control form-control-lg"  id="gender">
                                                <%
                                                    ArrayList<KhachHang> a2 = DAO.Home.getKhachHang();
                                                    for (KhachHang dto : a2) {
                                                %>
                                                <option value="<%= dto.getIdKH()%>"><%= dto.getTenKH()%></option>
                                                <%
                                                    }
                                                %>
                                                <option value="0">Trống</option>
                                            </select>
                                        </div>
                                        <h6 class="m-0 font-weight-bold text-primary">Tháng thuê</h6>
                                        <div class="form-outline mb-4">
                                            <input name="ThangThue" type="number" id="typeEmailX-2" class="form-control form-control-lg" placeholder="Tháng Thuê" value="<%= dtophongtro.getThangThue()%>" readonly=""/>
                                        </div>
                                        <h6 class="m-0 font-weight-bold text-primary">Giá thuê</h6>
                                        <div class="form-outline mb-4">
                                            <input name="GiaThue" type="number" id="typeEmailX-2" class="form-control form-control-lg" placeholder="Giá Thuê" value="<%= dtophongtro.getGiaThue()%>"/>
                                        </div>
                                        <%
                                            }
                                        %>
                                        <button class="btn btn-primary btn-lg btn-block" type="submit" name="type" value="ApplyEdit">Thay đổi</button>
                                        <button class="btn btn-primary btn-lg btn-block" type="submit" name="type" value="Cancel">Huỷ</button>
                                        <%
                                        } else {
                                        %>
                                        <h3 class="mb-5">Thêm Phòng Trọ</h3>
                                        <h6 class="m-0 font-weight-bold text-primary">Người thuê</h6>
                                        <div class="form-outline mb-4">
                                            <select name="idKH" class="form-control form-control-lg"  id="gender">
                                                <%
                                                    ArrayList<KhachHang> a2 = DAO.Home.getKhachHang();
                                                    for (KhachHang dto : a2) {
                                                %>
                                                <option value="<%= dto.getIdKH()%>"><%= dto.getTenKH()%></option>
                                                <%
                                                    }
                                                %>
                                            </select>
                                        </div>
                                        <h6 class="m-0 font-weight-bold text-primary">Tháng thuê</h6>
                                        <div class="form-outline mb-4">
                                            <select name="ThangThue" class="form-control form-control-lg"  id="Thangthue">
                                                <option value="1">1</option>
                                                <option value="2">2</option>
                                                <option value="3">3</option>
                                                <option value="4">4</option>
                                                <option value="5">5</option>
                                                <option value="6">6</option>
                                                <option value="7">7</option>
                                                <option value="8">8</option>
                                                <option value="9">9</option>
                                                <option value="10">10</option>
                                                <option value="11">11</option>
                                                <option value="12">12</option>
                                            </select>
                                        </div>
                                        <h6 class="m-0 font-weight-bold text-primary">Giá thuê</h6>
                                        <div class="form-outline mb-4">
                                            <input name="GiaThue" type="number" id="typeEmailX-2" class="form-control form-control-lg" placeholder="Giá Thuê"/>
                                        </div>
                                        <button class="btn btn-primary btn-lg btn-block" type="submit" name="type" value="add">Thêm</button>
                                        <%
                                            }
                                        %>
                                    </form>
                                </div>
                            </div>
                        </div>

                    </div>
                    <!-- /.container-fluid -->

                </div>
                <!-- End of Main Content -->

                <!-- Footer -->
                <footer class="sticky-footer bg-white">
                    <div class="container my-auto">
                        <div class="copyright text-center my-auto">
                            <span>Copyright &copy; Your Website 2020</span>
                        </div>
                    </div>
                </footer>
                <!-- End of Footer -->

            </div>
            <!-- End of Content Wrapper -->

        </div>
        <!-- End of Page Wrapper -->

        <!-- Scroll to Top Button-->
        <a class="scroll-to-top rounded" href="#page-top">
            <i class="fas fa-angle-up"></i>
        </a>

        <!-- Logout Modal-->
        <div class="modal fade" id="logoutModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel"
             aria-hidden="true">
            <div class="modal-dialog" role="document">
                <div class="modal-content">
                    <div class="modal-header">
                        <h5 class="modal-title" id="exampleModalLabel">Ready to Leave?</h5>
                        <button class="close" type="button" data-dismiss="modal" aria-label="Close">
                            <span aria-hidden="true">×</span>
                        </button>
                    </div>
                    <div class="modal-body">Select "Logout" below if you are ready to end your current session.</div>
                    <div class="modal-footer">
                        <button class="btn btn-secondary" type="button" data-dismiss="modal">Cancel</button>
                        <a class="btn btn-primary" href="Login.jsp">Logout</a>
                    </div>
                </div>
            </div>
        </div>



        <!-- Bootstrap core JavaScript-->
        <script src="vendor/jquery/jquery.min.js"></script>
        <script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

        <!-- Core plugin JavaScript-->
        <script src="vendor/jquery-easing/jquery.easing.min.js"></script>

        <!-- Custom scripts for all pages-->
        <script src="js/sb-admin-2.min.js"></script>

        <!-- Page level plugins -->
        <script src="vendor/datatables/jquery.dataTables.min.js"></script>
        <script src="vendor/datatables/dataTables.bootstrap4.min.js"></script>

        <!-- Page level custom scripts -->
        <script src="js/demo/datatables-demo.js"></script>

    </body>

</html>