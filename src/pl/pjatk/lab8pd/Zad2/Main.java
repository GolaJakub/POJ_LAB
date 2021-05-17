package pl.pjatk.lab8pd.Zad2;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        File directory = new File("./basedir");
        File[] files = directory.listFiles();
        int max=0, tmp=0;
        String maxfolder="";
        if (directory.isDirectory()){
            for (int i=0; i<files.length; i++){
                File pliki=new File(String.valueOf(files[i]));
                File[] files1 = pliki.listFiles();
                System.out.println(files[i]);
                for (int j = 0; j < files1.length; j++)
                {
                    tmp++;
                }
                if(tmp>max)
                {
                    maxfolder= String.valueOf(files[i]);
                    max=tmp;
                }
                tmp=0;
            }
        }
        System.out.println("Największa ilość plików to "+ max+" znajduje się w folderze "+ maxfolder);
}
}
