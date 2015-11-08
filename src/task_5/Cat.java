package task_5;

/**
 * Created by Anna on 08.11.2015.
 */
public class Cat {
    String name;
    int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String may() {
        return "may-may";
    }

    public String eat(Cut cut) {
        if (cut.isFull()) {
            return "nam-nam";
        } else {
            return "жрать";
        }
    }
}
