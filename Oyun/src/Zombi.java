public class Zombi extends Oyuncu{
    public Zombi() {
        super("Zombi");
        this.setOran(15);
        this.setSavunma(40);
        this.setCan(60);
        this.setMaxHP(getCan());
        this.setSaldiri(30);
    }

    @Override
    public void move() {
        System.out.println("Salak Zombi Geliyor!");
    }
}
