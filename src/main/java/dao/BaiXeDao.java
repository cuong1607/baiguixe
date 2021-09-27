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
import java.util.ArrayList;
import java.sql.Timestamp;
import java.util.List;
import model.BaiXe;


/**
 *
 * @author Admin
 */
public class BaiXeDao {
    public BaiXeDao(){}
    public boolean insert(BaiXe bx)
        throws Exception{
        String sql = " INSERT INTO [dbo].[QL_BaiXe]([BienSoXe],[TheXe],[ThoiGianVao],[LoaiXe],[LoaiVe]) values(?,?,?,?,?)";  
        try (
                Connection con = DatabaseHelper.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);
                ){
            pstmt.setString(1,bx.getBienSoXe());
            pstmt.setString(2,bx.getTheXe());
            pstmt.setTimestamp(3, new Timestamp(bx.getThoiGianVao().getTime()));
            pstmt.setString(4,bx.getLoaiXe());
            pstmt.setString(5,bx.getLoaiVe());
            return pstmt.executeUpdate()>0;
        }   
               
    }
    public boolean update(BaiXe bx)
        throws Exception{       
        String sql = " UPDATE [dbo].[QL_BaiXe] SET [BienSoXe] = ? ,[ThoiGianVao] = ? ,"
                + "[LoaiXe] = ? ,[LoaiVe] = ?,  [ThoiGianRa] = ? ,[ThanhTien] = ?,[TrangThai] = ?" 
                + " WHERE [TheXe] = ?";             
        try (
                Connection con = DatabaseHelper.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);
                ){
            pstmt.setString(1,bx.getBienSoXe());
            pstmt.setTimestamp(2, new Timestamp(bx.getThoiGianVao().getTime()));
            pstmt.setString(3,bx.getLoaiXe());
            pstmt.setString(4,bx.getLoaiVe());
            pstmt.setTimestamp(5, new Timestamp(bx.getThoiGianRa().getTime()));
            pstmt.setInt(6, bx.getThanhTien());
            pstmt.setInt(7, bx.getTrangThai());
            pstmt.setString(8, bx.getTheXe());
            return pstmt.executeUpdate()>0;
        }   
               
    }
    public List<BaiXe> findAll() throws Exception {       
        String sql = "select * from QL_BaiXe where TrangThai = 0";
        try (
            Connection con = DatabaseHelper.openConnection();
            PreparedStatement pstmt = con.prepareStatement(sql);
                ){       
            try (ResultSet rs = pstmt.executeQuery();) {
                List<BaiXe> list = new ArrayList<>();
                while (rs.next()){
                    BaiXe bx = new BaiXe();
                    bx.setTheXe(rs.getString("TheXe"));
                    bx.setBienSoXe(rs.getString("BienSoXe"));
                    bx.setThoiGianVao(rs.getTimestamp("ThoiGianVao"));                               
                    bx.setLoaiXe(rs.getString("LoaiXe"));
                    bx.setLoaiVe(rs.getString("LoaiVe"));
                    
                    list.add(bx);
                }
                return list;
            }
        }
    }
     public List<BaiXe> findAllBaoCao() throws Exception {
              
        String sql = "select * from QL_BaiXe where TrangThai = 1";
        try (
            Connection con = DatabaseHelper.openConnection();
            PreparedStatement pstmt = con.prepareStatement(sql);
                ){       
            try (ResultSet rs = pstmt.executeQuery();) {
                List<BaiXe> list = new ArrayList<>();
                while (rs.next()){
                    BaiXe bx = new BaiXe();
                    bx.setTheXe(rs.getString("TheXe"));
                    bx.setBienSoXe(rs.getString("BienSoXe"));
                    bx.setThoiGianVao(rs.getTimestamp("ThoiGianVao"));
                    bx.setLoaiXe(rs.getString("LoaiXe"));
                    bx.setLoaiVe(rs.getString("LoaiVe"));
                    bx.setThoiGianRa(rs.getTimestamp("ThoiGianRa"));
                    bx.setThanhTien(rs.getInt("ThanhTien"));
                    list.add(bx);
                }
                return list;
        }
        }
    }
    public List<BaiXe> findByTheXe(String theXe)
        throws Exception{       
        String sql = " select * from QL_BaiXe  where [TheXe] = ? and [TrangThai] = 0";            
        try (
                Connection con = DatabaseHelper.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);
                ){
                pstmt.setString(1,theXe);            
            try (ResultSet rs = pstmt.executeQuery();) {
                 List<BaiXe> list = new ArrayList<>();
                if (rs.next()) {
                    BaiXe bx = new BaiXe();
                    bx.setTheXe(rs.getString("Thexe").trim());
                    bx.setBienSoXe(rs.getString("BienSoXe").trim());
                    bx.setThoiGianVao(rs.getTimestamp("ThoiGianVao"));
                    bx.setLoaiXe(rs.getString("LoaiXe").trim());
                    bx.setLoaiVe(rs.getString("LoaiVe").trim());
                    list.add(bx);
                }
                return list;
            }
              
        }             
    }
    public List<BaiXe> findByBienSoXe(String bienSoXe)
        throws Exception{       
        String sql = " select * from QL_BaiXe  where [BienSoXe] = ? and [TrangThai] = 0";            
        try (
                Connection con = DatabaseHelper.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);
                ){
                pstmt.setString(1,bienSoXe);            
            try (ResultSet rs = pstmt.executeQuery();) {
                List<BaiXe> list = new ArrayList<>();
                if (rs.next()) {
                    BaiXe bx = new BaiXe();
                    bx.setTheXe(rs.getString("Thexe").trim());
                    bx.setBienSoXe(rs.getString("BienSoXe").trim());
                    bx.setThoiGianVao(rs.getTimestamp("ThoiGianVao"));
                    bx.setLoaiXe(rs.getString("LoaiXe").trim());
                    bx.setLoaiVe(rs.getString("LoaiVe").trim());
                    list.add(bx);
                }
               return list;
            }    
        } 
    }  
     
    public boolean checkTheXe(String theXe) throws Exception{
        String sql = " select * from QL_BaiXe  where [TheXe] = ? and [TrangThai] = 0";
        try (
                Connection con = DatabaseHelper.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);
                ){
                pstmt.setString(1,theXe);            
            try (ResultSet rs = pstmt.executeQuery();) {
                if (rs.next()) {
                    return false;
                }
                return true;
            }
        }
    }
}
            
        
       
    

