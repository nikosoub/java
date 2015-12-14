package exercice;

public class TestBissextile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calendrier c= new Calendrier();
		
		for (int i=2000;i<2020;i++){
			c.setAnnee(i);
			System.out.println("L'année "+c.getAnnee()+" est bissextile? "+c.estBissextile());	
		}
		
	}
}
