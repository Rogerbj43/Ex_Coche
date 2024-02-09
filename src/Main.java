import java.util.Objects;
import java.util.Scanner;

public class Main {

    /* TODO:
        - Menú
        - Donar de alta nous clients Roger
        - Donar de alta nous mecànics
        - Introduir vehicle
        - Fitxa de reparació
        - Poder modificar reparacións
     */

    public static String[][] reparacio = new String[100][3];
    public static String[][] clients = new String[100][2];
    public static String[][]  arrayVehicles= new String[100][3];
    public static String[][] mecanic= new String[100][3];
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
    //Tot ok


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


    public static String[][] clients() {
        Scanner input = new Scanner(System.in);

        boolean correcto = false;
        String regex = "\\d{8}[A-z]";

        do {
            System.out.println("Indique el DNI a añadir:");
            String DNI = input.next();

            for (int i = 0; i < 100; i++) {
                if (clients[i][0] == DNI) {
                    System.out.println("Aquest DNI ja està afegit");
                } else if (clients[i][0] == null && DNI.matches(regex)) {
                    System.out.println("Dni añadido correctamente");
                    clients[i][0] = DNI;
                    correcto = true;
                    break;

                } else if (i == 99) {
                    System.out.println("El valor no es correcto");
                    break;
                }
            }
        } while (!correcto);
        correcto = false;
        do {
            System.out.println("Indique el nombre del correspondiente DNI: ");
            String nom= input.next();
            for (int i=0; i<100; i++) {
                if (nom == "NULL") {
                    System.out.println("El nom no pot estar buit");
                    break;
                } else if (clients[i][1]==null){
                    System.out.println("Tot correcte");
                    clients[i][1]=nom;
                    correcto = true;
                    break;
                }
            }

        } while (!correcto);

    return clients;
    }

    public static String[][] reparacions() {

        Scanner input = new Scanner(System.in);

//matricula dni nom


        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                System.out.println(reparacio[i][j] + "     ");
            }
            System.out.print("\n");
        }

        System.out.println("Introdueix la matrícula a acutalitzar: ");
        String matricula = input.next();
        for (int i = 0; i < 100; i++) {
            if (arrayVehicles[i][0] == matricula) {
                if (arrayVehicles[i][2] == "Oberta") {
                    for (int x = 0; x < 100; x++) {
                        if (mecanic[x][2] == "lliure" || mecanic[x][2] == "Lliure") {
                            System.out.println("El mecanic " + mecanic[x][0] + " s'encarregarà de la reparació");
                            reparacio[i][1] = mecanic[x][0];
                            reparacio[i][2] = "En curs";
                            mecanic[x][2] = "Ocupat";
                        } else if (x == 99) {
                            System.out.println("Cap mecànic disponible ");
                        }
                    }
                } else if (arrayVehicles[i][0] == null) {
                    reparacio[i][0] = matricula;
                    for (int x = 0; x < 100; x++) {
                        if (mecanic[x][2] == "lliure" || mecanic[x][2] == "Lliure") {
                            System.out.println("El mecanic " + mecanic[x][0] + " s'encarregarà de la reparació");
                            reparacio[i][1] = mecanic[x][0];
                            reparacio[i][2] = "En curs";
                            mecanic[x][2] = "Ocupat";
                        } else if (x == 99) {
                            System.out.println("Ara mateix no hi ha cap mecànic disponible ");
                            reparacio[i][2] = "Oberta";
                        }
                    }
                }
            }



        }
        return reparacio;
    }

    public static void main(String[]args) {
        int menuItem;
        String[][] clients = new String[100][2];
        String[][] reparacio = new String[100][2];

        do {
            menuItem = Menu();

            switch (menuItem) {

                case 1:
                    clients();

                    for (int i = 0; i < 100; i++) {
                        for (int j = 0; j < 2; j++) {
                            if (clients[i][j]==null){
                                    break;
                            }else {
                                System.out.print(clients[i][j] + "   ");
                            }
                        }
                        if (clients[i][0]==null) {
                            break;

                        }
                        System.out.print("\n");
                    }
                    break;
                case 2:
                case 3:
                    nousVehicles();
                    break;
                case 4:
                    reparacions();
                    break;
                case 5:
                default:
                    break;
            }

        }while(menuItem!=5);
    }
}