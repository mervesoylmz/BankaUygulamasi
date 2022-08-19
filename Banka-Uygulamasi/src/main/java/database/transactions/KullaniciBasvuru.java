
package database.transactions;

import database.IBilgiController;

public class KullaniciBasvuru  implements IBilgiController{
    
    //başvuru bilgileri
    private String adSoyad = null, tcNo = null,telNo = null;
    private String guvenlikSorusu = null, guvenlikCevap = null;
    
    //sistem tarafından verilen bilgiler
    private String musteriNo = null;
    private String sifre = null;
    
    //

    @Override
    public boolean bilgilerGecerliMi() {
        return !(this.adSoyad == null
                ||this.tcNo == null
                ||this.telNo == null
                ||this.guvenlikSorusu == null
                ||this.guvenlikCevap == null
                ||this.musteriNo == null         
                ||this.sifre == null);
    }

    @Override
    public HesapBilgileri getHesapBilgileri() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public String getTcNo() {
        return tcNo;
    }

    public void setTcNo(String tcNo) {
        this.tcNo = tcNo;
    }

    public String getTelNo() {
        return telNo;
    }

    public void setTelNo(String telNo) {
        this.telNo = telNo;
    }

    public String getGuvenlikSorusu() {
        return guvenlikSorusu;
    }

    public void setGuvenlikSorusu(String guvenlikSorusu) {
        this.guvenlikSorusu = guvenlikSorusu;
    }

    public String getGuvenlikCevap() {
        return guvenlikCevap;
    }

    public void setGuvenlikCevap(String guvenlikCevap) {
        this.guvenlikCevap = guvenlikCevap;
    }

    public String getMusteriNo() {
        return musteriNo;
    }

    public void setMusteriNo(String musteriNo) {
        this.musteriNo = musteriNo;
    }

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }
    
    
    
}
