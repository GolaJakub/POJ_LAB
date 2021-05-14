package pl.pjatk.lab4pd.zad5;

public class Race {
    public static void main(String[] args) {
        Runner[] runners = new Runner[3];
        runners[0] = new Runner("Jarek", 12, 7);
        runners[1] = new Runner("Sebek", 18, 2);
        runners[2] = new Runner("Zdzisiek", 20, 1);

        for (int i = 0; i <= 2; i++) {
            runners[i].introduce();
        }
        boolean flag=true;
        while(flag){
            for (Runner runner : runners) {
                runner.run();
                if (runner.distance >= 50) {
                    System.out.println("The winner is: " + runner.name+" running "+runner.minspeed+"-"+runner.maxspeed+"km/h");
                    flag = false;
                    break;
                }
            }
        }
    }
}