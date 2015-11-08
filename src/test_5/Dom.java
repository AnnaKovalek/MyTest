package test_5;

/**
 * Created by Anna on 08.11.2015.
 */
public class Dom {
    private Cat myCat;
    private Cut catscut;

    public Dom(Cut catscut, Cat myCat) {
        this.catscut = catscut;
        this.myCat = myCat;
    }
    public void helloCat (){
        String may = this.myCat.may();
        System.out.println(may);

    }
    public void eat (){
        String eat = this.myCat.eat(catscut);
        System.out.println(eat);
    }
}
