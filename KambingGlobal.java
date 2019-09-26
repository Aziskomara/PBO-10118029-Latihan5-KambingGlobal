/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan5;

/**
 * Nama     : Azis komara
 * Kelas    : IF-1
 * Nim      : 10118029
 * deskiripsi program   : kambiing global
 * 
 * @author Azis komara
 */
public class KambingGlobal {

    /**
     * @param args the command line arguments
     */
    //variabel jumlahkambing menjadi variabelinstance
    
    int jumlahKambing = 88;
    
    //method untuk menampilkan jumlah kambing
    public void getJumlahKambing(){
        System.out.println("jumlah kambing: " + jumlahKambing);
    }
    
    public void tambahKambing(){
        jumlahKambing = jumlahKambing + 5;
        System.out.println("jumlah kambing setelah di tambah: " + jumlahKambing);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        KambingGlobal kambingSusu = new KambingGlobal();
        
        //menampilkan jumlah kambing yang ada saat program x berjalan
        kambingSusu.getJumlahKambing();
        
        //menambah satu kaming
        kambingSusu.tambahKambing();
        
        //menampilkan jumlah kambing yang ada
        kambingSusu.getJumlahKambing();
    }
    
}
