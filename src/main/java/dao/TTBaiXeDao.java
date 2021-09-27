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
import java.util.List;
import model.TTBaiXe;

/**
 *
 * @author Admin
 */
public class TTBaiXeDao {
    public boolean update(TTBaiXe bx)
        throws Exception{       
        String sql = " UPDATE [dbo].[QL_TTBaiXe] SET [TongSoCho] = ? ,[SoChoTrong] = ? "
                                + " WHERE [LoaiXe] = ?";             
        try (
                Connection con = DatabaseHelper.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);
                ){
            pstmt.setInt(1,bx.getTongSoCho());
            pstmt.setInt(2, bx.getSoChoTrong());
            pstmt.setString(3,bx.getLoaiXe());
            return pstmt.executeUpdate()>0;
        }   
               
    }
     public List<TTBaiXe> findTTBaiXe() throws Exception {          
        String sql = "select * from QL_TTBaiXe";
        try (
            Connection con = DatabaseHelper.openConnection();
            PreparedStatement pstmt = con.prepareStatement(sql);
                ){       
            try (ResultSet rs = pstmt.executeQuery();) {
                List<TTBaiXe> list = new ArrayList<>();
                while (rs.next()){
                    TTBaiXe bx = new TTBaiXe();
                    bx.setLoaiXe(rs.getString("LoaiXe"));
                    bx.setTongSoCho(rs.getInt("TongSoCho"));
                    bx.setSoChoTrong(rs.getInt("SoChoTrong"));
                    list.add(bx);
                }
                return list;
        }
        }
    } 
     
     public TTBaiXe findByLoaiXe(String loaiXe) throws Exception {          
         String sql = "select * from QL_TTBaiXe  WHERE [LoaiXe] = ? ";
         try (
                 Connection con = DatabaseHelper.openConnection();
                 PreparedStatement pstmt = con.prepareStatement(sql);) {
             pstmt.setString(1, loaiXe);
             try (ResultSet rs = pstmt.executeQuery();) {
                 while (rs.next()) {
                     TTBaiXe bx = new TTBaiXe();
                     bx.setLoaiXe(rs.getString("LoaiXe"));
                     bx.setTongSoCho(rs.getInt("TongSoCho"));
                     bx.setSoChoTrong(rs.getInt("SoChoTrong"));
                     return bx;
                 }
                 return null;
             }
        }
    }   
}
