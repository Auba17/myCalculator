package com.company;

import java.util.Scanner;

public class Main {
    public static int çıkarma(int a,int b){
        return (a-b);
    }
    public static int toplama (int a, int b){

        return (a+b);
    }
    public static int toplama (int a, int b,int c){

        return (a+b+c);
    }
    public static double bolme (double a, double b){

        return (a/b);

    }
    public static int carpma ( int a, int b){
        return (a*b);
    }
    public static int carpma ( int a, int b,int c){
        return (a*b*c);
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("************************");
        System.out.println("Çıkarma işlemi için : 1 \n" +
                " Toplama işlemi için : 2 \n" +
                " Bölme İşlemi için   : 3\n" +
                " Çarma işlemi için : 4\n" +
                " Programdan Çıkmak İçin : q ");
        System.out.println("************************");

        while (true){
            System.out.print("İİŞLEMİNİZİ SEÇİN :");
            String islemler=scanner.nextLine();

            if (islemler.equals("q")){

                System.out.println("İşlemden çıkılıyor Hoşçakalın...");

            }
            else if (islemler.equals("1")){
                System.out.print("Birinci Sayıyı giriniz :");
                int birinci =scanner.nextInt();
                System.out.print("ikinci Sayıyı giriniz :");
                int ikinci =scanner.nextInt();

                System.out.print("Çıkarma işleminin sonucu :"+çıkarma(birinci,ikinci));
            }
            else if (islemler.equals("2")){
                System.out.print("Kaç Sayı ile işlem yaıcaksınız :");
                int kacsayı=scanner.nextInt();
                if (kacsayı==2){
                    System.out.print("Birinci Sayıyı Giriniz :");
                    int birinci =scanner.nextInt();
                    System.out.print("ikinci Sayıyı giriniz :");
                    int ikinci =scanner.nextInt();
                    System.out.print("Toplama İşleminin sonucu :"+ toplama(birinci,ikinci));


                }
                else if (kacsayı==3){
                    System.out.print("Birinci Sayıyı Giriniz :");
                    int birinci =scanner.nextInt();
                    System.out.print("ikinci Sayıyı giriniz :");
                    int ikinci =scanner.nextInt();
                    System.out.print("Üçüncü Sayıyı giriniz :");
                    int üçüncü =scanner.nextInt();
                    System.out.print("Toplama İşleminin sonucu :"+ toplama(birinci,ikinci,üçüncü));

                }
                else {
                    System.out.println("Yanlış bir İşlem yaptınız.....");
                }

            }
            else if (islemler.equals("3")){
                System.out.print("Birinci Sayı :");
                double birinci=scanner.nextDouble();
                System.out.print("ikinci Sayı :");
                double ikinci=scanner.nextDouble();
                System.out.print("Bölme işleminiz :"+bolme(birinci,ikinci));
            }else if (islemler.equals("4")) {
                System.out.println("Kaç Sayı ile işlem yaıcaksınız :");
                int kacsayı = scanner.nextInt();
                if (kacsayı == 2) {
                    System.out.print("Birinci Sayıyı Giriniz :");
                    int birinci = scanner.nextInt();
                    System.out.print("ikinci Sayıyı giriniz :");
                    int ikinci = scanner.nextInt();
                    System.out.print("Toplama İşleminin sonucu :" + carpma(birinci, ikinci));


                } else if (kacsayı == 3) {
                    System.out.print("Birinci Sayıyı Giriniz :");
                    int birinci = scanner.nextInt();
                    System.out.print("ikinci Sayıyı giriniz :");
                    int ikinci = scanner.nextInt();
                    System.out.print("Üçüncü Sayıyı giriniz :");
                    int üçüncü = scanner.nextInt();
                    System.out.print("Toplama İşleminin sonucu :" + carpma(birinci, ikinci, üçüncü));

                } else {
                    System.out.println("Yanlış bir İşlem yaptınız.....");
                    System.out.println("Lütfen tekrar deneyiniz...");
                }
            }
            break;

        }
    }
}
