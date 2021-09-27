package form;

import DataBase.MessageDialogHelper;
import javax.swing.ImageIcon;
import util.Infomation;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Admin
 */
public class FormMain extends javax.swing.JFrame {

    private FormQuanLyNV mFormNV;
    private FormQuanLyBaiXe mFormBaiXe;
    private FormTaoTaiKhoan mFormTaiKhoan;
    private FormQLVeThang mFormVeThang;
    private FormBaoCao mFormBaoCao;
    private FormHome mFormHome;

    /**
     * Creates new form FormMain
     */
    public FormMain() {
        initComponents();
        this.setTitle("Hệ Thống Bãi Gửi Xe");
        menuHome();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tplMain = new javax.swing.JTabbedPane();
        jLabel5 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        btnDangXuat = new javax.swing.JButton();
        lblTenNguoiDung = new javax.swing.JLabel();
        lblChucVu = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuQLNV = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        menuBaiXe = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        menuQLVeXe = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        menuTaoTaiKhoan = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        menuBaoCao = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tplMain.setBackground(new java.awt.Color(0, 153, 102));

        jLabel5.setBackground(new java.awt.Color(0, 204, 204));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 102));
        jLabel5.setText("Hệ Thống Bãi Gửi Xe");

        btnDangXuat.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnDangXuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/baiguixe/icons/logout-icon-16.png"))); // NOI18N
        btnDangXuat.setText("Đăng Xuất");
        btnDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangXuatActionPerformed(evt);
            }
        });

        lblTenNguoiDung.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblTenNguoiDung.setForeground(new java.awt.Color(0, 102, 153));
        lblTenNguoiDung.setText("jLabel1");

        lblChucVu.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblChucVu.setForeground(new java.awt.Color(0, 102, 153));
        lblChucVu.setText("jLabel2");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 51));
        jLabel1.setText("Người dùng:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 0, 51));
        jLabel2.setText("Chức vụ:");

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/baiguixe/icons/Apps-preferences-desktop-user-password-icon-24.png"))); // NOI18N
        jMenu1.setText("Quản Lý");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        menuQLNV.setText("Quản Lý Nhân Viên");
        menuQLNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuQLNVActionPerformed(evt);
            }
        });
        jMenu1.add(menuQLNV);
        jMenu1.add(jSeparator1);

        menuBaiXe.setText("Quản Lý Bãi Xe");
        menuBaiXe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBaiXeActionPerformed(evt);
            }
        });
        jMenu1.add(menuBaiXe);
        jMenu1.add(jSeparator3);

        menuQLVeXe.setText("Quản Lý Vé Xe");
        menuQLVeXe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuQLVeXeActionPerformed(evt);
            }
        });
        jMenu1.add(menuQLVeXe);
        jMenu1.add(jSeparator2);

        menuTaoTaiKhoan.setText("Tạo Tài Khoản");
        menuTaoTaiKhoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuTaoTaiKhoanActionPerformed(evt);
            }
        });
        jMenu1.add(menuTaoTaiKhoan);

        jMenuBar1.add(jMenu1);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/baiguixe/icons/Actions-document-edit-icon-16.png"))); // NOI18N
        jMenu4.setText("Báo Cáo");

        menuBaoCao.setText("Doanh Thu");
        menuBaoCao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBaoCaoActionPerformed(evt);
            }
        });
        jMenu4.add(menuBaoCao);
        jMenu4.add(jSeparator4);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(tplMain, javax.swing.GroupLayout.PREFERRED_SIZE, 773, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jSeparator5, javax.swing.GroupLayout.DEFAULT_SIZE, 1, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator6)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(309, 309, 309)
                        .addComponent(jLabel5)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnDangXuat, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblTenNguoiDung, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(lblChucVu, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTenNguoiDung)
                    .addComponent(lblChucVu)
                    .addComponent(btnDangXuat)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(220, 220, 220)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tplMain, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(88, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuQLNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuQLNVActionPerformed
        Infomation infomation = Infomation.getInstance();
        if (infomation.laQuanLy()) {
            if (mFormNV == null) {
                mFormNV = new FormQuanLyNV();
                ImageIcon icon = new ImageIcon(getClass().
                        getResource("../com/mycompany/baiguixe/icons/Person-Male-Light-icon-24.png"));
                tplMain.addTab("Quản Lý Nhân Viên", icon, mFormNV, "Quản Lý Nhân Viên");
            }
            tplMain.setSelectedComponent(mFormNV);
        }else{
             MessageDialogHelper.showMessageDialog(this, "Bạn không có quyền truy cập", "Thông Báo");
        }
    }//GEN-LAST:event_menuQLNVActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void menuHome() {                                          
        if (mFormHome == null) {
            mFormHome = new FormHome();
            ImageIcon icon = new ImageIcon(getClass().
                    getResource("../com/mycompany/baiguixe/icons/home40.jpg"));
            tplMain.addTab("Trang Chủ", icon, mFormHome, "Trang Chủ");
        }
        tplMain.setSelectedComponent(mFormHome);
    }  
    
    private void menuBaiXeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBaiXeActionPerformed
        if (mFormBaiXe == null) {
            mFormBaiXe = new FormQuanLyBaiXe(mFormBaoCao);
            ImageIcon icon = new ImageIcon(getClass().
                    getResource("../com/mycompany/baiguixe/icons/20157190113652.png"));
            tplMain.addTab("Quản Lý Bãi Xe", icon, mFormBaiXe, "Quản Lý Bãi Xe");
        }
        tplMain.setSelectedComponent(mFormBaiXe);
    }//GEN-LAST:event_menuBaiXeActionPerformed

    private void menuTaoTaiKhoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuTaoTaiKhoanActionPerformed
        Infomation infomation = Infomation.getInstance();
        if (infomation.laQuanLy()) {
            if (mFormTaiKhoan == null) {
                mFormTaiKhoan = new FormTaoTaiKhoan();
                ImageIcon icon = new ImageIcon(getClass().
                        getResource("../com/mycompany/baiguixe/icons/Person-Male-Light-icon-24.png"));
                tplMain.addTab("Tạo Tài Khoản", icon, mFormTaiKhoan, "Tạo Tài Khoản");
            }
            tplMain.setSelectedComponent(mFormTaiKhoan);
        } else {
            MessageDialogHelper.showMessageDialog(this, "Bạn không có quyền truy cập", "Thông Báo");
        }
    }//GEN-LAST:event_menuTaoTaiKhoanActionPerformed

    private void menuQLVeXeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuQLVeXeActionPerformed
        Infomation infomation = Infomation.getInstance();
        if (infomation.laQuanLy()) {
            if (mFormVeThang == null) {
                mFormVeThang = new FormQLVeThang();
                ImageIcon icon = new ImageIcon(getClass().
                        getResource("../com/mycompany/baiguixe/icons/Person-Male-Light-icon-24.png"));
                tplMain.addTab("Quản Lý Vé Tháng", icon, mFormVeThang, "Quản Lý Vé Tháng");
            }
            tplMain.setSelectedComponent(mFormVeThang);
        } else {
            MessageDialogHelper.showMessageDialog(this, "Bạn không có quyền truy cập", "Thông Báo");
        }
    }//GEN-LAST:event_menuQLVeXeActionPerformed

    private void menuBaoCaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBaoCaoActionPerformed
        Infomation infomation = Infomation.getInstance();
        if (infomation.laQuanLy()) {
            if (mFormBaoCao == null) {
                mFormBaoCao = new FormBaoCao();
                ImageIcon icon = new ImageIcon(getClass().
                        getResource("../com/mycompany/baiguixe/icons/open-file-icon-16.png"));
                tplMain.addTab("Báo Cáo", icon, mFormBaoCao, "Báo Cáo");
            }
            tplMain.setSelectedComponent(mFormBaoCao);
        } else {
            MessageDialogHelper.showMessageDialog(this, "Bạn không có quyền truy cập", "Thông Báo");
        }
    }//GEN-LAST:event_menuBaoCaoActionPerformed

    private void btnDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangXuatActionPerformed
        new login().setVisible(true);
        Infomation instance = Infomation.getInstance();
        instance.clear();
        this.dispose();
    }//GEN-LAST:event_btnDangXuatActionPerformed

    public void setThongTin() {
        Infomation instance = Infomation.getInstance();
        if (instance == null) {
            return;
        }
        lblTenNguoiDung.setText(instance.getUsername());
        lblChucVu.setText(instance.getChucVu());
    }

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(FormMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(FormMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(FormMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(FormMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(() -> {
//            new FormMain().setVisible(true);
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDangXuat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel lblChucVu;
    private javax.swing.JLabel lblTenNguoiDung;
    private javax.swing.JMenuItem menuBaiXe;
    private javax.swing.JMenuItem menuBaoCao;
    private javax.swing.JMenuItem menuQLNV;
    private javax.swing.JMenuItem menuQLVeXe;
    private javax.swing.JMenuItem menuTaoTaiKhoan;
    private javax.swing.JTabbedPane tplMain;
    // End of variables declaration//GEN-END:variables
}
