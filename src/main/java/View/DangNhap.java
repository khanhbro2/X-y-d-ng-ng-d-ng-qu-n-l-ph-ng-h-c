/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Controller.FileData;
import Model.Phong;
import java.awt.Color;
import java.awt.Cursor;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author PC
 */
public class DangNhap extends javax.swing.JFrame {

    FileData file = new FileData();
    ArrayList<Phong> ds = new ArrayList<>(file.readFile("Phong.txt"));
    /**
     * Creates new form DangNhap
     */
    public DangNhap() {
        initComponents();
        
        cbbLoaiTaiKhoan.addItem("Admin");
        cbbLoaiTaiKhoan.addItem("User");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtTaiKhoan = new javax.swing.JTextField();
        btDangNhap = new javax.swing.JButton();
        cbbLoaiTaiKhoan = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        lbDangKy = new javax.swing.JLabel();
        txtMatKhau = new javax.swing.JPasswordField();
        lbQuenMatKhau = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFont(new java.awt.Font("Agency FB", 0, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 255, 153));
        jLabel1.setText("Đăng nhập");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Tài khoản:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Mật khẩu:");

        txtTaiKhoan.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        btDangNhap.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btDangNhap.setText("Đăng nhập");
        btDangNhap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btDangNhapMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btDangNhapMouseExited(evt);
            }
        });
        btDangNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDangNhapActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Loại Tài Khoản:");

        lbDangKy.setForeground(new java.awt.Color(51, 51, 255));
        lbDangKy.setText("Đăng Ký");
        lbDangKy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dangKy(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbDangKyMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbDangKyMouseExited(evt);
            }
        });

        txtMatKhau.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lbQuenMatKhau.setForeground(new java.awt.Color(51, 51, 255));
        lbQuenMatKhau.setText("Quên mật khẩu");
        lbQuenMatKhau.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbQuenMatKhaudangKy(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbQuenMatKhauMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbQuenMatKhauMouseExited(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 32, Short.MAX_VALUE)
                .addComponent(lbDangKy)
                .addGap(331, 331, 331))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(264, 264, 264)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(45, 45, 45)
                                .addComponent(txtTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(49, 49, 49)
                                .addComponent(txtMatKhau))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(cbbLoaiTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(258, 258, 258)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbQuenMatKhau)
                            .addComponent(btDangNhap))))
                .addContainerGap(241, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbbLoaiTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63)
                .addComponent(btDangNhap)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbDangKy)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbQuenMatKhau)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Link chuyển đến trang đăng ký phòng
    private void dangKy(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dangKy
        DangKy x = new DangKy();
        x.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_dangKy

    //Đổi màu cho button đăng nhập khi mà con trỏ vướt qua
    private void btDangNhapMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btDangNhapMouseExited
        // TODO add your handling code here:
        btDangNhap.setBackground(UIManager.getColor("control"));
         btDangNhap.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));

    }//GEN-LAST:event_btDangNhapMouseExited

    private void btDangNhapMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btDangNhapMouseEntered
        // TODO add your handling code here:
        btDangNhap.setBackground(Color.GREEN);
        btDangNhap.setCursor(new Cursor(Cursor.HAND_CURSOR));

    }//GEN-LAST:event_btDangNhapMouseEntered
    
    //Đổi màu cho chữ đăng ký
    private void lbDangKyMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbDangKyMouseEntered
        // TODO add your handling code here:
        lbDangKy.setForeground(Color.GRAY);
        lbDangKy.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_lbDangKyMouseEntered

    private void lbDangKyMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbDangKyMouseExited
        // TODO add your handling code here:
        lbDangKy.setForeground(UIManager.getColor("control"));
        lbDangKy.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_lbDangKyMouseExited

    //Sự kiên đăng nhập
    private void btDangNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDangNhapActionPerformed
        // TODO add your handling code here:
        if(txtTaiKhoan.getText().trim().length() == 0){
            JOptionPane.showMessageDialog(null, "Tài khoản không được để trống", "Thông báo", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(txtMatKhau.getText().trim().length() == 0){
            JOptionPane.showMessageDialog(null, "Mật khẩu không được để trống", "Thông báo", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(cbbLoaiTaiKhoan.getSelectedItem().toString().equals("Admin"))
        if(txtMatKhau.getText().equals("123456") && txtTaiKhoan.getText().equalsIgnoreCase("Admin")){
            MenuAdmin x = new MenuAdmin();
            x.setVisible(true);
            this.dispose();
        }else{
            JOptionPane.showMessageDialog(null, "Tài khoản hoặc mật khẩu bị sai!", "Thông báo", JOptionPane.WARNING_MESSAGE);
            return;
        }else{
            if(checkTk(txtTaiKhoan.getText(), txtMatKhau.getText())){
               MenuUser x = new MenuUser(txtTaiKhoan.getText());
               x.setVisible(true); 
               this.dispose();
            }else{
               JOptionPane.showMessageDialog(null, "Tài khoản không tồn tại!!", "Thông báo", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_btDangNhapActionPerformed
//Xử lý sự kiện bâm vào link quên mật khẩu
    private void lbQuenMatKhaudangKy(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbQuenMatKhaudangKy
        // TODO add your handling code here:
        (new QuenMatKhau()).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lbQuenMatKhaudangKy

    private void lbQuenMatKhauMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbQuenMatKhauMouseEntered
        // TODO add your handling code here:
        lbQuenMatKhau.setForeground(Color.GRAY);
        lbQuenMatKhau.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_lbQuenMatKhauMouseEntered

    private void lbQuenMatKhauMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbQuenMatKhauMouseExited
        // TODO add your handling code here:
        lbQuenMatKhau.setForeground(UIManager.getColor("control"));
        lbQuenMatKhau.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_lbQuenMatKhauMouseExited

    public boolean checkTk(String tk, String mk){
        for (Phong d : ds) 
            if(d.getTk().getTaiKhoan().equals(tk) && d.getTk().getMatKhau().equals(mk))
                return true;
        return false;
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DangNhap().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btDangNhap;
    private javax.swing.JComboBox<String> cbbLoaiTaiKhoan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lbDangKy;
    private javax.swing.JLabel lbQuenMatKhau;
    private javax.swing.JPasswordField txtMatKhau;
    private javax.swing.JTextField txtTaiKhoan;
    // End of variables declaration//GEN-END:variables
}
