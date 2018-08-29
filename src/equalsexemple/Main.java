package equalsexemple;

public class Main {

    public static void main(String[] args) {
        Car car1 = new Car("Lada", 60);
        Car car2 = new Car("Lada", 60);

        System.out.println(car1.equals(car2)); /* несмотря на то что объекты одинаковые результат будет false
        потому что если не переопределить метод equals внутри класса, то будут сравниваться ссылки на объекты, а они будут
        равны только тогда, когда речь идёт об одном и том же объекте, а у нас они разные.
         */

        Car car3 = car2;
        System.out.println(car2.equals(car3)); // объект один и тот же, ссылки равны - результат true


        Motorcycle moto1 = new Motorcycle("bmv", 150);
        Motorcycle moto2 = new Motorcycle("bmv", 150);

        System.out.println(moto1.equals(moto2)); /* у этого класса мы переопеределили метод equals и сравниваться объекты
        будут по условиям, которые мы там прописали (в данном случае мы просто сравниваем все поля,
        если какое-нибудь поле не будет равно результат будет false)
        по условиям объекты равны, значит результат true
        */
    }

}
