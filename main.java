import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Scanner;

public class main {

    // Martin M
    // Hashmaps created
    // master hashmap will store the masterId and passwords
    // addUserId hashmap will store the normal entries.

    private static HashMap<String, String> master = new HashMap<>();

    private static HashMap<String, String> addUserId = new HashMap<String, String>();

    private static boolean hasrun;
    private static int option;

    private static Scanner scanner = new Scanner(System.in);

    public static void main (String[]args){

        String name = "";
        String password = "";

        String newpassword = "";

        String mastername = "";
        String masterpassword = "";
        String newmasterpassword = "";

        // Master user method prompts for correct credentials at program start
	// Incorrect input results in program termination
        masteruser(mastername, masterpassword);

        mainmenu();

        System.out.println("select your option");
        option = scanner.nextInt();

        // Add student
        if (option == 1) {
            UserId(name, password);
            main(args);

        }

        // Delete an entry
        if (option == 2) {
            Officialmasteraccess(mastername,newmasterpassword);
            delete(name, password);
            main(args);

        }

        // Allows changing of User ID passwords
        if (option == 3) {
            masteruser(mastername, masterpassword);
            updated(name, password, newpassword);
            main(args);

        }

        //Modify the Master user password
        if(option == 4){
            ModifyMasteruserupdated(mastername, masterpassword, newmasterpassword);
            main(args);

        }
        // Stores User ID and passwords in a file with encryption
        if(option == 5){
            Officialmasteraccess(mastername,newmasterpassword);
            encrypyt();
            main(args);
        }

        // Stores Master User ID and passwords in a file with encryption
        if(option == 6){
            Officialmasteraccess(mastername,newmasterpassword);
            encrypytMaster();
            main(args);

        }

    }

    public static void masteruser (String username, String password) {

        // Implemented an if statement to ensure method runs only once
        // Guarantees transition to main menu method after initial selection, preventing repeated access to master user method

        if (!hasrun) {

            System.out.println("Please enter in your User ID and password ");

            System.out.println("Enter in the master User Id");
            username = scanner.next();

            System.out.println("Enter in the master password");
            password = scanner.next();

            if (username.equals("username") && password.equals("password")) {
                System.out.println("welcome");

                master.put(username, password);

            }

            else {
                // Exits program if credentials are incorrect
                System.out.println("Wrong Master Id and password");
                System.exit(-1);

            }
            hasrun=true;

        }

    }


    private static void mainmenu() {

        System.out.println("press 1 : Enter an entry");
        System.out.println("press 2 : Delete an entry");
        System.out.println("press 3 : Modify an entry");
        System.out.println("press 4 : Modify the Master Id and passwords");
        System.out.println("press 5 : Store the userId's and passwords into a file");
        System.out.println("press 6 : Store the Master Id password into a file");

    }

    // Adding students to the addUserId() method
    public static void UserId(String username, String password) {

        System.out.println("You will need to enter your credentials first to enter a new in a new entry");
        System.out.println("Enter in a username");
        username = scanner.next();

        System.out.println("Enter in a password");
        password = scanner.next();

        // Stores username and passwords entries here
        addUserId.put(username, password);

        // https://javatutorialhq.com/java/util/hashmap-class/put-method-example/
        // Java Hashmaps - Data Accessed on 26/11/21
        // javatutorialhq.com

    }


    // Deletes an entry in the addUserId hashmap
    private static boolean delete (String name, String password){

        System.out.println("Enter the username in which you want to delete");
        name = scanner.next();

        System.out.println("Enter in the password");
        password = scanner.next();

        // Validates user input against addUserId hashmap entries
        if (addUserId.containsKey(name) && addUserId.containsValue(password)) {
            addUserId.remove(name, password);
            return true;
        } else {
            return false;
        }


    }


    // Updates entries in the addUserId hashmap
    private static boolean updated (String name, String password, String newpassword){

        System.out.println("Enter the User ID in which you want to modify");
        name = scanner.next();

        System.out.println("Enter in the password of the user");
        password = scanner.next();


        // The if statement will validate user input against hashmap entries
        if (addUserId.containsKey(name) && addUserId.containsValue(password)) {


            System.out.println("Enter the new password for the user");
            newpassword = scanner.next();

            addUserId.replace(name, newpassword);


            return true;
        } else {
            System.out.println("The User ID and passwords that you have entered does not exists");
            return false;
        }


    }


