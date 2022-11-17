import java.util.Objects;

public class Amphibians extends Animals {

    protected String habitat;


    public Amphibians(String name, Integer age, String habitat) {
        super(name, age);
        if (habitat == null || habitat.length() == 0) {
            this.habitat = "ПРИРОДА!";
        } else {
            this.habitat = habitat;
        }
    }

    @Override
    public void sleep() {
        System.out.println(getName() + ". Впал в анабиоз!");
    }

    @Override
    public void go() {
        System.out.println(getName() + ". Сгоняю прогуляться, чего сидеть!");
    }

    @Override
    public void eat() {
        System.out.println(getName() + " хочет покушаЦ!");
    }

    public void hunting() {
        System.out.println(getName() + ". Пойду кого-нибудь съем!");
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
        Amphibians that = (Amphibians) o;
        return Objects.equals(habitat, that.habitat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), habitat);
    }

    @Override
    public String toString() {
        return "Земноводное: " + name +
                ", возраст: " + age +
                ", среда обитания: " + habitat +
                '.';
    }
}
