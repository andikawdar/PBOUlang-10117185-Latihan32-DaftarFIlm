/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FilmPackage;

/**
 *
 * @author user 
 * Nama       : Andhyka WIdariyanto  
 * Kelas      : IF-Ulang
 * NIM        : 10117185 
 * Deskriipsi : Membuat program daftar film dengan konsep pendekatan berbasis object
 */
public class Jarak {
    public String filmName, filmGenre;
    public Double filmRating;
    public int filmDuration;
    
    public void nowPlaying() {
        System.out.println("Nama film   : "+filmName);
        System.out.println("Genre film  : "+filmGenre);
        System.out.println("Rating film : "+filmRating);
        System.out.println("Durasi film : "+filmDuration+"menit");
        System.out.println("");  
    }
}
