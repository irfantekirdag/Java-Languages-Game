import java.util.Scanner;

public class User extends Oyuncu{
    static Scanner sc = new Scanner(System.in);
    public User() {

        super(sc.nextLine());
        this.setOran(25);
        this.setSavunma(40);
        this.setCan(100);
        this.setMaxHP(getCan());
        this.setSaldiri(50);
    }

    @Override
    public void levelUp() {
        addLevel();
        System.out.println("Level :"+getLevel());
        setCan(getMaxHP());
        System.out.println("1 - Can =>"+getMaxHP()+"-->"+(getMaxHP()+50));
        System.out.println("2 - Hasar =>"+getSaldiri()+"-->"+(getSaldiri()+20));
        System.out.println("3 - Savunma =>"+getSavunma()+"-->"+(getSavunma()+20));
        System.out.println("4 - Kritik Oranı  =>"+getOran()+"-->"+(getOran()+15));
        System.out.println("Bir seçim yapınız");
        int secim = sc.nextInt();
        switch (secim){
            case 1:
                int can = getMaxHP()+50;
                setMaxHP(can);
                setCan(getMaxHP());
                break;
            case 2: setSaldiri(getSaldiri()+20);
            break;
            case 3: setSavunma(getSavunma()+20);
            break;
            case 4: setOran(getOran()+15);
            break;
            default:
                System.out.println("Yanlış seçim yaptınız özelliğiniz gelişmedi !!!");
        }

    }
}
