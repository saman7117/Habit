package App;

import UserPackage.User;

public class Application {
    private User[] user;
    public User[] getUserByName(String s){
        User[] person = new User[100];
        int j = 0;
        for (int i = 0; i < user.length; i++) {
            if(user[i].getUsername().equals(s)){
                person[j] = user[i];
                j++;
            }
        }
        return person;
    }
}
