import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Aвтор:\tСтивен Кинг");
        System.out.println("Книги:\tЦикл романов \"Тёмная башня\"");
        System.out.println();

        Movie shoushenka = new Movie(
                "Побег из Шоушенка",
                "Стивен кинг: \"Побег из Шоушенка (книга)\"",
                "Фрэнк Дарабонт",
                "Премия Оскар за лучшую мужскую Роль(1995)",
                "14 октября 1994" ,
                "9.1/10 (Кинопоиск)");

        Movie mist = new Movie(
                "Мгла",
                "Стивен Кинг \"Туман\"",
                "Фрэнк Дарабонт",
                "Лучшее специальное DVD-издание(2009)",
                "21 ноября 2007",
                "3/5 (Киного)"
        );

        Movie it = new Movie(
                "Оно",
                "Стивен кинг\"Оно\"",
                "Энди Мускетти",
                "Лучший молодой актёр(2017)",
                "7 сентября 2017",
                "7,6/10 (Иви)"
        );

        List<Movie> movies = new ArrayList<>();
        movies.add(shoushenka);
        movies.add(mist);
        movies.add(it);

        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("1 - Побег из Шоушенка\n2 - Мгла\n3 - Оно\n Выберите номер фильма что бы посмотреть подробнее\n");
            try{
                int choice = sc.nextInt();
                System.out.println(movies.get(choice-1).printInfo());
            }catch (InputMismatchException | IndexOutOfBoundsException e){
                break;
            }

        }
    }
}