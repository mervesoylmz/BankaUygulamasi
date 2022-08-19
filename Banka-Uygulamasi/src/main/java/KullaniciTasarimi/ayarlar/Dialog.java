
package KullaniciTasarimi.ayarlar;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Dialog {
    
    public static void bosOlamazMesajiGoster (JFrame frame){
        JOptionPane.showMessageDialog(frame, "Tüm alanlar dolu olmalıdır.");
    }
    
    public static void OzelMesajGoster (JFrame frame, String message){
        JOptionPane.showMessageDialog(frame, message);
    }
}
