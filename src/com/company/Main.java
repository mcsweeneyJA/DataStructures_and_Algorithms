package com.company;

import java.util.Scanner;

public class Main {


    public static void homeMenu(){
        System.out.println("Welcome to the Community Library");
        System.out.println("=========== Main Menu ===========");
        System.out.println("1: Staff Login ");
        System.out.println("2: Member Login ");
        System.out.println("0: Exit ");
        System.out.println("=================================");
    }

    public static void staffMenu(){

        System.out.println("=========== Staff Menu ===========");
        System.out.println("1: Add a new movie DVD ");
        System.out.println("2: Remove a movie DVD ");
        System.out.println("3: Register a new member ");
        System.out.println("4: Find a registered member's phone number ");
        System.out.println("0: Return to main menu ");
        System.out.println("=================================");
    }
    public static void memberMenu(){

        System.out.println("=========== Staff Menu ===========");
        System.out.println("1: Display all movies");
        System.out.println("2: Borrow a movie DVD ");
        System.out.println("3: Return a movie DVD ");
        System.out.println("4: List current borrowed movie DVDs");
        System.out.println("5: Display top 10 most popular movies");
        System.out.println("0: Return to main menu");
        System.out.println("=================================");
    }

    public static void main(String[] args) {

        Boolean isRunning = true;
        int programStatus = 1;

        while(isRunning){
            if (programStatus == 1) {



                homeMenu();
                Scanner scan = new Scanner(System.in);  // Create a Scanner object
                int response = scan.nextInt();  // Read user input
                if (response == 1) {
                    System.out.println("Enter username: ");

                    String loginUsername = scan.next();  // Read user input
                    if (loginUsername.equals("staff")) {
                        System.out.println("Enter Password");

                        String loginPassword = scan.next();  // Read user input
                        if (loginPassword.equals("today123")) {
                            System.out.println("Login Successful");
                            programStatus = 2;


                        }
                    }
                }
            }
            else if (programStatus == 2){
                MemberCollection newy = new MemberCollection();
                staffMenu();
                Scanner scan = new Scanner(System.in);  // Create a Scanner object
                int response = scan.nextInt();  // Read user input

                if (response == 1) {

                    System.out.println("Enter movie Title: ");
                    Scanner scanTitle = new Scanner(System.in);  // Create a Scanner object
                    String userMovTitle = scanTitle.next();  // Read user input
                    String currentMov = userMovTitle;
                    System.out.println("Enter movie Actor(s): ");
                    Scanner scanActor = new Scanner(System.in);  // Create a Scanner object
                    String userMovActor = scanActor.next();  // Read user input
                    System.out.println("Enter movie Director: ");
                    Scanner scanDirector = new Scanner(System.in);  // Create a Scanner object
                    String userMovDirector = scanDirector.next();  // Read user input
                    System.out.println("Select the genre: ");
                    System.out.println("1. Drama");
                    System.out.println("2. Adventure");
                    System.out.println("3. Family");
                    System.out.println("4. Action");
                    System.out.println("5. Sci-fi");
                    System.out.println("6. Comedy");
                    System.out.println("7. Thriller");
                    System.out.println("8. Other");


                    Scanner scanGenre = new Scanner(System.in);  // Create a Scanner object
                    int selection = scanGenre.nextInt();  // Read user input
                    String genre;
                    switch(selection){
                        case 1: genre = "Drama";
                                break;
                        case 2: genre = "Adventure";
                            break;
                        case 3: genre = "Family";
                            break;
                        case 4: genre = "Action";
                            break;
                        case 5: genre = "Sci-fi";
                            break;
                        case 6: genre = "Comedy";
                            break;
                        case 7: genre = "Thriller";
                            break;
                        case 8: genre = "Other";
                            break;
                    }

                    System.out.println("Select the classification: ");
                    System.out.println("1. General (G)");
                    System.out.println("2. Parental Guidance (PG)");
                    System.out.println("3. Mature (M 15+)");
                    System.out.println("4. Mature Accompanied (MA 15+)");



                    Scanner scanClassification = new Scanner(System.in);  // Create a Scanner object
                    int result = scanClassification.nextInt();  // Read user input
                    String classifiedAs = "x";
                    switch(result){
                        case 1: classifiedAs = "Drama";
                                break;
                        case 2: classifiedAs = "Adventure";
                                 break;
                        case 3: classifiedAs = "Family";
                                 break;
                        case 4: classifiedAs = "Action";
                                  break;

                    }
                    System.out.println("Enter the duration (minutes):");
                    Scanner scanDuration = new Scanner(System.in);  // Create a Scanner object
                    int duration = scanDuration.nextInt();  // Read user input

                    System.out.println("Enter the release date (year):");
                    Scanner scanRelease = new Scanner(System.in);  // Create a Scanner object
                    int year = scanRelease.nextInt();  // Read user input

                    System.out.println("Number of copies available");
                    Scanner scanCopies = new Scanner(System.in);  // Create a Scanner object
                    int copies = scanCopies.nextInt();  // Read user input

                    Movie firstMovie = new Movie (userMovTitle, userMovActor, userMovDirector, duration, classifiedAs, classifiedAs, year );
                    System.out.print(firstMovie.title + " Starring: " + firstMovie.starring + " Directed by: " + firstMovie.director);
                }
                else if (response == 0){

                    programStatus = 1;
                }
                else if (response == 2){
                    System.out.println(" << Remove a movie DVD pop >> ");
                }
                else if (response == 3){
                    System.out.println("Enter new member first name: ");
                    Scanner scanFirst = new Scanner(System.in);  // Create a Scanner object
                    String fname = scanFirst.next();  // Read user input
                    System.out.println("Enter new member last name: ");
                    Scanner scanLast = new Scanner(System.in);  // Create a Scanner object
                    String lname = scanLast.next();  // Read user input
                    System.out.println("Enter new member address: ");
                    Scanner scanAddress = new Scanner(System.in);  // Create a Scanner object
                    String addr = scanAddress.next();  // Read user input
                    System.out.println("Enter new member phone number: ");
                    Scanner scanPhone = new Scanner(System.in);  // Create a Scanner object
                    int phone = scanPhone.nextInt();  // Read user input
                    System.out.println("Enter new member password (4 digits): ");
                    Scanner scanPass = new Scanner(System.in);  // Create a Scanner object
                    int password = scanPass.nextInt();  // Read user input
                    Member newMember = new Member(fname, lname, addr, phone, password, "Nil");

                    newy.add(0, newMember);
                    System.out.println(newy.a[0].firstName);
                }
                else if (response == 4){
                    System.out.println(" << find registered member phone >> ");
                }

            }
            else if (programStatus == 3){
                memberMenu();
                Scanner scan = new Scanner(System.in);  // Create a Scanner object
                int response = scan.nextInt();  // Read user input
                if (response == 0){
                    programStatus = 1;
                }
                else if (response == 1){
                    System.out.println(" << ALL MOVIES HERE >> ");
                }
                else if (response == 2){
                    System.out.println(" << Borrow movie // pop >> ");
                }
                else if (response == 3){
                    System.out.println(" << Return movie  // push >> ");
                }
                else if (response == 4){
                    System.out.println(" << current borrowed movie DVD's >> ");
                }
                else if (response == 5){
                    System.out.println(" << display top 10  >> ");
                }
            }






        }}

}
