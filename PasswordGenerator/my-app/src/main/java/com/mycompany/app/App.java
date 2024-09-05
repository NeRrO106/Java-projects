package com.mycompany.app;

import java.security.SecureRandom;
import java.util.Random;

public class App 
{

    private static final String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String lower = upper.toLowerCase();
    private static final String digits = "0123456789";
    private static final String special_char = "!@#$%^&*()_+-={}[]";

    private static final String all_char = upper + lower + digits + special_char;

    private static SecureRandom random = new SecureRandom();

    public static String generateRandomPassword(int length){
        StringBuilder password = new StringBuilder(length);

        password.append(upper.charAt(random.nextInt(upper.length())));

        password.append(lower.charAt(random.nextInt(lower.length())));

        password.append(digits.charAt(random.nextInt(digits.length())));

        password.append(special_char.charAt(random.nextInt(special_char.length())));

        for(int i = 4; i < length; i++){
            password.append(all_char.charAt(random.nextInt(all_char.length())));
        }

        return password.toString();
    }

    public static void main( String[] args )
    {
        String randomPassword = generateRandomPassword(12);
        System.out.println( "Parola de 12 caractere generata random: " + randomPassword);
    }
}
