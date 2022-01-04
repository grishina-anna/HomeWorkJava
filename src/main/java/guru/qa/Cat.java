package guru.qa;

public class Cat {

    //создаем новый тип данных=новый класс, Cat
    int age;
    String name;
    String breed;
    boolean isKind;
    long wool;

    //добавляем метод
    public void sayAge() {
        System.out.println("Возраст " + age + " лет");
    }

    public void sayName() {
        System.out.println("Кличка " + name);
    }

    public void sayBreed() {
        System.out.println("Порода " + breed);
    }

    public void sayIsKind() {
        System.out.println("Дружелюбный " + isKind);
    }

    public void sayWool() {
        System.out.println(wool + " волоcков шерсти");
    }
}

