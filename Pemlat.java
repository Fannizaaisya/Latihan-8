package latihan8;

public class Pemlat implements D1,I1 {
    
    @Override
    public void methodD1(){
        System.out.println("Nilai yg anda masukkan termasuk kelas integer");
    }
    
    @Override
    public void methodI1(){
        System.out.println("Nilai yg anda masukkan termasuk kelas double");
    }
    
}
