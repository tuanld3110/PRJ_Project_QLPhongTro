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
public class PhongTro {
 int idPhong, idKH, thangThue, trangThai;
 float giaThue;

    public int getIdPhong() {
        return idPhong;
    }

    public void setIdPhong(int idPhong) {
        this.idPhong = idPhong;
    }

    public int getIdKH() {
        return idKH;
    }

    public void setIdKH(int idKH) {
        this.idKH = idKH;
    }

    public int getThangThue() {
        return thangThue;
    }

    public void setThangThue(int thangThue) {
        this.thangThue = thangThue;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }

    public float getGiaThue() {
        return giaThue;
    }

    public void setGiaThue(float giaThue) {
        this.giaThue = giaThue;
    }

    public PhongTro(int idPhong, int idKH, int thangThue, int trangThai, float giaThue) {
        this.idPhong = idPhong;
        this.idKH = idKH;
        this.thangThue = thangThue;
        this.trangThai = trangThai;
        this.giaThue = giaThue;
    }

    public PhongTro() {
    }
}
