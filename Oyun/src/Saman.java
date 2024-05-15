public class Saman extends Oyuncu{
    public Saman() {
        super("Saman");
        this.setOran(20);
        this.setSavunma(60);
        this.setCan(120);
        this.setMaxHP(getCan());
        this.setSaldiri(20);
    }

    @Override
    public void move() {
        System.out.println("Karşıdan bir Şaman geliyor!");
    }

    @Override
    public int blok() {
        int blokDegeri = super.blok();
        int canYenile = (int)(getCan() * 0.1);
        int canMiktari = getCan() + canYenile;
        if (canMiktari >120) canMiktari = 120;
        setCan(canMiktari);

        return blokDegeri;
    }
}
