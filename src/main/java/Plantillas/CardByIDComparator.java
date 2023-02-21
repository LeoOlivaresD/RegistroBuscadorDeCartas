package Plantillas.yugioh;

import java.util.Comparator;

public class CardByIDComparator extends CartasYuGiOh implements Comparator<CartasYuGiOh> {

    @Override
    public int compare(CartasYuGiOh carta1, CartasYuGiOh carta2) {
        int respuesta =0;
        if (carta1.getIdCard() > carta2.getIdCard()){
            respuesta = 1;
        } else if (carta1.getIdCard() < carta2.getIdCard()) {
            respuesta =-1;
        }else{
            respuesta = 0;
        }
        return respuesta;
    }
}
