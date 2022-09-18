package com.gl.lab1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       /* System.out.println("Enter your firstname");
        String firstName=sc.nextLine();
        System.out.println("Enter your lastname");
        String lastName=sc.nextLine();*/
        Employee emp=new Employee("anupam", "sahoo");
        Department department;
        CredentialService cred;
        int choice=0;
        do {
            System.out.println("Please enter the department from the following");
            System.out.println("1. Technical 2. Admin 3. Human Resources 4. Legal");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    department = new Department("tech");
                    cred = new CredentialService();
                    cred.showCredentials(emp.getFirstName(), emp.getLastName(), department.getDepartmentName());
                    break;
                case 2:
                    department = new Department("admin");
                    cred = new CredentialService();
                    cred.showCredentials(emp.getFirstName(), emp.getLastName(), department.getDepartmentName());

                    break;
                case 3:
                    department = new Department("hr");
                    cred = new CredentialService();
                    cred.showCredentials(emp.getFirstName(), emp.getLastName(), department.getDepartmentName());
                    break;
                case 4:
                    department = new Department("legal");
                    cred = new CredentialService();
                    cred.showCredentials(emp.getFirstName(), emp.getLastName(), department.getDepartmentName());
                    break;
                default:
                    System.out.println("Invalid selection. enter within 1, 2, 3 and 4");

            }
        }while(choice!=0);
    }
}
