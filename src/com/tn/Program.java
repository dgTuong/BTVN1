package com.tn;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Nhap chuoi: ");
        String str= sc.nextLine();
        System.out.println("Chuoi da nhap: "+ str);
        System.out.println("Chuoi viet hoa: " + str.toUpperCase());
        String str1 = str.substring(0, 1).toUpperCase() + str.substring(1);
        System.out.println("Chuoi viet hoa chu dau: " + str1);
        String str2 = str.replaceAll("n","a");
        String str3 = str2.replaceAll("g","a");
        System.out.println("Chuoi thay the n vs g bang a: "+str3);
    }
}
