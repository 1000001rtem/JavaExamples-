package equalsexemple;

import java.util.Objects;

public class Motorcycle {

    private String model;
    private int hoursePower;

    public Motorcycle(String model, int hoursePower) {
        this.model = model;
        this.hoursePower = hoursePower;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // если ссылки равны, значит это один и тот же объект поэтому возвращает true
        if (o == null || getClass() != o.getClass()) return false; //если объект пустой или сравниваемые обхекты разных классов
        Motorcycle that = (Motorcycle) o;
        return hoursePower == that.hoursePower &&
                Objects.equals(model, that.model); // возвращаем результат сравнения полей
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, hoursePower);
    } // чтобы всё работало корректно, переопределяя метод equals, нужно всегда переопеределять метод hashCode.
}
