/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;

/**
 *
 * @author Windows 10
 */
import java.util.Scanner;
public class Bioadata {
    public static void main(String[] args){
    Scanner masukan = new Scanner(System.in);
    String nama,nis,tempat,tgl,jk,alamat,motto;
        System.out.println("Biodata");
       
        System.out.print("Nama            : ");
        nama = masukan.nextLine();
        System.out.print("NIS             : ");
        nis = masukan.nextLine();
        System.out.print("Tempat Lahir    :");
        tempat = masukan.nextLine();
        System.out.print("Tanggal Lahir   :");
        tgl = masukan.nextLine();
        System.out.print("jenis Kelamin   :");
        jk = masukan.nextLine();
        System.out.print("Alamat di Malang:");
        alamat = masukan.nextLine();
        System.out.print("Motto Hidup     :");
        motto = masukan.nextLine();
    }
}
