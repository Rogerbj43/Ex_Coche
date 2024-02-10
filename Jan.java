import java.util.Scanner;

public class Jan {

    public static String[][] clients() {

        String[][] clients = new String[100][3];
        return clients;
    }

    public static void main(String[] args) {
        String[][] mecanics = clients();
        Scanner scanner = new Scanner(System.in);
        int dades = 0;

        while (true) {
            System.out.println("Introdueix el número d'empleat que ha de ser de 6 digits ");
            String numeroEmpleat = scanner.nextLine();

            if ("sortir".equalsIgnoreCase(numeroEmpleat)) {
                break;
            }

            if (!numeroEmpleat.matches("\\d{6}")) {
                System.out.println("Error: El numero ha de ser se 6 digits");
                continue;
            }

            boolean numeroExisteix = false;
            for (int i = 0; i < dades; i++) {
                if (mecanics[i][0].equals(numeroEmpleat)) {
                    numeroExisteix = true;
                    break;
                }
            }

            if (numeroExisteix) {
                System.out.println("Error: Aquet numero de mecanic ja existeix.");
                continue;
            }

            System.out.println("Introdueix el nom del mecanic:");
            String nom = scanner.nextLine();

            System.out.println("Introdueix si el mecanic està Lliure o ocupat?");
            String estat = scanner.nextLine();

            mecanics[dades][0] = numeroEmpleat;
            mecanics[dades][1] = nom;
            mecanics[dades][2] = estat;
            dades++;

            System.out.println("Mecanic afegit correctament!");
        }

        System.out.println("Llista de mecànics registrats:");
        for (int i = 0; i < dades; i++) {
            System.out.println("Número d'empleat: " + mecanics[i][0] + ", Nom: " + mecanics[i][1] + ", Estat: " + mecanics[i][2]);
        }
    }
}