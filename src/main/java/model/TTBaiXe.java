/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Admin
 */
public class TTBaiXe {
    private String loaiXe;
    private int tongSoCho, soChoTrong;

    public TTBaiXe() {
    }

    public TTBaiXe(String loaiXe, int tongSoCho, int soChoTrong) {
        this.loaiXe = loaiXe;
        this.tongSoCho = tongSoCho;
        this.soChoTrong = soChoTrong;
    }

    public String getLoaiXe() {
        return loaiXe;
    }

    public void setLoaiXe(String loaiXe) {
        this.loaiXe = loaiXe;
    }

    public int getTongSoCho() {
        return tongSoCho;
    }

    public void setTongSoCho(int tongSoCho) {
        this.tongSoCho = tongSoCho;
    }

    public int getSoChoTrong() {
        return soChoTrong;
    }

    public void setSoChoTrong(int soChoTrong) {
        this.soChoTrong = soChoTrong;
    }
    
}
