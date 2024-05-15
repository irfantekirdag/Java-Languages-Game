public class Vampir extends  Oyuncu{
    public Vampir() {
        super("Vampir");
        this.setOran(30);
        this.setSavunma(40);
        this.setCan(100);
        this.setMaxHP(getCan());
        this.setSaldiri(70);
    }

    @Override
    public void move() {
        System.out.println("Vampir karsinizda belirdi!");
    }

    @Override
    public int atack() {
        int vurulanHasar = super.atack();
        double canYenileme = vurulanHasar * 0.07;
        int canMiktarı = getCan() + (int)canYenileme; // canYenileme önündeki int değeri yuvarlamak için int yaptık
        if(canMiktarı >100) canYenileme = 100; // vampir canı 100'ün üzerine geçmesin diye yazdık.
        setCan(canMiktarı);
        return vurulanHasar;
    }
}
