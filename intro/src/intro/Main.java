package intro;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello world");
		
		String ortaMetin = "Ýlginizi Çekebilir";
		String altMetin = "Vade Süresi";
		
		System.out.println(ortaMetin);
		
		int vade = 12;
		
		double dolarDun = 18.25;
		double dolarBugun = 18.30;
		
		boolean dolarDustuMu = false;
		
		String okYonu = "";
		
		if(dolarDun>dolarBugun) {
			okYonu = "down.svg";
			System.out.println(okYonu);
		}
		else if (dolarDun<dolarBugun){
			okYonu = "up.svg";
			System.out.println(okYonu);
		}
		else {
			okYonu = "equal.svg";
			System.out.println(okYonu);
		}
		
		String[] krediler = {"Hýzlý kredi", "Maaþýný Halkbanktan","Mutlu Emekli"};
		
		for(String kredi:krediler) {
			System.out.println(kredi);
		}
		
		
		
		
	}

}
