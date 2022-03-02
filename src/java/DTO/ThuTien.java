/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author crrtt
 */
public class ThuTien {

    int idThuTien, idPhong, thangThue, soDien, soNuoc;
    float tongTien;

    public ThuTien() {
    }

    public ThuTien(int idThuTien, int idPhong, int thangThue, int soDien, int soNuoc, float tongTien) {
        this.idThuTien = idThuTien;
        this.idPhong = idPhong;
        this.thangThue = thangThue;
        this.soDien = soDien;
        this.soNuoc = soNuoc;
        this.tongTien = tongTien;
    }

    public int getIdThuTien() {
        return idThuTien;
    }

    public void setIdThuTien(int idThuTien) {
        this.idThuTien = idThuTien;
    }

    public int getIdPhong() {
        return idPhong;
    }

    public void setIdPhong(int idPhong) {
        this.idPhong = idPhong;
    }

    public int getThangThue() {
        return thangThue;
    }

    public void setThangThue(int thangThue) {
        this.thangThue = thangThue;
    }

    public int getSoDien() {
        return soDien;
    }

    public void setSoDien(int soDien) {
        this.soDien = soDien;
    }

    public int getSoNuoc() {
        return soNuoc;
    }

    public void setSoNuoc(int soNuoc) {
        this.soNuoc = soNuoc;
    }

    public float getTongTien() {
        return tongTien;
    }

    public void setTongTien(float tongTien) {
        this.tongTien = tongTien;
    }

}
