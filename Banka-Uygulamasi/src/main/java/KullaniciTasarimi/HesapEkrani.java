
package KullaniciTasarimi;

import KullaniciTasarimi.ayarlar.ActionAyarlari;
import KullaniciTasarimi.ayarlar.ButonAyarlari;
import KullaniciTasarimi.ayarlar.Duzenleyici;
import java.awt.Color;


public final class HesapEkrani extends javax.swing.JFrame implements Duzenleyici {

    
    public HesapEkrani() {
        initComponents();
        getEdits();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        HesapEkraniPanel = new javax.swing.JPanel();
        HosgeldinText = new javax.swing.JLabel();
        AdSoyadText = new javax.swing.JLabel();
        BakiyeText = new javax.swing.JLabel();
        BakiyeIcon = new javax.swing.JLabel();
        ParaCekmeIcon = new javax.swing.JLabel();
        ParaCekmeButon = new javax.swing.JButton();
        ParaYatirmaIcon = new javax.swing.JLabel();
        ParaYatirmaButon = new javax.swing.JButton();
        HavaleIcon = new javax.swing.JLabel();
        HavaleButon = new javax.swing.JButton();
        ÖdemeButon = new javax.swing.JButton();
        ÖdemelerIcon = new javax.swing.JLabel();
        AyarlarIcon = new javax.swing.JLabel();
        CikisIcon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Orenda Bank Hesap Ekranı");

        HesapEkraniPanel.setBackground(new java.awt.Color(204, 204, 255));
        HesapEkraniPanel.setForeground(new java.awt.Color(0, 102, 102));

        HosgeldinText.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        HosgeldinText.setForeground(new java.awt.Color(0, 102, 102));
        HosgeldinText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        HosgeldinText.setText("HOŞ GELDİNİZ");

        AdSoyadText.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        AdSoyadText.setForeground(new java.awt.Color(0, 102, 102));
        AdSoyadText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AdSoyadText.setText("[Kullancı Adı Soyadı]");

        BakiyeText.setFont(new java.awt.Font("Consolas", 1, 36)); // NOI18N
        BakiyeText.setForeground(new java.awt.Color(0, 102, 102));
        BakiyeText.setText("[Bakiye]");

        BakiyeIcon.setIcon(new javax.swing.ImageIcon("C:\\Users\\merve\\OneDrive\\Belgeler\\NetBeansProjects\\Banka-Uygulamasi\\src\\main\\java\\KullaniciTasarimi\\İconlar\\ParaIcon.png")); // NOI18N
        BakiyeIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        ParaCekmeIcon.setIcon(new javax.swing.ImageIcon("C:\\Users\\merve\\OneDrive\\Belgeler\\NetBeansProjects\\Banka-Uygulamasi\\src\\main\\java\\KullaniciTasarimi\\İconlar\\ParaCekmeIcon.png")); // NOI18N
        ParaCekmeIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        ParaCekmeButon.setBackground(new java.awt.Color(0, 51, 51));
        ParaCekmeButon.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        ParaCekmeButon.setForeground(new java.awt.Color(255, 255, 255));
        ParaCekmeButon.setText("Para Çek");
        ParaCekmeButon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ParaCekmeButon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ParaCekmeButonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ParaCekmeButonMouseExited(evt);
            }
        });
        ParaCekmeButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ParaCekmeButonActionPerformed(evt);
            }
        });

        ParaYatirmaIcon.setIcon(new javax.swing.ImageIcon("C:\\Users\\merve\\OneDrive\\Belgeler\\NetBeansProjects\\Banka-Uygulamasi\\src\\main\\java\\KullaniciTasarimi\\İconlar\\ParaYatirmaIcon.png")); // NOI18N
        ParaYatirmaIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        ParaYatirmaButon.setBackground(new java.awt.Color(0, 51, 51));
        ParaYatirmaButon.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        ParaYatirmaButon.setForeground(new java.awt.Color(255, 255, 255));
        ParaYatirmaButon.setText("Para Yatır");
        ParaYatirmaButon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ParaYatirmaButon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ParaYatirmaButonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ParaYatirmaButonMouseExited(evt);
            }
        });
        ParaYatirmaButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ParaYatirmaButonActionPerformed(evt);
            }
        });

        HavaleIcon.setIcon(new javax.swing.ImageIcon("C:\\Users\\merve\\OneDrive\\Belgeler\\NetBeansProjects\\Banka-Uygulamasi\\src\\main\\java\\KullaniciTasarimi\\İconlar\\HavaleIcon.png")); // NOI18N
        HavaleIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        HavaleButon.setBackground(new java.awt.Color(0, 51, 51));
        HavaleButon.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        HavaleButon.setForeground(new java.awt.Color(255, 255, 255));
        HavaleButon.setText("Havale");
        HavaleButon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        HavaleButon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                HavaleButonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                HavaleButonMouseExited(evt);
            }
        });
        HavaleButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HavaleButonActionPerformed(evt);
            }
        });

        ÖdemeButon.setBackground(new java.awt.Color(0, 51, 51));
        ÖdemeButon.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        ÖdemeButon.setForeground(new java.awt.Color(255, 255, 255));
        ÖdemeButon.setText("Ödeme");
        ÖdemeButon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ÖdemeButon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ÖdemeButonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ÖdemeButonMouseExited(evt);
            }
        });
        ÖdemeButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ÖdemeButonActionPerformed(evt);
            }
        });

        ÖdemelerIcon.setIcon(new javax.swing.ImageIcon("C:\\Users\\merve\\OneDrive\\Belgeler\\NetBeansProjects\\Banka-Uygulamasi\\src\\main\\java\\KullaniciTasarimi\\İconlar\\OdemelerIcon.png")); // NOI18N
        ÖdemelerIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        AyarlarIcon.setIcon(new javax.swing.ImageIcon("C:\\Users\\merve\\OneDrive\\Belgeler\\NetBeansProjects\\Banka-Uygulamasi\\src\\main\\java\\KullaniciTasarimi\\İconlar\\AyarlarIcon.png")); // NOI18N
        AyarlarIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AyarlarIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AyarlarIconMouseClicked(evt);
            }
        });

        CikisIcon.setIcon(new javax.swing.ImageIcon("C:\\Users\\merve\\OneDrive\\Belgeler\\NetBeansProjects\\Banka-Uygulamasi\\src\\main\\java\\KullaniciTasarimi\\İconlar\\CikisIcon.png")); // NOI18N
        CikisIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CikisIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CikisIconMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout HesapEkraniPanelLayout = new javax.swing.GroupLayout(HesapEkraniPanel);
        HesapEkraniPanel.setLayout(HesapEkraniPanelLayout);
        HesapEkraniPanelLayout.setHorizontalGroup(
            HesapEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HesapEkraniPanelLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(ParaCekmeButon, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ParaYatirmaButon, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(HavaleButon, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ÖdemeButon, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(HesapEkraniPanelLayout.createSequentialGroup()
                .addGroup(HesapEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HesapEkraniPanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(AyarlarIcon)
                        .addGap(53, 53, 53)
                        .addComponent(HosgeldinText, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addComponent(CikisIcon))
                    .addGroup(HesapEkraniPanelLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(AdSoyadText, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(HesapEkraniPanelLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(BakiyeIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(BakiyeText, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(HesapEkraniPanelLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(ParaCekmeIcon)
                        .addGap(18, 18, 18)
                        .addComponent(ParaYatirmaIcon)
                        .addGap(18, 18, 18)
                        .addComponent(HavaleIcon)
                        .addGap(18, 18, 18)
                        .addComponent(ÖdemelerIcon)))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        HesapEkraniPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {HavaleButon, ParaCekmeButon, ParaYatirmaButon, ÖdemeButon});

        HesapEkraniPanelLayout.setVerticalGroup(
            HesapEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HesapEkraniPanelLayout.createSequentialGroup()
                .addGroup(HesapEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HesapEkraniPanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(AyarlarIcon))
                    .addGroup(HesapEkraniPanelLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(HosgeldinText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(CikisIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(AdSoyadText, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addGroup(HesapEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BakiyeIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(HesapEkraniPanelLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(BakiyeText, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(58, 58, 58)
                .addGroup(HesapEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ParaCekmeIcon)
                    .addComponent(ParaYatirmaIcon)
                    .addComponent(HavaleIcon)
                    .addComponent(ÖdemelerIcon))
                .addGap(12, 12, 12)
                .addGroup(HesapEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ParaCekmeButon, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(HesapEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(HavaleButon, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ÖdemeButon, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ParaYatirmaButon, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        HesapEkraniPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {HavaleButon, ParaCekmeButon, ParaYatirmaButon, ÖdemeButon});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(HesapEkraniPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(HesapEkraniPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    @Override
    public void getEdits() {
        this.setLocationRelativeTo(null);
        HesapEkraniPanel.setFocusable(true);                     
    }
    
    /*
    Buton Renklendirmelerive icon değişimleri
    */
    private void ParaCekmeButonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ParaCekmeButonMouseEntered
        ButonAyarlari.setBgFg(ParaCekmeButon, Color.DARK_GRAY, Color.WHITE);
        ParaCekmeIcon.setIcon(new javax.swing.ImageIcon("C:\\Users\\merve\\OneDrive\\Belgeler\\NetBeansProjects\\Banka-Uygulamasi\\src\\main\\java\\KullaniciTasarimi\\İconlar\\ParaCekmeIcon2.png")); 
       
    }//GEN-LAST:event_ParaCekmeButonMouseEntered

    private void ParaCekmeButonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ParaCekmeButonMouseExited
        ButonAyarlari.setorijinalBgFg(ParaCekmeButon);
        ParaCekmeIcon.setIcon(new javax.swing.ImageIcon("C:\\Users\\merve\\OneDrive\\Belgeler\\NetBeansProjects\\Banka-Uygulamasi\\src\\main\\java\\KullaniciTasarimi\\İconlar\\ParaCekmeIcon.png")); 
       
    }//GEN-LAST:event_ParaCekmeButonMouseExited

    private void ParaYatirmaButonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ParaYatirmaButonMouseEntered
        ButonAyarlari.setBgFg(ParaYatirmaButon, Color.DARK_GRAY, Color.WHITE);
        ParaYatirmaIcon.setIcon(new javax.swing.ImageIcon("C:\\Users\\merve\\OneDrive\\Belgeler\\NetBeansProjects\\Banka-Uygulamasi\\src\\main\\java\\KullaniciTasarimi\\İconlar\\ParaYatirmaIcon2.png")); 
       
    }//GEN-LAST:event_ParaYatirmaButonMouseEntered

    private void ParaYatirmaButonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ParaYatirmaButonMouseExited
        ButonAyarlari.setorijinalBgFg(ParaYatirmaButon);
        ParaYatirmaIcon.setIcon(new javax.swing.ImageIcon("C:\\Users\\merve\\OneDrive\\Belgeler\\NetBeansProjects\\Banka-Uygulamasi\\src\\main\\java\\KullaniciTasarimi\\İconlar\\ParaYatirmaIcon.png")); 
       
    }//GEN-LAST:event_ParaYatirmaButonMouseExited

    private void HavaleButonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HavaleButonMouseEntered
        ButonAyarlari.setBgFg(HavaleButon, Color.DARK_GRAY, Color.WHITE);
        HavaleIcon.setIcon(new javax.swing.ImageIcon("C:\\Users\\merve\\OneDrive\\Belgeler\\NetBeansProjects\\Banka-Uygulamasi\\src\\main\\java\\KullaniciTasarimi\\İconlar\\HavaleIcon2.png")); 
       
    }//GEN-LAST:event_HavaleButonMouseEntered

    private void HavaleButonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HavaleButonMouseExited
        ButonAyarlari.setorijinalBgFg(HavaleButon);
        HavaleIcon.setIcon(new javax.swing.ImageIcon("C:\\Users\\merve\\OneDrive\\Belgeler\\NetBeansProjects\\Banka-Uygulamasi\\src\\main\\java\\KullaniciTasarimi\\İconlar\\HavaleIcon.png")); 
       
    }//GEN-LAST:event_HavaleButonMouseExited

    private void ÖdemeButonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ÖdemeButonMouseEntered
        ButonAyarlari.setBgFg(ÖdemeButon, Color.DARK_GRAY, Color.WHITE); 
        ÖdemelerIcon.setIcon(new javax.swing.ImageIcon("C:\\Users\\merve\\OneDrive\\Belgeler\\NetBeansProjects\\Banka-Uygulamasi\\src\\main\\java\\KullaniciTasarimi\\İconlar\\OdemelerIcon2.png")); 
       
    }//GEN-LAST:event_ÖdemeButonMouseEntered

    private void ÖdemeButonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ÖdemeButonMouseExited
        ButonAyarlari.setorijinalBgFg(ÖdemeButon);
        ÖdemelerIcon.setIcon(new javax.swing.ImageIcon("C:\\Users\\merve\\OneDrive\\Belgeler\\NetBeansProjects\\Banka-Uygulamasi\\src\\main\\java\\KullaniciTasarimi\\İconlar\\OdemelerIcon.png")); 
       
    }//GEN-LAST:event_ÖdemeButonMouseExited

    
    /*
    Butonları Sayfaya Yönlendirme 
    */
    
    private void ParaCekmeButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ParaCekmeButonActionPerformed
        ActionAyarlari.setVisible(this, new ParaCekmeEkrani());
    }//GEN-LAST:event_ParaCekmeButonActionPerformed

    private void ParaYatirmaButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ParaYatirmaButonActionPerformed
        ActionAyarlari.setVisible(this, new ParaYatirmaEkrani());      
    }//GEN-LAST:event_ParaYatirmaButonActionPerformed

    private void HavaleButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HavaleButonActionPerformed
        ActionAyarlari.setVisible(this, new HavaleEkrani());
    }//GEN-LAST:event_HavaleButonActionPerformed

    private void ÖdemeButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ÖdemeButonActionPerformed
        ActionAyarlari.setVisible(this, new OdemelerEkrani());    
    }//GEN-LAST:event_ÖdemeButonActionPerformed

    private void AyarlarIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AyarlarIconMouseClicked
        ActionAyarlari.setVisible(this, new AyarlarEkrani());
    }//GEN-LAST:event_AyarlarIconMouseClicked

    private void CikisIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CikisIconMouseClicked
        ActionAyarlari.setVisible(this, new GirisEkrani());
    }//GEN-LAST:event_CikisIconMouseClicked

    
       
       
   
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HesapEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HesapEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HesapEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HesapEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HesapEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AdSoyadText;
    private javax.swing.JLabel AyarlarIcon;
    private javax.swing.JLabel BakiyeIcon;
    private javax.swing.JLabel BakiyeText;
    private javax.swing.JLabel CikisIcon;
    private javax.swing.JButton HavaleButon;
    private javax.swing.JLabel HavaleIcon;
    private javax.swing.JPanel HesapEkraniPanel;
    private javax.swing.JLabel HosgeldinText;
    private javax.swing.JButton ParaCekmeButon;
    private javax.swing.JLabel ParaCekmeIcon;
    private javax.swing.JButton ParaYatirmaButon;
    private javax.swing.JLabel ParaYatirmaIcon;
    private javax.swing.JButton ÖdemeButon;
    private javax.swing.JLabel ÖdemelerIcon;
    // End of variables declaration//GEN-END:variables
}
