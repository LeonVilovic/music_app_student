/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.view;

import Domain.Korisnik;
import UI.view.components.TableModelKorisnik;
import communication.CommunicationController;
import java.io.IOException;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Leon
 */
public class UserFrame extends javax.swing.JFrame {

    /**
     * Creates new form UserFrame
     */
    public UserFrame() {
        initComponents();
        prepareView();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImeTextField = new javax.swing.JTextField();
        PrezimeTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        EmailTextField = new javax.swing.JTextField();
        UssernameTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        PasswordTextField = new javax.swing.JTextField();
        SacuvajKorisnikaButton = new javax.swing.JButton();
        SearchTextField = new javax.swing.JTextField();
        SearchButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        KorisniciTable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();

        jLabel1.setText("Ime");

        jLabel2.setText("Prezime");

        jLabel4.setText("E-mail");

        jLabel5.setText("Username");

        jLabel6.setText("Password");

        SacuvajKorisnikaButton.setText("Sacuvaj");
        SacuvajKorisnikaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SacuvajKorisnikaButtonActionPerformed(evt);
            }
        });

        SearchButton.setText("Pretrazi");
        SearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchButtonActionPerformed(evt);
            }
        });

        KorisniciTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6"
            }
        ));
        KorisniciTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                KorisniciTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(KorisniciTable);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel3.setText("Unos Novog Korisnika");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(194, 194, 194)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(SearchTextField)
                                    .addComponent(SearchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(83, 83, 83)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(ImeTextField)
                                        .addComponent(PrezimeTextField)
                                        .addComponent(EmailTextField)
                                        .addComponent(UssernameTextField)
                                        .addComponent(PasswordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 167, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(215, 215, 215)
                .addComponent(SacuvajKorisnikaButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ImeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PrezimeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EmailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UssernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PasswordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addComponent(SacuvajKorisnikaButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SearchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SearchButton)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SacuvajKorisnikaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SacuvajKorisnikaButtonActionPerformed
        Korisnik k = new Korisnik();
        k.setIme(ImeTextField.getText());
        k.setPrezime(PrezimeTextField.getText());
        k.setUsername(UssernameTextField.getText());
        k.setPassword(PasswordTextField.getText());
        GregorianCalendar d = new GregorianCalendar();
        k.setClanOd(d);
        k.setEmail(EmailTextField.getText());
        try {
            validacijaPartitura();
            CommunicationController.getInstance().saveKorisnik(k);
            JOptionPane.showMessageDialog(this, "Uspesno sacuvan korisnik", "Obavestenje", JOptionPane.PLAIN_MESSAGE);
        } catch (Exception ex) {
            Logger.getLogger(UserFrame.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Greska pri cuvanju korisnika", JOptionPane.WARNING_MESSAGE);
        }


    }//GEN-LAST:event_SacuvajKorisnikaButtonActionPerformed

    private void SearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchButtonActionPerformed
        SearchUsers();
    }//GEN-LAST:event_SearchButtonActionPerformed

    private void KorisniciTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KorisniciTableMouseClicked
        int selectedRow = KorisniciTable.getSelectedRow();
        if (selectedRow != -1) {
            TableModelKorisnik model = (TableModelKorisnik) KorisniciTable.getModel();
            Korisnik korisnik = model.getKorisnikAt(selectedRow);
            try {
                CommunicationController.getInstance().setSavedData(korisnik);
            } catch (IOException ex) {
                Logger.getLogger(UserFrame.class.getName()).log(Level.SEVERE, null, ex);
            }

            JPanel pannel = new UserDetailsPanel();
            JDialog dialog = new JDialog(this, "Detalji o korisniku", true);
            dialog.add(pannel);
            dialog.setLocationRelativeTo(this);
            dialog.pack();
            dialog.setVisible(true);

        }
    }//GEN-LAST:event_KorisniciTableMouseClicked

    private void validacijaPartitura() throws Exception {
        
        if (ImeTextField.getText().equals("")) {
            throw new Exception("Polje Ime je obavezno");
        }
        if (UssernameTextField.getText().equals("")) {
            throw new Exception("Polje Username je obavezno");
        }
        if (PasswordTextField.getText().equals("")) {
            throw new Exception("Polje Password je obavezno");
        }
        if (ImeTextField.getText().length()>30) {
            throw new Exception("Ime je predugacko");
        }
        if (PrezimeTextField.getText().length()>30) {
            throw new Exception("Prezime je predugacko");
        }
        if (UssernameTextField.getText().length()>30) {
            throw new Exception("Username je predugacak");
        }

    }

    private void prepareView() {
        setLocationRelativeTo(null);
        SearchUsers();
    }

    private void SearchUsers() {
        Korisnik k = new Korisnik();
        List<Korisnik> listaKorisnika = new ArrayList<>();

        try {
            listaKorisnika = CommunicationController.getInstance().searchKorisnik(k, SearchTextField.getText());
        } catch (Exception ex) {
            Logger.getLogger(UserFrame.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Greska", JOptionPane.WARNING_MESSAGE);
        }
        TableModelKorisnik model = new TableModelKorisnik(listaKorisnika);
        KorisniciTable.setModel(model);

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
            java.util.logging.Logger.getLogger(UserFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField EmailTextField;
    private javax.swing.JTextField ImeTextField;
    private javax.swing.JTable KorisniciTable;
    private javax.swing.JTextField PasswordTextField;
    private javax.swing.JTextField PrezimeTextField;
    private javax.swing.JButton SacuvajKorisnikaButton;
    private javax.swing.JButton SearchButton;
    private javax.swing.JTextField SearchTextField;
    private javax.swing.JTextField UssernameTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
