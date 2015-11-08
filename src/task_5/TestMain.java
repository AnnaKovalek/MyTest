package task_5;

/**
 * Created by Anna on 08.11.2015.
 */
public class TestMain {
    public static void main(String[] args) {
        Cat cat = new Cat("barsik", 8);
        Cut cut = new Cut(true);
        Dom dom = new Dom(cut, cat);
        dom.helloCat();
        dom.eat();
    }
}
