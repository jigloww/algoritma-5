import java.util.Scanner;

public class MainNilaiUTS09 {
    public static void main(String[] args) {
        Scanner nga = new Scanner(System.in);

        Mahasiswa[] mahasiswa = {
            new Mahasiswa("Ahmad", 220101001, 2022, 78, 82),
            new Mahasiswa("Budi", 220101002, 2022, 85, 88),
            new Mahasiswa("Cindy", 220101003, 2021, 90, 87),
            new Mahasiswa("Dian", 220101004, 2021, 76, 79),
            new Mahasiswa("Eko", 220101005, 2023, 92, 95),
            new Mahasiswa("Fajar", 220101006, 2020, 88, 85),
            new Mahasiswa("Gina", 220101007, 2023, 80, 83),
            new Mahasiswa("Hadi", 220101008, 2020, 82, 84)
        };

        int n = mahasiswa.length;
        int[] nilaiUTS = new int[n];
        int[] nilaiUAS = new int[n];

        // Memasukkan nilai UTS dan UAS ke dalam array
        for (int i = 0; i < n; i++) {
            nilaiUTS[i] = mahasiswa[i].nilaiUTS;
            nilaiUAS[i] = mahasiswa[i].nilaiUAS;
        }

        NilaiUTS09 hitung = new NilaiUTS09();

        System.out.println("====================================");
        System.out.println("HASIL PERHITUNGAN NILAI MAHASISWA");
        System.out.println("====================================");
        System.out.println("Nilai UTS Tertinggi: " + hitung.maxNilaiUTS(nilaiUTS, 0, n - 1));
        System.out.println("Nilai UTS Terendah: " + hitung.minNilaiUTS(nilaiUTS, 0, n - 1));
        System.out.printf("Rata-rata Nilai UAS: %.2f\n", hitung.hitungRataUAS(nilaiUAS));
        System.out.println("====================================");

    }
}

