import java.util.Random;

public class Oyuncu {
    private String isim;
    private int can;
    private int oran;
    private int saldiri;
    private int savunma;
    private int level;
    private int maxHP;

    public int getMaxHP() {
        return maxHP;
    }

    public void setMaxHP(int maxHP) {
        this.maxHP = maxHP;
    }

    public Oyuncu(String isim) {
        this.isim = isim;
        this.level = 1;
    }
    public void move(){}
    public void levelUp(){}
    public int atack(){
        Random r = new Random();
        int vurulanHasar = r.nextInt(getSaldiri()/2,getSaldiri());
        if (r.nextInt(100)<getOran()){
            System.out.println(this.isim+"kritik vurdu!");
            vurulanHasar = vurulanHasar*2;
        }
        return  vurulanHasar; }
    public int blok(){ Random r = new Random();
        int blokDegeri =  r.nextInt(getSavunma()/3,getSavunma());
        return blokDegeri;}

    public int getCan() {
        return can;
    }

    public void setCan(int can) {
        this.can = can;
    }

    public int getOran() {
        return oran;
    }

    public void setOran(int oran) {
        this.oran = oran;
    }

    public int getSaldiri() {
        return saldiri;
    }

    public void setSaldiri(int saldiri) {
        if(saldiri>0 && saldiri<=100)
            this.saldiri=saldiri;
        else
            this.saldiri=0;
    }

    public int getSavunma() {
        return savunma;
    }

    public void setSavunma(int savunma) {
        this.savunma = savunma;
    }

    public int getLevel() {
        return level;
    }

    public void addLevel() {
        this.level ++;
    }
}
