public class Cat {
    private String name;
    private int appetite;

    public boolean isFullness() {
        return fullness;
    }

    public void setFullness(boolean fullness) {
        this.fullness = fullness;
    }

    private boolean fullness;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }


    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.fullness = false;
    }

    public void eat(Plate plate) {
        if (this.getAppetite() <= plate.getFood()) {
            plate.setFood(plate.getFood() - this.getAppetite());
            this.fullness = true;
            this.appetite = 0;
            System.out.println(this.name + " поел");

        } else {
            System.out.println(this.name + " не поел");
        }
    }

    public void info() {
        System.out.printf("%s %s%n", this.getName(), this.isFullness() ? "Сыт" : "Голоден");
    }
}