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
public enum LoaiVe {
    THANG("Vé Tháng"),
    LUOT("Vé lượt");
            
    private final String name;
    
    private LoaiVe(String name){
        this.name = name;
    }
    
    public String getName(){
        return this.name;
    }
}
