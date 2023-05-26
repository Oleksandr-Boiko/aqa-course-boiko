package file_reader;

import java_oop.User;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WorkWithFile {

    private final static String USERS_FILE = "users.csv";
    public static FileWriter fileWriter;
    public static FileReader fileReader;
    public static Scanner scanner;

    public static void addUser(User user){
        try {
            fileWriter = new FileWriter(USERS_FILE, true);
            fileWriter.append(user.toString() + "\n");
            System.out.println("User successfully added!");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void printUsers() throws IOException {
        try {
            fileReader = new FileReader(USERS_FILE);
            scanner = new Scanner(fileReader);
            if (!scanner.hasNextLine()){
                new UsersNotFoundException("No users yet").printStackTrace();
            }
            while (scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            fileReader.close();
            scanner.close();
        }
    }

    public static void main(String[] args) throws UsersNotFoundException, IOException {
        String firstName;
        String lastName;
        String email;
        while(true){
            System.out.println("Choose one of options: addUser | printUsers | exit ");
            scanner = new Scanner(System.in);
            switch (scanner.nextLine()) {
                case "addUser" -> {

                    do {
                        System.out.println("Please enter first name: ");
                        firstName = scanner.nextLine();
                    } while (firstName.isBlank());
                    do {
                        System.out.println("Please enter last name: ");
                        lastName = scanner.nextLine();
                    } while (lastName.isBlank());
                    do {
                        System.out.println("Please enter email: ");
                        email = scanner.nextLine();
                    } while (!email.contains("@"));
                    User user = new User(firstName, lastName, email);
                    addUser(user);
                }
                case "printUsers" -> {
                    printUsers();
                }
                case "exit" -> {
                    System.out.println("Goodbye:)");
                    return;
                }
            }
        }
    }
}
