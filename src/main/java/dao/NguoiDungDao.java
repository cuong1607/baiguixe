/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import DataBase.DatabaseHelper;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.NguoiDung;

/**
 *
 * @author Admin
 */
public class NguoiDungDao {
    public NguoiDungDao(){}
    
    public NguoiDung checkLogin(String tenDangNhap, String matKhau)
            throws Exception{
        String sql = "SELECT MaNV, TenDangNhap, MatKhau, VaiTro FROM [dbo].[NguoiDung]"
                + "  where TenDangNhap=? and MatKhau = ?";
        try(
                Connection con = DatabaseHelper.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);
                
                ){
            pstmt.setString(1, tenDangNhap);
            pstmt.setString(2, matKhau);
            
            try (ResultSet rs = pstmt.executeQuery();){
                if(rs.next()){
                    NguoiDung nd =  new NguoiDung();
                    nd.setTenDangNhap(tenDangNhap);
                    nd.setMaNV(rs.getString("MaNV"));
                    nd.setMatKhau(rs.getString("MatKhau"));
                    nd.setVaiTro(rs.getString("VaiTro"));
                    return nd;
                }
            }
        }
        return null;
    }
    public NguoiDung findByNguoiDung(String tenDangNhap)
        throws Exception{       
        String sql = " select * from NguoiDung  where [TenDangNhap] = ?";             
        try (
                Connection con = DatabaseHelper.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);
                ){
            pstmt.setString(1,tenDangNhap); 
            
            try(ResultSet rs = pstmt.executeQuery();){
                if(rs.next()){
                    NguoiDung nd = createNguoiDung(rs);
                    return nd;
                }
            }
            return null;
        }             
    } 
    
    public NguoiDung findByNV(String nv)
        throws Exception{       
        String sql = " select * from NguoiDung  where [MaNV] = ?";             
        try (
                Connection con = DatabaseHelper.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);
                ){
            pstmt.setString(1,nv); 
            
            try(ResultSet rs = pstmt.executeQuery();){
                if(rs.next()){
                    NguoiDung nd = createNguoiDung(rs);
                    return nd;
                }
            }
            return null;
        }             
    } 
    public List<NguoiDung> findAll()
        throws Exception{       
        String sql = " select * from NguoiDung";             
        try (
                Connection con = DatabaseHelper.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);
                ){                   
            try(ResultSet rs = pstmt.executeQuery();){
                List<NguoiDung> list= new ArrayList<>();
                while(rs.next()){
                    NguoiDung nd = new NguoiDung();
                    nd.setMaNV(rs.getString("MaNV"));
                    nd.setTenDangNhap(rs.getString("TenDangNhap"));
                    nd.setMatKhau(rs.getString("MatKhau"));
                    nd.setVaiTro(rs.getString("VaiTro"));
                    list.add(nd);
                }
                return list;
            }
            
        }             
    }

    private NguoiDung createNguoiDung(final ResultSet rs) throws SQLException {
        NguoiDung nd = new NguoiDung();
        nd.setMaNV(rs.getString("MaNV"));
        nd.setTenDangNhap(rs.getString("TenDangNhap"));
        nd.setMatKhau(rs.getString("MatKhau"));
        nd.setVaiTro(rs.getString("VaiTro"));
        return nd;
    }
    public boolean insert(NguoiDung nd)
        throws Exception{
        String sql = " INSERT INTO [dbo].[NguoiDung]([MaNV],[TenDangNhap],[MatKhau],[VaiTro]) values(?,?,?,?)";  
        try (
                Connection con = DatabaseHelper.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);
                ){
            pstmt.setString(1,nd.getMaNV());
            pstmt.setString(2,nd.getTenDangNhap());
            pstmt.setString(3,nd.getMatKhau());
            pstmt.setString(4,nd.getVaiTro());            
            return pstmt.executeUpdate()>0;
        }   
               
    }
    public boolean update(NguoiDung nd)
        throws Exception{       
        String sql = " UPDATE [dbo].[NguoiDung] SET [TenDangNhap] = ?,"
                + "[MatKhau] = ? ,[VaiTro] = ?" 
                + " WHERE [MaNV] = ?";             
        try (
                Connection con = DatabaseHelper.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);
                ){
            pstmt.setString(4,nd.getMaNV());
            pstmt.setString(1,nd.getTenDangNhap());
            pstmt.setString(2,nd.getMatKhau());
            pstmt.setString(3,nd.getVaiTro());  
            return pstmt.executeUpdate()>0;
        }   
               
    }

    public boolean delete(String nd)    
        throws Exception{       
        String sql = " delete from NguoiDung  where [MaNV] = ?";             
        try (
                Connection con = DatabaseHelper.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);
                ){
            pstmt.setString(1,nd); 
            return pstmt.executeUpdate()>0;
        } 
    }
}
