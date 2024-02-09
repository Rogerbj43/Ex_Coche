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
        int numClientes=0;
        boolean correcto = false;
        String regex = "\\d{8}[A-z]";

        do {
            System.out.println("Indique el DNI a añadir:");
            String DNI = input.next();

            for (int i = 0; i < 100; i++) {
                if (clients[i][0] == DNI) {
                    System.out.println("Aquest DNI ja està afegit");
                } else if (i == 99 && DNI.matches(regex)) {
                    System.out.println("Dni añadido correctamente");
                    clients[numClientes][0] = DNI;
                    correcto = true;

                } else if (i == 99) {
                    System.out.println("El valor no es correcto");
                    break;
                }
            }
        } while (!correcto);
        correcto = false;
        do {
            System.out.println("Indique el nombre del correspondiente DNI: ");
            clients[numClientes][1] = input.next();
            if (clients[numClientes][1] == "NULL") {
                System.out.println("El nom no pot estar buit");
            } else {
                System.out.println("Tot correcte");

                correcto = true;
            }

        } while (!correcto);
        numClientes++;
    return clients;
    }

    public static String[][] reparacions(String[][] ArrayVehicles, String[][] numeros){
        String[][] reparacio=new String[100][2];



        return reparacio;
    }

    public static void main(String[] args) {
        int menuItem = Menu();
        String[][] clients = new String[100][2];
        String[][] reparacio = new String[100][2];

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