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

    public static String[][] clients() {
        Scanner input = new Scanner(System.in);
        String[][] clients = new String[100][2];
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

    public static String[][] reparacions(String[][] arrayVehicles, String[][] mecanic) {
        String[][] reparacio = new String[100][2];
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
        String[][] reparacio = new String[100][3];

        do {
            menuItem = Menu();

            switch (menuItem) {
                case 1:
                    clients = clients();

                    for (int i = 0; i < 100; i++) {
                        for (int j = 0; j < 2; j++) {
                            System.out.print(clients[i][j] + "   ");
                        }
                        System.out.print("\n");
                    }
                    break;
                case 2:
                case 3:
                case 4:
                    reparacio=reparacions();
                case 5:
                default:
                    break;
            }

        }while(menuItem!=5);
    }
}