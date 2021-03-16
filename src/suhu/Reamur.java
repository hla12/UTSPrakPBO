/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suhu;
import java.util.Scanner;

/**
 *
 * @author hla12
 */
class Reamur extends Suhu {
    
    
    @Override
    void hitungSuhu(int pil){
        switch (pil) {
            case 1://reamur
                setSuhuAwal(getSuhuAwal());
                tampil("Reamur", "Reamur");
                break;
            case 2:// celcius
                setSuhuAwal(getSuhuAwal()*5/4);
                tampil("Reamur", "Celcius");
                break;
            case 3://fahrenhait
                 setSuhuAwal(getSuhuAwal()*9/4+32);
                tampil("Reamur", "Fahrenhait");
                break;
            case 4://kelvin
                 setSuhuAwal(getSuhuAwal()*5/4+273);
                tampil("Reamur", "Kelvin");
                break;
            default:
                System.out.println("masukkan 1 - 4 saja bang!");
                System.out.println("Silahkan mengulangi program");
                break;
        }
    }
    void tampil(String Awal, String Akhir){
        System.out.println("Suhu Awal " + getSuhuAwal() + " " + Awal);
        System.out.println("Suhu Akhir " + getSuhuAwal() + " " + Akhir);
    }
    
}
