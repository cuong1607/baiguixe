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
public class Infomation {
    private static Infomation instance;
    private String username;
    private String password;
    private String chucVu;
    private boolean rememberMe = false;
    private boolean isLogin = false;
    
    private Infomation(){}
    
    public static Infomation getInstance() {
        if(instance == null) {
                instance = new Infomation();
        }
        return instance;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getChucVu() {
        return chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }

    public boolean isRememberMe() {
        return rememberMe;
    }

    public void setRememberMe(boolean rememberMe) {
        this.rememberMe = rememberMe;
    }
    
    public void clear(){
        if(!rememberMe)
            instance = null;
    }
    
    public boolean laQuanLy(){
        return !chucVu.isEmpty() && chucVu.equals(ChucVu.QL.getName());
    }

    public boolean isIsLogin() {
        return isLogin;
    }

    public void setIsLogin(boolean isLogin) {
        this.isLogin = isLogin;
    }
}
