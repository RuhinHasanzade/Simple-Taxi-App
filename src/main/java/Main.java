import util.MenuUtil;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            System.out.println("========TAXI APP========");
            System.out.println("1. Qeydiyyat");
            System.out.println("2. Giris");
            System.out.println("3. Cixis");
            int selectedNum = MenuUtil.getMenuInt("Servislerden birin sec: ");

            if(selectedNum == 1) {
                MenuUtil.registerUser();
            } else if (selectedNum == 2) {
                MenuUtil.loginUser();
            } else if (selectedNum == 3) {
                System.out.println("Cixilir....");
                break;
            }else  {
                System.out.println("Yalnis secim!");
            }
        }


        }

    }

