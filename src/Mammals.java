import java.util.Objects;

public class Mammals extends Animals {

    protected String habitat;
    protected Integer speedOfMovement;

    public Mammals(String name, Integer age, String habitat, Integer speedOfMovement) {
        super(name, age);
        if (habitat == null || habitat.length() == 0) {
            this.habitat = "ПРИРОДА";
        } else {
            this.habitat = name;
        }
        if (speedOfMovement <= 0) {
            this.speedOfMovement = 5;
        } else {
            this.speedOfMovement = speedOfMovement;
        }
    }

    @Override
    public void sleep() {
        System.out.println(getName() + ". Животное спит! Не будите его!");
    }

    @Override
    public void go() {
        System.out.println(getName() + ". Животное куда-то пошло! Будьте бдительны!");
    }

    @Override
    public void eat() {
        System.out.println(getName() + " немного проголодался! Покорми его!");
    }

    public void walk() {
        System.out.println("Животное пошло гулять!");
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public Integer getSpeedOfMovement() {
        return speedOfMovement;
    }

    public void setSpeedOfMovement(Integer speedOfMovement) {
        this.speedOfMovement = speedOfMovement;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Mammals mammals = (Mammals) o;
        return Objects.equals(habitat, mammals.habitat) && Objects.equals(speedOfMovement, mammals.speedOfMovement);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), habitat, speedOfMovement);
    }

    @Override
    public String toString() {
        return "Млекопитабщее: " + name +
                ", возраст: " + age +
                ", среда обитания: " + habitat +
                ", скорость передвижения: " + speedOfMovement +
                '.';
    }
}
