import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Aвтор:\tСтивен Кинг");
        System.out.println("Книги:\tЦикл романов \"Тёмная башня\"");
        System.out.println();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy", new Locale("ru"));

        Movie shoushenka = new Movie(
                "Побег из Шоушенка",
                "Стивен кинг: \"Побег из Шоушенка (книга)\"",
                "Фрэнк Дарабонт",
                "Премия Оскар за лучшую мужскую Роль(1995)",
                LocalDate.parse("14 октября 1994", formatter),
                9.1,
                "Кинопоиск");

        Movie mist = new Movie(
                "Мгла",
                "Стивен Кинг \"Туман\"",
                "Фрэнк Дарабонт",
                "Лучшее специальное DVD-издание(2009)",
                LocalDate.parse("21 ноября 2007", formatter),
                3.0,
                "Киного"
        );

        Movie it = new Movie(
                "Оно",
                "Стивен кинг\"Оно\"",
                "Энди Мускетти",
                "Лучший молодой актёр(2017)",
                LocalDate.parse("7 сентября 2017", formatter),
                7.6,
                "IVI"
        );
        Movie Empty = new Movie("проверка изменяемого списка меню",
                "",
                "",
                "",
                LocalDate.now(),
                0.0,
                "");

        List<Movie> movies = List.of(shoushenka, mist, it,Empty);

        Scanner sc = new Scanner(System.in);
        while (true){
            for(int i = 0; i<movies.size();i++){
                System.out.println(i+1 + "-"+movies.get(i).getName());
            }
            try{
                int choice = sc.nextInt();
                System.out.println(movies.get(choice-1).printInfo());
            }catch (InputMismatchException | IndexOutOfBoundsException e){
                break;
            }

        }
    }
}
