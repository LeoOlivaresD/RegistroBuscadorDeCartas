package Plantillas.yugioh;
import java.util.*;

//Usare esta clase para crear todos los metodos de la clase principal
public class CardData extends CartasYuGiOh{
    //Lista de cartas
    List<CartasYuGiOh> listaDeCartas = new ArrayList<>();
    CartasYuGiOh cartas = new CartasYuGiOh();

    Scanner sc = new Scanner(System.in);


    public List<CartasYuGiOh> getListaDeCartas() {
        return listaDeCartas;
    }

    public void setListaDeCartas(List<CartasYuGiOh> listaDeCartas) {
        this.listaDeCartas = listaDeCartas;
    }

    public CartasYuGiOh getCartas() {
        return cartas;
    }

    public void setCartas(CartasYuGiOh cartas) {
        this.cartas = cartas;
    }

    //OPCION 1 metodo para registrar cartas
    public void agregarCarta() {
        CartasYuGiOh cartas = new CartasYuGiOh();
        cartas.setIdCard(cartas.getIdCard());
        cartas.setName(cartas.getName());
        cartas.setType(cartas.getType());
        cartas.setEffect(cartas.getEffect());
        cartas.setRarityCard(cartas.getRarityCard());
        cartas.setLimitCard(cartas.getLimitCard());
        listaDeCartas.add(cartas);
    }

    //OPCION 2 ENCONTRAR POR NOMBRE
    public void findByName() {
        System.out.println("Ingrese el nombre de la carta que desea encontrar");
        String cardName = sc.nextLine();
        for (CartasYuGiOh nombreCarta : listaDeCartas) {
            if (cardName.equalsIgnoreCase(nombreCarta.getName())) {  //de esta forma buscamos omitiendo mayusculas o minusculas
                System.out.println(nombreCarta.toString());
            }
        }
        System.out.println("Aprete la tecla \"Enter\" para continuar");
        sc.nextLine();
    }

    // OPCION 3 BUSCAR POR TIPO
    public void findByType() {
        System.out.println("Ingrese el tipo de carta que desea buscar");
        String cardType = sc.nextLine();
        for (CartasYuGiOh tipoCarta : listaDeCartas) {
            if (cardType.equalsIgnoreCase(tipoCarta.getType())) {
                System.out.println(tipoCarta.toString());
            }
        }
        System.out.println("Aprete la tecla \"Enter\" para continuar");
        sc.nextLine();
    }

    //OPCION 4 BUSCAR POR LIMITE
    public void findByLimmit() {
        System.out.println("Ingrese un numero para buscar todas cartas limitadas a esa cantidad");
        Integer cardLimit = sc.nextInt();
        for (CartasYuGiOh cartaLimitada : listaDeCartas) {
            if (cardLimit.equals(cartaLimitada.getLimitCard())) {
                System.out.println(cartaLimitada.toString());
            }
        }
        System.out.println("Aprete la tecla \"Enter\" para continuar");
        sc.nextLine();
        sc.nextLine();

    }

    //OPCION 5 MOSTRAR LISTA DE CARTAS
    public void showList() {
        System.out.println("Mostrando lista de cartas");
        for (CartasYuGiOh cartas : listaDeCartas) {
            System.out.println(cartas.toString());
            System.out.println("*************************");
        }
        System.out.println("Presione la tecla \"Enter\" para continuar");
        sc.nextLine();
    }

    //OPCION 6 ELIMINAR PO NOMBRE
    public void deleteByName(){
        System.out.println("mostrando listado de cartas");
        for (CartasYuGiOh cartas : listaDeCartas) {
            System.out.println(cartas.toString());
            System.out.println("*************************");
        }
        System.out.println("Introdusca el nombre de la carta que desea eliminar");
        String cardName = sc.nextLine();
        listaDeCartas.removeIf(nombreCarta -> cardName.equalsIgnoreCase(nombreCarta.getName()));
        System.out.println("Eliminando, presione la tecla \"Enter\" para continuar");
        sc.nextLine();
    }
    //OPCION 7 MOSTRAR LISTA ORDENADA POR NOMBRE DE CARTA
    public void sortByName(){
        System.out.println("Mostrando lista de cartas ordenadas por nombre");
        Collections.sort(listaDeCartas);
        for (CartasYuGiOh cartasYuGiOh: listaDeCartas){
            System.out.println(cartasYuGiOh.toString());
            System.out.println("*************************************");
        }
        System.out.println("Presione \"tecla Enter\" para continuar");
        sc.nextLine();
    }
    //OPCION 8 MOSTRAR LISTA ORDENADA POR ID DE CARTA
    public void sortById(){
    Collections.sort(listaDeCartas,new CardByIDComparator());
        System.out.println("Mostrando lista ordenada por id de cartas");
        for (CartasYuGiOh cartas:listaDeCartas){
            System.out.println(cartas.toString());
            System.out.println("************************************");
        }
        System.out.println("Presione la tecla \"Enter\" para volver al menu anterior");
        sc.nextLine();
        sc.nextLine();
    }

    //OPCION 9 MOSTRAR LISTA ORDENADA POR ID DE CARTA
    public void sortByType(){
        System.out.println("Mostrando lista ordenada por tipo");
        Collections.sort(listaDeCartas,new CardByTypeComparator());
        for (CartasYuGiOh cartas: listaDeCartas){
            System.out.println(cartas.toString());
            System.out.println("***********************************");
        }
        System.out.println("Presione la tecla \"Enter\" para volver al menu anterior");
        sc.nextLine();
    }

}
