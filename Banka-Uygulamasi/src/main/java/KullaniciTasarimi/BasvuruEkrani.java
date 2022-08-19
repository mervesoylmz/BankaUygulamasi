
package KullaniciTasarimi;

import KullaniciTasarimi.ayarlar.ActionAyarlari;
import KullaniciTasarimi.ayarlar.ButonAyarlari;
import KullaniciTasarimi.ayarlar.Dialog;
import KullaniciTasarimi.ayarlar.Duzenleyici;
import KullaniciTasarimi.ayarlar.TextAyarlari;
import database.IBilgiController;
import database.transactions.HesapBilgileri;
import database.transactions.KullaniciBasvuru;
import java.awt.Color;
import javax.swing.JOptionPane;


public class BasvuruEkrani extends javax.swing.JFrame implements Duzenleyici, IBilgiController{

    private KullaniciBasvuru kullaniciBasvuruObject = null;
    
    public BasvuruEkrani() {
        initComponents();
        getEdits();
        
    }
    @Override
    public void getEdits() {
        this.setLocationRelativeTo(null);
        BasvuruEkraniPaneli.setFocusable(true);
        TextAyarlari.setOnlyAlphabetic(AdSoyadField);
        TextAyarlari.setOnlyNumber(TCNoField);
        TextAyarlari.setOnlyNumber(TelefonNoField);
        TextAyarlari.setMaxLimit(TCNoField, 11);
        TextAyarlari.setMaxLimit(TelefonNoField, 11);
    }

    public KullaniciBasvuru getKullaniciBasvuruObject() {
        if(this.kullaniciBasvuruObject == null){
            kullaniciBasvuruObject = new KullaniciBasvuru();
        }
        return kullaniciBasvuruObject;
    }
    
    
    
            
            
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BasvuruEkraniPaneli = new javax.swing.JPanel();
        AdSoyadText = new javax.swing.JLabel();
        GüvenlikBilgileriText = new javax.swing.JLabel();
        AdSoyadField = new javax.swing.JTextField();
        TCNoText = new javax.swing.JLabel();
        TCNoField = new javax.swing.JTextField();
        GüvenlikSorusuText = new javax.swing.JLabel();
        TelefonNoField = new javax.swing.JTextField();
        KisiselBilgilerText1 = new javax.swing.JLabel();
        TelefonNoText1 = new javax.swing.JLabel();
        GuvenlikSorusu = new javax.swing.JComboBox<>();
        CevapText = new javax.swing.JLabel();
        CevapField = new javax.swing.JTextField();
        BasvurButon = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Orenda Bank Başvuru Ekranı");

        BasvuruEkraniPaneli.setBackground(new java.awt.Color(204, 204, 255));
        BasvuruEkraniPaneli.setPreferredSize(new java.awt.Dimension(415, 426));

        AdSoyadText.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        AdSoyadText.setForeground(new java.awt.Color(0, 0, 0));
        AdSoyadText.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        AdSoyadText.setText("Ad Soyad:");

        GüvenlikBilgileriText.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        GüvenlikBilgileriText.setForeground(new java.awt.Color(0, 0, 0));
        GüvenlikBilgileriText.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        GüvenlikBilgileriText.setText("Güvenlik Bilgileri");

