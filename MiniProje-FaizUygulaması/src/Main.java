import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner (System.in);
        
        System.out.println("Bankamıza Hoş Geldiniz. Faiz Oranı: %5");
        int ana_para, vade;
        System.out.print("Yatırmak istediğiniz tutarı giriniz: ");
        ana_para = scanner.nextInt();
        System.out.print("Paranızı kaç yıl vadeli yatırmak istiyorsunuz? ");
        vade = scanner.nextInt();
        
        double toplam_para = ana_para;
        double faiz_Oranı = 0.05;
        
        for (int i = 1; i <= vade; i++) {
            toplam_para = (toplam_para * faiz_Oranı) + toplam_para;
            System.out.println(i + ". yılın sonunda toplam para: " + toplam_para);
        }                     
    }   
}



