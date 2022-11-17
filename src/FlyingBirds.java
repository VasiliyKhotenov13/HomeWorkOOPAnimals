import java.util.Objects;

public class FlyingBirds extends Birds {

    private String typeOfMovements;

    public FlyingBirds(String name, Integer age, String habitat, String typeOfMovements) {
        super(name, age, habitat);
        if (typeOfMovements == null || typeOfMovements.length() == 0) {
            this.typeOfMovements = "I Believe I Can Fly!!!";
        } else {
            this.typeOfMovements = typeOfMovements;
        }
    }

    public void flying() {
        System.out.println(getName() + ". Я улетаю, но обещаю вернуться!");
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
        FlyingBirds that = (FlyingBirds) o;
        return Objects.equals(typeOfMovements, that.typeOfMovements);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeOfMovements);
    }

    @Override
    public String toString() {
        return "Птица, не летающая: " + name +
                ", возраст: " + age +
                ", среда обитания: " + habitat +
                ", тип передвижения: " + typeOfMovements +
                '.';
    }
}
