/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;


/**
 *
 * @author Admin
 */
public class BaiXe {
    private String theXe, bienSoXe,  loaiXe, loaiVe;
    private Date thoiGianVao,thoiGianRa;
    private int thanhTien, trangThai;

    public BaiXe() {}

    public BaiXe(String theXe, String bienSoXe, String loaiXe, String loaiVe, Date thoiGianVao) {
        this.theXe = theXe;
        this.bienSoXe = bienSoXe;
        this.loaiXe = loaiXe;
        
        this.loaiVe = loaiVe;
        
        this.thoiGianVao = thoiGianVao;
       
    }

    public String getTheXe() {
        return theXe;
    }

    public void setTheXe(String theXe) {
        this.theXe = theXe;
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

    public String getLoaiVe() {
        return loaiVe;
    }

    public void setLoaiVe(String loaiVe) {
        this.loaiVe = loaiVe;
    }

    public Date getThoiGianVao() {
        return thoiGianVao;
    }

    public void setThoiGianVao(Date thoiGianVao) {
        this.thoiGianVao = thoiGianVao;
    }

    public Date getThoiGianRa() {
        return thoiGianRa;
    }

    public void setThoiGianRa(Date thoiGianRa) {
        this.thoiGianRa = thoiGianRa;
    }

    public int getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(int thanhTien) {
        this.thanhTien = thanhTien;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }   
    
}
