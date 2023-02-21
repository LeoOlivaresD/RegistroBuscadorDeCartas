package Plantillas.yugioh;

public class CartasDeMagia extends CartasYuGiOh{
    public CartasDeMagia() {
    }

    public CartasDeMagia(Integer idCard, String name, String effect, String rarityCard, Integer limitCard, String type) {
        super(idCard, name, effect, rarityCard, limitCard, type);
    }

    @Override
    public String toString() {
        return "CartasDeMagia{} " + super.toString();
    }
}
