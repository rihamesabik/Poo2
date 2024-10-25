package src;

public class Banque {
private CompteBancaire[] comptes;
private static int  nombreComptes=0 ;
public Banque(int tailleMax){
	 this.comptes = new CompteBancaire[tailleMax]; 
}
public void ajouterCompte(CompteBancaire compte) {
	if (nombreComptes<comptes.length) {
		comptes[nombreComptes]=compte;
		nombreComptes++;
		System.out.println("le compte ajouté avec succés");
	}
	else {
		System.out.println("Impossible d'ajouter plus de comptes");
	}
}
public CompteBancaire chercherCompte(String numeroCompte) {
	for(int i =0;i<nombreComptes;i++) {
		if (comptes[i].getNumeroCompte().equals(numeroCompte)) {
			return comptes[i];
		}
	}
	return null;
}
public void transfert(String numeroSource,String numeroDest,double montant) {
	CompteBancaire compteSource= chercherCompte(numeroSource);
	CompteBancaire compteDest= chercherCompte(numeroDest);
	if(compteSource !=null && compteDest != null) {
		if(compteSource.getSolde()>=montant) {
			compteSource.retirer(montant);
			compteDest.deposer(montant);
			System.out.println("Transfert de " + montant + " effectué avec succès");
		}
		else {
			System.out.println("solde insuffisant");
		}
		System.out.println("l'un des comptes n'existe pas");
	}
	
}
public static void afficherNombreComptes() {
    System.out.println("Nombre total de comptes bancaires : " + nombreComptes);
}
}
