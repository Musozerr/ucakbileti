import java.util.Scanner;

public class ucakbileti {
    public static void main(String[] args) {
        double mesafe,yas,tip,tutar,yas_indirim,tip_indirim,indirim,toplam;
        Scanner input = new Scanner(System.in);
        System.out.print("Mesafeyi km türünden giriniz : ");
        mesafe = input.nextInt();
        System.out.print("Yaşınızı giriniz : ");
        yas = input.nextInt();
        System.out.print("Yolculuk tipini giriniz : ");
        tip = input.nextInt();

        if (mesafe > 0 && yas > 0 && (tip == 1 || tip == 2)){
            tutar = mesafe * 0.10;
            if(yas < 12){
                yas_indirim = tutar * 0.50;
                tutar = tutar - yas_indirim;
            }else if(yas <= 24){
                yas_indirim = tutar * 0.10;
                tutar = tutar - yas_indirim;
            }else if(yas >= 65){
                yas_indirim = tutar * 0.30;
                tutar = tutar - yas_indirim;
            }
            if (tip == 2){
                tip_indirim = tutar * 0.20;
                tutar = (tutar - tip_indirim) * 2;
            }
            System.out.println("\nToplam Tutar = "+tutar+" TL");
        }else
            System.out.println("Hatalı veri Girdiniz");

    }
}
