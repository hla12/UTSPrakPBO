/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suhu;
import java.util.Scanner;
public class KonversiSuhuTestDrive {   
    public static void main(String[] args) {
        double temp = 0;
        double hasil = 0;
        int pilihan, pil;
        System.out.println("###### Konversi Suhu #####");
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Nilai Suhu : ");
        temp = input.nextDouble();
        System.out.print("Masukkan Nilai Awal : (1-4)\n"
                + "1. Reamur \n"
                + "2. Celcius \n"
                + "3. Fahrenheit \n"
                + "4. Kelvin\n"
                + "Jawaban : ");
        pilihan = input.nextInt();
        System.out.print("Masukkan Nilai Akhir : (1-4)\n"
                + "1. Reamur \n"
                + "2. Celcius \n"
                + "3. Fahrenheit \n"
                + "4. Kelvin\n"
                + "Jawaban : ");
        pil = input.nextInt();
        switch (pilihan) {
            case 1:
                Reamur r = new Reamur();
                r.setSuhuAwal(temp);
                r.hitungSuhu(pil);
                break;
            case 2:
                Celcius c = new Celcius();
                c.setSuhuAwal(temp);
                c.hitungSuhu(pil);
                break;
            case 3:
                Fahrenheit f = new Fahrenheit();
                f.setSuhuAwal(temp);
                f.hitungSuhu(pil);
                break;
            case 4:
                Kelvin k = new Kelvin();
                k.setSuhuAwal(temp);
                k.hitungSuhu(pil);
                break;
            default:
                System.out.println("Pastikan hanya memasukkan 1 - 4!!!");
                System.out.println("Silahkan mengulangi program");
                break;
        }
    }
}
