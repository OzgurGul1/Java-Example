
package homework;

import java.util.Scanner;


public class EmailAnalyzer {

    private static void emailAnly() {
        try {

            System.out.println("Eposta adresini giriniz:");
            Scanner klavye = new Scanner(System.in); //
            String mail = klavye.nextLine();// string olarak tüm satırı alır.
            String[] ayrac = mail.split("@"); //string ifadeyi @ karakteri görünce böler.
            String bolum1 = ayrac[0]; // string ilk kısmı alır.
            String bolum2 = ayrac[1];// string ikinci kısmı alır.

            System.out.println("Eposta Kullanıcı Adı : " + bolum1); // Ekrana eposta kullanıcı adını yazdırır .
            System.out.println("Eposta Sunucu Adı : " + bolum2); // Ekrana posta sunucu adını yazdırır .
            String bul = bolum2;

            String s = new String(bul);
            s = s.replace(".", " ");
            String[] test1 = s.split(" ");
            int say = test1.length;

            System.out.println("Tanımlı Bölümler: " + say);

            for (int i = 0; i < say; i++) {
                System.out.println((i + 1) + ". Bölüm :" + test1[i]);
            }
            String kurumu = test1[0];
            String domain = test1[1];

            String kurum = " Kuruluş : ";
            if (kurumu.equals("meb")) {

                System.out.println(kurum + "Milli Eğitim Bakanlığı");
            } else if (kurumu.equals(
                    "yandex")) {
                System.out.println(kurum + "Yandex Firması");
            } else if (kurumu.equals(
                    "hotmail")) {
                System.out.println(kurum + "Microsoft Firması");
            } else if (kurumu.equals(
                    "gmail")) {
                System.out.println(kurum + "Google Firması");
            } else {
                System.out.println(kurum + " Tanımlı Değil");
            }

            String domainTuru = " Domain Türü : ";
            if (domain.equals("gov")) {

                System.out.println(domainTuru + "Devlet  ");
            } else if (domain.equals(
                    "edu")) {
                System.out.println(domainTuru + "Eğitim");
            } else if (domain.equals(
                    "com")) {
                System.out.println(domainTuru + "Ticari");
            } else if (domain.equals(
                    "tsk")) {
                System.out.println(domainTuru + "TSK");
            } else if (domain.equals(
                    "org")) {
                System.out.println(domainTuru + "Dernek");
            } else {
                System.out.println(domainTuru + "Domain Türü Tanımlı Değil");
            }

            if (say > 2) {
                String ulke = test1[2];

                String lokasyon = " Lokasyonu : ";
                if (ulke.equals("tr")) {
                    System.out.println(lokasyon + "Türkiye");
                } else if (kurumu.equals("us")) {
                    System.out.println(lokasyon + "A.B.D.");
                } else if (kurumu.equals("uk")) {
                    System.out.println(lokasyon + "İngiltere");
                } else {
                    System.out.println(lokasyon + "Ülke Tanımlı Değil");
                }

            }
            System.out.println("Devam Etmek isityor musunuz-->(E/H)");
            Scanner devam = new Scanner(System.in);
            String dev = devam.next();

            String cevap = "e";

            if (dev.equalsIgnoreCase(cevap)) {
                emailAnly();
            } else {
                System.out.println("Teşekkürler... ");
            }
            klavye.close();// klavye kapatılır
        } catch (IndexOutOfBoundsException e) {

            System.out.println("hatalı eposta girdiniz tekrar deneyiniz: " + "\t");
            emailAnly();

        }
        
    }

    public static void main(String[] args) {
        emailAnly();

    }

}
