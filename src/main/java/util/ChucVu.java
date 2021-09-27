package util;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public enum ChucVu {
    QL("Quản lý"),
    NV("Nhân viên");
            
    private final String name;
    
    private ChucVu(String name){
        this.name = name;
    }
    
    public String getName(){
        return this.name;
    }
}
