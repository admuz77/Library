package pl.javastart.library.app;
import pl.javastart.library.model.Book;

public class Library {
    public static void main(String[] args) {
        final String appName = "Biblioteka v0.5";

        Book book1 = new Book("Pan Samochodzik i Templariusze ", "Zbigniew Nienacki",      1966,      223, "Oficyna Wydawnicza WARMIA", "9788385875031");
        Book book2 = new Book("Podróż za jeden uśmiech", "Adam Bahdaj", 1973, 214, "Wydawnictwo Literatura",
                "9788376724539");
        Book book3 = new Book("Wilki", "Adam Wajrak",
                2015, 272, "Agora", "9788326823053");

        System.out.println(appName);
        System.out.println("Książki dostępne w bibliotece:");
        book1.printInfo();
        book2.printInfo();
        book3.printInfo();
    }
}