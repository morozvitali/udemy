package lesson36_Nested;

public class Test {
    static class A {} // 1 static inner
    class B {} // 2 inner
    void method () {
        {class C {}} // локальний клас в середині методу
    }

    // D анонімний клас
}
