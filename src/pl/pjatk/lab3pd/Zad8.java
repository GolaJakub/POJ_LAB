package pl.pjatk.lab3pd;

public class Zad8 {
    public static void main(String[] args) {
        Player player = new Player();
        Enemy enemy = new Enemy();
        System.out.println("Choose your eq set!!");
        player.eq();
        enemy.eq();
        System.out.println("Player stats:\nhp:" + player.hp + "\nattack_damage: " + player.attack_damage);
        System.out.println("\nEnemy stats:\nhp:" + enemy.hp + "\nattack_damage: " + enemy.attack_damage);
        System.out.println("\nFIGHT!!!");

        while(player.hp>0 && enemy.hp>0)
        {
            enemy.hp -= player.attack_damage;
            System.out.println("Player attacked for "+player.attack_damage);
            if(enemy.hp<0)
            {
                enemy.hp=0;
                System.out.println("Player hp: "+player.hp);
                System.out.println("Enemy hp: "+ enemy.hp +"\n");
                break;
            }
            System.out.println("Player hp: "+player.hp);
            System.out.println("Enemy hp: "+ enemy.hp +"\n");
            player.hp -= enemy.attack_damage;
            System.out.println("Enemy attacked for "+enemy.attack_damage);
            if(player.hp<0)
            {
                player.hp = 0;
                System.out.println("Player hp: "+player.hp);
                System.out.println("Enemy hp: "+ enemy.hp +"\n");
                break;
            }
            System.out.println("Player hp: "+player.hp);
            System.out.println("Enemy hp: "+ enemy.hp +"\n");
        }

        if (player.hp>enemy.hp)
        {
            System.out.println("You won!!");
        }
        else
        {
            System.out.println("You lost!!");
        }
    }
}