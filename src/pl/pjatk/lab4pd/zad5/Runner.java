package pl.pjatk.lab4pd.zad5;

public class Runner {
    String name;
    int maxspeed;
    int minspeed;
    int distance;


    public Runner(String name, int maxspeed, int minspeed) {
        this.name = name;
        this.maxspeed = maxspeed;
        this.minspeed = minspeed;
        this.distance = 0;
    }

    void introduce(){
        System.out.println("I'm "+name+" and I run "+minspeed+"-"+maxspeed+"km/h");
    }

    void run(){
        distance += (int) (Math.random() * (maxspeed - minspeed) + minspeed);
    }
}