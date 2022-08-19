
package KullaniciTasarimi;

import KullaniciTasarimi.ayarlar.ActionAyarlari;
import KullaniciTasarimi.ayarlar.ButonAyarlari;
import KullaniciTasarimi.ayarlar.Duzenleyici;
import KullaniciTasarimi.ayarlar.TextAyarlari;
import java.awt.Color;
import javax.swing.JOptionPane;

public class OdemelerEkrani extends javax.swing.JFrame implements Duzenleyici {

    
    public OdemelerEkrani() {
        initComponents();
        getEdits();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        OdemelerEkraniPaneli = new javax.swing.JPanel();
        AdSoyadText = new javax.swing.JLabel();
        DogalgazText = new javax.swing.JLabel();
        SOdemeButon = new javax.swing.JButton();
        GeriIcon = new javax.swing.JLabel();
        SuText = new javax.swing.JLabel();
        InternetText = new javax.swing.JLabel();
        ElektrikText = new javax.swing.JLabel();
        SuBorcText = new javax.swing.JLabel();
        DogalgazBorcText = new javax.swing.JLabel();
        InternetBorcText = new javax.swing.JLabel();
        ElektrikBorcText = new javax.swing.JLabel();
        IOdemeButon = new javax.swing.JButton();
        DOdemeButon = new javax.swing.JButton();
        EOdemeButon = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Orenda Bank Ödemeler Ekranı");

        OdemelerEkraniPaneli.setBackground(new java.awt.Color(204, 204, 255));
        OdemelerEkraniPaneli.setToolTipText("");

        AdSoyadText.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        AdSoyadText.setForeground(new java.awt.Color(0, 102, 102));
        AdSoyadText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AdSoyadText.setText("Sayın [Kullanıcı Adı Soyadı]");

        DogalgazText.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        DogalgazText.setForeground(new java.awt.Color(0, 102, 102));
        DogalgazText.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        DogalgazText.setText("Toplam Doğalgaz Faturası Borcu:");

        SOdemeButon.setBackground(new java.awt.Color(0, 51, 51));
        SOdemeButon.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        SOdemeButon.setForeground(new java.awt.Color(255, 255, 255));
        SOdemeButon.setText("Öde");
        SOdemeButon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SOdemeButon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SOdemeButonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SOdemeButonMouseExited(evt);
            }
        });
        SOdemeButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SOdemeButonActionPerformed(evt);
            }
        });

        GeriIcon.setIcon(new javax.swing.ImageIcon("C:\\Users\\merve\\OneDrive\\Belgeler\\NetBeansProjects\\Banka-Uygulamasi\\src\\main\\java\\KullaniciTasarimi\\İconlar\\GeriIcon.png")); // NOI18N
        GeriIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        GeriIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GeriIconMouseClicked(evt);
            }
        });

        SuText.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        SuText.setForeground(new java.awt.Color(0, 102, 102));
        SuText.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        SuText.setText("Toplam Su Faturası Borcu:");

        InternetText.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        InternetText.setForeground(new java.awt.Color(0, 102, 102));
        InternetText.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        InternetText.setText("Toplam İnternet Faturası Borcu:");

        ElektrikText.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        ElektrikText.setForeground(new java.awt.Color(0, 102, 102));
        ElektrikText.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        ElektrikText.setText("Toplam Elektrik Faturası Borcu:");

        SuBorcText.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        SuBorcText.setForeground(new java.awt.Color(0, 102, 102));
        SuBorcText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SuBorcText.setText("[Su Borç]");

        DogalgazBorcText.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        DogalgazBorcText.setForeground(new java.awt.Color(0, 102, 102));
        DogalgazBorcText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DogalgazBorcText.setText("[Doğalgaz Borç]");

        InternetBorcText.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        InternetBorcText.setForeground(new java.awt.Color(0, 102, 102));
        InternetBorcText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        InternetBorcText.setText("[İnternet Borç]");

        ElektrikBorcText.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        ElektrikBorcText.setForeground(new java.awt.Color(0, 102, 102));
        ElektrikBorcText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ElektrikBorcText.setText("[Elektrik Borç]");

        IOdemeButon.setBackground(new java.awt.Color(0, 51, 51));
        IOdemeButon.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        IOdemeButon.setForeground(new java.awt.Color(255, 255, 255));
        IOdemeButon.setText("Öde");
        IOdemeButon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        IOdemeButon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                IOdemeButonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                IOdemeButonMouseExited(evt);
            }
        });
        IOdemeButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IOdemeButonActionPerformed(evt);
            }
        });

        DOdemeButon.setBackground(new java.awt.Color(0, 51, 51));
        DOdemeButon.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        DOdemeButon.setForeground(new java.awt.Color(255, 255, 255));
        DOdemeButon.setText("Öde");
        DOdemeButon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        DOdemeButon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                DOdemeButonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                DOdemeButonMouseExited(evt);
            }
        });
        DOdemeButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DOdemeButonActionPerformed(evt);
            }
        });

        EOdemeButon.setBackground(new java.awt.Color(0, 51, 51));
        EOdemeButon.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        EOdemeButon.setForeground(new java.awt.Color(255, 255, 255));
        EOdemeButon.setText("Öde");
        EOdemeButon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        EOdemeButon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                EOdemeButonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EOdemeButonMouseExited(evt);
            }
        });
        EOdemeButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EOdemeButonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout OdemelerEkraniPaneliLayout = new javax.swing.GroupLayout(OdemelerEkraniPaneli);
        OdemelerEkraniPaneli.setLayout(OdemelerEkraniPaneliLayout);
        OdemelerEkraniPaneliLayout.setHorizontalGroup(
            OdemelerEkraniPaneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OdemelerEkraniPaneliLayout.createSequentialGroup()
                .addGroup(OdemelerEkraniPaneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(OdemelerEkraniPaneliLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(AdSoyadText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(OdemelerEkraniPaneliLayout.createSequentialGroup()
                        .addGroup(OdemelerEkraniPaneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(OdemelerEkraniPaneliLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(GeriIcon))
                            .addGroup(OdemelerEkraniPaneliLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(OdemelerEkraniPaneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addGroup(OdemelerEkraniPaneliLayout.createSequentialGroup()
                                        .addGroup(OdemelerEkraniPaneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(SuText, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(DogalgazText))
                                        .addGap(18, 18, 18)
                                        .addGroup(OdemelerEkraniPaneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(DogalgazBorcText, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(SuBorcText, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, OdemelerEkraniPaneliLayout.createSequentialGroup()
                                        .addGroup(OdemelerEkraniPaneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(ElektrikText)
                                            .addComponent(InternetText))
                                        .addGap(18, 18, 18)
                                        .addGroup(OdemelerEkraniPaneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(InternetBorcText, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(ElektrikBorcText, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(18, 18, 18)
                                .addGroup(OdemelerEkraniPaneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(SOdemeButon)
                                    .addComponent(EOdemeButon)
                                    .addComponent(IOdemeButon)
                                    .addComponent(DOdemeButon))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        OdemelerEkraniPaneliLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {DogalgazText, ElektrikText, InternetText, SuText});

        OdemelerEkraniPaneliLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {DogalgazBorcText, ElektrikBorcText, InternetBorcText, SuBorcText});

        OdemelerEkraniPaneliLayout.setVerticalGroup(
            OdemelerEkraniPaneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OdemelerEkraniPaneliLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(GeriIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(AdSoyadText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addGroup(OdemelerEkraniPaneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SuText)
                    .addComponent(SuBorcText)
                    .addComponent(SOdemeButon))
                .addGap(18, 18, 18)
                .addGroup(OdemelerEkraniPaneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DogalgazText)
                    .addComponent(DogalgazBorcText, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DOdemeButon))
                .addGap(18, 18, 18)
                .addGroup(OdemelerEkraniPaneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(InternetText)
                    .addComponent(InternetBorcText, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IOdemeButon))
                .addGap(18, 18, 18)
                .addGroup(OdemelerEkraniPaneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ElektrikText)
                    .addComponent(ElektrikBorcText, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EOdemeButon))
                .addGap(165, 165, 165))
        );

        OdemelerEkraniPaneliLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {DogalgazBorcText, DogalgazText, ElektrikBorcText, ElektrikText, InternetBorcText, InternetText, SuBorcText, SuText});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(OdemelerEkraniPaneli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(OdemelerEkraniPaneli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    @Override
    public void getEdits() {
        this.setLocationRelativeTo(null);
        OdemelerEkraniPaneli.setFocusable(true);
    }
    
    
    private void SOdemeButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SOdemeButonActionPerformed
        JOptionPane.showMessageDialog(this, "İşleminiz Gerçekleştirildi.");
        ActionAyarlari.setVisible(this, new HesapEkrani());
    }//GEN-LAST:event_SOdemeButonActionPerformed

    private void GeriIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GeriIconMouseClicked
        ActionAyarlari.setVisible(this, new HesapEkrani());
    }//GEN-LAST:event_GeriIconMouseClicked

    private void IOdemeButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IOdemeButonActionPerformed
        JOptionPane.showMessageDialog(this, "İşleminiz Gerçekleştirildi.");
        ActionAyarlari.setVisible(this, new HesapEkrani());
    }//GEN-LAST:event_IOdemeButonActionPerformed

    private void DOdemeButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DOdemeButonActionPerformed
        JOptionPane.showMessageDialog(this, "İşleminiz Gerçekleştirildi.");
        ActionAyarlari.setVisible(this, new HesapEkrani());
    }//GEN-LAST:event_DOdemeButonActionPerformed

    private void EOdemeButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EOdemeButonActionPerformed
        JOptionPane.showMessageDialog(this, "İşleminiz Gerçekleştirildi.");
        ActionAyarlari.setVisible(this, new HesapEkrani());
    }//GEN-LAST:event_EOdemeButonActionPerformed

    /*
    buton renklendirme
    */
    
    
    private void SOdemeButonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SOdemeButonMouseEntered
        ButonAyarlari.setBgFg(SOdemeButon, Color.DARK_GRAY, Color.WHITE);
    }//GEN-LAST:event_SOdemeButonMouseEntered

    private void SOdemeButonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SOdemeButonMouseExited
       ButonAyarlari.setorijinalBgFg(SOdemeButon);
    }//GEN-LAST:event_SOdemeButonMouseExited

    private void DOdemeButonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DOdemeButonMouseEntered
        ButonAyarlari.setBgFg(DOdemeButon, Color.DARK_GRAY, Color.WHITE);
    }//GEN-LAST:event_DOdemeButonMouseEntered

    private void DOdemeButonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DOdemeButonMouseExited
       ButonAyarlari.setorijinalBgFg(DOdemeButon);
    }//GEN-LAST:event_DOdemeButonMouseExited

    private void IOdemeButonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IOdemeButonMouseEntered
        ButonAyarlari.setBgFg(IOdemeButon, Color.DARK_GRAY, Color.WHITE);
    }//GEN-LAST:event_IOdemeButonMouseEntered

    private void IOdemeButonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IOdemeButonMouseExited
       ButonAyarlari.setorijinalBgFg(IOdemeButon);
    }//GEN-LAST:event_IOdemeButonMouseExited

    private void EOdemeButonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EOdemeButonMouseEntered
        ButonAyarlari.setBgFg(EOdemeButon, Color.DARK_GRAY, Color.WHITE);
    }//GEN-LAST:event_EOdemeButonMouseEntered

    private void EOdemeButonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EOdemeButonMouseExited
       ButonAyarlari.setorijinalBgFg(EOdemeButon);
    }//GEN-LAST:event_EOdemeButonMouseExited

    
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(OdemelerEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OdemelerEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OdemelerEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OdemelerEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OdemelerEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AdSoyadText;
    private javax.swing.JButton DOdemeButon;
    private javax.swing.JLabel DogalgazBorcText;
    private javax.swing.JLabel DogalgazText;
    private javax.swing.JButton EOdemeButon;
    private javax.swing.JLabel ElektrikBorcText;
    private javax.swing.JLabel ElektrikText;
    private javax.swing.JLabel GeriIcon;
    private javax.swing.JButton IOdemeButon;
    private javax.swing.JLabel InternetBorcText;
    private javax.swing.JLabel InternetText;
    private javax.swing.JPanel OdemelerEkraniPaneli;
    private javax.swing.JButton SOdemeButon;
    private javax.swing.JLabel SuBorcText;
    private javax.swing.JLabel SuText;
    // End of variables declaration//GEN-END:variables

    
}
