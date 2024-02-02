import java.util.Scanner;

        public class Main {

    /* TODO:
        - Menú
        - Donar de alta nous clients Roger
        - Donar de alta nous mecànics jan
        - Introduir vehicle
        - Ftitxa de reparació
        - Poder modificar reparacións
     */

            /*public static int Menu(){
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
            }*/



            public static void mecanics(){

                /* Poder donar d’alta nous empleats (mecànics) que repararàn els vehicles. En volem guardar
                el número d’empleat, el seu nom i un atribut que ens informi de si actualment ja està ocupat
                reparant un vehicle o si està lliure que li direm “ocupat” o “lliure” en Strings.
                A. Tots els camps de l’array mecànic són obligatoris i no poden tenir valor blanc “ ”.
                B. Haurem de validar que el codi d’empleat no existeixi. Si existeix, demanarem a
                l’usuari que introdueixi un altre codi d’empleat.
                 */


                Scanner scanner = new Scanner(System.in); //perque els usuari introdueixi les dades del mecanic
                String[][] numeros = new String[100][3];
                System.out.println("Introdueix el numero de empleat:");
                String numeroEmpleat = scanner.nextLine(); //numero empleat mecànic
                System.out.println("Introdueix les dades del mecanic:");
                String nomMecanic = scanner.nextLine(); //nom mecànics
                System.out.println("Introdueix si esta lliure o ocupat:");
                String ocupatLLiure = scanner.nextLine(); //Disponibilitat mecànic

                System.out.println("El número es: " +numeroEmpleat + "\n" + "El nom es: " + nomMecanic + "\n" + "El mecànic està: " + ocupatLLiure);




            }

            public static void main(String[] args) {
                // int menuItem = Menu();
                // System.out.println(menuItem);
                mecanics();

            }


        }




