public class Plate {
    private int food;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public void addFood(int value) {
        System.out.println("***************");
        System.out.println(getName() + " было : " + getFood());
        System.out.println("Добавлено " + value);
        this.food += value;
        System.out.println("Стало " + getFood());
        System.out.println("***************");
    }


    public Plate(String name, int food) {
        this.food = food;
        setName(name);
    }

    public void info() {
        System.out.printf("%s = %d%n", this.getName(), food);
    }
}