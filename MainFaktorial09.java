import java.util.Scanner;
public class MainFaktorial09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai: ");
        int nilai = input.nextInt();

        Faktorial09 fk = new Faktorial09();
        System.out.println("Nilai faktorial " + nilai + " menggunakan BF FOR: " + fk.faktorialBF(nilai));
        System.out.println("Nilai faktorial " + nilai + " menggunakan DC: " + fk.faktorialDC(nilai));
        System.out.println("Nilai faktorial " + nilai + " menggunakan BF WHILE: " + fk.faktorialBFWhile(nilai));
        
    }
    
}
