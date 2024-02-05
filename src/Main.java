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

    public static int Menu(){
        Scanner input = new Scanner(System.in);

        int menuItem = 0;
        do {
            System.out.println("TALLER DE REPARACIÓ DE VEHICLES");
            System.out.println("[1] Donar d’alta nou client");
            System.out.println("[2] Donar d’alta nou mecànic");
            System.out.println("[3] Introduir nou vehicle");
            System.out.println("[4] Crear fitxa de nova reparació");
            System.out.println("[5] Sortir");
            System.out.println("Sel·lecciona una opció: ");

            if (input.hasNextInt()){
                menuItem = input.nextInt();

            }

        } while(menuItem!=5);

        return menuItem;
    }

    public static void clients(){
        String[][] clients=new String[100][2];

    }

    public static void main(String[] args) {
        int menuItem = Menu();
        System.out.println(menuItem);

    }
}