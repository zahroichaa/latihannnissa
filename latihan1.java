import java.util.Scanner;
public class latihan1 {
    public static void main(String[] args) {
        Scanner niss = new Scanner(System.in);

        String[] nama = new String[3];
        double[] nilai = new double[3];

        int jumlahMahasiswaLulus = 0;
        int jumlahMahasiswaTidakLulus = 0;

        boolean dataTersedia = false;
        boolean ulang = true;

        while (ulang) {
            System.out.println("Menu Program");
            System.out.println("1. Input Data Mahasiswa");
            System.out.println("2. Tampilkan Data Mahasiswa");
            System.out.println("3. Hitung Jumlah Mahasiswa Lulus dan Tidak Lulus");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu (1-4): ");
            int menu = niss.nextInt();
            niss.nextLine();

            switch (menu) {
                case 1:
                    for (int i = 0; i < 3; i++) {
                        System.out.print("Masukkan nama mahasiswa ke-" + (i + 1) + ": ");
                        nama[i] = niss.nextLine();
                        System.out.print("Masukkan nilai akhir: ");
                        nilai[i] = niss.nextDouble();
                        niss.nextLine();
                    }
                    dataTersedia = true;
                    break;

                case 2:
                    if (!dataTersedia) {
                        System.out.println("Data mahasiswa belum tersedia.");
                    } else {
                        System.out.println("Data Mahasiswa:");
                        for (int i = 0; i < 3; i++) {
                            System.out.println((i + 1) + ". Nama : " + nama[i]);
                            System.out.println("   Nilai Akhir: " + nilai[i]);
                        }
                    }
                    break;

                case 3:
                    if (!dataTersedia) {
                        System.out.println("Data belum tersedia. Silakan input di menu 1.");
                    } else {
                        jumlahMahasiswaLulus = 0;
                        jumlahMahasiswaTidakLulus = 0;

                        for (int i = 0; i < 3; i++) {
                            if (nilai[i] >= 60) {
                                jumlahMahasiswaLulus++;
                            } else {
                                jumlahMahasiswaTidakLulus++;
                            }
                        }

                        System.out.println("Hasil:");
                        System.out.println("Jumlah Mahasiswa Lulus: " + jumlahMahasiswaLulus);
                        System.out.println("Jumlah Mahasiswa Tidak Lulus: " + jumlahMahasiswaTidakLulus); 
                    }
                    break;
                        
                case 4:
                    ulang = false;
                    System.out.println("Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }

            if (ulang) {
                System.out.print("Kembali ke menu utama? (ya/tidak): ");
                String jawab = niss.nextLine();
                if (!jawab.equalsIgnoreCase("ya")) {
                    ulang = false;
                    System.out.println("Program selesai.");
                }
            }

        }

        niss.close();
    }
}
