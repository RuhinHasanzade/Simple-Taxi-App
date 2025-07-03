package util;

import Types.UserType;
import data.DataBase;
import entity.Driver;
import entity.Passenger;
import entity.UserBase;

import java.util.List;
import java.util.Scanner;

public class MenuUtil {

    private static UserBase loggedUser = null;
    static Scanner sc = new Scanner(System.in);
    public static void registerUser() {
        System.out.println("=========Register=========");
        System.out.print("Istifadechi adi: ");
        String username = sc.nextLine();
        sc.nextLine();
        System.out.print("Sifre: ");
        String password = sc.nextLine();
        System.out.println("1. Driver");
        System.out.println("2. Passenger");
        int selectedNum = getMenuInt("Istifadechi tipin secin: ");
        if (selectedNum == 1) {
            Driver driver = new Driver(username,password, UserType.DRIVER);
            DataBase.users.add(driver);
            System.out.println("Driver ugurla elave edildi!!!");
        }else if(selectedNum == 2) {
            Passenger passenger = new Passenger(username,password,UserType.PASSANGER);
            DataBase.users.add(passenger);
            System.out.println("Passenger ugurla elave edildi");
        }else {
            System.out.println("Ugursuz ceht");
        }
    }

    public static void loginUser() {
        System.out.println("=========Login=========");
        System.out.print("Istifadechi adi: ");
        String username = sc.nextLine();
        System.out.print("Sifre: ");
        String password = sc.nextLine();
        List<UserBase> users = DataBase.users;
        boolean found = false;
        for (UserBase user : users) {
            String name = user.getUserName();
            if (name != null && name.equals(username)) {
                found = true;
                if (user.getPassword().equals(password)) {
                    System.out.println("Siz ugurla dagil olduz!!!");
                    System.out.println("Username: " + user.getUserName());
                    System.out.println("Password: " + user.getPassword());
                    System.out.println("UserType: " + user.getUserType());
                    loggedUser = user;
                    user.showMenu();
                }else {
                    System.out.println("Password yalnisdir!!!");
                }
                return;
            }
        }

        if (!found) {
            System.out.println("Uygun Istifadechi tapilmadi!");
        }
    }


    public static int getMenuInt(String text) {
        System.out.print(text);
        int selectedNum = sc.nextInt();
        sc.nextLine();
        return selectedNum;
    }
}
