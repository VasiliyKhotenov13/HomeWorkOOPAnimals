public class Main {
    public static void main(String[] args) {

        Herbivore gazelle = new Herbivore("Газель", 3, "Сафари",
                50,"");
        Herbivore giraffe = new Herbivore("Жираф", 0, "",
                15, "Листики с деревьев!");
        Herbivore horse = new Herbivore("Лошадь", 9, "Поля и луга",
                30, "");

        Predators hyena = new Predators("Гиена", 0, "",
                25, null);
        Predators tiger = new Predators("Тигр", 14, "Джунгли",
                30, "");
        Predators bear = new Predators("Медведь", 2, "",
                0, "Мясо и рыба");

        Amphibians frog = new Amphibians("Лягушка", 1, "Болото");
        Amphibians snake = new Amphibians("Уж пресноводный", 0, "");

        FlyingBirds seagull = new FlyingBirds("Чайка", 2, "", "");
        FlyingBirds albatross = new FlyingBirds("Альбатрос", 0, "На берегу моря",
                "Летает");
        FlyingBirds falcon = new FlyingBirds("Сокол", 5, "Горы, степи, леса",
                "Летает");

        NotFlyingBirds peacock = new NotFlyingBirds("Павлин", 0, "Зоопарк",
                "Ходит-бродит");
        NotFlyingBirds penguin = new NotFlyingBirds("Пингвин", 3, "Антартика",
                "Прогулки в развалочку");
        NotFlyingBirds birdDoDo = new NotFlyingBirds("Птица ДоДо", 0, "",
                "");

        System.out.println(gazelle.toString());
        System.out.println(giraffe.toString());
        System.out.println(horse.toString());

        System.out.println(hyena.toString());
        System.out.println(tiger.toString());
        System.out.println(bear.toString());

        System.out.println(frog.toString());
        System.out.println(snake.toString());

        System.out.println(seagull.toString());
        System.out.println(albatross.toString());
        System.out.println(falcon.toString());

        System.out.println(peacock.toString());
        System.out.println(penguin.toString());
        System.out.println(birdDoDo.toString());

        tiger.sleep();
        bear.eat();
        hyena.hunting();

        gazelle.sleep();
        giraffe.eat();
        horse.pasture();

        frog.eat();
        frog.go();
        snake.hunting();

        peacock.eat();
        penguin.walk();
        birdDoDo.sleep();

        falcon.flying();
        albatross.eat();
        seagull.go();
    }
}