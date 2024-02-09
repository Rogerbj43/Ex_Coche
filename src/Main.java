import java.util.Objects;
import java.util.Scanner;

public class Main {

    /* TODO:
        - Menú
        - Donar de alta nous clients Roger
        - Donar de alta nous mecànics
        - Introduir vehicle
        - Ftitxa de reparació
        - Poder modificar reparacións
     */
    public static String[][] arrayVehicles = new String[100][3];
    public static int Menu() {
        Scanner input = new Scanner(System.in);

        int menuItem = 0;

        System.out.println("TALLER DE REPARACIÓ DE VEHICLES");
        System.out.println("[1] Donar d’alta nou client");
        System.out.println("[2] Donar d’alta nou mecànic");
        System.out.println("[3] Introduir nou vehicle");
        System.out.println("[4] Crear fitxa de nova reparació");
        System.out.println("[5] Sortir");
        System.out.println("Sel·lecciona una opció: ");

        if (input.hasNextInt()) {
            menuItem = input.nextInt();

        }

        return menuItem;
    }

    public static void nousVehicles() {
        Scanner input = new Scanner(System.in);

        boolean correcte = false;

        int emptyRow = -1;
        for (int i = 0; i < arrayVehicles.length; i++) {
            if (Objects.equals(arrayVehicles[i][0], null)) { // Solo comprobar la matrícula es suficiente
                emptyRow = i;
                break;
            }
        }

        if (emptyRow == -1) {
            System.out.println("ERROR: No hi ha espai per a més vehicles.");
            return; // Salir si no hay espacio
        }

        System.out.println("Donar d'alta un nou vehicle - ");

        String matricula = "";
        System.out.println("Donam la matricula del teu vehicle: ");
        do {
            matricula = input.nextLine();

            boolean matriculaCorrecte = matricula.matches("[0-9]{4}+[A-Z]{3}");

            if (matriculaCorrecte) {
                correcte = true;
                arrayVehicles[emptyRow][0] = matricula;

            } else {
                System.out.println("ERROR, torna a introduïr");
            }
        } while (!correcte);

        correcte = false;

        String dni = "";
        System.out.println("Donam el teu DNI: ");
        do {

            dni = input.nextLine();
            boolean dniCorrecte = dni.matches("[0-9]{8}+[A-Z]");

            if (dniCorrecte) {
                correcte = true;
                arrayVehicles[emptyRow][1] = dni;
            } else {
                System.out.println("ERROR, torna a introduïr");
            }
        } while (!correcte);

        correcte = false;

        String nom = "";
        System.out.println("Donam el teu nom: ");
        nom = input.nextLine();
        arrayVehicles[emptyRow][2] = nom;

        for (int i = 0; i < arrayVehicles.length; i++) {
            if (arrayVehicles[i][0] != null) { // Mostrar solo filas con datos
                System.out.println("Vehicle " + (i + 1) + ": Matrícula: " + arrayVehicles[i][0] + ", DNI: " + arrayVehicles[i][1] + ", Nom: " + arrayVehicles[i][2]);
            }
        }
    }
        /*System.out.println(arrayVehicles[0][0]);
        System.out.println(arrayVehicles[1][0]);*/


    public static void main(String[] args) {
        int menuItem;
        String[][] clients = new String[100][2];
        String[][] reparacio = new String[100][2];

        do {
            menuItem = Menu();

            switch (menuItem) {
                /*case 1:
                    clients = clients();

                    for (int i = 0; i < 100; i++) {
                        for (int j = 0; j < 2; j++) {
                            System.out.print(clients[i][j] + "   ");
                        }
                        System.out.print("\n");
                    }
                    break;
                case 2:
                */
                case 3:
                    nousVehicles();
                    break;
                case 4:


                case 5:
                default:
                    break;
            }

        }while(menuItem!=5);
    }
}