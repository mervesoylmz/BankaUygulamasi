package KullaniciTasarimi;
import KullaniciTasarimi.ayarlar.ActionAyarlari;
import KullaniciTasarimi.ayarlar.ButonAyarlari;
import KullaniciTasarimi.ayarlar.Duzenleyici;
import KullaniciTasarimi.ayarlar.TextAyarlari;
import database.DbConnection;
import java.awt.Color;


public final class GirisEkrani extends javax.swing.JFrame implements Duzenleyici {

    private final String KimlikTextOrijinal = "T.C. No / Müşteri No";
    private final String SifreTextOrijinal = "*********";
    public GirisEkrani() {
        initComponents();
        getEdits();
        new DbConnection();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GirisEkraniPaneli = new javax.swing.JPanel();
        OrendaBankText = new javax.swing.JLabel();
        HoşGeldinizText = new javax.swing.JLabel();
        GirisButon = new javax.swing.JButton();
        BasvurButon = new javax.swing.JButton();
        BasvurText = new javax.swing.JLabel();
        TCNOText = new javax.swing.JTextField();
        SifreText = new javax.swing.JPasswordField();
        SifremiUnuttumText = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Orenda Bank Giris Ekranı");

        GirisEkraniPaneli.setBackground(new java.awt.Color(204, 204, 255));
        GirisEkraniPaneli.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GirisEkraniPaneliMouseClicked(evt);
            }
        });

        OrendaBankText.setFont(new java.awt.Font("Forte", 1, 40)); // NOI18N
        OrendaBankText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        OrendaBankText.setText("OrendaBank");

        HoşGeldinizText.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        HoşGeldinizText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        HoşGeldinizText.setText("Hoş Geldiniz...");

        GirisButon.setBackground(new java.awt.Color(241, 241, 241));
        GirisButon.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        GirisButon.setText("GİRİŞ");
        GirisButon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        GirisButon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                GirisButonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                GirisButonMouseExited(evt);
            }
        });
        GirisButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GirisButonActionPerformed(evt);
            }
        });

        BasvurButon.setBackground(new java.awt.Color(241, 241, 241));
        BasvurButon.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        BasvurButon.setText("Hemen BAŞVUR");
        BasvurButon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BasvurButon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BasvurButonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BasvurButonMouseExited(evt);
            }
        });
        BasvurButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BasvurButonActionPerformed(evt);
            }
        });

        BasvurText.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        BasvurText.setText("Müşterimiz olmak için");

        TCNOText.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        TCNOText.setForeground(new java.awt.Color(102, 102, 102));
        TCNOText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TCNOTextFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TCNOTextFocusLost(evt);
            }
        });
        TCNOText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TCNOTextActionPerformed(evt);
            }
        });

        SifreText.setForeground(new java.awt.Color(102, 102, 102));
        SifreText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                SifreTextFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                SifreTextFocusLost(evt);
            }
        });

        SifremiUnuttumText.setFont(new java.awt.Font("Times New Roman", 1, 10)); // NOI18N
        SifremiUnuttumText.setForeground(new java.awt.Color(0, 0, 0));
        SifremiUnuttumText.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        SifremiUnuttumText.setText("Şifremi Unuttum");
        SifremiUnuttumText.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SifremiUnuttumText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SifremiUnuttumTextMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout GirisEkraniPaneliLayout = new javax.swing.GroupLayout(GirisEkraniPaneli);
        GirisEkraniPaneli.setLayout(GirisEkraniPaneliLayout);
        GirisEkraniPaneliLayout.setHorizontalGroup(
            GirisEkraniPaneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, GirisEkraniPaneliLayout.createSequentialGroup()
                .addContainerGap(110, Short.MAX_VALUE)
                .addGroup(GirisEkraniPaneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(OrendaBankText)
                    .addComponent(HoşGeldinizText)
                    .addComponent(TCNOText, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SifreText, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(GirisButon, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BasvurText)
                    .addComponent(BasvurButon)
                    .addComponent(SifremiUnuttumText, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(77, 77, 77))
        );

        GirisEkraniPaneliLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {SifreText, SifremiUnuttumText, TCNOText});

        GirisEkraniPaneliLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {BasvurButon, GirisButon});

        GirisEkraniPaneliLayout.setVerticalGroup(
            GirisEkraniPaneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GirisEkraniPaneliLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(OrendaBankText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(HoşGeldinizText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addComponent(TCNOText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(SifreText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SifremiUnuttumText, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(GirisButon)
                .addGap(66, 66, 66)
                .addComponent(BasvurText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BasvurButon)
                .addGap(30, 30, 30))
        );

        GirisEkraniPaneliLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {SifreText, TCNOText});

        GirisEkraniPaneliLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {BasvurButon, GirisButon});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(GirisEkraniPaneli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(GirisEkraniPaneli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    @Override
    public void getEdits() {
        this.setLocationRelativeTo(null);
        GirisEkraniPaneli.setFocusable(true);
        TCNOText.setText(KimlikTextOrijinal);
        SifreText.setText(SifreTextOrijinal);
        TextAyarlari.setOnlyNumber(TCNOText);
    }
    
    private void TCNOTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TCNOTextActionPerformed
       
    }//GEN-LAST:event_TCNOTextActionPerformed
  
    /*
   Buton Renklendirmeleri 
   */

    private void GirisButonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GirisButonMouseEntered
        ButonAyarlari.setBgFg(GirisButon, Color.DARK_GRAY, Color.WHITE);
    }//GEN-LAST:event_GirisButonMouseEntered

    private void GirisButonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GirisButonMouseExited
        ButonAyarlari.setorijinalBgFg(GirisButon);
    }//GEN-LAST:event_GirisButonMouseExited

    private void BasvurButonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BasvurButonMouseEntered
        ButonAyarlari.setBgFg(BasvurButon, Color.DARK_GRAY, Color.WHITE);
    }//GEN-LAST:event_BasvurButonMouseEntered
    
    private void BasvurButonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BasvurButonMouseExited
        ButonAyarlari.setorijinalBgFg(BasvurButon);
    }//GEN-LAST:event_BasvurButonMouseExited
    
    /*
    Text Odaklanması
    */    
    
    private void TCNOTextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TCNOTextFocusGained
        TextAyarlari.chechTheTextFocusGained(TCNOText, KimlikTextOrijinal);
    }//GEN-LAST:event_TCNOTextFocusGained

    private void TCNOTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TCNOTextFocusLost
       TextAyarlari.chechTheTextFocusLost(TCNOText);
    }//GEN-LAST:event_TCNOTextFocusLost

    private void SifreTextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_SifreTextFocusGained
       TextAyarlari.chechTheTextFocusGained(SifreText, SifreTextOrijinal);
    }//GEN-LAST:event_SifreTextFocusGained

    private void SifreTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_SifreTextFocusLost
        TextAyarlari.chechTheTextFocusLost(SifreText);
    }//GEN-LAST:event_SifreTextFocusLost
    
    /*
    Buton Actions
    */
    private void GirisButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GirisButonActionPerformed
        ActionAyarlari.setVisible(this, new HesapEkrani());
    }//GEN-LAST:event_GirisButonActionPerformed

    private void BasvurButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BasvurButonActionPerformed
        ActionAyarlari.setVisible(this, new BasvuruEkrani());
    }//GEN-LAST:event_BasvurButonActionPerformed

    private void SifremiUnuttumTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SifremiUnuttumTextMouseClicked
        SifreYenilemeEkrani SifreYenilemeEkrani = new SifreYenilemeEkrani();
        ActionAyarlari.setVisible(this, new SifreYenilemeEkrani());
        SifreYenilemeEkrani.getEskiSifreText().setEnabled(false);
    }//GEN-LAST:event_SifremiUnuttumTextMouseClicked

    private void GirisEkraniPaneliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GirisEkraniPaneliMouseClicked
        
    }//GEN-LAST:event_GirisEkraniPaneliMouseClicked

  
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GirisEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BasvurButon;
    private javax.swing.JLabel BasvurText;
    private javax.swing.JButton GirisButon;
    private javax.swing.JPanel GirisEkraniPaneli;
    private javax.swing.JLabel HoşGeldinizText;
    private javax.swing.JLabel OrendaBankText;
    private javax.swing.JPasswordField SifreText;
    private javax.swing.JLabel SifremiUnuttumText;
    private javax.swing.JTextField TCNOText;
    // End of variables declaration//GEN-END:variables

    
}
