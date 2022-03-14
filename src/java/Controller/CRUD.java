/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.Home;
import DTO.DichVu;
import DTO.KhachHang;
import DTO.PhongTro;
import DTO.ThuTien;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author gbuid
 */
@WebServlet(name = "CRUD", urlPatterns = {"/CRUD"})
public class CRUD extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            String id = request.getParameter("id");
            String type = request.getParameter("type");
            String manage = null;
            try {
                manage = request.getAttribute("manage").toString();
            } catch (Exception e) {
                manage = request.getParameter("manage");
            }
            switch (manage) {
                case "phongtro":
                    switch (type) {
                        case "del":
                            DAO.Home.DeleteSQL("UPDATE phongTro SET trangThai = 0 WHERE idPhong=" + id);
                            response.sendRedirect("QLPhong.jsp");
                            break;
                        case "edit":
                            request.setAttribute("type", "edit");
                            request.setAttribute("id", id);
                            request.getRequestDispatcher("ThemVaSuaPhong.jsp").forward(request, response);
                            break;
                        case "Cancel":
                            response.sendRedirect("QLPhong.jsp");
                            break;
                        case "ApplyEdit":
                            try {
                                PhongTro dto = new PhongTro();
                                System.out.println(request.getParameter("ThangThue"));
                                dto.setIdPhong(Integer.parseInt(request.getParameter("idPhong")));
                                dto.setIdKH(Integer.parseInt(request.getParameter("idKH")));
                                dto.setThangThue(Integer.parseInt(request.getParameter("ThangThue")));
                                dto.setGiaThue(Float.parseFloat(request.getParameter("GiaThue")));
                                if (Integer.parseInt(request.getParameter("idKH")) == 0) {
                                    dto.setTrangThai(2);
                                } else {
                                    dto.setTrangThai(Integer.parseInt(request.getParameter("trangThai")));
                                }
                                DAO.Home.UpdatePhongTro(dto);
                                request.getRequestDispatcher("QLPhong.jsp").forward(request, response);
                            } catch (Exception e) {
                                System.out.println(e);
                            }
                            break;
                        case "add":
                            try {
                                PhongTro dto = new PhongTro();
                                dto.setIdKH(Integer.parseInt(request.getParameter("idKH")));
                                dto.setThangThue(Integer.parseInt(request.getParameter("ThangThue")));
                                dto.setGiaThue(Float.parseFloat(request.getParameter("GiaThue")));
                                dto.setTrangThai(Integer.parseInt(request.getParameter("trangThai")));
                                DAO.Home.InsertPhongTro(dto);
                                request.getRequestDispatcher("QLPhong.jsp").forward(request, response);
                            } catch (Exception e) {
                                System.out.println(e);
                            }
                            break;
                    }
                    break;
                case "KH":
                    switch (type) {
                        case "del":
                            DAO.Home.DeleteSQL("UPDATE khachHang SET trangThai = 0 WHERE idKH=" + id);
                            if (DAO.Home.getPhongTroByIDKH(Integer.parseInt(id)).isEmpty()) {
                                response.sendRedirect("QLKH.jsp");
                            } else {
                                DAO.Home.RemoveOutOfPT(Integer.parseInt(id));
                                response.sendRedirect("QLKH.jsp");
                            }
                            break;
                        case "edit":
                            request.setAttribute("type", "edit");
                            request.setAttribute("id", id);
                            request.getRequestDispatcher("ThemVaSuaKH.jsp").forward(request, response);
                            break;
                        case "Cancel":
                            response.sendRedirect("QLKH.jsp");
                            break;
                        case "ApplyEdit":
                            try {
                                KhachHang dto = new KhachHang();
                                dto.setIdKH(Integer.parseInt(request.getParameter("id")));
                                dto.setTenKH(request.getParameter("name"));
                                dto.setSDT(request.getParameter("phone"));
                                dto.setCMND(request.getParameter("cmnd"));
                                dto.setGioiTinh(Integer.parseInt(request.getParameter("gender").toString()));
                                DAO.Home.UpdateKH(dto);
                                request.getRequestDispatcher("QLKH.jsp").forward(request, response);
                            } catch (Exception e) {
                                System.out.println(e);
                            }
                            break;
                        case "add":
                            try {
                                KhachHang dto = new KhachHang();
                                dto.setTenKH(request.getParameter("name"));
                                dto.setSDT(request.getParameter("phone"));
                                dto.setCMND(request.getParameter("cmnd"));
                                dto.setGioiTinh(Integer.parseInt(request.getParameter("gender")));
                                DAO.Home.InsertKH(dto);
                                request.getRequestDispatcher("QLKH.jsp").forward(request, response);
                            } catch (Exception e) {
                                System.out.println(e);
                            }
                            break;
                    }
                    break;
                case "DV":
                    switch (type) {
                        case "del":
                            DAO.Home.DeleteSQL("UPDATE dichVu SET trangThai = 0 WHERE idDV=" + id);
                            response.sendRedirect("QLDichVu.jsp");
                            break;
                        case "edit":
                            request.setAttribute("type", "edit");
                            request.setAttribute("id", id);
                            request.setAttribute("idTT", request.getParameter("idTT"));
                            request.getRequestDispatcher("ThemVaSuaDV.jsp").forward(request, response);
                            break;
                        case "Cancel":
                            response.sendRedirect("QLDichVu.jsp");
                            break;
                        case "ApplyEdit":
                            try {
                                DichVu dto = new DichVu();
                                dto.setIdDV(Integer.parseInt(request.getParameter("id")));
                                dto.setIdThuTien(Integer.parseInt(request.getParameter("idHD")));
                                dto.setTenDV(request.getParameter("name"));
                                dto.setGiaDV(Float.parseFloat(request.getParameter("price")));
                                DAO.Home.UpdateDV(dto);
                                request.getRequestDispatcher("QLDichVu.jsp").forward(request, response);
                            } catch (Exception e) {
                                System.out.println(e + "DV");
                            }
                            break;
                        case "add":
                            try {
                                DichVu dto = new DichVu();
                                dto.setIdThuTien(Integer.parseInt(request.getParameter("idHD")));
                                dto.setTenDV(request.getParameter("name"));
                                dto.setGiaDV(Float.parseFloat(request.getParameter("price")));
                                DAO.Home.InsertDV(dto);
                                request.getRequestDispatcher("QLDichVu.jsp").forward(request, response);
                            } catch (Exception e) {
                                System.out.println(e + "add");
                            }
                            break;
                    }
                    break;
                case "TT":
                    switch (type) {
                        case "del":
                            DAO.Home.DeleteSQL("UPDATE thuTien SET trangThai = 0 WHERE idThuTien=" + id);
                            response.sendRedirect("QLThuTien.jsp");
                            break;
                        case "edit":
                            request.setAttribute("type", "edit");
                            request.setAttribute("id", id);
                            request.setAttribute("idPhong", request.getParameter("idPhong"));
                            request.getRequestDispatcher("ThemVaSuaTT.jsp").forward(request, response);
                            break;
                        case "Cancel":
                            response.sendRedirect("QLThuTien.jsp");
                            break;
                        case "ApplyEdit":
                            try {
                                String idTmp = request.getParameter("idPhong");
                                String[] arrID = idTmp.split("\\.");
                                ThuTien dto = new ThuTien();
                                dto.setIdThuTien(Integer.parseInt(request.getParameter("idTT")));
                                dto.setIdPhong(Integer.parseInt(arrID[0]));
                                dto.setSoDien(Integer.parseInt(request.getParameter("SoDien")));
                                dto.setSoNuoc(Integer.parseInt(request.getParameter("SoNuoc")));
                                dto.setTrangThai(Integer.parseInt(request.getParameter("TrangThai")));
                                dto.setTongTien(Calculator.CalSumOfMoney(Integer.parseInt(request.getParameter("ThangThue")), Integer.parseInt(request.getParameter("idTT")), Integer.parseInt(arrID[0]), dto.getSoDien(), dto.getSoNuoc()));
                                Home.UpdateTT(dto);
                                response.sendRedirect("QLThuTien.jsp");
                            } catch (IOException | NumberFormatException | SQLException e) {
                                System.out.println(e + " DV");
                            }
                            break;
                        case "add":
                            try {
                                int idTT = 0;
                                String idTmp = request.getParameter("idPhong");
                                String[] arrID = idTmp.split("\\.");
                                ThuTien dto = new ThuTien();
                                try {
                                    idTT = Integer.parseInt(request.getParameter("idTT"));
                                } catch (Exception e) {
                                    idTT = 0;
                                }
                                dto.setIdPhong(Integer.parseInt(arrID[0]));
                                dto.setSoDien(Integer.parseInt(request.getParameter("SoDien")));
                                dto.setSoNuoc(Integer.parseInt(request.getParameter("SoNuoc")));
                                dto.setTrangThai(Integer.parseInt(request.getParameter("TrangThai")));
                                dto.setTongTien(Calculator.CalSumOfMoney(Integer.parseInt(request.getParameter("ThangThue")), idTT, Integer.parseInt(arrID[0]), dto.getSoDien(), dto.getSoNuoc()));
                                Home.InsertThuTien(dto);
                                response.sendRedirect("QLThuTien.jsp");
                            } catch (Exception e) {
                                System.out.println(e + " add");
                            }
                            break;
                    }
                    break;
            }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(CRUD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);

        } catch (SQLException ex) {
            System.out.println(ex);
            Logger.getLogger(CRUD.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
