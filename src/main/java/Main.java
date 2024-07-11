import services.UserDB;

public class Main <T>{
    public static void main(String[] args) {
        System.out.println("siema");


        Context context = new Context();
        context.registerBean(UserDB.class, UserDB::getInstance);
        UserDB userdb = context.getBean(UserDB.class);

        UserDB.getInstance();
                //TODO Zeby nie dało się wywołac poza contextem
    }

}
