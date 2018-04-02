package latihan02;

public class Jajargenjang {
        double alas;
        double tinggi;

    public Jajargenjang() {
        alas = 30;
        tinggi = 20;
    }
        
        void cetakinfo(){
            System.out.println("~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("Alasnya : "+alas);
            System.out.println("Tingginya : "+tinggi);
            System.out.println("");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~");
        }
        
        double hitungluas(){
            double luas;
            luas = alas*tinggi;
            return luas;
        }
        
        void cetakluas(){
            System.out.println("Luas JajarGenjang : "+hitungluas()+" Cm2");
        }
       
    }
