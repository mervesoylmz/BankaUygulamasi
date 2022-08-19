
package KullaniciTasarimi;

import KullaniciTasarimi.ayarlar.ActionAyarlari;
import KullaniciTasarimi.ayarlar.Duzenleyici;
import KullaniciTasarimi.ayarlar.TextAyarlari;
import javax.swing.JOptionPane;


public class ParaYatirmaEkrani extends javax.swing.JFrame implements Duzenleyici {

    private int YatirilanMiktar = 0;
    
    public ParaYatirmaEkrani() {
        initComponents();
        getEdits();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ParaYatirmaEkraniPaneli = new javax.swing.JPanel();
        AdSoyadText = new javax.swing.JLabel();
        MesajText = new javax.swing.JLabel();
        ToplamBakiyeText = new javax.swing.JLabel();
        BakiyeText = new javax.swing.JLabel();
        YatiralanTutarText = new javax.swing.JLabel();
        ParaYatirmaText = new javax.swing.JTextField();
        ParaYatirmaButon = new javax.swing.JButton();
        GeriIcon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Orenda Bank Para Yatırma Ekranı");

        ParaYatirmaEkraniPaneli.setBackground(new java.awt.Color(204, 204, 255));

        AdSoyadText.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        AdSoyadText.setForeground(new java.awt.Color(0, 102, 102));
        AdSoyadText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AdSoyadText.setText("Sayın [Kullanıcı Adı Soyadı]");

        MesajText.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        MesajText.setForeground(new java.awt.Color(0, 51, 51));
        MesajText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MesajText.setText("Tek seferde 5000 TL ve altını yatırabilirsiniz.");

        ToplamBakiyeText.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        ToplamBakiyeText.setForeground(new java.awt.Color(0, 51, 51));
        ToplamBakiyeText.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        ToplamBakiyeText.setText("Toplam Bakiyeniz :");

        BakiyeText.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        BakiyeText.setForeground(new java.awt.Color(0, 51, 51));
        BakiyeText.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BakiyeText.setText("[Bakiye]");

        YatiralanTutarText.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        YatiralanTutarText.setForeground(new java.awt.Color(0, 51, 51));
        YatiralanTutarText.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        YatiralanTutarText.setText("Yatırmak İstediğiniz Tutar:");

        ParaYatirmaText.setBackground(new java.awt.Color(255, 255, 255));
        ParaYatirmaText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ParaYatirmaTextKeyReleased(evt);
            }
        });

        ParaYatirmaButon.setBackground(new java.awt.Color(0, 51, 51));
        ParaYatirmaButon.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        ParaYatirmaButon.setForeground(new java.awt.Color(255, 255, 255));
        ParaYatirmaButon.setText("Para Yatır");
        ParaYatirmaButon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ParaYatirmaButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ParaYatirmaButonActionPerformed(evt);
            }
        });

        GeriIcon.setIcon(new javax.swing.ImageIcon("C:\\Users\\merve\\OneDrive\\Belgeler\\NetBeansProjects\\Banka-Uygulamasi\\src\\main\\java\\KullaniciTasarimi\\İconlar\\GeriIcon.png")); // NOI18N
        GeriIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        GeriIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GeriIconMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout ParaYatirmaEkraniPaneliLayout = new javax.swing.GroupLayout(ParaYatirmaEkraniPaneli);
        ParaYatirmaEkraniPaneli.setLayout(ParaYatirmaEkraniPaneliLayout);
        ParaYatirmaEkraniPaneliLayout.setHorizontalGroup(
            ParaYatirmaEkraniPaneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ParaYatirmaEkraniPaneliLayout.createSequentialGroup()
                .addGroup(ParaYatirmaEkraniPaneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ParaYatirmaEkraniPaneliLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(ParaYatirmaEkraniPaneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ParaYatirmaEkraniPaneliLayout.createSequentialGroup()
                                .addGroup(ParaYatirmaEkraniPaneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(YatiralanTutarText, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ToplamBakiyeText, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ParaYatirmaText, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(ParaYatirmaEkraniPaneliLayout.createSequentialGroup()
                                .addGap(187, 187, 187)
                                .addComponent(BakiyeText, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(ParaYatirmaEkraniPaneliLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(GeriIcon)))
                .addContainerGap(31, Short.MAX_VALUE))
            .addGroup(ParaYatirmaEkraniPaneliLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ParaYatirmaEkraniPaneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AdSoyadText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MesajText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ParaYatirmaEkraniPaneliLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ParaYatirmaButon)
                .addGap(74, 74, 74))
        );
        ParaYatirmaEkraniPaneliLayout.setVerticalGroup(
            ParaYatirmaEkraniPaneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ParaYatirmaEkraniPaneliLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(GeriIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(AdSoyadText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(MesajText)
                .addGap(60, 60, 60)
                .addGroup(ParaYatirmaEkraniPaneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BakiyeText)
                    .addComponent(ToplamBakiyeText))
                .addGap(18, 18, 18)
                .addGroup(ParaYatirmaEkraniPaneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(YatiralanTutarText)
                    .addComponent(ParaYatirmaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(ParaYatirmaButon)
                .addContainerGap(122, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(ParaYatirmaEkraniPaneli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ParaYatirmaEkraniPaneli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    @Override
    public void getEdits() {
        this.setLocationRelativeTo(null);
        ParaYatirmaEkraniPaneli.setFocusable(true);
        TextAyarlari.setOnlyNumber(ParaYatirmaText);
        TextAyarlari.setMaxLimit(ParaYatirmaText, 4);
    }
    
    
    private void ParaYatirmaTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ParaYatirmaTextKeyReleased
        this.YatirilanMiktar = TextAyarlari.checkTheTextKeyReleased(ParaYatirmaText, 5000);

    }//GEN-LAST:event_ParaYatirmaTextKeyReleased

    private void ParaYatirmaButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ParaYatirmaButonActionPerformed
        JOptionPane.showMessageDialog(this, "İşleminiz Gerçekleştiriliyor.\n" + "Yatırılan Tutar: " + YatirilanMiktar + "TL");
        ActionAyarlari.setVisible(this, new HesapEkrani());
    }//GEN-LAST:event_ParaYatirmaButonActionPerformed

    private void GeriIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GeriIconMouseClicked
        ActionAyarlari.setVisible(this, new HesapEkrani());
    }//GEN-LAST:event_GeriIconMouseClicked

    
    public static void main(String args[]) {
        
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ParaYatirmaEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ParaYatirmaEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ParaYatirmaEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ParaYatirmaEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ParaYatirmaEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AdSoyadText;
    private javax.swing.JLabel BakiyeText;
    private javax.swing.JLabel GeriIcon;
    private javax.swing.JLabel MesajText;
    private javax.swing.JButton ParaYatirmaButon;
    private javax.swing.JPanel ParaYatirmaEkraniPaneli;
    private javax.swing.JTextField ParaYatirmaText;
    private javax.swing.JLabel ToplamBakiyeText;
    private javax.swing.JLabel YatiralanTutarText;
    // End of variables declaration//GEN-END:variables

    
}
