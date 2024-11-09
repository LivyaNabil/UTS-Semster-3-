/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.semester.pkg3;

/**
 *
 * @author USER
 */
public class UTSSemester3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Smartphone SmartphoneSaya= new Smartphone();
        
        System.out.println("Spesifikasi Smartphone Saya:");
            SmartphoneSaya.Merk= "Infinix";
            SmartphoneSaya.Warna= "Blue";
            SmartphoneSaya.RAM= "8/256 GB";
                        
        SmartphoneSaya.Spesifikasi();
    }
    
}
