package src;

public class CompteEpargne extends CompteBancaire {
private double tauxInteret;
public CompteEpargne(String numeroCompte, String titulaire, double solde, double tauxInteret) {
    super(numeroCompte, titulaire, solde); 
    this.tauxInteret = tauxInteret;      
}
public void calculerInteret() {
	double interet =(this.getSolde() *tauxInteret /100);
	setSolde(this.getSolde()+interet);
	System.out.println("interet"+interet+"le solde apres les interets"+this.getSolde());
	}
public double getTauxInteret() {
    return tauxInteret;
}

public void setTauxInteret(double tauxInteret) {
    this.tauxInteret = tauxInteret;
}
}
