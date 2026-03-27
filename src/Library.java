//comment
class Book {

    private String title;
    private String auhtor;

    public Book(String title, String author) {
        this.title = title;
        this.auhtor = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return auhtor;
    }
}
class Professor {

    private String name;

    public Professor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
class LibrarySystem {

    public void checkout(Professor p, Book b) {
        System.out.println(p.getName()   + b.getTitle());
    }
}



public class Library {
    public static void main(String[] args) {

        Book b1 = new Book("Book", "by someone");
        Professor prof1 = new Professor("Pinto");

        LibrarySystem library = new LibrarySystem();
        library.checkout(prof1, b1);
    }
}
