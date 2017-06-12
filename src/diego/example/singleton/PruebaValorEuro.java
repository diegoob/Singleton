package diego.example.singleton;

public class PruebaValorEuro {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		EuroConvert.getInstance().setValorEuro((float)166.386);
		
		int pesetas = 1000;
		
		double euros = EuroConvert.getInstance().convert(pesetas);
		
		System.out.println("Valor del euro = " + EuroConvert.getInstance().getValorEuro());
		System.out.println("Valor de la conversion = " + euros);		
		

	}

}
