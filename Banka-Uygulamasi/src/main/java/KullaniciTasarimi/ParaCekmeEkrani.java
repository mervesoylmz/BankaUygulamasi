
package KullaniciTasarimi;

import KullaniciTasarimi.ayarlar.ActionAyarlari;
import KullaniciTasarimi.ayarlar.Duzenleyici;
import KullaniciTasarimi.ayarlar.TextAyarlari;
import javax.swing.JOptionPane;

public class ParaCekmeEkrani extends javax.swing.JFrame implements Duzenleyici {

    private int CekilenMiktar = 0;
   
    public ParaCekmeEkrani() {
        initComponents();
        getEdits();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ParaCekmeEkraniPaneli = new javax.swing.JPanel();
        AdSoyadText = new javax.swing.JLabel();
        MesajText = new javax.swing.JLabel();
        ToplamBakiyeText = new javax.swing.JLabel();
        BakiyeText = new javax.swing.JLabel();
        CekilenTutarText = new javax.swing.JLabel();
        ParaCekmeText = new javax.swing.JTextField();
        ParaCekmeButon = new javax.swing.JButton();
        GeriIcon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Orenda Bank Para Çekme Ekranı");

        ParaCekmeEkraniPaneli.setBackground(new java.awt.Color(204, 204, 255));

        AdSoyadText.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        AdSoyadText.setForeground(new java.awt.Color(0, 102, 102));
        AdSoyadText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AdSoyadText.setText("Sayın [Kullanıcı Adı Soyadı]");

        MesajText.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        MesajText.setForeground(new java.awt.Color(0, 51, 51));
        MesajText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MesajText.setText("Tek seferde 5000 TL ve altını çekebilirsiniz.");

        ToplamBakiyeText.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        ToplamBakiyeText.setForeground(new java.awt.Color(0, 51, 51));
        ToplamBakiyeText.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        ToplamBakiyeText.setText("Toplam Bakiyeniz :");

        BakiyeText.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        BakiyeText.setForeground(new java.awt.Color(0, 51, 51));
        BakiyeText.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BakiyeText.setText("[Bakiye]");

        CekilenTutarText.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        CekilenTutarText.setForeground(new java.awt.Color(0, 51, 51));
        CekilenTutarText.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        CekilenTutarText.setText("Çekmek İstediğiniz Tutar:");

        ParaCekmeText.setBackground(new java.awt.Color(255, 255, 255));
        ParaCekmeText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ParaCekmeTextActionPerformed(evt);
            }
        });
        ParaCekmeText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ParaCekmeTextKeyReleased(evt);
            }
        });

        ParaCekmeButon.setBackground(new java.awt.Color(0, 51, 51));
        ParaCekmeButon.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        ParaCekmeButon.setForeground(new java.awt.Color(255, 255, 255));
        ParaCekmeButon.setText("Para Çek");
        ParaCekmeButon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ParaCekmeButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ParaCekmeButonActionPerformed(evt);
            }
        });

        GeriIcon.setIcon(new javax.swing.ImageIcon("C:\\Users\\merve\\OneDrive\\Belgeler\\NetBeansProjects\\Banka-Uygulamasi\\src\\main\\java\\KullaniciTasarimi\\İconlar\\GeriIcon.png")); // NOI18N
        GeriIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        GeriIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GeriIconMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout ParaCekmeEkraniPaneliLayout = new javax.swing.GroupLayout(ParaCekmeEkraniPaneli);
        ParaCekmeEkraniPaneli.setLayout(ParaCekmeEkraniPaneliLayout);
        ParaCekmeEkraniPaneliLayout.setHorizontalGroup(
            ParaCekmeEkraniPaneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ParaCekmeEkraniPaneliLayout.createSequentialGroup()
                .addGroup(ParaCekmeEkraniPaneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ParaCekmeEkraniPaneliLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(ParaCekmeEkraniPaneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ParaCekmeEkraniPaneliLayout.createSequentialGroup()
                                .addGroup(ParaCekmeEkraniPaneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(CekilenTutarText, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ToplamBakiyeText, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ParaCekmeText, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(ParaCekmeEkraniPaneliLayout.createSequentialGroup()
                                .addGap(187, 187, 187)
                                .addComponent(BakiyeText, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(ParaCekmeEkraniPaneliLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(GeriIcon)))
                .addContainerGap(31, Short.MAX_VALUE))
            .addGroup(ParaCekmeEkraniPaneliLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ParaCekmeEkraniPaneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AdSoyadText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MesajText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ParaCekmeEkraniPaneliLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ParaCekmeButon)
                .addGap(74, 74, 74))
        );

        ParaCekmeEkraniPaneliLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {BakiyeText, CekilenTutarText, ToplamBakiyeText});

        ParaCekmeEkraniPaneliLayout.setVerticalGroup(
            ParaCekmeEkraniPaneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ParaCekmeEkraniPaneliLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(GeriIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(AdSoyadText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(MesajText)
                .addGap(60, 60, 60)
                .addGroup(ParaCekmeEkraniPaneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BakiyeText)
                    .addComponent(ToplamBakiyeText))
                .addGap(18, 18, 18)
                .addGroup(ParaCekmeEkraniPaneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CekilenTutarText)
                    .addComponent(ParaCekmeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(ParaCekmeButon)
                .addContainerGap(122, Short.MAX_VALUE))
        );

        ParaCekmeEkraniPaneliLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {AdSoyadText, MesajText});

        ParaCekmeEkraniPaneliLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {BakiyeText, CekilenTutarText, ParaCekmeText, ToplamBakiyeText});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(ParaCekmeEkraniPaneli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ParaCekmeEkraniPaneli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /*
    Kullanıcının bastığı tuşu bıraktığı andaki gerçekleşecek işlemleri belirler.
    */
    private void ParaCekmeTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ParaCekmeTextKeyReleased
        this.CekilenMiktar = TextAyarlari.checkTheTextKeyReleased(ParaCekmeText, 5000);
        
    }//GEN-LAST:event_ParaCekmeTextKeyReleased

    private void GeriIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GeriIconMouseClicked
       ActionAyarlari.setVisible(this, new HesapEkrani());
    }//GEN-LAST:event_GeriIconMouseClicked

    private void ParaCekmeButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ParaCekmeButonActionPerformed
       JOptionPane.showMessageDialog(this, "İşleminiz Gerçekleştiriliyor.\n" + "Çekilen Tutar: " + CekilenMiktar  + "TL");
       ActionAyarlari.setVisible(this, new HesapEkrani());
    }//GEN-LAST:event_ParaCekmeButonActionPerformed

    private void ParaCekmeTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ParaCekmeTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ParaCekmeTextActionPerformed

    @Override
    public void getEdits() {
        this.setLocationRelativeTo(null);
        ParaCekmeEkraniPaneli.setFocusable(true);
        TextAyarlari.setOnlyNumber(ParaCekmeText);
        TextAyarlari.setMaxLimit(ParaCekmeText, 4);
    }
    public static void main(String args[]) {
        
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
            java.util.logging.Logger.getLogger(ParaCekmeEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ParaCekmeEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ParaCekmeEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ParaCekmeEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ParaCekmeEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AdSoyadText;
    private javax.swing.JLabel BakiyeText;
    private javax.swing.JLabel CekilenTutarText;
    private javax.swing.JLabel GeriIcon;
    private javax.swing.JLabel MesajText;
    private javax.swing.JButton ParaCekmeButon;
    private javax.swing.JPanel ParaCekmeEkraniPaneli;
    private javax.swing.JTextField ParaCekmeText;
    private javax.swing.JLabel ToplamBakiyeText;
    // End of variables declaration//GEN-END:variables

    
}
