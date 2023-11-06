package lesson40_Anonymous;

public class Anonymous {
    private int x = 5;

    public static void main(String[] args) {
        Math m = new Math() {
            @Override
            public int doOperation(int a, int b) {

                //для доступу до полів класу треба створити обєкт зовнішнього класу
                Anonymous anonymous = new Anonymous();
                System.out.println(anonymous.x);


                return a+b;


            }
        };

        Math m2 = new Math() {
            @Override
            public int doOperation(int a, int b) {
                return a*b;
            }
        };


        System.out.println(m.doOperation(3,6));
        System.out.println(m2.doOperation(3,6));

    }

}



    interface Math {
    int doOperation (int a, int b);
}

