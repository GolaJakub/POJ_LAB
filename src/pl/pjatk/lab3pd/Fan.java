package pl.pjatk.lab3pd;

public class Fan {
    final int SLOW = 1, MEDIUM = 2, FAST = 3;
    int speed;
    boolean on;
    int radius;
    String color;

    public Fan(){}

    public Fan(int speed, boolean on, int radius, String color)
    {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }


    public void informations()
    {
        String informations;
        if (this.on)
        {
            informations = "Is on:"+ this.on +"\t"+ "speed:"+this.speed +"\t"+  "radius:"+this.radius+"\t"+"color:"+this.color;}
        else
        {
            informations = "Is on:"+ this.on +"\t"+ "radius:"+this.radius+"\t"+"color:"+this.color;
        }
        System.out.println(informations);
    }
}


