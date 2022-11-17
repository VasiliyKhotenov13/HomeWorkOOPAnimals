import java.util.Objects;

public class NotFlyingBirds extends Birds {

    private String typeOfMovements;

    public NotFlyingBirds(String name, Integer age, String habitat, String typeOfMovements) {
        super(name, age, habitat);
        if (typeOfMovements == null || typeOfMovements.length() == 0) {
            this.typeOfMovements = "Пешком хожу, погода не лётная!";
        } else {
            this.typeOfMovements = typeOfMovements;
        }
    }

    public void walk() {
        System.out.println(getName() + ". Пойду прогуляюсь, посмотрю как у кур дела!");
    }

    public String getTypeOfMovements() {
        return typeOfMovements;
    }

    public void setTypeOfMovements(String typeOfMovements) {
        this.typeOfMovements = typeOfMovements;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        NotFlyingBirds that = (NotFlyingBirds) o;
        return Objects.equals(typeOfMovements, that.typeOfMovements);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeOfMovements);
    }

    @Override
    public String toString() {
        return "Птица, летающая: " + name +
                ", возраст: " + age +
                ", среда обитания: " + habitat +
                ", тип передвижения: " + typeOfMovements +
                '.';
    }
}
