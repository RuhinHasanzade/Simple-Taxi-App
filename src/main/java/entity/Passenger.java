package entity;

import Types.TaxiType;
import Types.UserType;
import data.DataBase;
import util.MenuUtil;

import java.util.Scanner;

public class Passenger extends UserBase{

    public Passenger(String userName, String password, UserType userType) {
        super(userName, password, userType);
    }

    @Override
    public void showMenu() {
        Scanner sc =  new Scanner(System.in);
        System.out.println("1. Taksi Cagir");
        System.out.println("2. Cixis");
        int selectedNum = MenuUtil.getMenuInt("Servislerden birin sec: ");
        if (selectedNum == 1) {
            System.out.print("Getmek istediyin unvani dagil et: ");
            String destinationAddres = sc.nextLine();
            System.out.println("1. ECONOMY");
            System.out.println("2. STANDARD");
            System.out.println("3. PREMIUM");
            int typeNum = MenuUtil.getMenuInt("TaxiType secin:");
            TaxiType taxiType = null;
            if (typeNum == 1) {
                 taxiType = TaxiType.ECONOMY;
            } else if (typeNum == 2) {
                 taxiType = TaxiType.STANDARD;
            }else if (typeNum == 3) {
                 taxiType = TaxiType.PREMIUM;
            }
            Order order = new Order(this.getUserName(),destinationAddres,taxiType);
            DataBase.orders.add(order);
            System.out.println("Taksi Ugurla Cagirildi!!");
        } else if(selectedNum == 2) {
            return;
        }
    }
}
