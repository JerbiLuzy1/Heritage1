
public class Vehicule {
	
	private String marque ;
	private int prix ;
	
	
	
	public Vehicule (String marque , int prix) {
		
		this.marque = marque ;
		this.prix = prix ;
	}
	
	
	public void accélerer () {
		
		System.out.println("la voiture accélere");
	}
	
	public void arreter () {
		
		System.out.println("la voiture est en arret");
	}
	
	
	
	public String getMarque() {
		
		return marque;
	}
	public void setMarque(String marque) {
		
		this.marque = marque;
	}
	public int getPrix() {
		
		return prix;
	}
	public void setPrix(int prix) {
		
		this.prix = prix;
	} 
	

}
