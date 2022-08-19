
package KullaniciTasarimi.ayarlar;

import java.awt.Color;
import javax.swing.JButton;

public class ButonAyarlari {
    
    /*
    Arkaplan ve yazı rengi ayarları
    */
    
    private static Color orijinalBgColor, orijinalFgColor;
    
    public static void setBgFg (JButton button, Color bgColor, Color fgColor){
        orijinalBgColor = button.getBackground();
        orijinalFgColor = button.getForeground();
        button.setBackground(bgColor);
        button.setForeground(fgColor);
    }
    
    public static void setorijinalBgFg(JButton button){
        button.setBackground(orijinalBgColor);
        button.setForeground(orijinalFgColor);
        
    }
}
