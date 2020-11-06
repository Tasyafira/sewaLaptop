/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sewa.laptop;
import java.util.Scanner;
/**
 *
 * @author MOKLET-1
 */
public class SewaLaptop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("<<<           JAYA ABADI          >>>");
        System.out.println("        Nota Peminjaman Laptop       ");
        Scanner input = new Scanner(System.in);
        //Memasukkan Identitas diri
        System.out.print("Nama Lengkap : ");
        String nama = input.nextLine();
        System.out.print("Alamat : ");
        String alamat = input.nextLine();
        System.out.print("Nomer HP : ");
        String hp = input.nextLine();
        System.out.print("No KTP : ");
        int ktp = input.nextInt();
        
        System.out.println("\n");
        
        //Harga sewa laptop perhari
        int harga1 = 300000,  
            harga2 = 285000,  
            harga3 = 95000;
   
        System.out.println("   Daftar Harga Sewa Laptop Perhari ");
        String[] laptop = {" ", " Asus Zenbook Series", " Macbook Pro (2020)", " Lenovo Legion Y540 15"};
        int [] daftarHarga = {0, 300000, 285000, 95000};
            for (int i = 1; i < daftarHarga.length; i++)
            System.out.println("Kode "+i+laptop[i]+" ==> "+daftarHarga[i]);
        
        System.out.println("\n");
       
        //Memasukkan kode
        int lamaSewa, jumlah, total, uang, kembalian;
        System.out.print("Masukkan Kode Laptop : ");
        int kode = input.nextInt();
        switch(kode){
            case 1 :
                System.out.println("Laptop yang disewa : Asus Zenbook Series");
                System.out.println("Harga sewa perhari : Rp. "+harga1);
                System.out.print("Lama Sewa : ");
                lamaSewa = input.nextInt();
                System.out.print("Jumlah Laptop : ");
                jumlah = input.nextInt();
                total = harga1*lamaSewa*jumlah;
                System.out.println("Total : Rp. "+total);
                System.out.print("Nominal uang : Rp ");
                uang= input.nextInt();
                if (uang == total){
                    System.out.print("Uang Anda Pas ");
                }else if (uang >= total){
                    kembalian = uang - total;
                    System.out.print("Kembalian : "+kembalian);
                }else if (uang <= total){
                    System.out.print("Uang Anda Kurang");
                }
                
                break;
            
            case 2 :
                System.out.println("Laptop yang disewa : Macbook Pro (2020)");
                System.out.println("Harga sewa perhari : Rp. "+harga2);
                System.out.print("Lama Sewa : ");
                lamaSewa = input.nextInt();
                System.out.print("Jumlah Laptop : ");
                jumlah = input.nextInt();
                total = harga2*lamaSewa*jumlah;
                System.out.println("Total : "+total);
                System.out.print("Nominal uang : Rp ");
                uang= input.nextInt();
                if (uang == total){
                    System.out.print("Uang Anda Pas ");
                }else if (uang >= total){
                    kembalian = uang - total;
                    System.out.print("Kembalian : "+kembalian);
                }else if (uang <= total){
                    System.out.print("Uang Anda Kurang");
                }
                break;
            
            case 3 :
                System.out.println("Laptop yang disewa : Lenovo Legion Y540 15");
                System.out.println("Harga sewa perhari : Rp. "+harga3);
                System.out.print("Lama Sewa : ");
                lamaSewa = input.nextInt();
                System.out.print("Jumlah Laptop : ");
                jumlah = input.nextInt();
                total = harga3*lamaSewa*jumlah;
                System.out.println("Total : "+total);
                System.out.print("Nominal uang : Rp ");
                uang = input.nextInt();
                if (uang == total){
                    System.out.print("Uang Anda Pas ");
                }else if (uang >= total){
                    kembalian = uang - total;
                    System.out.print("Kembalian : "+kembalian);
                }else if (uang <= total){
                    System.out.print("Uang Anda Kurang");
                }
                break;
            
            default:
                System.out.println("Maaf, Kode Yang Anda Masukkan Tidak Tersedia");
                break;
        }
        System.out.println("\n");
        System.out.println("Terima Kasih Sudah Berkunjung");
        

 
    }
    
}
