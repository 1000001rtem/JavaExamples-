package converttipes;

public class Fish extends Animal implements ISwimble{
    @Override
    public void swim() {
        System.out.println("swim");
    }

    public void eat(){
        System.out.println("eat");
    }
}
