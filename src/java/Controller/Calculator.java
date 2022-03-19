/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.Home;
import model.DichVu;
import model.PhongTro;
import model.ThuTien;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author 84915
 */
public class Calculator {

    public static float CalSumOfMoney(int ThangThue, int idTT, int idPhong, int soDien, int soNuoc) {
        float Sum = 0, GiaDien = 0, GiaNuoc = 0;
        int SumOfThanhThue = 0;
        try {
            LocalDate LD = LocalDate.now();
            int month = LD.getMonthValue();
            SumOfThanhThue = Math.abs(month - ThangThue);
            if (idTT >=1) {
                ArrayList<DichVu> arr = Home.getDichVuByIDThuTien(idTT);
                for (DichVu dtoDV : arr) {
                    if (dtoDV.getTenDV().equals("Điện")) {
                        GiaDien = dtoDV.getGiaDV();
                    } else {
                        GiaNuoc = dtoDV.getGiaDV();
                    }
                }
                Sum = (soDien * GiaDien) + (soNuoc * GiaNuoc);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return Sum + CalRoomMoney(SumOfThanhThue, idPhong);
    }

    public static float CalRoomMoney(int NumberOfMonth, int idPhong) {
        float Sum = 0;
        try {
            ArrayList<PhongTro> arrPT = DAO.Home.getPhongTroByID(idPhong);
            for (PhongTro dtoPT : arrPT) {
                Sum = dtoPT.getGiaThue() * NumberOfMonth;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return Sum;
    }

}
