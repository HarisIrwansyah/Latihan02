package latihan02;

public class JajargenjangAksi {
    public static void main(String[] args) {
        
        Jajargenjang j1 = new Jajargenjang();
            j1.alas = 20;
            j1.tinggi= 12;
            
            j1.cetakinfo();
            System.out.println("Luas Jajargenjang : "+j1.hitungluas()+" Cm2");
            System.out.println("");
    }
}
