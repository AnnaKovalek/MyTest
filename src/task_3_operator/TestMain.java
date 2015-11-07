package task_3_operator;

/**
 * Created by Anna on 08.11.2015.
 */
public class TestMain {

    public static void main(String[] args) {
        int a = 4;
        int b = 5;
        if (a < b) {
            System.out.println("true");
        }
        if (a > b) {
            System.out.println("true");
        } else {
            System.out.println(false);
        }


        switch (a) {
            case 2:
                System.out.println(2);
                break;
            case 4:
                System.out.println(4);
                break;
            case 5:
                System.out.println(5);
            default:
                System.out.println("default");
                break;

        }


    }
}
