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
public enum LoaiXe {
    OTO("Ô tô", 50000, 1200000),
    XEMAY("Xe máy", 5000, 120000);
            
    private final String name;
    private final int giaTien;
    private final int thang;
    
    private LoaiXe(String name,int giaTien, int thang){
        this.name = name;
        this.giaTien = giaTien;
        this.thang = thang;
    }
    
    public String getName(){
        return this.name;
    }
    
    public int getGiaTien(){
        return this.giaTien;
    }
    
    public int getThang(){
        return this.thang;
    }
}
