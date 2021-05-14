package pl.pjatk.lab3pd;

public class Enemy {
    int hp = 100;
    int attack_damage = 20;

    public void eq() {
        int eq = (int) (Math.random() * ((5-1)+1)+1);
        System.out.println("Enemy chose set number: "+eq+"\n");
        switch (eq) {
            case 1:
            {
                attack_damage += 5;
                hp += 20;
                break;
            }
            case 2:
            {
                attack_damage += 20;
                hp += 5;
                break;
            }
            case 3:
            {
                attack_damage += 10;
                hp += 10;
                break;
            }
            case 4:
            {
                attack_damage += 25;
                break;
            }
            case 5:
            {
                hp += 30;
                break;
            }
            default:
            {
                System.out.println("Wrong choice");
                break;
            }
        }
    }
}
