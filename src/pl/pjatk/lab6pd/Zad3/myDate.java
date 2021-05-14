package pl.pjatk.lab6pd.Zad3;

public class myDate {
    int day;
    int month;
    int year;

    public myDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    //a
    /*@Override
    public String toString() {
        return String.format("%s.%s.%s",day,month,year);
    }*/


    //b
    /*@Override
    public String toString() {
        String result = "";
        if(day<10)
        {
            result+="0"+String.valueOf(day)+".";
        }
        else{
            result+=String.valueOf(day)+".";
        }
        if(month<10)
        {
            result+="0"+String.valueOf(month)+".";
        }
        else{
            result+=String.valueOf(month)+".";
        }
        result+=year;
        return result;
    }*/


    //c
    @Override
    public String toString() {
        String result="";
        result+=String.valueOf(day);
        switch(month)
        {
            case 1:
                result+=" sty ";
                break;
            case 2:
                result+=" lut ";
                break;
            case 3:
                result+=" mar ";
                break;
            case 4:
                result+=" kwi ";
                break;
            case 5:
                result+=" maj ";
                break;
            case 6:
                result+=" cze ";
                break;
            case 7:
                result+=" lip ";
                break;
            case 8:
                result+=" sie ";
                break;
            case 9:
                result+=" wrz ";
                break;
            case 10:
                result+=" paz ";
                break;
            case 11:
                result+=" lis ";
                break;
            case 12:
                result+=" gru ";
                break;
        }
        result+=year;
        return result;
    }
}
