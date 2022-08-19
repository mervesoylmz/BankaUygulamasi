
package KullaniciTasarimi;

import KullaniciTasarimi.ayarlar.ActionAyarlari;
import KullaniciTasarimi.ayarlar.Duzenleyici;
import KullaniciTasarimi.ayarlar.TextAyarlari;
import javax.swing.JOptionPane;

public class HavaleEkrani extends javax.swing.JFrame implements Duzenleyici{

    
    private final String MusteriNoTextOrijinal = "Müşteri No";
    private int GönderilenMiktar = 0;
    
    public HavaleEkrani() {
        initComponents();
        getEdits();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        HavaleEkraniPaneli = new javax.swing.JPanel();
        AdSoyadText = new javax.swing.JLabel();
        MesajText = new javax.swing.JLabel();
        ToplamBakiyeText = new javax.swing.JLabel();
        BakiyeText = new javax.swing.JLabel();
        GMüsteriNoText = new javax.swing.JLabel();
        MusteriNoText = new javax.swing.JTextField();
        ParaGönderButon = new javax.swing.JButton();
        GeriIcon = new javax.swing.JLabel();
        HavaleText = new javax.swing.JTextField();
        GönderilenTutarText = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Orenda Bank Havale Ekranı");

        HavaleEkraniPaneli.setBackground(new java.awt.Color(204, 204, 255));
        HavaleEkraniPaneli.setToolTipText("");

        AdSoyadText.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        AdSoyadText.setForeground(new java.awt.Color(0, 102, 102));
        AdSoyadText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AdSoyadText.setText("Sayın [Kullanıcı Adı Soyadı]");

        MesajText.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        MesajText.setForeground(new java.awt.Color(0, 51, 51));
        MesajText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MesajText.setText("Tek seferde 10.000 TL ve altını gönderebilirsiniz.");

        ToplamBakiyeText.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        ToplamBakiyeText.setForeground(new java.awt.Color(0, 51, 51));
        ToplamBakiyeText.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        ToplamBakiyeText.setText("Toplam Bakiyeniz :");

        BakiyeText.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        BakiyeText.setForeground(new java.awt.Color(0, 51, 51));
        BakiyeText.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BakiyeText.setText("[Bakiye]");

        GMüsteriNoText.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        GMüsteriNoText.setForeground(new java.awt.Color(0, 51, 51));
        GMüsteriNoText.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        GMüsteriNoText.setText("Müşteri Numarası:");

        MusteriNoText.setBackground(new java.awt.Color(255, 255, 255));

        ParaGönderButon.setBackground(new java.awt.Color(0, 51, 51));
        ParaGönderButon.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        ParaGönderButon.setForeground(new java.awt.Color(255, 255, 255));
        ParaGönderButon.setText("Para Gönder");
        ParaGönderButon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ParaGönderButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ParaGönderButonActionPerformed(evt);
            }
        });

        GeriIcon.setIcon(new javax.swing.ImageIcon("C:\\Users\\merve\\OneDrive\\Belgeler\\NetBeansProjects\\Banka-Uygulamasi\\src\\main\\java\\KullaniciTasarimi\\İconlar\\GeriIcon.png")); // NOI18N
        GeriIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        GeriIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GeriIconMouseClicked(evt);
            }
        });

        HavaleText.setBackground(new java.awt.Color(255, 255, 255));
        HavaleText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HavaleTextActionPerformed(evt);
            }
        });
        HavaleText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                HavaleTextKeyReleased(evt);
            }
        });

        GönderilenTutarText.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        GönderilenTutarText.setForeground(new java.awt.Color(0, 51, 51));
        GönderilenTutarText.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        GönderilenTutarText.setText("Göndermek İstediğiniz Tutar:");

        javax.swing.GroupLayout HavaleEkraniPaneliLayout = new javax.swing.GroupLayout(HavaleEkraniPaneli);
        HavaleEkraniPaneli.setLayout(HavaleEkraniPaneliLayout);
        HavaleEkraniPaneliLayout.setHorizontalGroup(
            HavaleEkraniPaneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HavaleEkraniPaneliLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ParaGönderButon)
                .addGap(70, 70, 70))
            .addGroup(HavaleEkraniPaneliLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(HavaleEkraniPaneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HavaleEkraniPaneliLayout.createSequentialGroup()
                        .addGroup(HavaleEkraniPaneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AdSoyadText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(MesajText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(HavaleEkraniPaneliLayout.createSequentialGroup()
                        .addGroup(HavaleEkraniPaneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(HavaleEkraniPaneliLayout.createSequentialGroup()
                                .addComponent(GönderilenTutarText, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(HavaleText, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(HavaleEkraniPaneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(HavaleEkraniPaneliLayout.createSequentialGroup()
                                    .addGroup(HavaleEkraniPaneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(GMüsteriNoText, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ToplamBakiyeText, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(HavaleEkraniPaneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(MusteriNoText, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(BakiyeText, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(GeriIcon)))
                        .addContainerGap(31, Short.MAX_VALUE))))
        );
        HavaleEkraniPaneliLayout.setVerticalGroup(
            HavaleEkraniPaneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HavaleEkraniPaneliLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(GeriIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(AdSoyadText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(MesajText)
                .addGap(60, 60, 60)
                .addGroup(HavaleEkraniPaneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BakiyeText)
                    .addComponent(ToplamBakiyeText))
                .addGap(18, 18, 18)
                .addGroup(HavaleEkraniPaneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GMüsteriNoText)
                    .addComponent(MusteriNoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(HavaleEkraniPaneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(HavaleText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(GönderilenTutarText))
                .addGap(18, 18, 18)
                .addComponent(ParaGönderButon)
                .addContainerGap(93, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(HavaleEkraniPaneli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(HavaleEkraniPaneli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    @Override
    public void getEdits() {
        this.setLocationRelativeTo(null);
        HavaleEkraniPaneli.setFocusable(true);
        MusteriNoText.setText(MusteriNoTextOrijinal);
        TextAyarlari.setOnlyNumber(HavaleText);
        TextAyarlari.setMaxLimit(HavaleText, 5);
        TextAyarlari.setOnlyNumber(MusteriNoText);
        TextAyarlari.setMaxLimit(MusteriNoText, 8);
        

    }
    
    private void ParaGönderButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ParaGönderButonActionPerformed
        JOptionPane.showMessageDialog(this, "İşleminiz Gerçekleştiriliyor.\n" + "Gönderilen Tutar: " + GönderilenMiktar  + "TL");
        ActionAyarlari.setVisible(this, new HesapEkrani());
       
    }//GEN-LAST:event_ParaGönderButonActionPerformed

    private void GeriIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GeriIconMouseClicked
         ActionAyarlari.setVisible(this, new HesapEkrani());
    }//GEN-LAST:event_GeriIconMouseClicked

    private void HavaleTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_HavaleTextKeyReleased
         this.GönderilenMiktar = TextAyarlari.checkTheTextKeyReleased(HavaleText, 10000);
       
    }//GEN-LAST:event_HavaleTextKeyReleased

    private void HavaleTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HavaleTextActionPerformed
        
    }//GEN-LAST:event_HavaleTextActionPerformed

   
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HavaleEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AdSoyadText;
    private javax.swing.JLabel BakiyeText;
    private javax.swing.JLabel GMüsteriNoText;
    private javax.swing.JLabel GeriIcon;
    private javax.swing.JLabel GönderilenTutarText;
    private javax.swing.JPanel HavaleEkraniPaneli;
    private javax.swing.JTextField HavaleText;
    private javax.swing.JLabel MesajText;
    private javax.swing.JTextField MusteriNoText;
    private javax.swing.JButton ParaGönderButon;
    private javax.swing.JLabel ToplamBakiyeText;
    // End of variables declaration//GEN-END:variables

    
}
