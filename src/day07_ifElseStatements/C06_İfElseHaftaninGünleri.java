package day07_ifElseStatements;

import javax.swing.*;
import java.util.Scanner;

public class C06_İfElseHaftaninGünleri {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir gün ismi giriniz.");
        String günIsmi = scan.next().toLowerCase()
                ;
        if (günIsmi.equals("pazar") || günIsmi.equals("cumartesi"))
        {
            System.out.println("Hafta Sonu");        }

        else if (günIsmi.equals("pazartesi") || günIsmi.equals("sali") || günIsmi.equals("carsamba") || günIsmi.equals("persembe")
                || günIsmi.equals("cuma"))
        {
            System.out.println("hafta ici");} else
            {
                System.out.println("lütfen gecerli bir gün ismi giriniz.");}

    }}


