package pl.pjatk.lab7pd.Zad5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringTransformation {
    String string;
    Sign sign;

    public static String removeSigns(String string, Sign sign) {
        for (String s : string.split("")) {
            if (sign == sign.CONSONANT) {
                Pattern pattern = Pattern.compile("[qwrtpsdfghjklzxcvbnmłżźćQWRTPSDFGHJKLZXCVBNMŁŻŹĆ]");
                Matcher matcher = pattern.matcher(s);
                if (!matcher.find()) {
                    System.out.print(s);
                }
            } else if (sign == sign.VOWEL) {
                Pattern pattern = Pattern.compile("[aeiouAEIOU]");
                Matcher matcher = pattern.matcher(s);
                if (!matcher.find()) {
                    System.out.print(s);
                }
            } else if (sign == sign.SPACE) {
                Pattern pattern = Pattern.compile("[\\s]");
                Matcher matcher = pattern.matcher(s);
                if (!matcher.find()) {
                    System.out.print(s);
                }
            } else if (sign == sign.SPECIAL_SIGN) {
                Pattern pattern = Pattern.compile("[\\W]");
                Matcher matcher = pattern.matcher(s);
                if (!matcher.find()) {
                    System.out.print(s);
                }
            } else if (sign == sign.NUMBER) {
                Pattern pattern = Pattern.compile("[0-9]");
                Matcher matcher = pattern.matcher(s);
                if (!matcher.find()) {
                    System.out.print(s);
                }
            }

        }return string;
    }

    public static String replaceSigns(String string, Sign sign,String sign1)
    {
        for (String s : string.split("")) {
            if (sign == sign.CONSONANT) {
                Pattern pattern =
                        Pattern.compile("[qwrtpsdfghjklzxcvbnmłżźćQWRTPSDFGHJKLZXCVBNMŁŻŹĆ]");
                Matcher matcher = pattern.matcher(s);
                if (matcher.find()){
                    System.out.print(sign1);
                }else if (!matcher.find()){
                    System.out.print(s);
                }
            } else if (sign == sign.VOWEL) {
                Pattern pattern = Pattern.compile("[aeiouAEIOU]");
                Matcher matcher = pattern.matcher(s);
                if (matcher.find()){
                    System.out.print(sign1);
                }else if (!matcher.find()){
                    System.out.print(s);
                }
            } else if (sign == sign.SPACE) {
                Pattern pattern = Pattern.compile("[\\s]");
                Matcher matcher = pattern.matcher(s);
                if (matcher.find()){
                    System.out.print(sign1);
                }else if (!matcher.find()){
                    System.out.print(s);
                }
            } else if (sign == sign.SPECIAL_SIGN) {
                Pattern pattern = Pattern.compile("[\\W]");
                Matcher matcher = pattern.matcher(s);
                if (matcher.find()){
                    System.out.print(sign1);
                }else if (!matcher.find()){
                    System.out.print(s);
                }
            } else if (sign == sign.NUMBER) {
                Pattern pattern = Pattern.compile("[0-9]");
                Matcher matcher = pattern.matcher(s);
                if (matcher.find()){
                    System.out.print(sign1);
                }else if (!matcher.find()){
                    System.out.print(s);
                }
            }
        }return string;
    }
    public static String leaveSigns(String string, Sign sign) {
        for (String s : string.split("")) {
            if (sign == sign.CONSONANT) {
                Pattern pattern =
                        Pattern.compile("[qwrtpsdfghjklzxcvbnmłżźćQWRTPSDFGHJKLZXCVBNMŁŻŹĆ]");  Matcher matcher = pattern.matcher(s);
                if (matcher.find()){
                    System.out.print(s);
                }
            } else if (sign == sign.VOWEL) {
                Pattern pattern = Pattern.compile("[aeiouAEIOU]");
                Matcher matcher = pattern.matcher(s);
                if (matcher.find()){
                    System.out.print(s);
                }
            } else if (sign == sign.SPACE) {
                Pattern pattern = Pattern.compile("[\\s]");
                Matcher matcher = pattern.matcher(s);
                if (matcher.find()){
                    System.out.print(s);
                }
            } else if (sign == sign.SPECIAL_SIGN) {
                Pattern pattern = Pattern.compile("[\\W]");
                Matcher matcher = pattern.matcher(s);
                if (matcher.find()){
                    System.out.print(s);
                }
            } else if (sign == sign.NUMBER) {
                Pattern pattern = Pattern.compile("[0-9]");
                Matcher matcher = pattern.matcher(s);
                if (matcher.find()){
                    System.out.print(s);
                }
            }
        }return string;
    }
}

