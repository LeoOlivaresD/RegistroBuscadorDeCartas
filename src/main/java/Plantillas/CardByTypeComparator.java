package Plantillas.yugioh;

import java.util.Comparator;

public class CardByTypeComparator implements Comparator<CartasYuGiOh> {
    @Override
    public int compare(CartasYuGiOh carta1, CartasYuGiOh carta2) {
        return carta1.getType().compareTo(carta2.getType());
    }
}
