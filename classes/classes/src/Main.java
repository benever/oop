/*public class Main {
    public static void main(String[] args) {
        Phone phone1 = new Phone("123456789", "iPhone X", 0.4);
        Phone phone2 = new Phone("987654321", "Samsung Galaxy S10");
        Phone phone3 = new Phone();

        System.out.println("Информация о первом телефоне:");
        System.out.println("Номер: " + phone1.getNumber());
        System.out.println("Модель: " + phone1.model);
        System.out.println("Вес: " + phone1.weight + " кг");

        System.out.println("Информация о втором телефоне:");
        System.out.println("Номер: " + phone2.getNumber());
        System.out.println("Модель: " + phone2.model);
        System.out.println("Вес: " + phone2.weight + " кг");

        System.out.println("Информация о третьем телефоне:");
        System.out.println("Номер: " + phone3.getNumber());
        System.out.println("Модель: " + phone3.model);
        System.out.println("Вес: " + phone3.weight + " кг");

        phone1.receiveCall("John");
        phone2.receiveCall("Alice", "+1234567890");

        phone1.sendMessage("111111111", "222222222", "333333333");
        phone2.sendMessage("444444444", "555555555");
    }
}*/
    //JavaBean
public class Main {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.setNumber("123456789");
        phone.setModel("iPhone X");
        phone.setWeight(0.4);

        System.out.println("Информация о телефоне:");
        System.out.println("Номер: " + phone.getNumber());
        System.out.println("Модель: " + phone.getModel());
        System.out.println("Вес: " + phone.getWeight() + " кг");

        phone.receiveCall("John");
        phone.receiveCall("Alice", "+1234567890");

        phone.sendMessage("111111111", "222222222", "333333333");
    }
}


/*public class Main {
    public static void main(String[] args) {
        Reader reader1 = new Reader("Петров В. В.", 12345, "Математика", "01.01.1990", "+79123456789");
        Reader reader2 = new Reader("Иванов И. И.", 54321, "Физика", "02.02.1995", "+79234567890");

        reader1.takeBook(3);
        reader1.takeBook("Приключения", "Словарь", "Энциклопедия");
        reader1.takeBook(new Book("Приключения", "Автор1"), new Book("Словарь", "Автор2"), new Book("Энциклопедия", "Автор3"));

        reader2.returnBook("Приключения", "Словарь", "Энциклопедия");
        reader2.returnBook(2);
    }
}*/