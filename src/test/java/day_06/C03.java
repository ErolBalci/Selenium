package day_06;

import java.util.Scanner;

public class C03 {
    public static void main(String[] args) {

            //verilen String'deki kullalanilan harfleri
           // kelimeyi ve tekrarsiz halini yazdirip
           // kelimede kullanilan farkli harf sayisini yazdırın

    String input = "Have nice day";
    String tekrarsizInput = "";
    String islenecekKelime = input.replaceAll("\\W", ""); //Haveaniceday
        System.out.println(input.substring(0, 1));
        tekrarsizInput = islenecekKelime.substring(0, 1);//H

        for (int i = 1; i < islenecekKelime.length(); i++) {
        if (!tekrarsizInput.contains((islenecekKelime.substring(i, i + 1)))) {
            System.out.print("," + islenecekKelime.substring(i, i + 1));
            tekrarsizInput+= islenecekKelime.substring(i, i + 1);
        }
    }
        System.out.println(" ");
        System.out.println("input :"+ input);
        System.out.println("tekrarsız input :"+tekrarsizInput);
        System.out.println("tekrarsiz harf sayısı :"+tekrarsizInput.length());
}
    }
