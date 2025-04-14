/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mainassignmentpart1;

/**
 *
 * @author RC_Student_lab
 */
public class Login {
     // Instance variables

    private static String Username;

    static boolean iscellNumber(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    private String Password;
    private String cellNumber;

    // Constructor
    public Login(String username, String password, String phone) {

        this.Username = username;
        this.Password = password;
        this.cellNumber = cellNumber;
    }
    

    // Check if the username is valid (contains "_" and must be 5 characters)
    public static boolean isUsernameValid(String username) {
        return username.length() <= 5 && username.contains("_");
    }

    // Checking if password is valid
    public static boolean isPasswordStrong(String password) {
        return password.length() >= 8 &&
                password.matches(".*[A-Z].*") &&
                password.matches(".*[a-z].*") &&
                password.matches(".*\\d.*") &&
                password.matches(".*[!@#_$%^&*].*");
    }

    // Check if the phone number is valid (starts with +27 and has 10 digits after)
    public boolean iscellNumberValid(String string){
       return cellNumber.length() == 10 && cellNumber.startsWith("+27");
    }

    // Attempt to register the user
    public String register(String username, String password, String phone) {
        if (!isUsernameValid(username)) {
            return "Username is invalid. It must contain an underscore and be no more than 5 characters.";
        }

        if (!isPasswordStrong(password)) {
            return "Password is weak. It must be at least 8 characters, with capital letter, a number, and a special character.";
        }

        if (!iscellNumberValid("+271234567890")) {
            return "Phone number format is incorrect. It should start with +27 followed by 10 numbers.";
        }

        username = username;
        password = password;
        cellNumber = cellNumber;

        return "User registered successfully.";
    }

    // Validate login detailsa
    public boolean authenticate(String inputUsername, String inputPassword) {
        return inputUsername.equals(Username) && inputPassword.equals(Password);
    }

    // Return a login message
    public String getLoginMessage(String inputUsername, String inputPassword) {
        if (authenticate(inputUsername, inputPassword)) {
            return "Welcome , it's great to see you again!";
        } else {
            return "Incorrect username or password. Please try again.";
        }
    }
}

    
        
    

       
        
    

   