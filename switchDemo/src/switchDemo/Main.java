package switchDemo;

public class Main {

	public static void main(String[] args) {
		
		char grade = 'A';
		
		switch(grade) {
		case 'A':
			System.out.println("M�kemmel not : Ge�tiniz");
			break;
		case 'B':
		case 'C':
			System.out.println("�yi : Ge�tiniz");
			break;
		case 'D':
			System.out.println("Fena de�il : Ge�tiniz");
		case 'F':
			System.out.println("Maalesef Kald�n�z");
			break;
		default:
			System.out.println("Ge�ersiz Not Girdiniz");
			
		}

	}

}
