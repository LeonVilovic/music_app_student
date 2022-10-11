/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.view;

import Domain.Izvodjac;
import Domain.Kompozicija;
import Domain.Korisnik;
import Domain.Kupovina;
import Domain.Partitura;
import Domain.ZvucniZapis;
import communication.CommunicationController;
import Domain.OpstiDomenskiObjekat;
import threads.AudioPlayerThread;
import java.io.IOException;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 *
 * @author Leon
 */
public class KompozicijaDetailsPanel extends javax.swing.JPanel {

    Kompozicija k;
    Partitura p;
    ZvucniZapis z;
    Izvodjac i;
    Korisnik kor;
    AudioPlayerThread audioPlayerThread;
    
    /**
     * Creates new form KompozicijaDetailsPanel
     */
    public KompozicijaDetailsPanel() {
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

        kompozicijaNazivJTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        partituraPutDoFajlaJTextField = new javax.swing.JTextField();
        partituraCenaJTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        zvucniZapisPutDoFajlaJTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        deleteKompozicijaJButton = new javax.swing.JButton();
        updateKompozicijaJButton = new javax.swing.JButton();
        playJButton = new javax.swing.JButton();
        stopJButton = new javax.swing.JButton();
        kupiKompozicijuJButton = new javax.swing.JButton();
        cenaZvucniZapisJTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();

        jLabel1.setText("Naziv Kompozicije");

        partituraPutDoFajlaJTextField.setEditable(false);

        partituraCenaJTextField.setEditable(false);

        jLabel2.setText("Partitura");

        jLabel3.setText("Cena");

        zvucniZapisPutDoFajlaJTextField.setEditable(false);

        jLabel4.setText("Zvucni Zapis");

        deleteKompozicijaJButton.setText("Delete Kompozicija");
        deleteKompozicijaJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteKompozicijaJButtonActionPerformed(evt);
            }
        });

        updateKompozicijaJButton.setText("Update Kompozicija");
        updateKompozicijaJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateKompozicijaJButtonActionPerformed(evt);
            }
        });

        playJButton.setText("Play");
        playJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playJButtonActionPerformed(evt);
            }
        });

        stopJButton.setText("Stop");
        stopJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stopJButtonActionPerformed(evt);
            }
        });

        kupiKompozicijuJButton.setText("Kupi Kompoziciju");
        kupiKompozicijuJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kupiKompozicijuJButtonActionPerformed(evt);
            }
        });

        cenaZvucniZapisJTextField.setEditable(false);

        jLabel5.setText("Cena");

        jLabel6.setText("Kompozitor");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(updateKompozicijaJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(deleteKompozicijaJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(playJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(stopJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(kupiKompozicijuJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(207, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(kompozicijaNazivJTextField)
                                .addComponent(jComboBox1, 0, 231, Short.MAX_VALUE))
                            .addComponent(jLabel6))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(236, 236, 236))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(partituraPutDoFajlaJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(partituraCenaJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(76, 76, 76)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addComponent(jLabel4))
                            .addComponent(zvucniZapisPutDoFajlaJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jLabel5))
                            .addComponent(cenaZvucniZapisJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kompozicijaNazivJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(partituraPutDoFajlaJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(zvucniZapisPutDoFajlaJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(partituraCenaJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cenaZvucniZapisJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteKompozicijaJButton)
                    .addComponent(updateKompozicijaJButton)
                    .addComponent(playJButton)
                    .addComponent(stopJButton)
                    .addComponent(kupiKompozicijuJButton))
                .addGap(24, 24, 24))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void deleteKompozicijaJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteKompozicijaJButtonActionPerformed
        try {
            CommunicationController.getInstance().deleteKompozicija(k);
            JOptionPane.showMessageDialog(this, "Kompozicija obrisana", "Poruka", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception ex) {
            Logger.getLogger(KompozicijaDetailsPanel.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Greska pri brisanju kompozicije", "Greska", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_deleteKompozicijaJButtonActionPerformed

    private void updateKompozicijaJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateKompozicijaJButtonActionPerformed
        try {
            Kompozicija k2 = k;
            k2.setNaziv(kompozicijaNazivJTextField.getText());
            k2.setKorisnikID((Korisnik)jComboBox1.getSelectedItem());
            CommunicationController.getInstance().updateKompozicija(k2);
            JOptionPane.showMessageDialog(this, "Kompozicija izmenjena", "Poruka", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception ex) {
            Logger.getLogger(KompozicijaDetailsPanel.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Greska", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_updateKompozicijaJButtonActionPerformed

    private void playJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playJButtonActionPerformed
        try {
            audioPlayerThread = new AudioPlayerThread(CommunicationController.getInstance().getAudioFile(z));
            
        } catch (IOException ex) {
            Logger.getLogger(KompozicijaDetailsPanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(KompozicijaDetailsPanel.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Greska pri pustanju audio fajla", "Greska", JOptionPane.ERROR_MESSAGE);
        
        } 
        audioPlayerThread.start();      
    }//GEN-LAST:event_playJButtonActionPerformed

    private void stopJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stopJButtonActionPerformed
        audioPlayerThread.stopPlay();
        
    }//GEN-LAST:event_stopJButtonActionPerformed

    private void kupiKompozicijuJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kupiKompozicijuJButtonActionPerformed
       try {
            GregorianCalendar d = new GregorianCalendar();
            Double cena = z.getCena();
            if (cena==null) {
               cena = 0.0;
           }
            Kupovina kupovina = new Kupovina(CommunicationController.getInstance().getLoggedUser(), k, d, cena,z.getValuta(), 0.0);
            CommunicationController.getInstance().kupiKompoziciju(kupovina);
            JOptionPane.showMessageDialog(this, "Uspesno kupljena kompozicija", "Obavestenje", JOptionPane.PLAIN_MESSAGE);
        } catch (Exception ex) {
            Logger.getLogger(KompozicijaDetailsPanel.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Greska pri kupovini kompozicije", JOptionPane.WARNING_MESSAGE);
        }
        
        
    }//GEN-LAST:event_kupiKompozicijuJButtonActionPerformed

    private void prepareView() {
        try {
            List<OpstiDomenskiObjekat> lista = (List<OpstiDomenskiObjekat>) CommunicationController.getInstance().getSavedData();
            k = (Kompozicija) lista.get(0);
            p = (Partitura) lista.get(1);
            z = (ZvucniZapis) lista.get(2);
            i = (Izvodjac) lista.get(3);
            kor = (Korisnik) lista.get(4);
            if (k.getNaziv() != null) {
                kompozicijaNazivJTextField.setText(k.getNaziv());
            }
            if (p.getPutDoFajla() != null && p.getCena() != null) {
                partituraPutDoFajlaJTextField.setText(p.getPutDoFajla());
                partituraCenaJTextField.setText(p.getCena().toString());
            }
            if (z.getPutDoFajla() != null && z.getCena() !=null) {
                zvucniZapisPutDoFajlaJTextField.setText(z.getPutDoFajla());
                cenaZvucniZapisJTextField.setText(z.getCena().toString());
            }
            jComboBox1.removeAllItems();
            List<Korisnik> ListaSvihKorisnika = CommunicationController.getInstance().searchKorisnik(kor, "");
            int indexKompozitora=0;
            for (int j = 0; j < ListaSvihKorisnika.size(); j++) {
                jComboBox1.addItem(ListaSvihKorisnika.get(j));
                if (kor.getKorisnikID().equals(ListaSvihKorisnika.get(j).getKorisnikID())) {
                    indexKompozitora=j;
                }
            }
                jComboBox1.setSelectedIndex(indexKompozitora);
          
        } catch (Exception ex) {
            Logger.getLogger(UserDetailsPanel.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cenaZvucniZapisJTextField;
    private javax.swing.JButton deleteKompozicijaJButton;
    private javax.swing.JComboBox<Korisnik> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField kompozicijaNazivJTextField;
    private javax.swing.JButton kupiKompozicijuJButton;
    private javax.swing.JTextField partituraCenaJTextField;
    private javax.swing.JTextField partituraPutDoFajlaJTextField;
    private javax.swing.JButton playJButton;
    private javax.swing.JButton stopJButton;
    private javax.swing.JButton updateKompozicijaJButton;
    private javax.swing.JTextField zvucniZapisPutDoFajlaJTextField;
    // End of variables declaration//GEN-END:variables
}
