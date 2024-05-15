public class Titan extends Oyuncu{
    public Titan() {
        super("Titan");
        this.setOran(20);
        this.setSavunma(60);
        this.setCan(200);
        this.setMaxHP(getCan());
        this.setSaldiri(15);
    }

    @Override
    public void move() {
        System.out.println("Titan geliyor!");
    }
}
