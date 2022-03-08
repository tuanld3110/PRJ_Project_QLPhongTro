/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.Home;
import DTO.KhachHang;
import DTO.PhongTro;
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
                                dto.setIdPhong(Integer.parseInt(request.getParameter("idPhong")));
                                dto.setIdKH(Integer.parseInt(request.getParameter("idKH")));
                                dto.setThangThue(Integer.parseInt(request.getParameter("ThangThue")));
                                dto.setGiaThue(Float.parseFloat(request.getParameter("GiaThue")));
                                if (Integer.parseInt(request.getParameter("idKH")) == 0) {
                                    dto.setTrangThai(2);
                                } else {
                                    dto.setTrangThai(1);
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
                            response.sendRedirect("QLKH.jsp");
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
                            request.getRequestDispatcher("ThemVaSuaKH.jsp").forward(request, response);
                            break;
                        case "Cancel":
                            response.sendRedirect("QLDichVu.jsp");
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
                                request.getRequestDispatcher("QLDichVu.jsp").forward(request, response);
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
                                request.getRequestDispatcher("QLDichVu.jsp").forward(request, response);
                            } catch (Exception e) {
                                System.out.println(e);
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