    private static boolean ModifyMasteruserupdated(String mastername, String masterpassword, String newmasterpassword) {

        System.out.println("enter the Master ID");
        mastername = scanner.next();

        System.out.println("enter in the old Master password");
        masterpassword = scanner.next();


        // If statement to validate user input against master hashmap entries
        // Verification is performed using the containsKey method
        if (master.containsKey(mastername) && master.containsValue(masterpassword)) {
            System.out.println("enter the new master password");
            newmasterpassword = scanner.next();

            // The newmasterpassword is employed to replace the existing password, "password"
            master.replace(mastername, newmasterpassword);

            return true;
        } else {
            System.out.println("The Credentials that you have entered are wrong");
            return false;
        }

    }

    private static boolean Officialmasteraccess(String mastername, String newmasterpassword) {


        System.out.println("Enter in the master Id");
        mastername = scanner.next();

        System.out.println("Enter in the master Password");
        newmasterpassword = scanner.next();

        if (master.containsKey(mastername) && master.containsValue(newmasterpassword)) {

            System.out.println("continue");

            return true;
        } else {

            System.out.println("The User ID and the Master password that you have entered does not exists");

            // Program closes if the username and passwords are incorrect
            System.exit(-1);
            return false;
        }


    }



    private static String encrypyt() {


        // This for loop will go through the hashmap that stores the userID's and passwords

        for (String key : addUserId.keySet()) {

            // This will get the addUserId password, which is stored in a string: addStudentspassword
            String addStudentspassword = addUserId.get(key);

            try {

                // https://stackoverflow.com/questions/5531455/how-to-hash-some-string-with-sha256-in-java
                // How to hash some String with SHA-256 in Java? - Data Accessed on 26/11/21
                // Stackoverflow

                // BufferedWriter will be used in order to write into a file, called EncryptedUserId's.txt
                BufferedWriter writingtofile = new BufferedWriter(new FileWriter("EncryptedUserId's.txt"));

                // Implements MessageDigest as a hash function to encrypt stored passwords
                // Utilised SHA-256 to encrypt our plaintext passwords
                // MessageDigest ensures fixed-size length result regardless of plaintext password length when encrypted
                MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");


                // This will take the password and convert it into a byte array
                byte EncryptedPasswordBytes[] = messageDigest.digest(addStudentspassword.getBytes());


                // BigInteger handles large numbers.
                BigInteger Randomnum = new BigInteger(1, EncryptedPasswordBytes);

                // Converts Randomnum to a String, representing the encrypted passwords
                String EncryptedPasswordString = Randomnum.toString(16);

                // Implemented a put method to overwrite the plaintext password with the new encrypted passwords
                // utilising EncryptedPasswordString
                addUserId.put(key, EncryptedPasswordString);

                for (String UserIDs : addUserId.keySet()) {

                    writingtofile.write("Username = " + UserIDs + " Password = " + addUserId.get(UserIDs));
                    writingtofile.newLine();
                    writingtofile.flush();

                }

            } catch (IOException | NoSuchAlgorithmException e) {
                e.printStackTrace();
            }

        }

        return null;

    }


    private static String encrypytMaster() {




        // Retrieves masterID and password from the master hashmap

        for (String key : master.keySet()) {

            // Retrieves the master password from the hashmap
            String MasterPasswordString = master.get(key);

            try {

                // https://stackoverflow.com/questions/5531455/how-to-hash-some-string-with-sha256-in-java
                // How to hash some String with SHA-256 in Java? - Data Accessed on 26/11/21
                // Stackoverflow

                // BufferedWriter to write into a file named "EncryptedMasterId's.txt"
                BufferedWriter writingtofile = new BufferedWriter(new FileWriter("EncryptedMasterId's.txt"));

                // MessageDigest is a hash function used to store our encrypted passwords
                // This function uses SHA-256 for plain text password encryption
                MessageDigest SHA256Encryption = MessageDigest.getInstance("SHA-256");


                // Converts the password into a byte array
                byte EncryptedPasswordBytes[] = SHA256Encryption.digest(MasterPasswordString.getBytes());


                // BigInteger for handling large numbers
                BigInteger Randomnum = new BigInteger(1, EncryptedPasswordBytes);

                // This will convert the BigInteger number to a String
                String MasterEncryptedPasswordString = Randomnum.toString(16);

                // A put method used to overwrite the plaintext password with the new encrypted passwords using MasterEncryptedPasswordString
                master.put(key, MasterEncryptedPasswordString);

                for (String UserIDs : master.keySet()) {

                    writingtofile.write("Username = " + UserIDs + " Password = " + master.get(UserIDs));
                    writingtofile.newLine();
                    writingtofile.flush();

                }

            } catch (IOException | NoSuchAlgorithmException e) {
                e.printStackTrace();
            }

        }

        return null;

    }

}
