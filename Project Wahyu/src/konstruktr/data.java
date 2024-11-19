/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package konstruktr;

/**
 *
 * @author asus
 */
public class data {
    private String Nama;
    private String JK;
    
    public data(String nama,String jenkel){
        this.Nama=nama;
        this.JK=jenkel;
    }
        public void datamhs(){
            System.out.println("Nama          : "+this.Nama);
            System.out.println("Jenis Kelamin : "+this.JK);
            
    }
}
