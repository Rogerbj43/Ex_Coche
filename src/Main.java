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

    public static String[][] clients(){
        Scanner input = new Scanner(System.in);
        String[][] clients= {{"47174402J"},{"Lluís"},
                {"74174402S"},{"Antoniu"},
                {"74574402Z"},{"Maria"},
                {"0"},{"0"},
                {"0"},{"0"},
                {"0"},{"0"},
                {"0"},{"0"},
                {"0"},{"0"},
                {"0"},{"0"},
                {"0"},{"0"},
                {"0"},{"0"},
                {"0"},{"0"},
                {"0"},{"0"},
                {"0"},{"0"},
                {"0"},{"0"},
                {"0"},{"0"},
                {"0"},{"0"},
                {"0"},{"0"},
                {"0"},{"0"},
                {"0"},{"0"},
                {"0"},{"0"},
                {"0"},{"0"},
                {"0"},{"0"},
                {"0"},{"0"},
                {"0"},{"0"},
                {"0"},{"0"},
                {"0"},{"0"},
                {"0"},{"0"},
                {"0"},{"0"},
                {"0"},{"0"},
                {"0"},{"0"},
                {"0"},{"0"},
                {"0"},{"0"},
                {"0"},{"0"},
                {"0"},{"0"},
                {"0"},{"0"},
                {"0"},{"0"},
                {"0"},{"0"},
                {"0"},{"0"},
                {"0"},{"0"},
                {"0"},{"0"},
                {"0"},{"0"},
                {"0"},{"0"},
                {"0"},{"0"},
                {"0"},{"0"},
                {"0"},{"0"},
                {"0"},{"0"},
                {"0"},{"0"},
                {"0"},{"0"},
                {"0"},{"0"},
                {"0"},{"0"},
                {"0"},{"0"},
                {"0"},{"0"},
                {"0"},{"0"},
                {"0"},{"0"},
                {"0"},{"0"},
                {"0"},{"0"},
                {"0"},{"0"},
                {"0"},{"0"},
                {"0"},{"0"},
                {"0"},{"0"},
                {"0"},{"0"},
                {"0"},{"0"},
                {"0"},{"0"},
                {"0"},{"0"},
                {"0"},{"0"},
                {"0"},{"0"},
                {"0"},{"0"},
                {"0"},{"0"},
                {"0"},{"0"},
                {"0"},{"0"},
                {"0"},{"0"},
                {"0"},{"0"},
                {"0"},{"0"},
                {"0"},{"0"},
                {"0"},{"0"},
                {"0"},{"0"},
                {"0"},{"0"},
                {"0"},{"0"},
                {"0"},{"0"},
                {"0"},{"0"},
                {"0"},{"0"},
                {"0"},{"0"},
                {"0"},{"0"},
                {"0"},{"0"},
                {"0"},{"0"},
                {"0"},{"0"},
                {"0"},{"0"},
                {"0"},{"0"},
                {"0"},{"0"},
                {"0"},{"0"},
                {"0"},{"0"},
                {"0"},{"0"},
                {"0"},{"0"},
                {"0"},{"0"},
                {"0"},{"0"},
                {"0"},{"0"},
                {"0"},{"0"},
                {"0"},{"0"},
                {"0"},{"0"},
                {"0"},{"0"}};
        int disp=0;

        for(int i=0; i<100; i++){
            for(int j=0; j<2; j++){
                System.out.print(clients[i][j]);
                if (j!=1){
                    System.out.println(", ");
                }
            }
            System.out.print("\n");
        }

        return clients;
    }

    public static void main(String[] args) {
        int menuItem = Menu();
        System.out.println(menuItem);

        switch (menuItem){
            case 1: clients();
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            default: break;
        }

    }
}