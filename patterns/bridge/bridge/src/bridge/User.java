package bridge;

public class User {
    private UserImpl realUser;
    public User(UserImpl impl)
    {
        realUser = impl;
    }
    public void theSecond()
    {
        realUser = new SecondImpl();
        realUser.theSecond();
    }
    public void theFirst()
    {
        realUser = new FirstImpl();
        realUser.theFirst();
    }

}