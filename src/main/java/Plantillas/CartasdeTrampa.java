package Plantillas.yugioh;

public class CartasdeTrampa extends CartasYuGiOh{
    public CartasdeTrampa() {
    }

    public CartasdeTrampa(Integer idCard, String name, String effect, String rarityCard, Integer limitCard, String type) {
        super(idCard, name, effect, rarityCard, limitCard, type);
    }

    @Override
    public String toString() {
        return "CartasdeTrampa{} " + super.toString();
    }
}
