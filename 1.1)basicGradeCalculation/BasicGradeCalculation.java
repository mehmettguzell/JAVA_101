import java.util.Scanner;

public class BasicGradeCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int mat,fizik,kimya,turkce,tarih,muzik;

        System.out.print("Matematik notun: ");      mat =    scanner.nextInt();
        System.out.print("fizik notun: ");          fizik =  scanner.nextInt();
        System.out.print("turkce notun: ");         turkce = scanner.nextInt();
        System.out.print("muzik notun: ");          muzik =  scanner.nextInt();
        System.out.print("kimya notun: ");          kimya =  scanner.nextInt();
        System.out.print("tarih notun: ");          tarih =  scanner.nextInt();

        int toplam = (mat + fizik + turkce + tarih + kimya + muzik) ;
        double sonuc = toplam / 6.0;
        System.out.println("Ortalamaniz: " + sonuc);

        String durum = sonuc >= 50.0 ? "Geçtiniz" : "Kaldınız";
        System.out.println(durum);
    }
}