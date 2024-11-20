import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        User user = new User();
        UserDataBase userDataBase = new UserDataBase();
        Scanner scannerText = new Scanner(System.in);
        Scanner scannerNum = new Scanner(System.in);
        while (true) {
            System.out.println("керектуу номерди танданыз!!!");
            System.out.println("1. Каттоо.    Register");
            System.out.println("2. Кирүү      Login");
            System.out.println("3. Чыгyy.     Exit");
            System.out.print("Тандаңыз: ");
            int choice = scannerNum.nextInt();

            switch (choice) {
                case 1 -> {
                    User register = user.Register(scannerText);
                    userDataBase.addLogin(register);
                }
                case 2 -> {
                    if (userDataBase.getUsers() != null) {
                        userDataBase.loginUser(scannerNum);
                    }else {
                        System.out.println("сизде аккаун сакталбаган");
                    }

                }
                case 3 -> {
                    return;
                }
                default -> {

                }
            }
        }
    }
}