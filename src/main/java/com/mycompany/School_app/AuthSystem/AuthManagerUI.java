/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.School_app.AuthSystem;

import com.mycompany.School_app.Config.InitConfig;
import com.mycompany.School_app.Data_Handler;
import com.mycompany.School_app.MainApp.MainApp;
import com.mycompany.School_app.StatusSystem.Status;
import com.mycompany.School_app.ThemeManger.ThemeMangerUI;

import javax.swing.*;
import java.util.Enumeration;

/**
 *
 * @author mohamed waleed
 */
public class AuthManagerUI extends javax.swing.JFrame {

    /**
     * Creates new form AuthManagerUI
     */
    public AuthManagerUI() {
        initComponents();
        custominit();
    }

    private void custominit() {
        Fix_BTN_DEV.setVisible(InitConfig.DEVMODE);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        UserSelectorRadioGroup = new javax.swing.ButtonGroup();
        AuthTabbedPanel = new javax.swing.JTabbedPane();
        Login_Panel = new javax.swing.JPanel();
        Login_btn = new javax.swing.JButton();
        Email_Login_txt = new javax.swing.JTextField();
        Email_Login_Label = new javax.swing.JLabel();
        Password_Login_Label = new javax.swing.JLabel();
        User_Radio_Login = new javax.swing.JRadioButton();
        Librarian_Radio_Login = new javax.swing.JRadioButton();
        Status_Login_Label = new javax.swing.JLabel();
        Type_Register_Label1 = new javax.swing.JLabel();
        Password_Login_txt = new javax.swing.JPasswordField();
        Fix_BTN_DEV = new javax.swing.JButton();
        Register_Panel = new javax.swing.JPanel();
        Name_Register_Label = new javax.swing.JLabel();
        Name_Register_txt = new javax.swing.JTextField();
        Email_Register_Label = new javax.swing.JLabel();
        Email_Register_txt = new javax.swing.JTextField();
        Password_Register_Label = new javax.swing.JLabel();
        Password_Register_txt = new javax.swing.JPasswordField();
        UserTypeSelector_Register = new javax.swing.JComboBox<>();
        Type_Register_Label = new javax.swing.JLabel();
        Status_Register_Label = new javax.swing.JLabel();
        Register_btn = new javax.swing.JButton();
        jPanel1 = new TypingPanel();
        MenuBar = new javax.swing.JMenuBar();
        File_Menu = new javax.swing.JMenu();
        View_Menu = new javax.swing.JMenu();
        Theme_Menu_Item = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Authentication");

        Login_btn.setText("Login");
        Login_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Login_btnActionPerformed(evt);
            }
        });

        Email_Login_Label.setText("Email");

        Password_Login_Label.setText("Password");

        UserSelectorRadioGroup.add(User_Radio_Login);
        User_Radio_Login.setSelected(true);
        User_Radio_Login.setText("User");
        User_Radio_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                User_Radio_LoginActionPerformed(evt);
            }
        });

        UserSelectorRadioGroup.add(Librarian_Radio_Login);
        Librarian_Radio_Login.setText("Librarian");

        Status_Login_Label.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);

        Type_Register_Label1.setText("Type");

        Fix_BTN_DEV.setText("Fix_BTN_DEV");
        Fix_BTN_DEV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Fix_BTN_DEVActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Login_PanelLayout = new javax.swing.GroupLayout(Login_Panel);
        Login_Panel.setLayout(Login_PanelLayout);
        Login_PanelLayout.setHorizontalGroup(
            Login_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Login_PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Login_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Login_PanelLayout.createSequentialGroup()
                        .addComponent(Status_Login_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Login_btn)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(Login_PanelLayout.createSequentialGroup()
                        .addGroup(Login_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Email_Login_Label)
                            .addComponent(Password_Login_Label)
                            .addComponent(Type_Register_Label1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(Login_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Email_Login_txt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Password_Login_txt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(Login_PanelLayout.createSequentialGroup()
                                .addComponent(User_Radio_Login)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Librarian_Radio_Login))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Login_PanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Fix_BTN_DEV)))
                .addContainerGap())
        );
        Login_PanelLayout.setVerticalGroup(
            Login_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Login_PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Login_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Email_Login_Label)
                    .addComponent(Email_Login_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Login_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Password_Login_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Password_Login_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Login_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Login_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(User_Radio_Login)
                        .addComponent(Librarian_Radio_Login))
                    .addComponent(Type_Register_Label1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(Fix_BTN_DEV)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Login_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Status_Login_Label, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Login_btn, javax.swing.GroupLayout.Alignment.TRAILING)))
        );

        AuthTabbedPanel.addTab("Login", Login_Panel);

        Name_Register_Label.setText("Name");

        Email_Register_Label.setText("Email");

        Password_Register_Label.setText("Password");

        UserTypeSelector_Register.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Student", "Teacher", "Librarian" }));
        UserTypeSelector_Register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserTypeSelector_RegisterActionPerformed(evt);
            }
        });

        Type_Register_Label.setText("Type");

        Status_Register_Label.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);

        Register_btn.setText("Register");
        Register_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Register_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Register_PanelLayout = new javax.swing.GroupLayout(Register_Panel);
        Register_Panel.setLayout(Register_PanelLayout);
        Register_PanelLayout.setHorizontalGroup(
            Register_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Register_PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Register_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Register_PanelLayout.createSequentialGroup()
                        .addComponent(Status_Register_Label, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Register_btn))
                    .addGroup(Register_PanelLayout.createSequentialGroup()
                        .addGroup(Register_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Email_Register_Label)
                            .addComponent(Name_Register_Label)
                            .addComponent(Password_Register_Label)
                            .addComponent(Type_Register_Label))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(Register_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Email_Register_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Register_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(UserTypeSelector_Register, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Name_Register_txt, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(Password_Register_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        Register_PanelLayout.setVerticalGroup(
            Register_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Register_PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Register_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Name_Register_Label)
                    .addComponent(Name_Register_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Register_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Email_Register_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Email_Register_Label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Register_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Password_Register_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Password_Register_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Register_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UserTypeSelector_Register, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Type_Register_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(Register_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Register_btn)
                    .addComponent(Status_Register_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        AuthTabbedPanel.addTab("Register", Register_Panel);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE)
        );

        File_Menu.setText("File");
        MenuBar.add(File_Menu);

        View_Menu.setText("View");

        Theme_Menu_Item.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        Theme_Menu_Item.setText("Themes");
        Theme_Menu_Item.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Theme_Menu_ItemActionPerformed(evt);
            }
        });
        View_Menu.add(Theme_Menu_Item);

        MenuBar.add(View_Menu);

        setJMenuBar(MenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AuthTabbedPanel))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AuthTabbedPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Login_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Login_btnActionPerformed
        // TODO add your handling code here:
        String email = Email_Login_txt.getText();
        String password = Password_Login_txt.getText();
        int mode = getCurrentSelectionIndex(UserSelectorRadioGroup);

        AuthManager.Authenticate(email,password,mode);

        Status status = AuthManager.getStatus();
        Status_Login_Label.setText(status.getstatusMessage());

        switch (status.getErrorCode()) {
            case 1->{Email_Login_txt.requestFocus();}
            case 2->{Password_Login_txt.requestFocus();}
        }
    }//GEN-LAST:event_Login_btnActionPerformed

    private void Register_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Register_btnActionPerformed
        // TODO add your handling code here:
        String username = Name_Register_txt.getText();
        String email = Email_Register_txt.getText();
        String password = Password_Register_txt.getText();
        int mode = UserTypeSelector_Register.getSelectedIndex();

        AuthManager.Register(username,email,password,mode);

        Status status = AuthManager.getStatus();
        Status_Register_Label.setText(status.getstatusMessage());

        switch (status.getErrorCode()) {
            case 1->{Name_Register_txt.requestFocus();}
            case 2->{Email_Register_txt.requestFocus();}
            case 3->{Password_Register_txt.requestFocus();}
        }

    }//GEN-LAST:event_Register_btnActionPerformed

    private void User_Radio_LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_User_Radio_LoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_User_Radio_LoginActionPerformed

    private void UserTypeSelector_RegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserTypeSelector_RegisterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UserTypeSelector_RegisterActionPerformed

    private void Theme_Menu_ItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Theme_Menu_ItemActionPerformed
        // TODO add your handling code here:
        new ThemeMangerUI();
    }//GEN-LAST:event_Theme_Menu_ItemActionPerformed

    private void Fix_BTN_DEVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Fix_BTN_DEVActionPerformed
        // TODO add your handling code here:
        Data_Handler.fixnumbers();
    }//GEN-LAST:event_Fix_BTN_DEVActionPerformed


    private int getCurrentSelectionIndex(ButtonGroup buttonGroup) {
        int i = 0;
        for (Enumeration<AbstractButton> buttons = buttonGroup.getElements(); buttons.hasMoreElements(); ) {
            AbstractButton button = buttons.nextElement();
            if (button.isSelected()) {
                return i;
            }
            i++;
        }
        return 0;
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
            java.util.logging.Logger.getLogger(AuthManagerUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AuthManagerUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AuthManagerUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AuthManagerUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AuthManagerUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane AuthTabbedPanel;
    private javax.swing.JLabel Email_Login_Label;
    private javax.swing.JTextField Email_Login_txt;
    private javax.swing.JLabel Email_Register_Label;
    private javax.swing.JTextField Email_Register_txt;
    private javax.swing.JMenu File_Menu;
    private javax.swing.JButton Fix_BTN_DEV;
    private javax.swing.JRadioButton Librarian_Radio_Login;
    private javax.swing.JPanel Login_Panel;
    private javax.swing.JButton Login_btn;
    private javax.swing.JMenuBar MenuBar;
    private javax.swing.JLabel Name_Register_Label;
    private javax.swing.JTextField Name_Register_txt;
    private javax.swing.JLabel Password_Login_Label;
    private javax.swing.JPasswordField Password_Login_txt;
    private javax.swing.JLabel Password_Register_Label;
    private javax.swing.JPasswordField Password_Register_txt;
    private javax.swing.JPanel Register_Panel;
    private javax.swing.JButton Register_btn;
    private javax.swing.JLabel Status_Login_Label;
    private javax.swing.JLabel Status_Register_Label;
    private javax.swing.JMenuItem Theme_Menu_Item;
    private javax.swing.JLabel Type_Register_Label;
    private javax.swing.JLabel Type_Register_Label1;
    private javax.swing.ButtonGroup UserSelectorRadioGroup;
    private javax.swing.JComboBox<String> UserTypeSelector_Register;
    private javax.swing.JRadioButton User_Radio_Login;
    private javax.swing.JMenu View_Menu;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
