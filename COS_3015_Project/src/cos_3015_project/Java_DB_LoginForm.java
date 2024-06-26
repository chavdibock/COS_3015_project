/**
 *
 * File: Java_DB_LoginForm.java
 *
* @author Nikola Georgiev
 * date 27.04.2024
 */
package cos_3015_project;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public final class Java_DB_LoginForm extends javax.swing.JFrame {

    /**
     * Creates new form JavaDB
     */
    public Java_DB_LoginForm() {

        initComponents();
        loadCover();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        pnl_welcome = new javax.swing.JPanel();
        txt_Name = new javax.swing.JTextField();
        bthn_exit = new javax.swing.JButton();
        lbl_userName = new javax.swing.JLabel();
        lbl_pass = new javax.swing.JLabel();
        bthn_reg = new javax.swing.JButton();
        bthn_login = new javax.swing.JButton();
        lbl_snowBox = new javax.swing.JLabel();
        lblMessageLogin = new javax.swing.JLabel();
        lblPicture = new javax.swing.JLabel();
        txt_Pass = new javax.swing.JPasswordField();
        chb_show_pass = new javax.swing.JCheckBox();

        jButton2.setText("jButton2");

        jPasswordField1.setText("jPasswordField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnl_welcome.setPreferredSize(new java.awt.Dimension(500, 370));

        txt_Name.setToolTipText("");
        txt_Name.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt_Name.setInheritsPopupMenu(true);
        txt_Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_NameActionPerformed(evt);
            }
        });

        bthn_exit.setBackground(new java.awt.Color(0, 0, 0));
        bthn_exit.setForeground(new java.awt.Color(255, 255, 255));
        bthn_exit.setText("Exit");
        bthn_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bthn_exitActionPerformed(evt);
            }
        });

        lbl_userName.setText("Username");

        lbl_pass.setText("Password");

        bthn_reg.setBackground(new java.awt.Color(0, 0, 0));
        bthn_reg.setForeground(new java.awt.Color(255, 255, 255));
        bthn_reg.setText("Register");
        bthn_reg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bthn_regActionPerformed(evt);
            }
        });

        bthn_login.setBackground(new java.awt.Color(0, 0, 0));
        bthn_login.setForeground(new java.awt.Color(255, 255, 255));
        bthn_login.setText("Login");
        bthn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bthn_loginActionPerformed(evt);
            }
        });

        lbl_snowBox.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        lbl_snowBox.setText("Reg System");

        chb_show_pass.setText("Show pass");
        chb_show_pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chb_show_passActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_welcomeLayout = new javax.swing.GroupLayout(pnl_welcome);
        pnl_welcome.setLayout(pnl_welcomeLayout);
        pnl_welcomeLayout.setHorizontalGroup(
            pnl_welcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_welcomeLayout.createSequentialGroup()
                .addGroup(pnl_welcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnl_welcomeLayout.createSequentialGroup()
                        .addGroup(pnl_welcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnl_welcomeLayout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(lbl_userName))
                            .addGroup(pnl_welcomeLayout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addComponent(lbl_pass))
                            .addGroup(pnl_welcomeLayout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(pnl_welcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_Name, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                                    .addComponent(txt_Pass)))
                            .addGroup(pnl_welcomeLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(pnl_welcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_snowBox)
                                    .addGroup(pnl_welcomeLayout.createSequentialGroup()
                                        .addComponent(bthn_reg)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(bthn_login)
                                        .addGap(18, 18, 18)
                                        .addComponent(chb_show_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(12, 12, 12)
                        .addComponent(lblPicture, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE))
                    .addGroup(pnl_welcomeLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnl_welcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bthn_exit)
                            .addComponent(lblMessageLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(20, 20, 20))
        );
        pnl_welcomeLayout.setVerticalGroup(
            pnl_welcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_welcomeLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(pnl_welcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_welcomeLayout.createSequentialGroup()
                        .addComponent(lbl_snowBox)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_userName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 27, Short.MAX_VALUE)
                        .addComponent(lbl_pass)
                        .addGap(18, 18, 18)
                        .addComponent(txt_Pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnl_welcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bthn_login)
                            .addComponent(bthn_reg)
                            .addComponent(chb_show_pass)))
                    .addComponent(lblPicture, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMessageLogin)
                .addGap(57, 57, 57)
                .addComponent(bthn_exit)
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_welcome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 571, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_welcome, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
public void loadCover() {
        try {
            BufferedImage img = ImageIO.read(new File("img\\intro.png"));
            ImageIcon image = new ImageIcon(img);
            Image im = image.getImage();
            Image myimg = im.getScaledInstance(lblPicture.getWidth(), lblPicture.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon newImage = new ImageIcon(myimg);
            lblPicture.setIcon(newImage);
        } catch (IOException e) {

        }

    }

    public static int id = 0;
    Cred credentials = new Cred();

    private void bthn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bthn_loginActionPerformed
       
        String name = txt_Name.getText();
        String pass = txt_Pass.getText();

        try {
            Connection conn = DriverManager.getConnection(credentials.getURL(), credentials.getUser(), credentials.getPass());

            if (conn != null) {

                Statement stm = conn.createStatement();

                String query = "select * from " + credentials.getTable() + " ;";

                //stm.execute(query);
                ResultSet rs = stm.executeQuery(query);

                if (rs.next() != true) {
                    JOptionPane.showMessageDialog(this, "Wrong credentials!!!", "No regs", JOptionPane.ERROR_MESSAGE);
                    //System.out.println("No registrations are made!!");
                } else {
                    //going trough the response
                    boolean log = false;
                    while (rs.next()) {
                        //id = rs.getInt("ID");
                        //System.out.println("id:" + id);

                        String userSaltDB = rs.getString("user_salt");
                        //System.out.println("user salt:" + userSaltDB);
                        String userDB = rs.getString("user_hash");
                        //System.out.println("user: " + userDB);
                        String passSaltDB = rs.getString("pass_salt");
                        //System.out.println("pass salt: " + passSaltDB);
                        String passDB = rs.getString("pass");
                        //System.out.println("pass: " + passDB);

                        byte[] convertedSaltUser = new byte[userSaltDB.length() / 2];
                        byte[] convertedSaltPass = new byte[passSaltDB.length() / 2];

                        for (int i = 0; i < convertedSaltUser.length; i++) {
                            int index = i * 2;
                            int val = Integer.parseInt(userSaltDB.substring(index, index + 2), 16);
                            convertedSaltUser[i] = (byte) val;
                        }

                        for (int i = 0; i < convertedSaltPass.length; i++) {
                            int index = i * 2;
                            int b = Integer.parseInt(passSaltDB.substring(index, index + 2), 16);
                            convertedSaltPass[i] = (byte) b;
                        }
                        String realUser = generateHash(name, credentials.getAlgo(), convertedSaltUser);
                        String realPass = generateHash(pass, credentials.getAlgo(), convertedSaltPass);

                        if (realUser.equals(userDB) && realPass.equals(passDB)) {
                            //System.out.println("Welcome to snow box, " + name + " ;)");
                            id = rs.getInt("ID");
                            Company_Frame cp = new Company_Frame();
                            //System.out.println("Before ->" + gr.userId);
                            //TreePanel.userId = id;
                            //System.out.println("After ->" + gr.userId);
                            cp.setVisible(true);
                            this.dispose();
                            log = true;
                        }

                    }

                    if (log == false) {
                        JOptionPane.showMessageDialog(this, "Wrong credentials!!!");
                        //lblMessageLogin.setForeground(Color.red);
                        //blMessageLogin.setText("Wrong credentials");
                    }

                }

            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_bthn_loginActionPerformed

    private void bthn_regActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bthn_regActionPerformed

        new Java_DB_RegisterForm().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bthn_regActionPerformed

    private void bthn_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bthn_exitActionPerformed
        // TODO add your handling code here:

        System.exit(0);
    }//GEN-LAST:event_bthn_exitActionPerformed

    private void txt_NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_NameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_NameActionPerformed

    private void chb_show_passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chb_show_passActionPerformed
        if (chb_show_pass.isSelected()) {
            txt_Pass.setEchoChar((char) 0);// Show password
        } else {
            txt_Pass.setEchoChar('*'); // Hide password
        }
    }//GEN-LAST:event_chb_show_passActionPerformed

    private static String generateHash(String data, String algorithm, byte[] salt) throws NoSuchAlgorithmException {

        MessageDigest digest = MessageDigest.getInstance(algorithm);
        digest.reset();
        digest.update(salt);
        byte[] hash = digest.digest(data.getBytes());
        return bytesToStringHex(hash);
    }

    private final static char[] hexArray = "0123456789ABCDEF".toCharArray();

    public static String bytesToStringHex(byte[] bytes) {
        char[] hexChars = new char[bytes.length * 2];
        for (int j = 0; j < bytes.length; j++) {
            int v = bytes[j] & 0xFF;
            hexChars[j * 2] = hexArray[v >>> 4];
            hexChars[j * 2 + 1] = hexArray[v & 0x0F];

        }
        return new String(hexChars);
    }

    public static byte[] createSalt() {
        byte[] bytes = new byte[20];
        SecureRandom random = new SecureRandom();
        random.nextBytes(bytes);
        return bytes;

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
            java.util.logging.Logger.getLogger(Java_DB_LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Java_DB_LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Java_DB_LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Java_DB_LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Java_DB_LoginForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bthn_exit;
    private javax.swing.JButton bthn_login;
    private javax.swing.JButton bthn_reg;
    private javax.swing.JCheckBox chb_show_pass;
    private javax.swing.JButton jButton2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JLabel lblMessageLogin;
    private javax.swing.JLabel lblPicture;
    private javax.swing.JLabel lbl_pass;
    private javax.swing.JLabel lbl_snowBox;
    private javax.swing.JLabel lbl_userName;
    private javax.swing.JPanel pnl_welcome;
    private javax.swing.JTextField txt_Name;
    private javax.swing.JPasswordField txt_Pass;
    // End of variables declaration//GEN-END:variables
}
