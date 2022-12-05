/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package utspbo;

/**
 *
 * @author ez
 * Kelas TI-B
 * 21104410075
 */
class Dangdut {
    
    String penyanyi = "Ayu Ting Ting";
    String lagu = "Alamat Palsu";
    
    public Dangdut(){       
    }

    void singer(String penyanyi){
        this.penyanyi = penyanyi;
    }
    
    public void song(String lagu, String kopi_Dandut){
        this.lagu = lagu;
    }
    
    void cetakLabel(){
        System.out.println(this.penyanyi+" <=> "+this.lagu);
    }

    
}
