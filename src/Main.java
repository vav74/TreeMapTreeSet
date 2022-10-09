import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Predicate<Person> isNot18yo = (p)->p.getAge()<18;
        List<Person> people = new ArrayList<>();
        Person p1 = new Person("Антуан", "Мари Жан-Батист Роже де Сент-Экзюпери", 42);
        Person p2 = new Person("Иоганн", "Кристоф Фридрих фон Шиллер", 24);
        Person p3 = new Person("Филипп", "Ауреол Теофраст Бомбаст фон Гогенгейм Парацельс", 36);
        Person p4 = new Person("Джордж", "Ноэл Гордон Байрон", 25);
        Person p5 = new Person("Оскар", "Фингал О’Флаэрти Уиллз Уайльд", 27);
        Person p6 = new Person("Публий", "Мирон Вергилий", 40);
        Person p7 = new Person("Фрэнсис", "Скотт Ки Фицджеральд", 16);
        Person p8 = new Person("Иоганн", "Вольфганг Гете", 17);
        people.add(p1);
        people.add(p2);
        people.add(p3);
        people.add(p4);
        people.add(p5);
        people.add(p6);
        people.add(p7);
        people.add(p8);
        people.sort(new PersonComp(5));
        people.removeIf(isNot18yo);
        System.out.println(people);
    }
}