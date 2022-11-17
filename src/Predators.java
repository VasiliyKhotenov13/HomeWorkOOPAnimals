import java.util.Objects;

public class Predators extends Mammals{

    private String typeOfFood;

    public Predators(String name, Integer age, String habitat, Integer speedOfMovement, String typeOfFood) {
        super(name, age, habitat, speedOfMovement);
        if (typeOfFood == null || typeOfFood.length() == 0) {
            this.typeOfFood = "Что-то мясное, возможно оно ещё бегает!";
        } else {
            this.typeOfFood = typeOfFood;
        }
    }

    public void hunting() {
        System.out.println(getName() + ". Я вышел на охоту! Кто не спрятался, я не виноват!");
    }

    public String getTypeOfFood() {
        return typeOfFood;
    }

    public void setTypeOfFood(String typeOfFood) {
        this.typeOfFood = typeOfFood;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Predators predators = (Predators) o;
        return Objects.equals(typeOfFood, predators.typeOfFood);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeOfFood);
    }

    @Override
    public String toString() {
        return "Хищьное млекопитающее: " + name +
                ", возраст: " + age +
                ", среда обитания: " + habitat +
                ", тип еды: " + typeOfFood +
                ", скорость передвижения: " + speedOfMovement +
                '.';
    }
}
