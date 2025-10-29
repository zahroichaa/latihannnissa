import java.util.Scanner;
public class mbohwes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
       while (true) {
        System.out.print("\n hitung keliling segitiga");
        System.out.print("\n\n masukkan sisi a : ");
        double a = scanner.nextDouble();
        System.out.print(" masukkan sisi b : ");
        double b = scanner.nextDouble();
        System.out.print(" masukkan sisi c : ");
        double c = scanner.nextDouble();
        double keliling = a + b + c;
        System.out.println("\n keliling segitiga adalah : " + keliling);
        System.out.print("\n ulangi lagi? (iye/nggawes) : ");
        String jawab = scanner.next();
        if (jawab.equalsIgnoreCase("nggawes")) {
            String pesan = "\n ojok bosen sinau javané, ya!";
            System.out.println(pesan);
            break;
        }
       }
        scanner.close();
    }
}   