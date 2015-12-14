package exercice;

public class Calendrier {

	private int annee;

	public int getAnnee() {
		return annee;
	}

	public void setAnnee(int annee) {
		this.annee = annee;
	}
	public Calendrier() {
		// TODO Auto-generated constructor stub
	}

	public Calendrier(int a){
		this.annee=a;	
	}

	public boolean estBissextile(){

		if (this.annee%4==0){

			if ((this.annee%400!=0)&&(this.annee%100==0)){
				return false;
			}
			else{		
				return true;
			}					
		}
		else{
			return false;
		}

	}
}