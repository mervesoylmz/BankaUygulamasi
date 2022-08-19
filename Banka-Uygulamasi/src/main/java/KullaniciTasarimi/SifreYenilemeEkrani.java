
package KullaniciTasarimi;

import KullaniciTasarimi.ayarlar.ActionAyarlari;
import KullaniciTasarimi.ayarlar.ButonAyarlari;
import KullaniciTasarimi.ayarlar.Duzenleyici;
import KullaniciTasarimi.ayarlar.TextAyarlari;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

public class SifreYenilemeEkrani extends javax.swing.JFrame implements Duzenleyici{

   
    public SifreYenilemeEkrani() {
        initComponents();
        getEdits();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SifreYenilemeEkraniPaneli = new javax.swing.JPanel();
        GeriIcon = new javax.swing.JLabel();
        SİfreYenilemeText = new javax.swing.JLabel();
        TcNoText = new javax.swing.JLabel();
        TCNoText = new javax.swing.JTextField();
        TelefonNoText = new javax.swing.JTextField();
        EskiSText = new javax.swing.JLabel();
        GSorusuText = new javax.swing.JTextField();
        GSoruText = new javax.swing.JLabel();
        TelNoText = new javax.swing.JLabel();
        YeniSText = new javax.swing.JLabel();
        YeniSsText = new javax.swing.JLabel();
        EskiSifreText = new javax.swing.JPasswordField();
        YaniSifreText = new javax.swing.JPasswordField();
        YeniSifreTextt = new javax.swing.JPasswordField();
        DevamButon = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Orenda Bank Şifre Yenileme Ekranı");

        SifreYenilemeEkraniPaneli.setBackground(new java.awt.Color(204, 204, 255));
        SifreYenilemeEkraniPaneli.setPreferredSize(new java.awt.Dimension(415, 426));

        GeriIcon.setIcon(new javax.swing.ImageIcon("C:\\Users\\merve\\OneDrive\\Belgeler\\NetBeansProjects\\Banka-Uygulamasi\\src\\main\\java\\KullaniciTasarimi\\İconlar\\GeriIcon.png")); // NOI18N
        GeriIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        GeriIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GeriIconMouseClicked(evt);
            }
        });

        SİfreYenilemeText.setFont(new java.awt.Font("Times New Roman", 1, 28)); // NOI18N
        SİfreYenilemeText.setForeground(new java.awt.Color(0, 102, 102));
        SİfreYenilemeText.setText("Şifre Yenileme");

        TcNoText.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        TcNoText.setForeground(new java.awt.Color(0, 102, 102));
        TcNoText.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        TcNoText.setText("T.C. No:");

        TCNoText.setBackground(new java.awt.Color(255, 255, 255));
        TCNoText.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        TCNoText.setForeground(new java.awt.Color(0, 102, 102));

        TelefonNoText.setBackground(new java.awt.Color(255, 255, 255));
        TelefonNoText.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        TelefonNoText.setForeground(new java.awt.Color(0, 102, 102));

        EskiSText.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        EskiSText.setForeground(new java.awt.Color(0, 102, 102));
        EskiSText.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        EskiSText.setText("Eski Şifre:");

        GSorusuText.setBackground(new java.awt.Color(255, 255, 255));
        GSorusuText.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        GSorusuText.setForeground(new java.awt.Color(0, 102, 102));

        GSoruText.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        GSoruText.setForeground(new java.awt.Color(0, 102, 102));
        GSoruText.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        GSoruText.setText("Güvenlik Sorusunun Cevabı:");

        TelNoText.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        TelNoText.setForeground(new java.awt.Color(0, 102, 102));
        TelNoText.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        TelNoText.setText("Telefon No:");

        YeniSText.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        YeniSText.setForeground(new java.awt.Color(0, 102, 102));
        YeniSText.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        YeniSText.setText("Yeni Şifre Tekrar:");

        YeniSsText.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        YeniSsText.setForeground(new java.awt.Color(0, 102, 102));
        YeniSsText.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        YeniSsText.setText("Yeni Şifre:");

        EskiSifreText.setBackground(new java.awt.Color(255, 255, 255));
        EskiSifreText.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        EskiSifreText.setForeground(new java.awt.Color(0, 102, 102));

        YaniSifreText.setBackground(new java.awt.Color(255, 255, 255));
        YaniSifreText.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        YaniSifreText.setForeground(new java.awt.Color(0, 102, 102));

        YeniSifreTextt.setBackground(new java.awt.Color(255, 255, 255));
        YeniSifreTextt.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        YeniSifreTextt.setForeground(new java.awt.Color(0, 102, 102));

        DevamButon.setBackground(new java.awt.Color(0, 51, 51));
        DevamButon.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        DevamButon.setForeground(new java.awt.Color(255, 255, 255));
        DevamButon.setText("Devam");
        DevamButon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        DevamButon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                DevamButonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                DevamButonMouseExited(evt);
            }
        });
        DevamButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DevamButonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SifreYenilemeEkraniPaneliLayout = new javax.swing.GroupLayout(SifreYenilemeEkraniPaneli);
        SifreYenilemeEkraniPaneli.setLayout(SifreYenilemeEkraniPaneliLayout);
        SifreYenilemeEkraniPaneliLayout.setHorizontalGroup(
            SifreYenilemeEkraniPaneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SifreYenilemeEkraniPaneliLayout.createSequentialGroup()
                .addGroup(SifreYenilemeEkraniPaneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SifreYenilemeEkraniPaneliLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(SifreYenilemeEkraniPaneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addGroup(SifreYenilemeEkraniPaneliLayout.createSequentialGroup()
                                .addComponent(TcNoText, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(TCNoText, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE))
                            .addGroup(SifreYenilemeEkraniPaneliLayout.createSequentialGroup()
                                .addComponent(TelNoText, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(TelefonNoText))
                            .addGroup(SifreYenilemeEkraniPaneliLayout.createSequentialGroup()
                                .addComponent(GSoruText)
                                .addGap(18, 18, 18)
                                .addComponent(GSorusuText))
                            .addGroup(SifreYenilemeEkraniPaneliLayout.createSequentialGroup()
                                .addComponent(EskiSText, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(EskiSifreText, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE))
                            .addGroup(SifreYenilemeEkraniPaneliLayout.createSequentialGroup()
                                .addComponent(YeniSText, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(YaniSifreText, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(SifreYenilemeEkraniPaneliLayout.createSequentialGroup()
                                .addComponent(YeniSsText, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(YeniSifreTextt, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(SifreYenilemeEkraniPaneliLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(GeriIcon)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(SifreYenilemeEkraniPaneliLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(SİfreYenilemeText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SifreYenilemeEkraniPaneliLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(DevamButon)
                .addGap(61, 61, 61))
        );

        SifreYenilemeEkraniPaneliLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {EskiSText, GSoruText, TcNoText, TelNoText, YeniSText, YeniSsText});

        SifreYenilemeEkraniPaneliLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {EskiSifreText, GSorusuText, YaniSifreText, YeniSifreTextt});

        SifreYenilemeEkraniPaneliLayout.setVerticalGroup(
            SifreYenilemeEkraniPaneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SifreYenilemeEkraniPaneliLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(GeriIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(SifreYenilemeEkraniPaneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(SifreYenilemeEkraniPaneliLayout.createSequentialGroup()
                        .addComponent(SİfreYenilemeText, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(SifreYenilemeEkraniPaneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TcNoText, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TCNoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(SifreYenilemeEkraniPaneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TelefonNoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TelNoText, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(SifreYenilemeEkraniPaneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(GSoruText, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(GSorusuText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(EskiSText, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(EskiSifreText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(SifreYenilemeEkraniPaneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(YeniSText, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(YaniSifreText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(SifreYenilemeEkraniPaneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(YeniSsText, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(YeniSifreTextt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(DevamButon)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        SifreYenilemeEkraniPaneliLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {EskiSText, GSoruText, TcNoText, TelNoText, YeniSText, YeniSsText});

        SifreYenilemeEkraniPaneliLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {EskiSifreText, GSorusuText, YaniSifreText, YeniSifreTextt});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SifreYenilemeEkraniPaneli, javax.swing.GroupLayout.DEFAULT_SIZE, 417, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SifreYenilemeEkraniPaneli, javax.swing.GroupLayout.DEFAULT_SIZE, 435, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public JPasswordField getEskiSifreText() {
        return EskiSifreText;
    }

    private boolean isEnableEskiSifreText(){
        return this.getEskiSifreText().isEnabled();
    }
    
    @Override
    public void getEdits() {
        this.setLocationRelativeTo(null);
        SifreYenilemeEkraniPaneli.setFocusable(true);
        TextAyarlari.setOnlyNumber(TCNoText);
        TextAyarlari.setMaxLimit(TCNoText, 11);
        TextAyarlari.setOnlyNumber(TelefonNoText);
        TextAyarlari.setMaxLimit(TelefonNoText, 11);
    }
    private void GeriIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GeriIconMouseClicked
        if(isEnableEskiSifreText()){
            ActionAyarlari.setVisible(this, new AyarlarEkrani());
        }
        else{
            ActionAyarlari.setVisible(this, new GirisEkrani());
        }
    }//GEN-LAST:event_GeriIconMouseClicked

    private void DevamButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DevamButonActionPerformed
        JOptionPane.showMessageDialog(this, "Şifreniz Değiştirildi.");
        ActionAyarlari.setVisible(this, new GirisEkrani());
        if(isEnableEskiSifreText()){
            ActionAyarlari.setVisible(this, new HesapEkrani());
        }
        else{
            ActionAyarlari.setVisible(this, new GirisEkrani());
        }
    }//GEN-LAST:event_DevamButonActionPerformed

    private void DevamButonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DevamButonMouseEntered
        ButonAyarlari.setBgFg(DevamButon, Color.DARK_GRAY, Color.WHITE);
    }//GEN-LAST:event_DevamButonMouseEntered

    private void DevamButonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DevamButonMouseExited
        ButonAyarlari.setorijinalBgFg(DevamButon);
    }//GEN-LAST:event_DevamButonMouseExited
  
    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SifreYenilemeEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SifreYenilemeEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SifreYenilemeEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SifreYenilemeEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SifreYenilemeEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DevamButon;
    private javax.swing.JLabel EskiSText;
    private javax.swing.JPasswordField EskiSifreText;
    private javax.swing.JLabel GSoruText;
    private javax.swing.JTextField GSorusuText;
    private javax.swing.JLabel GeriIcon;
    private javax.swing.JPanel SifreYenilemeEkraniPaneli;
    private javax.swing.JLabel SİfreYenilemeText;
    private javax.swing.JTextField TCNoText;
    private javax.swing.JLabel TcNoText;
    private javax.swing.JLabel TelNoText;
    private javax.swing.JTextField TelefonNoText;
    private javax.swing.JPasswordField YaniSifreText;
    private javax.swing.JLabel YeniSText;
    private javax.swing.JPasswordField YeniSifreTextt;
    private javax.swing.JLabel YeniSsText;
    // End of variables declaration//GEN-END:variables

    
}
