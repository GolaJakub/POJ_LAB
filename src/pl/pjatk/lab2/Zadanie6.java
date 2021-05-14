package pl.pjatk.lab2;

public class Zadanie6 {
    public static void main(String[] args) {
    int nwd = nwd(100,15);
        System.out.println(nwd);
    }

    public static int nwd(int a, int b) {
        int nwd = 1;
        for (int i = 1; i < Math.min(a,b); i++) {
            if (a % i == 0 && b % i == 0)
                nwd = i;
        }
        return nwd;
    }
}
