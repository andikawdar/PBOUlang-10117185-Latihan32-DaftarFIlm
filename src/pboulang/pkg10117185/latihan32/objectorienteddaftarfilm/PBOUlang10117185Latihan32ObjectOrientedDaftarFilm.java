/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboulang.pkg10117185.latihan32.objectorienteddaftarfilm;

/**
 *
 * @author user
 * Nama       : Andhyka WIdariyanto  
 * Kelas      : IF-Ulang
 * NIM        : 10117185 
 * Deskriipsi : Membuat program daftar film dengan konsep pendekatan berbasis object
 */
public class PBOUlang10117185Latihan32ObjectOrientedDaftarFilm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("==Daftar film sedang tayang==");
        Film f = new Film();
        f.filmName     = "Venom";
        f.filmGenre    = "Action, Horror, Scifi";
        f.filmRating   = 8.5;
        f.filmDuration = 120;
        f.nowPlaying();
        
        
        Film f2 = new Film();
        f2.filmName     = "Small Foot";
        f2.filmGenre    = "Animation";
        f2.filmRating   = 9.0;
        f2.filmDuration = 96;
        f2.nowPlaying();
        
        
        Film f3 = new Film();
        f3.filmName     = "Crazy Rich Asian";
        f3.filmGenre    = "Comedy";
        f3.filmRating   = 7.8;
        f3.filmDuration = 119;
        f3.nowPlaying();
        
        
        Film f4 = new Film();
        f4.filmName     = "Asih";
        f4.filmGenre    = "Horror";
        f4.filmRating   = 6.0;
        f4.filmDuration = 100;
        f4.nowPlaying();
    
    }

    private static package Film {

        private String filmName;
        private String filmGenre;
        private double filmRating;
        private int filmDuration;

        public Film() {
        }

        private void nowPlaying() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
    
}