        AdSoyadField.setBackground(new java.awt.Color(255, 255, 255));
        AdSoyadField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdSoyadFieldActionPerformed(evt);
            }
        });

        TCNoText.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        TCNoText.setForeground(new java.awt.Color(0, 0, 0));
        TCNoText.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        TCNoText.setText("T.C. No:");

        TCNoField.setBackground(new java.awt.Color(255, 255, 255));

        GüvenlikSorusuText.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        GüvenlikSorusuText.setForeground(new java.awt.Color(0, 0, 0));
        GüvenlikSorusuText.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        GüvenlikSorusuText.setText("Güvenlik Sorusu:");

        TelefonNoField.setBackground(new java.awt.Color(255, 255, 255));

        KisiselBilgilerText1.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        KisiselBilgilerText1.setForeground(new java.awt.Color(0, 0, 0));
        KisiselBilgilerText1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        KisiselBilgilerText1.setText("Kişisel Bilgiler");

        TelefonNoText1.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        TelefonNoText1.setForeground(new java.awt.Color(0, 0, 0));
        TelefonNoText1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        TelefonNoText1.setText("Telefon No:");

        GuvenlikSorusu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Anneniz hangi şehirde doğdu?", "Evcil hayvanınızın adı nedir?", "En sevdiğiniz nesne nedir?", "En sevdiğiniz peluş ya da bir hayvan adı neydi?", "En sevdiğiniz yemek nedir?", "En sevdiğiniz sınıf okul öğretmeninizin soyadı neydi?", "İlk işiniz neydi?", "Yaşamak istediğiniz yer neresidir?", "Soru giriniz(önerilir)..." }));

        CevapText.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        CevapText.setForeground(new java.awt.Color(0, 0, 0));
        CevapText.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        CevapText.setText("Cevap:");

        CevapField.setBackground(new java.awt.Color(255, 255, 255));

        BasvurButon.setBackground(new java.awt.Color(241, 241, 241));
        BasvurButon.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        BasvurButon.setText("BAŞVUR");
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

        javax.swing.GroupLayout BasvuruEkraniPaneliLayout = new javax.swing.GroupLayout(BasvuruEkraniPaneli);
        BasvuruEkraniPaneli.setLayout(BasvuruEkraniPaneliLayout);
        BasvuruEkraniPaneliLayout.setHorizontalGroup(
            BasvuruEkraniPaneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BasvuruEkraniPaneliLayout.createSequentialGroup()
                .addGroup(BasvuruEkraniPaneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BasvuruEkraniPaneliLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(BasvuruEkraniPaneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(KisiselBilgilerText1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BasvuruEkraniPaneliLayout.createSequentialGroup()
                                .addGroup(BasvuruEkraniPaneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(TelefonNoText1, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                                    .addComponent(TCNoText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(AdSoyadText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(BasvuruEkraniPaneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(TCNoField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
                                    .addComponent(TelefonNoField, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(AdSoyadField))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(BasvuruEkraniPaneliLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(GüvenlikBilgileriText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(BasvuruEkraniPaneliLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BasvuruEkraniPaneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(GüvenlikSorusuText, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CevapText, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BasvuruEkraniPaneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(CevapField, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(GuvenlikSorusu, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BasvurButon))
                .addContainerGap(8, Short.MAX_VALUE))
        );
        BasvuruEkraniPaneliLayout.setVerticalGroup(
            BasvuruEkraniPaneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BasvuruEkraniPaneliLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(KisiselBilgilerText1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(BasvuruEkraniPaneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AdSoyadText, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AdSoyadField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(BasvuruEkraniPaneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TCNoText, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TCNoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(BasvuruEkraniPaneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TelefonNoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TelefonNoText1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(BasvuruEkraniPaneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BasvuruEkraniPaneliLayout.createSequentialGroup()
                        .addComponent(GüvenlikBilgileriText, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(GüvenlikSorusuText, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(GuvenlikSorusu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(BasvuruEkraniPaneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CevapField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CevapText, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(BasvurButon)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        BasvuruEkraniPaneliLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {AdSoyadField, AdSoyadText, CevapField, CevapText, GuvenlikSorusu, GüvenlikSorusuText, TCNoField, TCNoText, TelefonNoField, TelefonNoText1});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BasvuruEkraniPaneli, javax.swing.GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BasvuruEkraniPaneli, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    @Override
    public boolean bilgilerGecerliMi() {
        return TextAyarlari.textAlaniDolumu(BasvuruEkraniPaneli);
    }

    @Override
    public HesapBilgileri getHesapBilgileri() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private void AdSoyadFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdSoyadFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AdSoyadFieldActionPerformed

    
    private void BasvurButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BasvurButonActionPerformed
        if(this.bilgilerGecerliMi()){
            this.basvuruyuGerceklestir();
        }
        else{
            Dialog.bosOlamazMesajiGoster(this);            
        }
        
    }//GEN-LAST:event_BasvurButonActionPerformed

    private void basvuruyuGerceklestir(){
        

        //kişisel bilgiler
        this.getKullaniciBasvuruObject().setAdSoyad(this.AdSoyadField.getText().trim());
        this.getKullaniciBasvuruObject().setTcNo(this.TCNoField.getText().trim());
        this.getKullaniciBasvuruObject().setTelNo(this.TelefonNoField.getText().trim());
        
        // güvenlik bilgileri
        this.getKullaniciBasvuruObject().setGuvenlikSorusu(String.valueOf(this.GuvenlikSorusu.getSelectedItem()));
        this.getKullaniciBasvuruObject().setGuvenlikCevap(this.CevapField.getText().trim());
        
        // sistem tarafından verilecek bilgiler
        this.getKullaniciBasvuruObject().setMusteriNo(this.randomMusteriNoAl());
        this.getKullaniciBasvuruObject().setSifre(this.randomSifreAl());
        
        Dialog.OzelMesajGoster(this, "Başvurunuz kabul edilmiştir...");
        ActionAyarlari.setVisible(this, new GirisEkrani());
        
    }
    
    private String randomMusteriNoAl(){
        String musteriNo;
        musteriNo = String.valueOf(100000 + (int)(Math.random()* 9000000));
        return musteriNo;
    }
    
    private String randomSifreAl(){
        String sifre;
        sifre = String.valueOf(1000 + (int)(Math.random()*9000));
        return sifre;
    }
            
    private void BasvurButonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BasvurButonMouseEntered
        ButonAyarlari.setBgFg(BasvurButon, Color.DARK_GRAY, Color.WHITE);
    }//GEN-LAST:event_BasvurButonMouseEntered

    private void BasvurButonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BasvurButonMouseExited
        ButonAyarlari.setorijinalBgFg(BasvurButon);
    }//GEN-LAST:event_BasvurButonMouseExited

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BasvuruEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AdSoyadField;
    private javax.swing.JLabel AdSoyadText;
    private javax.swing.JButton BasvurButon;
    private javax.swing.JPanel BasvuruEkraniPaneli;
    private javax.swing.JTextField CevapField;
    private javax.swing.JLabel CevapText;
    private javax.swing.JComboBox<String> GuvenlikSorusu;
    private javax.swing.JLabel GüvenlikBilgileriText;
    private javax.swing.JLabel GüvenlikSorusuText;
    private javax.swing.JLabel KisiselBilgilerText1;
    private javax.swing.JTextField TCNoField;
    private javax.swing.JLabel TCNoText;
    private javax.swing.JTextField TelefonNoField;
    private javax.swing.JLabel TelefonNoText1;
    // End of variables declaration//GEN-END:variables

    

    
}
