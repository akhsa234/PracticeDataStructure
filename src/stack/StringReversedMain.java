package stack;

public class StringReversedMain {
    public static void main(String[] args) {

        String str = "qertyui";
        StringReverse stringReverse = new StringReverse();
        stringReverse.reverse(str);
        String result= stringReverse.reverse(str);
        System.out.println(result);
    }

}
