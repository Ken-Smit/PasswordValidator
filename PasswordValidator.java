//Kenneth Smith 
//7-7-2024
//7.2
//This program is intended to validate passwords. 

public class PasswordValidator {

    public static boolean isValidPassword(String password) {
        // Check length
        if (password.length() < 8) {
            return false;
        }

        // Flags to check presence of required character types
        boolean hasUppercase = false;
        boolean hasLowercase = false;
        boolean hasDigit = false;

        // Iterate through each character in the password
        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                hasUppercase = true;
            }
            if (Character.isLowerCase(c)) {
                hasLowercase = true;
            }
            if (Character.isDigit(c)) {
                hasDigit = true;
            }
        }

        // Check if all conditions are met
        return hasUppercase && hasLowercase && hasDigit;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(isValidPassword("Passs3456")); // true
        System.out.println(isValidPassword("pass567")); // false, no uppercase
        System.out.println(isValidPassword("PASS1999")); // false, no lowercase
        System.out.println(isValidPassword("PassWord"));  // false, no digit
        System.out.println(isValidPassword("Pass"));     // false, less than 8 characters
    }
}
