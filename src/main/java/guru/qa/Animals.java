package guru.qa;

public class Animals {

    //создаем новый тип данных=новый класс, Dog. Представляющий из себя комбинацию нескольких элементарных параметров

    int age;
    String name;
    byte eyes;
    String breed;
    boolean isKind;
    long wool;

    //добавляем метод
    public void sayAge() {
        System.out.println("Возраст " + age + " года");
    }

    public void sayName() {
        System.out.println("Кличка " + name);
    }

    public void sayEyes() {
        System.out.println(eyes + " глаза");
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

