package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import DTO.ThuTien;
import DTO.DichVu;
import DTO.KhachHang;
import javax.xml.ws.Holder;
import DTO.PhongTro;
import java.util.ArrayList;

public final class ThemVaSuaDV_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("        <meta name=\"description\" content=\"\">\n");
      out.write("        <meta name=\"author\" content=\"\">\n");
      out.write("\n");
      out.write("        <title>Qu???n L?? Ph??ng Tr???</title>\n");
      out.write("\n");
      out.write("        <!-- Custom fonts for this template -->\n");
      out.write("        <link href=\"vendor/fontawesome-free/css/all.min.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        <link\n");
      out.write("            href=\"https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i\"\n");
      out.write("            rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- Custom styles for this template -->\n");
      out.write("        <link href=\"css/sb-admin-2.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- Custom styles for this page -->\n");
      out.write("        <link href=\"vendor/datatables/dataTables.bootstrap4.min.css\" rel=\"stylesheet\">\n");
      out.write("        <style>\n");
      out.write("            select[readonly]{\n");
      out.write("                pointer-events: none;\n");
      out.write("                touch-action: none;\n");
      out.write("            }\n");
      out.write("            input::-webkit-outer-spin-button,\n");
      out.write("            input::-webkit-inner-spin-button {\n");
      out.write("                -webkit-appearance: none;\n");
      out.write("                margin: 0;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body id=\"page-top\">\n");
      out.write("\n");
      out.write("        <!-- Page Wrapper -->\n");
      out.write("        <div id=\"wrapper\">\n");
      out.write("\n");
      out.write("            <!-- Sidebar -->\n");
      out.write("            <ul class=\"navbar-nav bg-gradient-primary sidebar sidebar-dark accordion\" id=\"accordionSidebar\">\n");
      out.write("\n");
      out.write("                <!-- Sidebar - Brand -->\n");
      out.write("                <a class=\"sidebar-brand d-flex align-items-center justify-content-center\" href=\"QLPhong.jsp\">\n");
      out.write("                    <div class=\"sidebar-brand-icon rotate-n-15\">\n");
      out.write("                        <i class=\"fas fa-laugh-wink\"></i>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"sidebar-brand-text mx-3\">Qu???n L?? Ph??ng Tr???</div>\n");
      out.write("                </a>\n");
      out.write("\n");
      out.write("                <!-- Nav Item - Pages Collapse Menu -->\n");
      out.write("                <li class=\"nav-item\">\n");
      out.write("                    <a class=\"nav-link collapsed\" href=\"#\" data-toggle=\"collapse\" data-target=\"#collapseTwo\"\n");
      out.write("                       aria-expanded=\"true\" aria-controls=\"collapseTwo\">\n");
      out.write("                        <i class=\"fas fa-fw fa-cog\"></i>\n");
      out.write("                        <span>Th??m D??? Li???u</span>\n");
      out.write("                    </a>\n");
      out.write("                    <div id=\"collapseTwo\" class=\"collapse\" aria-labelledby=\"headingTwo\" data-parent=\"#accordionSidebar\">\n");
      out.write("                        <div class=\"bg-white py-2 collapse-inner rounded\">\n");
      out.write("                            <a class=\"collapse-item\" href=\"ThemVaSuaKH.jsp\">Kh??ch H??ng</a>\n");
      out.write("                            <a class=\"collapse-item\" href=\"ThemVaSuaDV.jsp\">D???ch V???</a>\n");
      out.write("                            <a class=\"collapse-item\" href=\"ThemVaSuaPhong.jsp\">Ph??ng Tr???</a>\n");
      out.write("                            <a class=\"collapse-item\" href=\"ThemVaSuaTT.jsp\">Ho?? ????n</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </li>\n");
      out.write("\n");
      out.write("                <!-- Divider -->\n");
      out.write("                <hr class=\"sidebar-divider\">\n");
      out.write("\n");
      out.write("                <!-- Nav Item - Pages Collapse Menu -->\n");
      out.write("                <li class=\"nav-item\">\n");
      out.write("                    <a class=\"nav-link collapsed\" href=\"#\" data-toggle=\"collapse\" data-target=\"#collapsePages\"\n");
      out.write("                       aria-expanded=\"true\" aria-controls=\"collapsePages\">\n");
      out.write("                        <i class=\"fas fa-fw fa-folder\"></i>\n");
      out.write("                        <span>Qu???n L??</span>\n");
      out.write("                    </a>\n");
      out.write("                    <div id=\"collapsePages\" class=\"collapse\" aria-labelledby=\"headingPages\" data-parent=\"#accordionSidebar\">\n");
      out.write("                        <div class=\"bg-white py-2 collapse-inner rounded\">\n");
      out.write("                            <h6 class=\"collapse-header\">D???ch V???:</h6>\n");
      out.write("                            <a class=\"collapse-item\" href=\"QLDichVu.jsp\">N?????c v?? ??i???n</a>\n");
      out.write("                            <div class=\"collapse-divider\"></div>\n");
      out.write("                            <h6 class=\"collapse-header\">Ph??ng Tr???:</h6>\n");
      out.write("                            <a class=\"collapse-item\" href=\"QLPhong.jsp\">Ph??ng tr???</a>\n");
      out.write("                            <a class=\"collapse-item\" href=\"QLThuTien.jsp\">Ti???n Thu??</a>\n");
      out.write("                            <div class=\"collapse-divider\"></div>\n");
      out.write("                            <h6 class=\"collapse-header\">Kh??ch H??ng:</h6>\n");
      out.write("                            <a class=\"collapse-item\" href=\"QLKH.jsp\">Kh??ch h??ng</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </li>\n");
      out.write("\n");
      out.write("                <!-- Divider -->\n");
      out.write("                <hr class=\"sidebar-divider d-none d-md-block\">\n");
      out.write("\n");
      out.write("                <!-- Sidebar Toggler (Sidebar) -->\n");
      out.write("                <div class=\"text-center d-none d-md-inline\">\n");
      out.write("                    <button class=\"rounded-circle border-0\" id=\"sidebarToggle\"></button>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </ul>\n");
      out.write("            <!-- End of Sidebar -->\n");
      out.write("\n");
      out.write("            <!-- Content Wrapper -->\n");
      out.write("            <div id=\"content-wrapper\" class=\"d-flex flex-column\">\n");
      out.write("\n");
      out.write("                <!-- Main Content -->\n");
      out.write("                <div id=\"content\">\n");
      out.write("\n");
      out.write("                    <!-- Topbar -->\n");
      out.write("                    <nav class=\"navbar navbar-expand navbar-light bg-white topbar mb-4 static-top shadow\">\n");
      out.write("\n");
      out.write("                        <!-- Sidebar Toggle (Topbar) -->\n");
      out.write("                        <form class=\"form-inline\">\n");
      out.write("                            <button id=\"sidebarToggleTop\" class=\"btn btn-link d-md-none rounded-circle mr-3\">\n");
      out.write("                                <i class=\"fa fa-bars\"></i>\n");
      out.write("                            </button>\n");
      out.write("                        </form>\n");
      out.write("\n");
      out.write("                        <!-- Topbar Navbar -->\n");
      out.write("                        <ul class=\"navbar-nav ml-auto\">\n");
      out.write("\n");
      out.write("                            <!-- Nav Item - User Information -->\n");
      out.write("                            <li class=\"nav-item dropdown no-arrow\">\n");
      out.write("                                <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"userDropdown\" role=\"button\"\n");
      out.write("                                   data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                                    <span class=\"mr-2 d-none d-lg-inline text-gray-600 small\">");
      out.print(session.getAttribute("username"));
      out.write("</span>\n");
      out.write("                                    <img class=\"img-profile rounded-circle\"\n");
      out.write("                                         src=\"img/undraw_profile.svg\">\n");
      out.write("                                </a>\n");
      out.write("                                <!-- Dropdown - User Information -->\n");
      out.write("                                <div class=\"dropdown-menu dropdown-menu-right shadow animated--grow-in\"\n");
      out.write("                                     aria-labelledby=\"userDropdown\">\n");
      out.write("                                    <a class=\"dropdown-item\" href=\"\" data-toggle=\"modal\" data-target=\"#logoutModal\">\n");
      out.write("                                        <i class=\"fas fa-sign-out-alt fa-sm fa-fw mr-2 text-gray-400\"></i>\n");
      out.write("                                        Logout\n");
      out.write("                                    </a>\n");
      out.write("                                </div>\n");
      out.write("                            </li>\n");
      out.write("\n");
      out.write("                        </ul>\n");
      out.write("\n");
      out.write("                    </nav>\n");
      out.write("                    <!-- End of Topbar -->\n");
      out.write("\n");
      out.write("                    <!-- Begin Page Content -->\n");
      out.write("                    <div class=\"container-fluid\">\n");
      out.write("\n");
      out.write("                        <!-- DataTales Example -->\n");
      out.write("                        <div class=\"card shadow mb-4\">\n");
      out.write("                            <div class=\"card-header py-3\">\n");
      out.write("                                <h6 class=\"m-0 font-weight-bold text-primary\">Qu???n L?? D???ch V???</h6>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"card-body\">\n");
      out.write("                                <div class=\"table-responsive\">\n");
      out.write("                                    <form action=\"CRUD\" method=\"GET\">\n");
      out.write("                                        <input type=\"hidden\" name=\"manage\" value=\"DV\">\n");
      out.write("                                        ");

                                            String type = "";
                                            try {
                                                type = request.getAttribute("type").toString();
                                            } catch (Exception e) {
                                                System.out.println(e);
                                                type = "add";
                                            }
                                            if (type == "edit") {
                                                ArrayList<DichVu> dto = DAO.Home.getDichVuByID(Integer.parseInt(request.getParameter("id").toString()));
                                                for (DichVu dtoDV : dto) {
                                        
      out.write("\n");
      out.write("                                        <h3 class=\"mb-5\">Thay ?????i th??ng tin</h3>\n");
      out.write("                                        <h6 class=\"m-0 font-weight-bold text-primary\">ID D???ch V???</h6>\n");
      out.write("                                        <div class=\"form-outline mb-4\">\n");
      out.write("                                            <input name=\"id\" type=\"text\" id=\"typeEmailX-2\" class=\"form-control form-control-lg\" value=\"");
      out.print( dtoDV.getIdDV());
      out.write("\" readonly/>\n");
      out.write("                                        </div>\n");
      out.write("                                        <h6 class=\"m-0 font-weight-bold text-primary\">ID Ho?? ????n</h6>\n");
      out.write("                                        <div class=\"form-outline mb-4\">\n");
      out.write("                                            <select name=\"idHD\" class=\"form-control form-control-lg\"  id=\"gender\">\n");
      out.write("                                                ");

                                                    ArrayList<ThuTien> arr = DAO.Home.getThuTien();
                                                    for (ThuTien dtoEdit : arr) {
                                                        if (dtoEdit.getIdThuTien() == Integer.parseInt(request.getParameter("idTT"))) {
                                                
      out.write("\n");
      out.write("                                                <option value=\"");
      out.print( dtoEdit.getIdThuTien());
      out.write("\" selected>");
      out.print( dtoEdit.getIdThuTien());
      out.write("</option>\n");
      out.write("                                                ");

                                                } else {

                                                
      out.write("\n");
      out.write("                                                <option value=\"");
      out.print( dtoEdit.getIdThuTien());
      out.write('"');
      out.write('>');
      out.print( dtoEdit.getIdThuTien());
      out.write("</option>\n");
      out.write("                                                ");

                                                        }
                                                    }
                                                
      out.write("\n");
      out.write("                                            </select>\n");
      out.write("                                        </div>\n");
      out.write("                                        <h6 class=\"m-0 font-weight-bold text-primary\">T??n D???ch V???</h6>\n");
      out.write("                                        <div class=\"form-outline mb-4\">\n");
      out.write("                                            <select name=\"name\" class=\"form-control form-control-lg\"  id=\"gender\">\n");
      out.write("                                                ");

                                                    if (dtoDV.getTenDV().equals("??i???n")) {
                                                
      out.write("\n");
      out.write("                                                <option value=\"??i???n\" selected>??i???n</option>\n");
      out.write("                                                <option value=\"N?????c\">N?????c</option>\n");
      out.write("                                                ");

                                                } else {

                                                
      out.write("\n");
      out.write("                                                <option value=\"??i???n\">??i???n</option>\n");
      out.write("                                                <option value=\"N?????c\" selected>N?????c</option>\n");
      out.write("                                                ");

                                                }
                                                
      out.write("\n");
      out.write("                                            </select>\n");
      out.write("                                        </div>\n");
      out.write("                                        <h6 class=\"m-0 font-weight-bold text-primary\">Gi?? D???ch V???</h6>\n");
      out.write("                                        <div class=\"form-outline mb-4\">\n");
      out.write("                                            <input name=\"price\" type=\"number\" id=\"typeEmailX-2\" class=\"form-control form-control-lg\" placeholder=\"Gi?? D???ch V???\" value=\"");
      out.print( dtoDV.getGiaDV());
      out.write("\" required pattern=\"^[1-9]\\d*$\" title=\"Gi?? Ti???n ph???i l?? s??? d????ng\"/>\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("                                        <button class=\"btn btn-primary btn-lg btn-block\" type=\"submit\"name=\"type\" value=\"ApplyEdit\">Thay ?????i</button>\n");
      out.write("                                        <button class=\"btn btn-primary btn-lg btn-block\" type=\"submit\" name=\"type\" value=\"Cancel\">Hu???</button>\n");
      out.write("                                        ");

                                            }
                                        } else {
                                        
      out.write("\n");
      out.write("                                        <h3 class=\"mb-5\">Th??m D???ch V???</h3>\n");
      out.write("                                        <h6 class=\"m-0 font-weight-bold text-primary\">ID Ho?? ????n</h6>\n");
      out.write("                                        <div class=\"form-outline mb-4\">\n");
      out.write("                                            <select name=\"idHD\" class=\"form-control form-control-lg\"  id=\"gender\">\n");
      out.write("                                                ");

                                                    ArrayList<ThuTien> arr = DAO.Home.getThuTien();
                                                    for (ThuTien dto : arr) {
                                                
      out.write("\n");
      out.write("                                                <option value=\"");
      out.print( dto.getIdThuTien());
      out.write('"');
      out.write('>');
      out.print( dto.getIdThuTien());
      out.write("</option>\n");
      out.write("                                                ");

                                                    }
                                                
      out.write("\n");
      out.write("                                            </select>\n");
      out.write("                                        </div>\n");
      out.write("                                        <h6 class=\"m-0 font-weight-bold text-primary\">T??n D???ch V???</h6>\n");
      out.write("                                        <div class=\"form-outline mb-4\">\n");
      out.write("                                            <input name=\"name\" type=\"text\" id=\"typeEmailX-2\" class=\"form-control form-control-lg\" placeholder=\"T??n D???ch V???\" required title=\"T??n kh??ng h???p l???\"/>\n");
      out.write("                                        </div>\n");
      out.write("                                        <h6 class=\"m-0 font-weight-bold text-primary\">Gi?? D???ch V???</h6>\n");
      out.write("                                        <div class=\"form-outline mb-4\">\n");
      out.write("                                            <input name=\"price\" type=\"text\" id=\"typeEmailX-2\" class=\"form-control form-control-lg\" placeholder=\"Gi?? D???ch V???\" required required pattern=\"^[1-9]\\d*$\" title=\"Gi?? Ti???n ph???i l?? s??? d????ng\"/>\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("                                        <button class=\"btn btn-primary btn-lg btn-block\" type=\"submit\"  name=\"type\" value=\"add\">Th??m</button>\n");
      out.write("                                        ");

                                            }
                                        
      out.write("\n");
      out.write("                                    </form>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <!-- /.container-fluid -->\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <!-- End of Main Content -->\n");
      out.write("\n");
      out.write("                <!-- Footer -->\n");
      out.write("                <footer class=\"sticky-footer bg-white\">\n");
      out.write("                    <div class=\"container my-auto\">\n");
      out.write("                        <div class=\"copyright text-center my-auto\">\n");
      out.write("                            <span>Copyright &copy; Your Website 2020</span>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </footer>\n");
      out.write("                <!-- End of Footer -->\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <!-- End of Content Wrapper -->\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <!-- End of Page Wrapper -->\n");
      out.write("\n");
      out.write("        <!-- Scroll to Top Button-->\n");
      out.write("        <a class=\"scroll-to-top rounded\" href=\"#page-top\">\n");
      out.write("            <i class=\"fas fa-angle-up\"></i>\n");
      out.write("        </a>\n");
      out.write("\n");
      out.write("        <!-- Logout Modal-->\n");
      out.write("        <div class=\"modal fade\" id=\"logoutModal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"exampleModalLabel\"\n");
      out.write("             aria-hidden=\"true\">\n");
      out.write("            <div class=\"modal-dialog\" role=\"document\">\n");
      out.write("                <div class=\"modal-content\">\n");
      out.write("                    <div class=\"modal-header\">\n");
      out.write("                        <h5 class=\"modal-title\" id=\"exampleModalLabel\">Ready to Leave?</h5>\n");
      out.write("                        <button class=\"close\" type=\"button\" data-dismiss=\"modal\" aria-label=\"Close\">\n");
      out.write("                            <span aria-hidden=\"true\">??</span>\n");
      out.write("                        </button>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"modal-body\">Select \"Logout\" below if you are ready to end your current session.</div>\n");
      out.write("                    <div class=\"modal-footer\">\n");
      out.write("                        <button class=\"btn btn-secondary\" type=\"button\" data-dismiss=\"modal\">Cancel</button>\n");
      out.write("                        <a class=\"btn btn-primary\" href=\"Login.jsp\">Logout</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- Bootstrap core JavaScript-->\n");
      out.write("        <script src=\"vendor/jquery/jquery.min.js\"></script>\n");
      out.write("        <script src=\"vendor/bootstrap/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- Core plugin JavaScript-->\n");
      out.write("        <script src=\"vendor/jquery-easing/jquery.easing.min.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- Custom scripts for all pages-->\n");
      out.write("        <script src=\"js/sb-admin-2.min.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- Page level plugins -->\n");
      out.write("        <script src=\"vendor/datatables/jquery.dataTables.min.js\"></script>\n");
      out.write("        <script src=\"vendor/datatables/dataTables.bootstrap4.min.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- Page level custom scripts -->\n");
      out.write("        <script src=\"js/demo/datatables-demo.js\"></script>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("</html>");
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
