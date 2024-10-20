import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan yaş girişi alma
        System.out.print("Lütfen yaşınızı girin: ");
        int age = scanner.nextInt();

        // If-Else yapısı ile yaş kontrolü
        if (age >= 18) {
            System.out.println("Yetişkinsiniz.");
        } else if (age >= 13) {
            System.out.println("Gençsiniz.");
        } else {
            System.out.println("Çocuksunuz.");
        }

        // Başka bir örnek - not kontrolü
        System.out.print("Lütfen notunuzu girin: ");
        int grade = scanner.nextInt();

        if (grade >= 90) {
            System.out.println("Aldığınız not: A");
        } else if (grade >= 80) {
            System.out.println("Aldığınız not: B");
        } else if (grade >= 70) {
            System.out.println("Aldığınız not: C");
        } else if (grade >= 60) {
            System.out.println("Aldığınız not: D");
        } else {
            System.out.println("Aldığınız not: F (Kaldınız)");
        }

        // Scanner'ı kapatma
        scanner.close();
    }
}