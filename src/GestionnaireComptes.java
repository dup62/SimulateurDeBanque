/**
 * Created by Desnyder Rémi
 * Date: 25/11/2023
 */

import java.util.HashMap;
import java.util.Map;

public class GestionnaireComptes {
    private Map<String, CompteBancaire> comptes;

    public GestionnaireComptes() {
        this.comptes = new HashMap<>();
    }

    // Méthode pour créer un nouveau compte
    public void creerCompte(String numeroCompte, String titulaire) {
        CompteBancaire nouveauCompte = new CompteBancaire(numeroCompte, titulaire);
        comptes.put(numeroCompte, nouveauCompte);
        System.out.println("Nouveau compte créé pour " + titulaire + " avec le numéro " + numeroCompte);
    }

    // Méthode pour obtenir un compte par numéro de compte
    public CompteBancaire getCompte(String numeroCompte) {
        return comptes.get(numeroCompte);
    }

}
