package Project_01;

import java.util.Scanner;

public class getTotal {


      /*

        Given three positive Strings
        remove all the non numeric numbers.
        change the Strings to int
        and print the total

        Example:
        String num1 = "$15";
        String num2 = "$20";
        String num3 = "$30";
        output should be == 65;

        NOTE : if the output less then 0 change output to -1

     */


    /*
    verilen String variable'da sayı değerlerinin toplamını print eden code create ediniz


        Ornek:
       String num1 = "$15";
       String num2 = "$20";
       String num3 = "$30";
       output ----> 65;

       NOT : Eğer output 0 dan küçük ise outputu -1 e cevir





   */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String allElements = scanner.nextLine();

        String[] elements = allElements.split(" ");


        String num1 = elements[0];

        String num2 = elements[1];

        String num3 = elements[2];

        //  code Start here don't change before this line
        //   use String num1 , num2 , num3

        // bu satırdan önceki kodlari değiştirmeyiniz
        // String num1,num2,num3 kullanın


//        num1 = num1.replaceAll("[^\\d]", "");
//        num2 = num2.replaceAll("[^\\d]", "");
//        num3 = num3.replaceAll("[^\\d]", "");
//
//        // String'leri integer'a dönüştürün
//        int intNum1 = Integer.parseInt(num1);
//        int intNum2 = Integer.parseInt(num2);
//        int intNum3 = Integer.parseInt(num3);
//
//        // Toplamı hesaplayın
//        int total = intNum1 + intNum2 + intNum3;
//
//        // Toplam 0'dan küçükse, -1 yazdırın
//        if (total < 0) {
//            total = -1;
//        }
//
//        // Sonucu ekrana yazdırın
//        System.out.println("Toplam: " + total);

//        int total = Integer.parseInt(num1.replaceAll("[^\\d]", "")) + // num1'deki sadece sayısal karakterlerin alınması ve integer'a dönüştürülmesi
//                Integer.parseInt(num2.replaceAll("[^\\d]", "")) + // num2'deki sadece sayısal karakterlerin alınması ve integer'a dönüştürülmesi
//                Integer.parseInt(num3.replaceAll("[^\\d]", "")); // num3'deki sadece sayısal karakterlerin alınması ve integer'a dönüştürülmesi
//
//        // Eğer toplam 0'dan küçükse, -1 yazdıralım
//        if (total < 0) {
//            System.out.println("-1");
//        } else {
//            // Toplamı yazdıralım
//            System.out.println("Toplam: " + total);
//        }


        int total = Integer.parseInt(num1.replaceAll("[^-\\d]", "")) +
                Integer.parseInt(num2.replaceAll("[^-\\d]", "")) +
                Integer.parseInt(num3.replaceAll("[^-\\d]", ""));

        if (total < 0) {
            total = -1;
        }


        System.out.println("Toplam: " + total);
    }

    }


