import java.util.Scanner;
public class random {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double nMtk, nIndo, nInggris, nIPA;
        System.out.print("Masukkan Nilai Matematika: ");
        nMtk = scanner.nextDouble();
        System.out.print("Masukkan Nilai Bahasa Indonesia: ");
        nIndo = scanner.nextDouble();
        System.out.print("Masukkan Nilai Bahasa Inggris: ");
        nInggris = scanner.nextDouble();
        System.out.print("Masukkan Nilai IPA: ");
        nIPA = scanner.nextDouble();

        double rataRata = (nMtk + nIndo + nInggris + nIPA) / 4;

        System.out.println("Nilai Rata-Rata: " + rataRata);
        
        if (rataRata >= 75) {
            System.out.println("CIE...LULUS REKKK, SELAMETAN KONO");
        } else {
            System.out.println("INI BUKAN SALAH KAMU, TAPI KALIAN YANG GAK NGASIH SAYA UANG JADINYA KAGAK LULUS");
        }
        scanner.close();}
}
