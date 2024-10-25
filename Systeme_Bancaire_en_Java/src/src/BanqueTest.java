package src;

public class BanqueTest {
	public static void main(String[] args) {
Banque banque = new Banque(10);
CompteBancaire compte1=new CompteBancaire("b599","rihame",5000);
CompteBancaire compte2=new CompteBancaire("b66","lina",10000);
CompteBancaire compte3=new CompteBancaire("c456","oumnia",300);

banque.ajouterCompte(compte1);
banque.ajouterCompte(compte2);
banque.ajouterCompte(compte3);
compte1.deposer(500);
compte2.retirer(500);
banque.transfert("rihame", "oumnia", 500);
System.out.println("le compte de rihame  "+compte1.getSolde());
System.out.println("le compte de lina "+compte2.getSolde());
System.out.println("le compte de oumnia  "+compte3.getSolde());
Banque.afficherNombreComptes();
        CompteCourant compteCourant1 = new CompteCourant("111111", "riro", 500.0, 200.0);
        CompteCourant compteCourant2 = new CompteCourant("226778", "nana", 1000.0, 300.0);
        CompteEpargne compteEpargne1 = new CompteEpargne("3334636", "lolo", 1500.0, 2.0);
        CompteEpargne compteEpargne2 = new CompteEpargne("4235647", "sami", 2000.0, 3.0);
        banque.ajouterCompte(compteCourant1);
        banque.ajouterCompte(compteCourant2);
        banque.ajouterCompte(compteEpargne1);
        banque.ajouterCompte(compteEpargne2);
        compteCourant1.deposer(200.0);
        compteEpargne1.deposer(300.0);
        compteCourant2.retirer(500.0);
        compteEpargne2.retirer(100.0);
        compteEpargne1.calculerInteret();
        compteEpargne2.calculerInteret();
        System.out.println("Solde final du compte courant 1 : " + compteCourant1.getSolde());
        System.out.println("Solde final du compte courant 2 : " + compteCourant2.getSolde());
        System.out.println("Solde final du compte épargne 1 : " + compteEpargne1.getSolde());
        System.out.println("Solde final du compte épargne 2 : " + compteEpargne2.getSolde());
        compte1.afficherHistorique();
        compte2.afficherHistorique();
}
}