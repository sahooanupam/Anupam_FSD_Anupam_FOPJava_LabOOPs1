package com.gl.lab1;

import java.util.Random;

public class CredentialService {

    public String generatePassword(){
        int length=10;
        Random random=new Random();
       char[] password=new char[length];
       String CapitalLetters="ABCDEFGHIZKLMNOPQRSTUVWXYZ";
       String SmallLetters="abcdefghijklmnopqrstuvwxyz";
       String Numbers="0123456789";
       String SpecialCharacters="@!#$%^&*";
       String combinedValues=CapitalLetters+SmallLetters+Numbers+SpecialCharacters;
       password[0]=CapitalLetters.charAt(random.nextInt(CapitalLetters.length()));
       password[1]=SmallLetters.charAt(random.nextInt(SmallLetters.length()));
       password[2]=Numbers.charAt(random.nextInt(Numbers.length()));
       password[3]=SpecialCharacters.charAt(random.nextInt(SpecialCharacters.length()));
       for(int i=4; i<10; i++){
           password[i]=combinedValues.charAt(random.nextInt(combinedValues.length()));
       }
        return String.valueOf(password);
    }

    public String generateEmailAddress(String firstName, String lastName, String departmentName){

        return firstName+lastName+"@"+departmentName+".abc.com";
    }

    public void showCredentials(String firstName, String lastName, String departmentName){

       System.out.println("Email-------->"+generateEmailAddress(firstName, lastName, departmentName));
       System.out.println("Password----->"+generatePassword());

    }


}
