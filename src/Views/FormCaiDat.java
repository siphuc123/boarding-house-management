package Views;

import Helper.ShareHelper;
import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.UIManager;

public class FormCaiDat extends javax.swing.JPanel {

    public FormCaiDat() {
        initComponents();
        init();
    }

    void init() {
        if (ShareHelper.USER != null) {
            lblHoTen.setText(ShareHelper.USER.getHoTen());
            lblVaiTro.setText(ShareHelper.USER.isVaiTro() ? "Quản lý trọ" : "Chủ trọ");
            lblEmail.setText(ShareHelper.USER.getEmail());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        pnlCaiDat = new javax.swing.JPanel();
        pnlCaiDat1 = new javax.swing.JPanel();
        lblEmail = new javax.swing.JLabel();
        lblGiaoDien = new javax.swing.JLabel();
        lblGmail = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblRole = new javax.swing.JLabel();
        rdoToi = new javax.swing.JRadioButton();
        lblHoTen = new javax.swing.JLabel();
        rdoSang = new javax.swing.JRadioButton();
        lblCDTaiKhoan = new javax.swing.JLabel();
        lblCDGiaoDien = new javax.swing.JLabel();
        lblVaiTro = new javax.swing.JLabel();

        setBackground(new java.awt.Color(227, 240, 252));

        pnlCaiDat.setLayout(new java.awt.BorderLayout());

        pnlCaiDat1.setBackground(new java.awt.Color(227, 240, 252));

        lblEmail.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N
        lblEmail.setText("..........................................");

        lblGiaoDien.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        lblGiaoDien.setText("Giao diện:");

        lblGmail.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        lblGmail.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblGmail.setText("Email:");

        lblName.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        lblName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblName.setText("Họ và tên:");

        lblRole.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        lblRole.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblRole.setText("Vai trò:");

        rdoToi.setBackground(new java.awt.Color(227, 240, 252));
        buttonGroup1.add(rdoToi);
        rdoToi.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        rdoToi.setText("Tối");
        rdoToi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoToiActionPerformed(evt);
            }
        });

        lblHoTen.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N
        lblHoTen.setText("..........................................");

        rdoSang.setBackground(new java.awt.Color(227, 240, 252));
        buttonGroup1.add(rdoSang);
        rdoSang.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        rdoSang.setSelected(true);
        rdoSang.setText("Sáng");
        rdoSang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoSangActionPerformed(evt);
            }
        });

        lblCDTaiKhoan.setBackground(new java.awt.Color(227, 240, 252));
        lblCDTaiKhoan.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblCDTaiKhoan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCDTaiKhoan.setText("Cài đặt tài khoản:");
        lblCDTaiKhoan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCDTaiKhoan.setOpaque(true);
        lblCDTaiKhoan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCDTaiKhoanMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblCDTaiKhoanMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblCDTaiKhoanMouseExited(evt);
            }
        });

        lblCDGiaoDien.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblCDGiaoDien.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCDGiaoDien.setText("Cài đặt giao diện:");
        lblCDGiaoDien.setMaximumSize(new java.awt.Dimension(240, 29));
        lblCDGiaoDien.setPreferredSize(new java.awt.Dimension(240, 29));

        lblVaiTro.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N
        lblVaiTro.setText("..........................................");

        javax.swing.GroupLayout pnlCaiDat1Layout = new javax.swing.GroupLayout(pnlCaiDat1);
        pnlCaiDat1.setLayout(pnlCaiDat1Layout);
        pnlCaiDat1Layout.setHorizontalGroup(
            pnlCaiDat1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCaiDat1Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(pnlCaiDat1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCaiDat1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(pnlCaiDat1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblGmail)
                            .addComponent(lblRole)
                            .addComponent(lblName))
                        .addGap(18, 18, 18)
                        .addGroup(pnlCaiDat1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblHoTen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblVaiTro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlCaiDat1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(lblGiaoDien)
                        .addGap(29, 29, 29)
                        .addComponent(rdoSang)
                        .addGap(42, 42, 42)
                        .addComponent(rdoToi))
                    .addComponent(lblCDTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCDGiaoDien, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(593, Short.MAX_VALUE))
        );
        pnlCaiDat1Layout.setVerticalGroup(
            pnlCaiDat1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCaiDat1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(lblCDTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(pnlCaiDat1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(lblHoTen))
                .addGap(25, 25, 25)
                .addGroup(pnlCaiDat1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblRole, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblVaiTro))
                .addGap(25, 25, 25)
                .addGroup(pnlCaiDat1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGmail)
                    .addComponent(lblEmail))
                .addGap(113, 113, 113)
                .addComponent(lblCDGiaoDien, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(pnlCaiDat1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGiaoDien)
                    .addComponent(rdoSang)
                    .addComponent(rdoToi))
                .addContainerGap(344, Short.MAX_VALUE))
        );

        pnlCaiDat.add(pnlCaiDat1, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlCaiDat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlCaiDat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void lblCDTaiKhoanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCDTaiKhoanMouseClicked
        pnlCaiDat.removeAll();
        pnlCaiDat.add(new FormTaiKhoan());
        pnlCaiDat.revalidate();
        pnlCaiDat.repaint();
    }//GEN-LAST:event_lblCDTaiKhoanMouseClicked

    private void lblCDTaiKhoanMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCDTaiKhoanMouseEntered
        lblCDTaiKhoan.setBackground(new java.awt.Color(255, 255, 255));
        lblCDTaiKhoan.setForeground(Color.blue);
    }//GEN-LAST:event_lblCDTaiKhoanMouseEntered

    private void lblCDTaiKhoanMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCDTaiKhoanMouseExited
        lblCDTaiKhoan.setBackground(new java.awt.Color(227, 240, 252));
        lblCDTaiKhoan.setForeground(Color.black);
