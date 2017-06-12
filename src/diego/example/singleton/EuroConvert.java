package diego.example.singleton;
/**
 * Clase singleton de ejemplo
 * @author Diego
 *
 */
public class EuroConvert {
	
	private static EuroConvert instance = new EuroConvert();
	
	private float valorEuro;
	
	private EuroConvert(){
		
	}
	
	public static EuroConvert getInstance(){
		return instance;
	}
	
	public double convert(int pts){
		double result = 0;
		if (this.valorEuro != 0){
			result = pts / this.valorEuro;
		}
		
		return result;
	}

	public float getValorEuro() {
		return valorEuro;
	}

	public void setValorEuro(float valorEuro) {
		this.valorEuro = valorEuro;
	}

	

}
