import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Bitte gebe das Geschlecht des Kindes an (M/W): ");
        Scanner scan = new Scanner(System.in);
        String geschlecht = scan.next();


        System.out.println("Bitte gebe das Alter des Kindes an: ");
        int alter = scan.nextInt();

        System.out.println(geschlecht.toUpperCase());


        System.out.println(auswahlGeschaenk(geschlecht, alter));
        System.exit(0);

    }
    private static String auswahlGeschaenk(String geschlecht, int alter) {
        String ergebnis = "";
        if (geschlecht.toUpperCase().equals("M")) {
            if (alter <= 0) {
                ergebnis = "Dieses Alter ist nicht korrekt!";
            } else if (alter <= 4 && alter >= 0) {
                ergebnis = "Du kannst dem Kind ein Kinderpuzzle schenken.";
            } else if (alter <= 6 && alter >= 4) {
                ergebnis = "Du kannst dem Kind ein Fernrohr schenken.";
            } else if (alter <= 8 && alter >= 6) {
                ergebnis = "Du kannst dem Kind VBucks schenken.";
            } else if (alter <= 12 && alter >= 8) {
                ergebnis = "Du kannst dem Kind viele VBucks schenken.";
            } else if (alter <= 14 && alter >= 12) {
                ergebnis = "Du kannst dem Kind einen Computer schenken, um Fortnite zu spielen.";
            } else if (alter <= 18 && alter >= 14) {
                ergebnis = "Du kannst dem Kind eine DJI Drohne schenken.";
            } else if (alter >= 18) {
                ergebnis = "Das \"Kind\" ist nun Volljährig und kann sich selber beschenken!!";
            } else {
                ergebnis = "Dieses Alter ist nicht korrekt!";
            }
        } else if (geschlecht.toUpperCase().equals("W")) {
            if (alter <= 0) {
                ergebnis = "Dieses Alter ist nicht korrekt!";
            } else if (alter <= 4 && alter >= 0) {
                ergebnis = "Du kannst dem Kind ein Kinderpuzzle schenken.";
            } else if (alter <= 6 && alter >= 4) {
                ergebnis = "Du kannst dem Kind ein Fernrohr schenken.";
            } else if (alter <= 8 && alter >= 6) {
                ergebnis = "Du kannst dem Kind VBucks schenken.";
            } else if (alter <= 12 && alter >= 8) {
                ergebnis = "Du kannst dem Kind ein Farrad schenken.";
            } else if (alter <= 14 && alter >= 12) {
                ergebnis = "Du kannst dem Kind eine Zimmerpflanze schenken.";
            } else if (alter <= 18 && alter >= 14) {
                ergebnis = "Du kannst dem Kind ein iPhone schenken.";
            } else if (alter >= 18) {
                ergebnis = "Das \"Kind\" ist nun Volljährig und kann sich selber beschenken!!";
            } else {
                ergebnis = "Dieses Alter ist nicht korrekt!";
            }
        } else {
            ergebnis = "Fehler: Ungültiges Geschlecht!";
        }
        return ergebnis;
    }

}