/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author Admin
 */
public class ReportModel {
    private int STT;
    private String bienSoXe;
    private String loaiXe;
    private int soLanVaoRa;
    private int tongTien;

    public ReportModel() {
    }

    public ReportModel(int STT, String bienSoXe, String loaiXe, int soLanVaoRa, int tongTien) {
        this.STT = STT;
        this.bienSoXe = bienSoXe;
        this.loaiXe = loaiXe;
        this.soLanVaoRa = soLanVaoRa;
        this.tongTien = tongTien;
    }

    public int getSTT() {
        return STT;
    }

    public void setSTT(int STT) {
        this.STT = STT;
    }

    public String getBienSoXe() {
        return bienSoXe;
    }

    public void setBienSoXe(String bienSoXe) {
        this.bienSoXe = bienSoXe;
    }

    public String getLoaiXe() {
        return loaiXe;
    }

    public void setLoaiXe(String loaiXe) {
        this.loaiXe = loaiXe;
    }

    public int getSoLanVaoRa() {
        return soLanVaoRa;
    }

    public void setSoLanVaoRa(int soLanVaoRa) {
        this.soLanVaoRa = soLanVaoRa;
    }

    public int getTongTien() {
        return tongTien;
    }

    public void setTongTien(int tongTien) {
        this.tongTien = tongTien;
    }
    
}
