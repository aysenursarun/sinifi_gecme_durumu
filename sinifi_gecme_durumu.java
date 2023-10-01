package sinifi_gecme_durumu;

import java.util.Scanner;

public class sinifi_gecme_durumu {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int derssayisi = 0;
		int toplamnot = 0;

		System.out.print("Matematik notunuzu girin: ");
		int mat = scan.nextInt();

		if (mat < 0 || mat > 100) {
			System.out.println("Geçersiz not girdiğinizden değerlendirmeye alınmayacak.");
		} else {
			derssayisi++;
			toplamnot += mat;
		}

		System.out.print("Fizik notunuzu girin: ");
		int fizik = scan.nextInt();

		if (fizik < 0 || fizik > 100) {
			System.out.println("Geçersiz not girdiğinizden değerlendirmeye alınmayacak.");
		} else {
			derssayisi++;
			toplamnot += fizik;
		}

		System.out.print("Türkçe notunuzu girin: ");
		int turkce = scan.nextInt();

		if (turkce < 0 || turkce > 100) {
			System.out.println("Geçersiz not girdiğinizden değerlendirmeye alınmayacak.");
		} else {
			derssayisi++;
			toplamnot += turkce;
		}

		System.out.print("Kimya notunuzu girin: ");
		int kimya = scan.nextInt();

		if (kimya < 0 || kimya > 100) {
			System.out.println("Geçersiz not girdiğinizden değerlendirmeye alınmayacak.");
		} else {
			derssayisi++;
			toplamnot += kimya;
		}

		System.out.print("Müzik notunuzu girin: ");
		int muzik = scan.nextInt();

		if (muzik < 0 || muzik > 100) {
			System.out.println("Geçersiz not girdiğinizden değerlendirmeye alınmayacak.");
		} else {
			derssayisi++;
			toplamnot += muzik;
		}

		int ort = toplamnot / derssayisi;

		if (ort >= 55) {
			System.out.println("Ortalamanız: " + ort + "Sınıfı geçtiniz.");
		} else {
			System.out.println("Ortalamanız: " + ort + "Sınıfta kaldınız.");
		}

	}

}
