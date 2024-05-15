import java.util.Random;

public class Ork extends Oyuncu{
    public Ork() {
        super("Ork");
        this.setOran(20);
        this.setSavunma(80);
        this.setCan(150);
        this.setMaxHP(getCan());
        this.setSaldiri(50);
    }

    @Override
    public int atack() {
         int vurulacakhasar = super.atack();
         //özellikler -- can yenile gibi
        return vurulacakhasar;
    }

    @Override
    public int blok() {
        int blokDegeri = super.blok();
         // özellik atcaksan buraya at
        return blokDegeri;
    }

    @Override
    public void move() {
        System.out.println("Ork önünü kesti!");
    }
}
