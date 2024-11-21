import java.util.Arrays;
import java.util.Scanner;

public class UserDataBase {
    private User[] users = new User[0];

    ProductDataBase productDataBase = new ProductDataBase();

    public UserDataBase() {
    }

    public void addLogin(User users1) {
        users = Arrays.copyOf(users, users.length + 1);
        users[users.length - 1] = users1;
        for (User user : this.users) {
            System.out.println("\nFirst Name : " + user.getFirstName());
            System.out.println("Last Name : " + user.getLastName());
            System.out.println("Email : " + user.getEmail());
            System.out.println("Last Name : " + user.getPassword());
        }
    }

    public User[] getUsers() {
        return users;
    }

    public void loginUser(Scanner scanner) {
        System.out.println("сиздин акаунт:");
        int j = 1;
        for (User user : getUsers()) {
            System.out.println("\n"+j + ". " + user.getEmail()+"\n");
            j++;
        }
        System.out.println("0. Logout              Чыгуу");

        System.out.print("танданыз : ");
        int userLogin = scanner.nextInt();
        if (userLogin==0){
            return;
        }
        for (int i = 1; i <= users.length; i++) {
            if (userLogin == i) {
                while (true) {
                    System.out.println("0. Logout              Чыгуу");
                    System.out.println("1. Add new Product     Жаңы продукт кошуңуз");
                    System.out.println("2. Get all Products    Бардык продукталарды алыңыз");
                    System.out.println("3. Get all Book        Бардык китепти алыңыз");
                    System.out.println("4. Get all Device.     Бардык устройстволарды алыңыз");
                    System.out.print("Тандаңыз: ");
                    int command = scanner.nextInt();
                    switch (command) {
                        case 0 -> {
                            return;
                        }
                        case 1 -> {
                            while (true) {
                                System.out.println("1. add Device");
                                System.out.println("2. add Book");
                                System.out.println("0. Logout              Чыгуу");
                                System.out.print("Тандаңыз: ");
                                int choice = scanner.nextInt();
                                switch (choice) {
                                    case 1 -> {
                                       Device newDevice = productDataBase.addDevise(scanner);
                                       productDataBase.addDevise(newDevice);
                                    }
                                    case 0 -> {

                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

    }


}
