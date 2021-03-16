/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suhu;

/**
 *
 * @author hla12
 */
class Fahrenheit extends Suhu{
    
    @Override
    public void hitungSuhu(int pil){
        switch (pil) {
            case 1://reamur
                setSuhuAwal(getSuhuAwal()-32*4/9);
                tampil("Kelvin", "Reamur");
                break;
            case 2:
                setSuhuAwal(getSuhuAwal()-32*5/9);
                tampil("Kelvin", "Reamur");
                break;
            case 3:
                setSuhuAwal(getSuhuAwal());
                tampil("Kelvin", "Fahrenheit");
                break;
            case 4:
                setSuhuAwal(getSuhuAwal()-32+273*5/9);
                tampil("Kelvin", "Kelvin");
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
