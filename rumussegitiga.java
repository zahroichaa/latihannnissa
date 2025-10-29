import java.util.Scanner;
public class rumussegitiga {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nRumus Segitiga\n");

        System.out.print("\nMasukkan alas segitiga: ");
        double alas = scanner.nextDouble();

        System.out.print("Masukkan tinggi segitiga: ");
        double tinggi = scanner.nextDouble();

        System.out.print("Masukkan sisi A: ");
        double a = scanner.nextDouble();

        System.out.print("Masukkan sisi B: ");
        double b = scanner.nextDouble();

        System.out.print("Masukkan sisi C: ");
        double c = scanner.nextDouble();

        double luas = 0.5 * alas * tinggi;
        double keliling = a + b + c;

        System.out.println("Hasil Perhitungan:");
        System.out.println("Alas:" + alas);
        System.out.println("Tinggi:" + tinggi);
        System.out.println("Sisi A:" + a);
        System.out.println("Sisi B:" + b);
        System.out.println("Sisi C:" + c);
        System.out.println("\nLuas Segitiga: " + luas);
        System.out.println("Keliling Segitiga: " + keliling);
    }
}