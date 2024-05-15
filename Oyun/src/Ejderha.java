public class Ejderha extends Oyuncu{
    public Ejderha() {
        super("Ejderha");
        this.setOran(30);
        this.setSavunma(50);
        this.setCan(350);
        this.setMaxHP(getCan());
        this.setSaldiri(60);
    }

    @Override
    public void move() {
        System.out.println("Isıtıcı Geldi KAAACCCC!!!");
    }

    @Override
    public int atack() {
        int vurulanHasar = super.atack();
        if (getCan()<200 && getCan() >100)
            vurulanHasar = (int)(vurulanHasar *1.5);
        else if (getCan()<100)
            vurulanHasar = 2*vurulanHasar;

        return vurulanHasar;
    }
}
