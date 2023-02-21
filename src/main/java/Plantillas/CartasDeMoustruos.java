package Plantillas.yugioh;

public class CartasDeMoustruos extends CartasYuGiOh{
    private Integer attack;
    private Integer deffense;
    private Integer lvl,rank;
    private Integer pendulomScale;

    public CartasDeMoustruos(){};

    public CartasDeMoustruos(Integer attack, Integer deffense, Integer lvl, Integer rank, Integer pendulomScale) {
        this.attack = attack;
        this.deffense = deffense;
        this.lvl = lvl;
        this.rank = rank;
        this.pendulomScale = pendulomScale;
    }

    public CartasDeMoustruos(Integer idCard, String name, String effect, String rarityCard, Integer limitCard, String type, Integer attack, Integer deffense, Integer lvl, Integer rank, Integer pendulomScale) {
        super(idCard, name, effect, rarityCard, limitCard, type);
        this.attack = attack;
        this.deffense = deffense;
        this.lvl = lvl;
        this.rank = rank;
        this.pendulomScale = pendulomScale;
    }

    public Integer getAttack() {
        return attack;
    }

    public void setAttack(Integer attack) {
        this.attack = attack;
    }

    public Integer getDeffense() {
        return deffense;
    }

    public void setDeffense(Integer deffense) {
        this.deffense = deffense;
    }

    public Integer getLvl() {
        return lvl;
    }

    public void setLvl(Integer lvl) {
        this.lvl = lvl;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public Integer getPendulomScale() {
        return pendulomScale;
    }

    public void setPendulomScale(Integer pendulomScale) {
        this.pendulomScale = pendulomScale;
    }

    @Override
    public String toString() {
        return "CartasDeMoustruos{" +
                "attack=" + attack +
                ", deffense=" + deffense +
                ", lvl=" + lvl +
                ", rank=" + rank +
                ", pendulomScale=" + pendulomScale +
                "} " + super.toString();
    }
}
