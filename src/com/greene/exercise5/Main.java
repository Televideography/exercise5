package com.greene.exercise5;

import java.util.Scanner;

public class Main
{
    static String[] add(String[] people, String newPerson)
    {
        String[] newPersons = new String[people.length + 1];
        for (int i = 0; i < people.length; i++) {
            newPersons[i] = people[i];
        }
        newPersons[(newPersons.length - 1)] = newPerson;
        return newPersons;
    }

    static void list(String[] people)
    {
        for (int i = 0; i < people.length; i++)
            System.out.println(people[i]);
    }

    public static void main(String[] args)
    {
        String[] people = new String[0];
        Boolean loop = Boolean.valueOf(true);
        Scanner scanner = new Scanner(System.in);

        while (loop.booleanValue()) {
            System.out.println("Please choose an option:");
            System.out.println("(1) Add a contact.");
            System.out.println("(2) Look Up email via full name.");
            System.out.println("(3) List all contacts.");
            System.out.println("(0) Exit.");

            String input = scanner.nextLine();
            switch (input) {

                case "1":
                    System.out.println("Enter contact information (first name, email): ");
                    String newPerson = scanner.nextLine();
                    people = add(people, newPerson);
                    break;

                case "2":
                    System.out.println("Enter the first name of the person's email you would like to see.");
                    String firstName = scanner.nextLine();
                    for (int i = 0; i < people.length; i++){
                        if (people[i].contains(firstName)){
                           String outputEmail = people[i];
                           System.out.println(outputEmail);
                        }
                    }
                    break;

                case "3":
                    list(people);
                    break;

                case "0":
                    loop = Boolean.valueOf(false);
            }
        }
    }
}

class personData{
    private String firstName;
    private String email;



    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}