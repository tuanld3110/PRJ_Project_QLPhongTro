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
public class DichVu {

    int idDV, idThuTien;
    String tenDV;
    float giaDV;

    public DichVu() {
    }

    public DichVu(int idDV, int idThuTien, String tenDV, float giaDV) {
        this.idDV = idDV;
        this.idThuTien = idThuTien;
        this.tenDV = tenDV;
        this.giaDV = giaDV;
    }

    public int getIdDV() {
        return idDV;
    }

    public void setIdDV(int idDV) {
        this.idDV = idDV;
    }

    public int getIdThuTien() {
        return idThuTien;
    }

    public void setIdThuTien(int idThuTien) {
        this.idThuTien = idThuTien;
    }

    public String getTenDV() {
        return tenDV;
    }

    public void setTenDV(String tenDV) {
        this.tenDV = tenDV;
    }

    public float getGiaDV() {
        return giaDV;
    }

    public void setGiaDV(float giaDV) {
        this.giaDV = giaDV;
    }

}
