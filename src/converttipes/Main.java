package converttipes;

public class Main {
    public static void main(String[] args) {
        ISwimble fish1 = new Fish();
        Fish fish2 = new Fish();

        fish1.swim(); //этот объект типа ISwimble, а значит он может использовать только
        // те методы что есть к интерфейсе ISwimble, написать fish1.run() или fish1.eat() нельзя

        fish2.eat();
        fish2.swim();// с этим объектом таких проблем нет, потому что он типа Fish

        Fish fish3 = (Fish)fish1; //создаём третью рыбу и присваеиваем ей вторую рыбу приводя к типу Fish
        // просто написать Fish fish3 = fish1 нельзя, потому что они разных типов, но поскольку они в одной иерархии,
        // то мы можем привести одно к другому
        fish3.run(); // теперь можем использовать все "рыбные" методы

        ((Fish) fish1).run(); // так тоже можно написать
    }
}
