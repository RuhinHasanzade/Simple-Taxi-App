package entity;

import Types.UserType;
import data.DataBase;
import util.MenuUtil;

import java.util.List;
import java.util.Scanner;

public class Driver extends UserBase{

    public Driver(String userName, String password, UserType userType) {
        super(userName, password, userType);
    }

    @Override
    public void showMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Sifarişləri gör");
        System.out.println("2. Çıxış");
        int selectedNum = MenuUtil.getMenuInt("Servislerden birin sec:");
        if (selectedNum == 1) {
            List <Order> orders = DataBase.orders;
            for (Order order : orders ) {
                System.out.println(order);
            }
        }else if(selectedNum == 2) {
            return;
        }

    }
}
