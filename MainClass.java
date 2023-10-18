import java.util.ArrayList;

public class MainClass {
    public static void main(String[] args) {
        Plate plate = new Plate("Plate #1", 50);
        plate.info();
        plate.addFood(50);
        plate.info();
        ArrayList<Cat> cats = new ArrayList<>();
        cats.add(new Cat("Барсик", 5));
        cats.add(new Cat("Пушинка", 25));
        cats.add(new Cat("Толстяк", 45));
        cats.add(new Cat("Волосок", 15));
        cats.add(new Cat("Пушок", 30));
        cats.add(new Cat("Снежок", 5));

        cats.forEach(n -> n.info());
        cats.forEach(n -> n.eat(plate));
        System.out.println("*********************");
        cats.forEach(n -> n.info());

    }
}