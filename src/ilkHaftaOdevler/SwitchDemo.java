package ilkHaftaOdevler;

public class SwitchDemo {

	public static void main(String[] args) {
		char grade = 'A';
		switch (grade) {
		case 'A' :
			System.out.println("Mukemmel : Gectiniz");
			break;
		case 'B' :
			System.out.println("Cok Guzel : Gectiniz");
		case 'C' :
			System.out.println("Iyi : Gectiniz");
			break;
		case 'D' :
			System.out.println("Fena Degil : Gectiniz");
			break;
		case 'F' : 
			System.out.println("Maalesef Kaldınız");
			break;
		default :
				System.out.println("Gecersiz Not Girdiniz");
		}

	}

}
