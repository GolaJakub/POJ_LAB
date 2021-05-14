package pl.pjatk.lab3pd;
import java.util.Scanner;

public class Player {

        Scanner scan = new Scanner(System.in);
        int hp = 100;
        int attack_damage = 20;
        int eq;

        public void eq() {
            System.out.println("1. Set 1:\thp: +20 \t attack_damage: +5");
            System.out.println("2. Set 2:\thp: +5  \t attack_damage: +20");
            System.out.println("3. Set 3:\thp: +10 \t attack_damage: +10");
            System.out.println("4. Set 4:\thp: +0  \t attack_damage: +25");
            System.out.println("5. Set 5:\thp: +30 \t attack_damage: +0");

            eq = scan.nextInt();
            switch (eq){
                case 1:
                {
                    attack_damage +=5;
                    hp += 20;
                    break;
                }
                case 2:
                {
                    attack_damage +=20;
                    hp += 5;
                    break;
                }
                case 3:
                {
                    attack_damage +=10;
                    hp+=10;
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
