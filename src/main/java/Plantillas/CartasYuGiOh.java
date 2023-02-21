package Plantillas.yugioh;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CartasYuGiOh implements Comparable<CartasYuGiOh> {
    private Integer idCard;
    private String name;
    private String effect;
    private String rarityCard;
    private Integer limitCard;
    private String type;

    Scanner sc = new Scanner(System.in);

    boolean salir = false;

    public CartasYuGiOh() {
    }

    public CartasYuGiOh(Integer idCard, String name, String effect, String rarityCard, Integer limitCard, String type) {
        this.idCard = idCard;
        this.name = name;
        this.effect = effect;
        this.rarityCard = rarityCard;
        this.limitCard = limitCard;
        this.type = type;
    }

    public Integer getIdCard() {
        return idCard;
    }

    public void setIdCard(Integer idCard) {
        do {
            System.out.println("Ingrese un numero entero para asignar id a carta");
            try {
                idCard = sc.nextInt();
                salir = true;
            } catch (InputMismatchException e) {
                sc.nextLine();
                System.out.println("Debes ingresar un \"Numero mayor a 0\"");
            }
        } while (!salir);
        this.idCard = idCard;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        sc.nextLine();
        do {
            System.out.println("Ingrese el nombre de la carta");
            name = sc.nextLine();
        } while (name.equals(" ") || name.isEmpty());
        this.name = name;
    }

    public String getEffect() {
        return effect;
    }

    public void setEffect(String effect) {
        do {
            System.out.println("Ingrese efecto o descripcion de la carta");
            effect = sc.nextLine();
        } while (effect.equals(" ") || effect.isEmpty());
        this.effect = effect;
    }

    public String getRarityCard() {
        return rarityCard;
    }

    public void setRarityCard(String rarityCard) {
        do {
            System.out.println("Ingrese la rareza de la carta");
            rarityCard = sc.nextLine();
        } while (rarityCard.equals(" ") || rarityCard.isEmpty());
        this.rarityCard = rarityCard;
    }

    public Integer getLimitCard() {
        return limitCard;
    }

    public void setLimitCard(Integer limitCard) {
        do {
            System.out.println("Ingrese un numero de 0 al 3 para determinar el limite de esta carta");
            limitCard = sc.nextInt();
        } while (limitCard > 3 || limitCard < 0);
        this.limitCard = limitCard;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        do {
            System.out.println("Que tipo de carta es: ");
            type = sc.nextLine();
            type = type.toLowerCase();
        } while (!type.equals("magia") && !type.equals("trampa") && !type.equals("moustruo"));
        this.type = type;
    }

    @Override
    public String toString() {
        return "CartasYuGiOh{" + "idCard=" + idCard + ", name='" + name + '\'' + ", effect='" + effect + '\'' +
                ", rarityCard='" + rarityCard + '\'' +
                ", limitCard=" + limitCard +
                ", type='" + type + '\'' +
                '}';
    }

    @Override
    public int compareTo(CartasYuGiOh cartas) {
        return this.name.compareTo(cartas.getName());
    }
}
