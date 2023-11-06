package lesson41_Lambda;

public class Test2 {
    static void def (I i) {
        System.out.println(i.abc("privit"));    }


    public static void main(String[] args) {
        def((String str) -> str.length());
    }

}
interface I {
    int abc (String s);
}