
import java.sql.ResultSet;
import javax.swing.JOptionPane;



public class DoiMatKhau extends javax.swing.JFrame {


    KetNoi kn = new KetNoi();
    maHoa MH = new maHoa();
    
    public DoiMatKhau() {
        initComponents();
        btnDoimk.setEnabled(false);
        setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnDoimk = new javax.swing.JButton();
        btnHuy = new javax.swing.JButton();
        passmkcu = new javax.swing.JPasswordField();
        passmk1 = new javax.swing.JPasswordField();
        passmk2 = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Change Password");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Password");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("New password");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Confirm new password");

        btnDoimk.setBackground(new java.awt.Color(153, 204, 255));
        btnDoimk.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnDoimk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Checkmark-20.png"))); // NOI18N
        btnDoimk.setText("Submit");
        btnDoimk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoimkActionPerformed(evt);
            }
        });

        btnHuy.setBackground(new java.awt.Color(153, 204, 255));
        btnHuy.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnHuy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Cancel.png"))); // NOI18N
        btnHuy.setText("Cancel");
        btnHuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuyActionPerformed(evt);
            }
        });

        passmkcu.setForeground(new java.awt.Color(0, 0, 102));
        passmkcu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passmkcuKeyPressed(evt);
            }
        });

        passmk1.setForeground(new java.awt.Color(0, 0, 102));

        passmk2.setForeground(new java.awt.Color(0, 0, 102));
        passmk2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passmk2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(passmkcu, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                            .addComponent(passmk1)
                            .addComponent(passmk2)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnDoimk)
                        .addGap(62, 62, 62)
                        .addComponent(btnHuy)
                        .addGap(20, 20, 20)))
                .addGap(50, 50, 50))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(passmkcu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(passmk1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(passmk2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnHuy)
                    .addComponent(btnDoimk))
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDoimkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoimkActionPerformed
        try{
            kn.KN();
            String sql = "Select * from DANGNHAP where pw='"+MH.encryptMD5(passmkcu.getText())+"'";
            ResultSet rs = KetNoi.s.executeQuery(sql);        
            if (rs.next()){
                String s = passmk1.getText();
                if((s.matches(".*[0-9].*")) && (s.matches(".*[a-z].*"))&& (s.matches(".*[A-Z].*")) && (s.matches(".*[^a-zA-Z_0-9].*")) && (s.matches("\\S+")) && (s.length()>= 8) == true ){
                    if(passmk1.getText().equals(passmk2.getText())){
                        String up = "update DANGNHAP set pw = '"+MH.encryptMD5(passmk2.getText())+"'";
                        KetNoi.s.execute(up);
                        JOptionPane.showMessageDialog(this, "Change password sucessfully.");
                        this.dispose();
                        DangNhap frm = new DangNhap();
                        frm.setVisible(true);
                    }else{
                        JOptionPane.showMessageDialog(this, "Confirm the password incorrectly.");
                    }
                }
                else{
                    JOptionPane.showMessageDialog(rootPane,"                     Password has at least 8 characters,\n contains  uppercase, lowercase, number and special character.");
                }
            }else {
                JOptionPane.showMessageDialog(this,"Old password is incorrect.");
                    passmkcu.setText("");
                    passmk1.setText("");
                    passmk2.setText("");
                }
        }
        catch(Exception e){
        }
    }//GEN-LAST:event_btnDoimkActionPerformed

    private void btnHuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuyActionPerformed
        this.dispose();
        MainPage frm = new MainPage();
        frm.setVisible(true);
    }//GEN-LAST:event_btnHuyActionPerformed

    private void passmkcuKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passmkcuKeyPressed
        btnDoimk.setEnabled(true);
    }//GEN-LAST:event_passmkcuKeyPressed

    private void passmk2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passmk2ActionPerformed
        btnDoimkActionPerformed(evt);
    }//GEN-LAST:event_passmk2ActionPerformed

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
            java.util.logging.Logger.getLogger(DoiMatKhau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DoiMatKhau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DoiMatKhau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DoiMatKhau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DoiMatKhau().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDoimk;
    private javax.swing.JButton btnHuy;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField passmk1;
    private javax.swing.JPasswordField passmk2;
    private javax.swing.JPasswordField passmkcu;
    // End of variables declaration//GEN-END:variables
}
