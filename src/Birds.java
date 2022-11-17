import java.util.Objects;

public class Birds extends Animals {

    protected String habitat;

    public Birds(String name, Integer age, String habitat) {
        super(name, age);
        if (habitat == null || habitat.length() == 0) {
            this.habitat = "ПРИРОДА";
        } else {
            this.habitat = habitat;
        }
    }

    @Override
    public void sleep() {
        System.out.println(getName() + ". Птичка спит! Не пугай её!");
    }

    @Override
    public void go() {
        System.out.println(getName() + ". Птичка решила куда-то прогуляться!");
    }

    @Override
    public void eat() {
        System.out.println(getName() + " поклевал бы что-то!");
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Birds birds = (Birds) o;
        return Objects.equals(habitat, birds.habitat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), habitat);
    }

    @Override
    public String toString() {
        return "Птица: " + name +
                ", возраст: " + age +
                ", среда обитания: " + habitat +
                '.';
    }
}
