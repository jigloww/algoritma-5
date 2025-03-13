class NilaiUTS09 {
    int maxNilaiUTS(int[] uts, int l, int r) {
        if (l == r) {
            return uts[l]; 
        }

        int mid = (l + r) / 2;
        int maxKiri = maxNilaiUTS(uts, l, mid);
        int maxKanan = maxNilaiUTS(uts, mid + 1, r);

        return Math.max(maxKiri, maxKanan);
    }

    int minNilaiUTS(int[] uts, int l, int r) {
        if (l == r) {
            return uts[l]; 
        }

        int mid = (l + r) / 2;
        int minKiri = minNilaiUTS(uts, l, mid);
        int minKanan = minNilaiUTS(uts, mid + 1, r);

        return Math.min(minKiri, minKanan);
    }

    double hitungRataUAS(int[] uas) {
        int total = 0;
        for (int nilai : uas) {
            total += nilai;
        }
        return (double) total / uas.length;
    }
}

class Mahasiswa {
    String nama;
    int nim;
    int tahunMasuk;
    int nilaiUTS;
    int nilaiUAS;

    Mahasiswa(String nama, int nim, int tahunMasuk, int nilaiUTS, int nilaiUAS) {
        this.nama = nama;
        this.nim = nim;
        this.tahunMasuk = tahunMasuk;
        this.nilaiUTS = nilaiUTS;
        this.nilaiUAS = nilaiUAS;
    }
}

