
public class Main {

	public static void main(String[] args) {

		
		Voiture voiture = new Voiture ("BMW" , 10000) ;
		
	    voiture.accélerer();
	    voiture.arreter();
	    
	    voiture.setMarque("Mercedes");
	    System.out.println(voiture.getMarque());
		
		
		
		
	}

}
