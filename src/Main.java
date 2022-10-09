import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Comparator<Person> personComparator = (p1, p2) -> {
            int len1 = Math.min(p1.getSurname().split("[ -]").length, 5);
            int len2 = Math.min(p2.getSurname().split("[ -]").length, 5);
            if (len1 != len2) {
                return Integer.compare(len1, len2);
            }
            return Integer.compare(p1.getAge(), p2.getAge());
        };
        List<Person> people = new ArrayList<>();
        Person p1 = new Person("Антуан", "Мари Жан-Батист Роже де Сент-Экзюпери", 42);
        Person p2 = new Person("Иоганн", "Кристоф Фридрих фон Шиллер", 24);
        Person p3 = new Person("Филипп", "Ауреол Теофраст Бомбаст фон Гогенгейм Парацельс", 36);
        Person p4 = new Person("Джордж", "Ноэл Гордон Байрон", 25);
        Person p5 = new Person("Оскар", "Фингал О’Флаэрти Уиллз Уайльд", 27);
        Person p6 = new Person("Публий", "Мирон Вергилий", 40);
        people.add(p1);
        people.add(p2);
        people.add(p3);
        people.add(p4);
        people.add(p5);
        people.add(p6);
        people.sort(personComparator);
        System.out.println(people);
    }
}