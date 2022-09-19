package reCapDemo1;

public class Main {

	public static void main(String[] args) {
		int sayi1 = 26;
		int sayi2 = 25;
		int sayi3 = 30;
		
		int enBuyuk = sayi1;

		if(sayi2 > enBuyuk) {
			enBuyuk = sayi2;
			
		}
		else if(sayi3 > enBuyuk) {
			enBuyuk = sayi3;
			
		}
		
		System.out.println(enBuyuk);

	}

}
