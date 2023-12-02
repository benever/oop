/*public class Phone {
    //1
    String number;
    String model;
    double weight;
    //2
    public Phone(String number, String model, double weight)
    {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }
    //6
    public Phone(String number, String model)
    {
        this.number = number;
        this.model = model;
    }
    //7
    public Phone() {
    }
    //4
    public void receiveCall(String name)
    {
        System.out.println("Звонит " + name);
    }
    //9
    public void receiveCall(String name, String callerNumber)
    {
        System.out.println("Звонит " + name + ". Номер телефона: " + callerNumber);
    }
    //4
    public String getNumber()
    {
        return number;
    }
    //10
    public void sendMessage(String... numbers)
    {
        System.out.println("Отправить сообщение на номера:");
        for (String number : numbers) {
            System.out.println(number);
        }
    }
}*/
//JavaBean
    public class Phone {
    String number;
    String model;
    double weight;
    public Phone() {
    }
    public void receiveCall(String name)
    {
        System.out.println("Звонит " + name);
    }
    public void receiveCall(String name, String callerNumber)
    {
        System.out.println("Звонит " + name + ". Номер телефона: " + callerNumber);
    }
    public void sendMessage(String... numbers)
    {
        System.out.println("Отправить сообщение на номера:");
        for (String number : numbers) {
            System.out.println(number);
        }
    }
    public String getNumber()
    {
        return number;
    }
    public void setNumber(String number)
    {
        this.number = number;
    }
    public String getModel()
    {
        return model;
    }
    public void setModel(String model)
    {
        this.model = model;
    }
    public double getWeight()
    {
        return weight;
    }
    public void setWeight(double weight)
    {
        this.weight = weight;
    }
}