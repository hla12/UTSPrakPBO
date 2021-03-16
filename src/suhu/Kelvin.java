/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suhu;

class Kelvin extends Suhu {
    
    
    @Override
    public void hitungSuhu(int pil){
        switch (pil) {
            case 1://reamur
                setSuhuAwal(getSuhuAwal()-273*4/5);
                tampil("Kelvin", "Reamur");
                break;
            case 2://celcius
                setSuhuAwal(getSuhuAwal()-273);
                tampil("Kelvin", "Celcius");
                break;
            case 3://fahrenheit
                setSuhuAwal(getSuhuAwal()-273+32*9/5);
                tampil("Kelvin", "Fahrenheit");
                break;
            case 4://Kelvin
                setSuhuAwal(getSuhuAwal());
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
