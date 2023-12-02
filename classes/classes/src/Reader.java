public class Reader {
    //12345
    String fullName;
    int readerTicket;
    String faculty;
    String dateOfBirth;
    String phone;
    Reader(String fullName, int readerTicket, String faculty, String dateOfBirth, String phone)
    {
        this.fullName = fullName;
        this.readerTicket = readerTicket;
        this.faculty = faculty;
        this.dateOfBirth = dateOfBirth;
        this.phone = phone;
    }
    //6
    void takeBook(int numberOfBooks)
    {
        System.out.println(fullName + " взял " + numberOfBooks + " книги");
    }
    //8
    void takeBook(String... bookNames)
    {
        System.out.print(fullName + " взял книги:");
        for (String bookName : bookNames) {
            System.out.print(" " + bookName + ","); }
        System.out.println();
    }
    //8
    void takeBook(Book... books)
    {
        System.out.print(fullName + " взял книги:");
        for (Book book : books) {
            System.out.print(" " + book.name + ","); }
        System.out.println();
    }
    //9
    void returnBook(String... bookNames)
    {
        System.out.print(fullName + " вернул книги:");
        for (String bookName : bookNames) {
            System.out.print(" " + bookName + ","); }
        System.out.println();
    }
    //6
    void returnBook(int numberOfBooks)
    {
        System.out.println(fullName + " вернул " + numberOfBooks + " книги");
    }
}
    //8
    class Book {
        String name;
        String author;
        Book(String name, String author)
        {
            this.name = name;
            this.author = author;
        }
}
