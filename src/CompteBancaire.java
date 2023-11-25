import java.util.ArrayList;
import java.util.List;

/**
 * Created by Desnyder Rémi
 * Date: 25/11/2023
 */

public class CompteBancaire {
    private String numeroCompte;
    private String titulaire;
    private double solde;
    private List<String> historiqueTransactions;

    // Constructeur
    public CompteBancaire(String numeroCompte, String titulaire) {
        this.numeroCompte = numeroCompte;
        this.titulaire = titulaire;
        this.solde = 0.0;
        this.historiqueTransactions = new ArrayList<>();
    }

    // Méthode pour effectuer un dépôt
    public void deposer(double montant) {
        solde += montant;
        historiqueTransactions.add("Dépôt de " + montant + "€");
    }

    // Méthode pour effectuer un retrait
    public void retirer(double montant) {
        if (montant <= solde) {
            solde -= montant;
            historiqueTransactions.add("Retrait de " + montant + "€");
        } else {
            System.out.println("Solde insuffisant");
        }
    }

    // Méthode pour consulter le solde
    public double consulterSolde() {
        return solde;
    }

    // Méthode pour afficher l'historique des transactions
    public void afficherHistorique() {
        for (String transaction : historiqueTransactions) {
            System.out.println(transaction);
        }
    }
}