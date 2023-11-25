
public class Main {
    public static void main(String[] args) {
        GestionnaireComptes gestionnaire = new GestionnaireComptes();

        gestionnaire.creerCompte("123456", "John Doe");
        gestionnaire.creerCompte("789012", "Jane Smith");

        CompteBancaire compteJohn = gestionnaire.getCompte("123456");
        CompteBancaire compteJane = gestionnaire.getCompte("789012");

        compteJohn.deposer(1000);
        compteJohn.retirer(200);

        compteJane.deposer(500);

        System.out.println("Solde de John Doe : " + compteJohn.consulterSolde());
        System.out.println("Solde de Jane Smith : " + compteJane.consulterSolde());

        System.out.println("\nHistorique de John Doe :");
        compteJohn.afficherHistorique();

        System.out.println("\nHistorique de Jane Smith :");
        compteJane.afficherHistorique();
    }
}