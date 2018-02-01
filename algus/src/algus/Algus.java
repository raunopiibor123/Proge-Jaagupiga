/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algus;

/**
 * Esimene katsetus. Muutujad, valik, massiiv
 * @author if17
 */
public class Algus {
    
    /**
     * Alamprogramm toa soojuse hindamiseks vastavalt temperatuurile.
     * Vähemasti kolm taset
     * /
  
    /**
     * @param temperatuur 
     */
    

    
    public static void ilmaKommentaar(int temperatuur){
       if(temperatuur>=21){System.out.println("Soe on");}
            if(temperatuur==20){System.out.println("Täpselt paras");}
                if(temperatuur<20){System.out.println("Külmaks läheb");}

    }
   
    /**
     * Programmi töö alguskoht. Siit alustatakse käivitamisel
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       System.out.println("Hello, Web!");
       ilmaKommentaar(101);
    }
    
}
