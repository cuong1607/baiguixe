/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import DataBase.DatabaseHelper;
import java.util.List;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.ThemNhanVien;
 

/**
 *
 * @author Admin
 */
public class NhanVienDao {
    public NhanVienDao(){}
    public boolean insert(ThemNhanVien tnv)
        throws Exception{
        String sql = " INSERT INTO [dbo].[QL_NhanVien]([MaNV],[HoTen],[DiaChi],[DienThoai],[CMND],[NgaySinh],[GioiTinh]) values(?,?,?,?,?,?,?)";  
        try (
                Connection con = DatabaseHelper.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);
                ){
            pstmt.setString(1,tnv.getMaNV());
            pstmt.setString(2,tnv.getHoTen());
            pstmt.setString(3,tnv.getDiaChi());
            pstmt.setString(4,tnv.getDienThoai());
            pstmt.setString(5,tnv.getCMND());
            pstmt.setDate(6, new Date(tnv.getNgaySinh().getTime()));
            pstmt.setString(7,tnv.getGioiTinh());  
            return pstmt.executeUpdate()>0;
        }   
               
    }
     public boolean update(ThemNhanVien tnv)
        throws Exception{       
        String sql = " UPDATE [dbo].[QL_NhanVien] SET [HoTen] = ? ,[DiaChi] = ? ,"
                + "[NgaySinh] = ? ,[GioiTinh] = ?,  [DienThoai] = ? ,[CMND] = ?" 
                + " WHERE [MaNV] = ?";             
        try (
                Connection con = DatabaseHelper.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);
                ){
            pstmt.setString(7,tnv.getMaNV());
            pstmt.setString(1,tnv.getHoTen());
            pstmt.setString(2,tnv.getDiaChi());
            pstmt.setString(5,tnv.getDienThoai());
            pstmt.setString(6,tnv.getCMND());
            pstmt.setDate(3, new Date(tnv.getNgaySinh().getTime()));
            pstmt.setString(4,tnv.getGioiTinh());  
            return pstmt.executeUpdate()>0;
        }   
               
    }
     public boolean deleteByNhanVien(String maNhanVien)
        throws Exception{       
        String sql = " delete from QL_NhanVien  where [MaNV] = ?";             
        try (
                Connection con = DatabaseHelper.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);
                ){
            pstmt.setString(1,maNhanVien); 
            return pstmt.executeUpdate()>0;
        }   
               
    }
    public ThemNhanVien findByNhanVien(String maNhanVien)
            throws Exception {
        String sql = " select * from QL_NhanVien  where [MaNV] = ?";
        try (
                Connection con = DatabaseHelper.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);
                ){
                pstmt.setString(1, maNhanVien);
            try (ResultSet rs = pstmt.executeQuery();) {
                if (rs.next()) {
                    ThemNhanVien tnv = createThemNhanVien(rs);

                    return tnv;
                }
            }
            return null;
        }             
    }  
      public List<ThemNhanVien> findAll() 
        throws Exception{       
        String sql = " select * from QL_NhanVien ";             
        try (
                Connection con = DatabaseHelper.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);
                ){           
            try(ResultSet rs = pstmt.executeQuery();){
                List<ThemNhanVien> list = new ArrayList<>();
                while (rs.next()){
                    ThemNhanVien tnv = createThemNhanVien(rs);
                    list.add(tnv);
                 
                }
                return list;
            }
            
        }             
    }  

    private ThemNhanVien createThemNhanVien(final ResultSet rs) throws SQLException {
        ThemNhanVien tnv = new ThemNhanVien();
        tnv.setMaNV(rs.getString("MaNV").trim());
        tnv.setHoTen(rs.getNString("HoTen").trim());
        tnv.setDiaChi(rs.getNString("DiaChi").trim());
        tnv.setCMND(rs.getString("CMND").trim());
        tnv.setDienThoai(rs.getString("DienThoai").trim());
        tnv.setGioiTinh(rs.getNString("GioiTinh"));
        tnv.setNgaySinh(rs.getDate("NgaySinh"));
        return tnv;
    }
}

