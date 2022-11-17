import java.util.Objects;

public abstract class Animals {

    protected String name;
    protected Integer age;

    public Animals(String name, Integer age) {
        if (name == null || name.length() == 0) {
            this.name = "Животное?";
        } else {
            this.name = name;
        }
        if (age <= 0) {
            this.age = 1;
        } else {
            this.age = age;
        }
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public abstract void sleep();

    public abstract void go();

    public abstract void eat();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animals animals = (Animals) o;
        return name.equals(animals.name) && age.equals(animals.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Животное: " + name +
                ", возраст: " + age + ".";
    }
}
