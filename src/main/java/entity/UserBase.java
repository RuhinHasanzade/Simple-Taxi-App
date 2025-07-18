package entity;

import Inter.UserAction;
import Types.UserType;

public abstract class UserBase implements UserAction {
    private String userName;
    private String password;
    private UserType userType;

    public UserBase(String userName, String password, UserType userType) {
        this.userName = userName;
        this.password = password;
        this.userType = userType;
    }





    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }

    @Override
    public abstract void showMenu();
}
