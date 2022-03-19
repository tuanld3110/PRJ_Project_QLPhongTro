/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author 84915
 */
public class KhachHang {
    int idKH, gioiTinh;
    String tenKH, SDT, CMND;

    public KhachHang() {
    }

    public KhachHang(int idKH, int gioiTinh, String tenKH, String SDT, String CMND) {
        this.idKH = idKH;
        this.gioiTinh = gioiTinh;
        this.tenKH = tenKH;
        this.SDT = SDT;
        this.CMND = CMND;
    }

    public int getIdKH() {
        return idKH;
    }

    public void setIdKH(int idKH) {
        this.idKH = idKH;
    }

    public int getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(int gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getCMND() {
        return CMND;
    }

    public void setCMND(String CMND) {
        this.CMND = CMND;
    }
    
}
