package third;

public class User {
    final private String login,password;

    User(String login, String password){
        this.login = login;
        this.password = password;
    }
    static class Query{
        final private String login,password;
        Query(String l, String p){
            login = l;
            password = p;
        }
        public void printToLog(){
            System.out.println("Пользователь с логином: "+login+" и паролем: "+password+" отправил запрос");
        }
    }
    public void createQuery(){
        Query query = new Query(login,password);
        query.printToLog();
    }

    public static void main(String[] args) {
        User user = new User("Sam","saam02");
        user.createQuery();

        Query query = new Query("Atan","at123");
        query.printToLog();
    }
}