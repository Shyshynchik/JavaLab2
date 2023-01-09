package create_order;

import java.util.ArrayList;

public class User {
    String firstName;
    String lastName;
    String nickName;
    String passWord;
    ArrayList<Product> userCart;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public ArrayList<Product> getUserCart() {
        return userCart;
    }

    public void setUserCart(ArrayList<Product> userCart) {
        this.userCart = userCart;
    }
}
