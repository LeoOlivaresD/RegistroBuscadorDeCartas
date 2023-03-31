import Plantillas.CardData;

import java.util.Scanner;

public class RunAplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean salir = false;
        int opcion;
        String respuesta;

        //instancia de la clase CardData para poder usar todos los métodos que ocuparemos en nuestro menu.
        CardData cardData = new CardData();
        do {
            System.out.println("*****************************************");
            System.out.println("*Bienvenido al editor de cartas Yu-Gi-Oh*");
            System.out.println("*****************************************");
            System.out.println("*Elija una de las siguientes opciones   *");
            System.out.println("1: Add Card\n" +
                    "2: Find for Name\n" +
                    "3: Find for type\n" +
                    "4: Find LimitCard\n" +
                    "5: Show card list\n" +
                    "6: Delete Card by name\n" +
                    "7: Sort list by name card \n" +
                    "8: Sort list by id card\n" +
                    "9: Sort list by type card\n" +
                    "10: Exit");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    //add cards
                    cardData.agregarCarta();
                    break;
                case 2:
                    //find by Name
                    cardData.findByName();
                    break;
                case 3:
                    //find by Type
                    cardData.findByType();
                    break;
                case 4:
                    //find by limit Card
                    cardData.findByLimmit();
                    break;
                case 5:
                    //show list cards
                    cardData.showList();
                    break;
                case 6:
                    //delete by Name
                    cardData.deleteByName();
                    break;
                case 7:
                    // mostrar lista ordenada por nombre
                    cardData.sortByName();
                    break;
                case 8:
                    //mostrar lista ordenada por id de cartas
                    cardData.sortById();
                    break;
                case 9:
                    //mostrar lista de cartas ordenadas por tipo
                    cardData.sortByType();
                    break;
                case 10:
                    System.out.println("Desea salir del programa ? (responda \"si, /no \") ");
                    sc.nextLine();
                    respuesta = sc.nextLine();
                    if (respuesta.equalsIgnoreCase("si")){
                        salir=true;
                    }else {
                        System.out.println("Volviendo al menu principal..\n" +
                                "Presione Enter para continuar");
                        sc.nextLine();
                    }
                    break;
                default:
                    System.out.println("La opcion ingresada no corresponde\n" +
                            "Presione la tecla \"Enter\" para continuar");
                    sc.nextLine();
            }
        } while (!salir);

    }
}

