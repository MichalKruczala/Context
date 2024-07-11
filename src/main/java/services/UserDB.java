package services;

public class UserDB implements IUserDB{
    private static UserDB instance;

    private UserDB(){};

    public static UserDB getInstance() {
        if (instance == null) {
            instance = new UserDB();
        }
        return instance;
    }

    public void saveUser() {

    }

    public void deleteUser() {

    }

    public void updateUser() {

    }

    public void getUser() {

    }
}
