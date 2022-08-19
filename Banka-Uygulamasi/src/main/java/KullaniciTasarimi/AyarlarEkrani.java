
package KullaniciTasarimi;

import KullaniciTasarimi.ayarlar.ActionAyarlari;
import KullaniciTasarimi.ayarlar.Duzenleyici;
import KullaniciTasarimi.ayarlar.TextAyarlari;
import javax.swing.JOptionPane;

public class AyarlarEkrani extends javax.swing.JFrame implements Duzenleyici{

    
    public AyarlarEkrani() {
        initComponents();
        getEdits();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AyarlarEkraniPaneli = new javax.swing.JPanel();
        AdSoyadText = new javax.swing.JLabel();
        GeriIcon = new javax.swing.JLabel();
        TelefonText = new javax.swing.JLabel();
        TelefonNoText = new javax.swing.JTextField();
        TelefonIcon = new javax.swing.JLabel();
        ŞifreText = new javax.swing.JLabel();
        SifreText = new javax.swing.JTextField();
        SifreIcon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Orenda Bank Ayarlar Ekranı");

        AyarlarEkraniPaneli.setBackground(new java.awt.Color(204, 204, 255));
        AyarlarEkraniPaneli.setPreferredSize(new java.awt.Dimension(415, 426));

        AdSoyadText.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        AdSoyadText.setForeground(new java.awt.Color(0, 102, 102));
        AdSoyadText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AdSoyadText.setText("Sayın [Kullanıcı Adı Soyadı]");

        GeriIcon.setIcon(new javax.swing.ImageIcon("C:\\Users\\merve\\OneDrive\\Belgeler\\NetBeansProjects\\Banka-Uygulamasi\\src\\main\\java\\KullaniciTasarimi\\İconlar\\GeriIcon.png")); // NOI18N
        GeriIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        GeriIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GeriIconMouseClicked(evt);
            }
        });

        TelefonText.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        TelefonText.setForeground(new java.awt.Color(0, 102, 102));
        TelefonText.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        TelefonText.setText("Telefon Numaranız :");

        TelefonNoText.setBackground(new java.awt.Color(255, 255, 255));
        TelefonNoText.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        TelefonNoText.setForeground(new java.awt.Color(0, 102, 102));
        TelefonNoText.setEnabled(false);

        TelefonIcon.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        TelefonIcon.setForeground(new java.awt.Color(0, 102, 102));
        TelefonIcon.setIcon(new javax.swing.ImageIcon("C:\\Users\\merve\\OneDrive\\Belgeler\\NetBeansProjects\\Banka-Uygulamasi\\src\\main\\java\\KullaniciTasarimi\\İconlar\\UpdateIcon.png")); // NOI18N
        TelefonIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TelefonIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TelefonIconMouseClicked(evt);
            }
        });

        ŞifreText.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        ŞifreText.setForeground(new java.awt.Color(0, 102, 102));
        ŞifreText.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        ŞifreText.setText("Şifreniz :");

        SifreText.setBackground(new java.awt.Color(255, 255, 255));
        SifreText.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        SifreText.setForeground(new java.awt.Color(0, 102, 102));
        SifreText.setText("**************");
        SifreText.setEnabled(false);

        SifreIcon.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        SifreIcon.setForeground(new java.awt.Color(0, 102, 102));
        SifreIcon.setIcon(new javax.swing.ImageIcon("C:\\Users\\merve\\OneDrive\\Belgeler\\NetBeansProjects\\Banka-Uygulamasi\\src\\main\\java\\KullaniciTasarimi\\İconlar\\UpdateIcon.png")); // NOI18N
        SifreIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SifreIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SifreIconMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout AyarlarEkraniPaneliLayout = new javax.swing.GroupLayout(AyarlarEkraniPaneli);
        AyarlarEkraniPaneli.setLayout(AyarlarEkraniPaneliLayout);
        AyarlarEkraniPaneliLayout.setHorizontalGroup(
            AyarlarEkraniPaneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AyarlarEkraniPaneliLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AyarlarEkraniPaneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AyarlarEkraniPaneliLayout.createSequentialGroup()
                        .addComponent(AdSoyadText, javax.swing.GroupLayout.DEFAULT_SIZE, 387, Short.MAX_VALUE)
                        .addGap(7, 7, 7))
                    .addGroup(AyarlarEkraniPaneliLayout.createSequentialGroup()
                        .addComponent(GeriIcon)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(AyarlarEkraniPaneliLayout.createSequentialGroup()
                        .addGroup(AyarlarEkraniPaneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addGroup(AyarlarEkraniPaneliLayout.createSequentialGroup()
                                .addComponent(TelefonText, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TelefonNoText, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(AyarlarEkraniPaneliLayout.createSequentialGroup()
                                .addComponent(ŞifreText, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SifreText, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(AyarlarEkraniPaneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SifreIcon)
                            .addComponent(TelefonIcon))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        AyarlarEkraniPaneliLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {SifreText, TelefonNoText, TelefonText, ŞifreText});

        AyarlarEkraniPaneliLayout.setVerticalGroup(
            AyarlarEkraniPaneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AyarlarEkraniPaneliLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(GeriIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(AdSoyadText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addGroup(AyarlarEkraniPaneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(TelefonNoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TelefonIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TelefonText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(AyarlarEkraniPaneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(ŞifreText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SifreText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SifreIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(185, Short.MAX_VALUE))
        );

        AyarlarEkraniPaneliLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {SifreText, TelefonNoText, TelefonText, ŞifreText});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AyarlarEkraniPaneli, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AyarlarEkraniPaneli, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    @Override
    public void getEdits() {
         this.setLocationRelativeTo(null);
         AyarlarEkraniPaneli.setFocusable(true);
         TextAyarlari.setOnlyNumber(TelefonNoText);
         TextAyarlari.setMaxLimit(TelefonNoText, 11);
         
    }
    
    private void GeriIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GeriIconMouseClicked
        ActionAyarlari.setVisible(this, new HesapEkrani());
    }//GEN-LAST:event_GeriIconMouseClicked

    private int clickCounter = 0;
    
    private void TelefonIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TelefonIconMouseClicked
        if(this.clickCounter == 0){ // daha önce tıklanmamışsa
        TelefonNoText.setEnabled(true);
        TelefonIcon.setIcon(new javax.swing.ImageIcon("C:\\Users\\merve\\OneDrive\\Belgeler\\NetBeansProjects\\Banka-Uygulamasi\\src\\main\\java\\KullaniciTasarimi\\İconlar\\UpdateIcon2.png"));
        clickCounter++;
        }
        else{
            TelefonNoText.setEnabled(false);
            JOptionPane.showMessageDialog(this, "Telefon numarası güncellendi.");
            TelefonIcon.setIcon(new javax.swing.ImageIcon("C:\\Users\\merve\\OneDrive\\Belgeler\\NetBeansProjects\\Banka-Uygulamasi\\src\\main\\java\\KullaniciTasarimi\\İconlar\\UpdateIcon.png"));
            clickCounter = 0;
       
            
        }
    }//GEN-LAST:event_TelefonIconMouseClicked

    private void SifreIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SifreIconMouseClicked
        ActionAyarlari.setVisible(this, new SifreYenilemeEkrani());
        SifreIcon.setIcon(new javax.swing.ImageIcon("C:\\Users\\merve\\OneDrive\\Belgeler\\NetBeansProjects\\Banka-Uygulamasi\\src\\main\\java\\KullaniciTasarimi\\İconlar\\UpdateIcon2.png")); 
    }//GEN-LAST:event_SifreIconMouseClicked

    
    
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AyarlarEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AyarlarEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AyarlarEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AyarlarEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AyarlarEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AdSoyadText;
    private javax.swing.JPanel AyarlarEkraniPaneli;
    private javax.swing.JLabel GeriIcon;
    private javax.swing.JLabel SifreIcon;
    private javax.swing.JTextField SifreText;
    private javax.swing.JLabel TelefonIcon;
    private javax.swing.JTextField TelefonNoText;
    private javax.swing.JLabel TelefonText;
    private javax.swing.JLabel ŞifreText;
    // End of variables declaration//GEN-END:variables

    
}