//        if (rdoSang.isSelected()) {
//            lblCDTaiKhoan.setBackground(new java.awt.Color(227, 240, 252));
//            lblCDTaiKhoan.setForeground(Color.black);
//        } else {
//            lblCDTaiKhoan.setBackground(new java.awt.Color(75, 83, 89));
//            lblCDTaiKhoan.setForeground(Color.white);
//        }

    }//GEN-LAST:event_lblCDTaiKhoanMouseExited

    private void rdoSangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoSangActionPerformed
//        ShareHelper.theme = true;
//        try {
//            UIManager.setLookAndFeel(new FlatLightLaf());
//            pnlCaiDat.setBackground(new java.awt.Color(227, 240, 252));
//            pnlCaiDat1.setBackground(new java.awt.Color(227, 240, 252));
//            lblCDTaiKhoan.setBackground(new java.awt.Color(227, 240, 252));
//            lblCDTaiKhoan.setForeground(Color.black);
//            lblCDGiaoDien.setForeground(Color.black);
//            lblGiaoDien.setForeground(Color.black);
//            lblName.setForeground(Color.black);
//            lblHoTen.setForeground(Color.black);
//            lblVaiTro.setForeground(Color.black);
//            lblRole.setForeground(Color.black);
//            lblGmail.setForeground(Color.black);
//            lblEmail.setForeground(Color.black);
//            rdoSang.setForeground(Color.black);
//            rdoToi.setForeground(Color.black);
//        } catch (Exception ex) {
//            System.err.println("Failed to initialize LaF");
//        }
    }//GEN-LAST:event_rdoSangActionPerformed

    private void rdoToiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoToiActionPerformed
//        ShareHelper.theme = false;
//        try {
//            UIManager.setLookAndFeel(new FlatDarkLaf());
//            pnlCaiDat.setBackground(new java.awt.Color(75, 83, 89));
//            pnlCaiDat1.setBackground(new java.awt.Color(75, 83, 89));
//            lblCDTaiKhoan.setBackground(new java.awt.Color(75, 83, 89));
//            lblCDTaiKhoan.setForeground(Color.white);
//            lblCDGiaoDien.setForeground(Color.white);
//            lblGiaoDien.setForeground(Color.white);
//            lblName.setForeground(Color.white);
//            lblHoTen.setForeground(Color.white);
//            lblVaiTro.setForeground(Color.white);
//            lblRole.setForeground(Color.white);
//            lblGmail.setForeground(Color.white);
//            lblEmail.setForeground(Color.white);
//            rdoSang.setForeground(Color.white);
//            rdoToi.setForeground(Color.white);
//            rdoSang.setBackground(new java.awt.Color(75, 83, 89));
//            rdoToi.setBackground(new java.awt.Color(75, 83, 89));
//        } catch (Exception ex) {
//            System.err.println("Failed to initialize LaF");
//        }
    }//GEN-LAST:event_rdoToiActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel lblCDGiaoDien;
    private javax.swing.JLabel lblCDTaiKhoan;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblGiaoDien;
    private javax.swing.JLabel lblGmail;
    private javax.swing.JLabel lblHoTen;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblRole;
    private javax.swing.JLabel lblVaiTro;
    private javax.swing.JPanel pnlCaiDat;
    private javax.swing.JPanel pnlCaiDat1;
    private javax.swing.JRadioButton rdoSang;
    private javax.swing.JRadioButton rdoToi;
    // End of variables declaration//GEN-END:variables
}
