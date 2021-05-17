package pl.pjatk.lab7pd.Zad5;

public class Main {
    public static void main(String[] args) {
        System.out.println(StringTransformation.removeSigns("123 Test!",Sign.NUMBER));
        System.out.println(StringTransformation.removeSigns("123 Test!",Sign.VOWEL));
        System.out.println(StringTransformation.removeSigns("123 Test!",Sign.CONSONANT));
        System.out.println(StringTransformation.removeSigns("123 Test!",Sign.SPECIAL_SIGN));
        System.out.println(StringTransformation.removeSigns("123 Test!",Sign.SPACE));


        System.out.println(StringTransformation.leaveSigns("123 Test!",Sign.NUMBER));
        System.out.println(StringTransformation.leaveSigns("123 Test!",Sign.VOWEL));
        System.out.println(StringTransformation.leaveSigns("123 Test!",Sign.CONSONANT));
        System.out.println(StringTransformation.leaveSigns("123 Test!",Sign.SPECIAL_SIGN));
        System.out.println(StringTransformation.leaveSigns("123 Test!",Sign.SPACE));


        System.out.println(StringTransformation.replaceSigns("123 Test!",Sign.NUMBER,"#"));
        System.out.println(StringTransformation.replaceSigns("123 Test!",Sign.VOWEL,"#"));
        System.out.println(StringTransformation.replaceSigns("123 Test!",Sign.CONSONANT,"#"));
        System.out.println(StringTransformation.replaceSigns("123 Test!",Sign.SPECIAL_SIGN,"#"));
        System.out.println(StringTransformation.replaceSigns("123 Test!",Sign.SPACE,"#"));

    }
}
