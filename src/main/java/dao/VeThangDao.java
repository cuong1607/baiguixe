/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import DataBase.DatabaseHelper;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.VeThang;

/**
 *
 * @author Admin
 */
public class VeThangDao {
    public void VeThangDao(){}
    public boolean insert(VeThang vt) throws Exception{
        String sql = "insert into [dbo].[QL_VeThang] ([TheXe],[BienSoXe],[LoaiXe],[NgayDangKi],[NgayKetThuc],[ThanhToan], [TrangThai]) "
                + "values(?,?,?,?,?,?,?)";
        try (
                Connection con = DatabaseHelper.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);) {
            pstmt.setString(1, vt.getTheXe());
            pstmt.setString(2, vt.getBienSoXe());
            pstmt.setString(3, vt.getLoaiXe());
            pstmt.setDate(4, new Date(vt.getNgayDangKi().getTime()));
            pstmt.setDate(5, new Date(vt.getNgayKetThuc().getTime()));
            pstmt.setInt(6, vt.getThanhToan());
            pstmt.setInt(7, vt.getTrangThai());
            return pstmt.executeUpdate() > 0;
        }
    }
    public List<VeThang> findAll() throws Exception {
   
        String sql = "select * from QL_VeThang WHERE TrangThai = 0";
        try (
                Connection con = DatabaseHelper.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);) {
            try (ResultSet rs = pstmt.executeQuery();) {
                List<VeThang> list = new ArrayList<>();
                while (rs.next()) {
                    VeThang vt = new VeThang();
                    vt.setTheXe(rs.getString("TheXe"));
                    vt.setBienSoXe(rs.getString("BienSoXe"));
                    vt.setLoaiXe(rs.getString("LoaiXe"));
                    vt.setNgayDangKi(rs.getDate("NgayDangKi"));
                    vt.setNgayKetThuc(rs.getDate("NgayKetThuc"));
                    vt.setThanhToan(rs.getInt("ThanhToan"));
                    list.add(vt);
                }
                return list;
            }
        }
    }
    
    public List<VeThang> findAllBaoCao() throws Exception {
   
        String sql = "select * from QL_VeThang";
        try (
                Connection con = DatabaseHelper.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);) {
            try (ResultSet rs = pstmt.executeQuery();) {
                List<VeThang> list = new ArrayList<>();
                while (rs.next()) {
                    VeThang vt = new VeThang();
                    vt.setTheXe(rs.getString("TheXe"));
                    vt.setBienSoXe(rs.getString("BienSoXe"));
                    vt.setLoaiXe(rs.getString("LoaiXe"));
                    vt.setNgayDangKi(rs.getDate("NgayDangKi"));
                    vt.setNgayKetThuc(rs.getDate("NgayKetThuc"));
                    vt.setThanhToan(rs.getInt("ThanhToan"));
                    list.add(vt);
                }
                return list;
            }
        }
    }
    
    public List<VeThang> findByTheXe(String theXe)
        throws Exception{       
        String sql = " select * from QL_VeThang  where [TheXe] = ? and [TrangThai] = 0";            
        try (
                Connection con = DatabaseHelper.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);
                ){
                pstmt.setString(1,theXe);            
            try (ResultSet rs = pstmt.executeQuery();) {
                 List<VeThang> list = new ArrayList<>();
                if (rs.next()) {
                    VeThang vt = new VeThang();
                    vt.setTheXe(rs.getString("TheXe"));
                    vt.setBienSoXe(rs.getString("BienSoXe"));
                    vt.setLoaiXe(rs.getString("LoaiXe"));
                    vt.setNgayDangKi(rs.getDate("NgayDangKi"));
                    vt.setNgayKetThuc(rs.getDate("NgayKetThuc"));
                    vt.setThanhToan(rs.getInt("ThanhToan"));
                    vt.setTrangThai(rs.getInt("TrangThai"));
                    list.add(vt);
                }
                return list;
            }
              
        }             
    }
    public VeThang findByBienSoXe(String bienSoXe)
        throws Exception{
        String sql = " select * from QL_VeThang  where [BienSoXe] = ? and [TrangThai] = 0";            
        try (
                Connection con = DatabaseHelper.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);
                ){
                pstmt.setString(1,bienSoXe);            
            try (ResultSet rs = pstmt.executeQuery();) {
                if (rs.next()) {
                    VeThang vt = new VeThang();
                    vt.setTheXe(rs.getString("TheXe"));
                    vt.setBienSoXe(rs.getString("BienSoXe"));
                    vt.setLoaiXe(rs.getString("LoaiXe"));
                    vt.setNgayDangKi(rs.getDate("NgayDangKi"));
                    vt.setNgayKetThuc(rs.getDate("NgayKetThuc"));
                    vt.setThanhToan(rs.getInt("ThanhToan"));
                    vt.setTrangThai(rs.getInt("TrangThai"));
                    return vt;
                }
                return null;
            }
              
        }             
    }
    public boolean delete(String theXe)
        throws Exception{       
        String sql = " update [dbo].[QL_VeThang] SET [TrangThai] = 1  where [TheXe] = ?";             
        try (
                Connection con = DatabaseHelper.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);
                ){
            pstmt.setString(1, theXe);
            return pstmt.executeUpdate() > 0;
        }   
               
    }
    public boolean update(VeThang vt)
        throws Exception{       
        String sql = " UPDATE [dbo].[QL_VeThang] SET [TheXe] = ?,"
                + "[LoaiXe] = ? ,[NgayDangKi] = ?,[NgayKetThuc] = ?,[ThanhToan] = ?, [TrangThai] = ?" 
                + " WHERE [BienSoXe] = ?";             
        try (
                Connection con = DatabaseHelper.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);
                ){
            pstmt.setString(1,vt.getTheXe());
            pstmt.setString(2,vt.getLoaiXe());
            pstmt.setDate(3, new Date(vt.getNgayDangKi().getTime()));
            pstmt.setDate(4, new Date(vt.getNgayKetThuc().getTime()));
            pstmt.setInt(5,vt.getThanhToan());
            pstmt.setInt(6, vt.getTrangThai());
            pstmt.setString(7,vt.getBienSoXe());
            return pstmt.executeUpdate()>0;
        }   
               
    }
}
    

