import java.util.Objects;

public class Herbivore extends Mammals {

    private String typeOfFood;

    public Herbivore(String name, Integer age, String habitat, Integer speedOfMovement, String typeOfFood) {
        super(name, age, habitat, speedOfMovement);
        if (typeOfFood == null || typeOfFood.length() == 0) {
            this.typeOfFood = "Что-то веганское, возможно даже просто травка!";
        } else {
            this.typeOfFood = typeOfFood;
        }
    }

    public String getTypeOfFood() {
        return typeOfFood;
    }

    public void setTypeOfFood(String typeOfFood) {
        this.typeOfFood = typeOfFood;
    }

    public void pasture() {
        System.out.println(getName() + ". Я пойду пастись, c Вашего позволения!");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Herbivore herbivore = (Herbivore) o;
        return Objects.equals(typeOfFood, herbivore.typeOfFood);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeOfFood);
    }

    @Override
    public String toString() {
        return "Травоядное млекопитающее: " + name +
                ", возраст: " + age +
                ", среда обитания: " + habitat +
                ", тип еды: " + typeOfFood +
                ", скорость передвижения: " + speedOfMovement +
                '.';
    }
}
