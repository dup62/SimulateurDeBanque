package utils;

/**
 * Created by Desnyder Rémi
 * Date: 25/11/2023
 */

public class ConsoleUtils {

    // Codes ANSI pour la couleur du texte
    public static final String RESET = "\u001B[0m";
    public static final String BLACK = "\u001B[30m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String PURPLE = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";
    public static final String WHITE = "\u001B[37m";

    // Codes ANSI pour les styles de texte
    public static final String BOLD = "\u001B[1m";
    public static final String UNDERLINE = "\u001B[4m";

    // Méthode pour afficher du texte colorisé avec un style
    public static void printColoredText(String text, String color, String style) {
        System.out.print(style + color + text + RESET);
    }

    // Méthode pour afficher un icône avec une couleur spécifique
    public static void printIcon(String icon, String color) {
        System.out.print(color + icon + RESET);
    }

    // Exemples d'icônes
    public static final String INFO_ICON = "\u24D8";  // Utilisez un caractère Unicode approprié pour "i" (par exemple, un cercle avec un point au centre)
    public static final String CROSS_ICON = "\u2717";  // Utilisez un caractère Unicode approprié pour une croix

    public static void main(String[] args) {
        // Exemple d'utilisation
        printColoredText("Ceci est un message d'information.", BLUE, BOLD);
        System.out.println();  // Saut de ligne

        printIcon(INFO_ICON, GREEN);
        System.out.println(" Opération réussie!");

        printIcon(CROSS_ICON, RED);
        System.out.println(" Erreur lors de l'opération.");
    }
}
