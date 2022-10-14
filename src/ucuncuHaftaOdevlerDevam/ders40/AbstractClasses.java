package ucuncuHaftaOdevlerDevam.ders40;

public class AbstractClasses {

	public static void main(String[] args) {
	/*WomanGameCalculator womanGameCalculator = new WomanGameCalculator();
	womanGameCalculator.hesapla();
	womanGameCalculator.gameOver(); */
		
		GameCalculator[] gameCalculators = new GameCalculator[] {new ManGameCalculator(), new WomanGameCalculator(), new KidsGameCalculator(), new OlderGameCalculator()};
		for(GameCalculator gameCalculator : gameCalculators) {
			gameCalculator.hesapla();
			gameCalculator.gameOver();
			System.out.println("--------------");
		}

	}

}
