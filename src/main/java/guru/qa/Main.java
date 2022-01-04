package guru.qa;

public class Main {
//создаем метод main
   public static void main(String[] args) {
       Animals dog = new Animals(); //создание объекта класса Main
       dog.age = 4; // полю объекта Dog присваивается значение 4
       dog.name = "Виски";
       dog.eyes= 2;
       dog.breed = "Собака, такса";
       dog.isKind = true;
       dog.wool = 900719900;
       dog.sayBreed();
       dog.sayName();
       dog.sayEyes();
       dog.sayAge();
       dog.sayIsKind();
       dog.sayWool();

       Animals cat = new Animals(); //создание второго объекта класса Main
       cat.age = 3;
       cat.name = "Тим";
       cat.breed = "Кошка, сфинкс";
       cat.isKind = false;
       cat.wool = 0;
       cat.sayBreed();
       cat.sayName();
       cat.sayAge();
       cat.sayIsKind();
       cat.sayWool();
    }
}
