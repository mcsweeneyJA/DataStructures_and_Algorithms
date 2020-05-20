package com.company;



import java.util.Scanner;

public class Main {


    public static void staffMenu() {

        System.out.println("=========== Staff Menu ===========");
        System.out.println("1: Add a new movie DVD ");
        System.out.println("2: Remove a movie DVD ");
        System.out.println("3: Register a new member ");
        System.out.println("4: Find a registered member's phone number ");
        System.out.println("0: Return to main menu ");
        System.out.println("=================================");
    }

    public static void memberMenu() {

        System.out.println("=========== Member Menu ===========");
        System.out.println("1: Display all movies");
        System.out.println("2: Borrow a movie DVD ");
        System.out.println("3: Return a movie DVD ");
        System.out.println("4: List current borrowed movie DVDs");
        System.out.println("5: Display top 10 most popular movies");
        System.out.println("0: Return to main menu");
        System.out.println("=================================");
    }

    public static void main(String[] args) {
        MemberCollection members = new MemberCollection();


        MovieCollection.BST bst = new MovieCollection().new BST();


        Boolean isRunning = true;
        int programStatus = 1;

        while (isRunning) {

            switch (programStatus) {
                ////////////// HOME MENU /////////
                case 1:
                    HomeMenu.homeMenu();
                    Scanner scan = new Scanner(System.in);  // Create a Scanner object
                    int response = scan.nextInt();  // Read user input
                    switch (response) {
                        case 1:
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
                            break;
                        case 2:
                            programStatus = 3;
                            break;
                    }
                    break;
                ////////////// STAFF MENU /////////
                case 2:
                    staffMenu();
                    Scanner scanStaff = new Scanner(System.in);  // Create a Scanner object
                    int responseStaff = scanStaff.nextInt();  // Read user input
                    switch (responseStaff) {
                        // ADD A NEW MOVIE DVD TO LIBRARY
                        case 1:
                            System.out.println("Enter movie Title: ");
                            Scanner scanTitle = new Scanner(System.in);  // Create a Scanner object
                            String userMovTitle = scanTitle.nextLine();  // Read user input
                            String currentMov = userMovTitle;
                            System.out.println("Enter movie Actor(s): ");
                            Scanner scanActor = new Scanner(System.in);  // Create a Scanner object
                            String userMovActor = scanActor.nextLine();  // Read user input
                            System.out.println("Enter movie Director: ");
                            Scanner scanDirector = new Scanner(System.in);  // Create a Scanner object
                            String userMovDirector = scanDirector.nextLine();  // Read user input
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
                            switch (selection) {
                                case 1:
                                    genre = "Drama";
                                    break;
                                case 2:
                                    genre = "Adventure";
                                    break;
                                case 3:
                                    genre = "Family";
                                    break;
                                case 4:
                                    genre = "Action";
                                    break;
                                case 5:
                                    genre = "Sci-fi";
                                    break;
                                case 6:
                                    genre = "Comedy";
                                    break;
                                case 7:
                                    genre = "Thriller";
                                    break;
                                case 8:
                                    genre = "Other";
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
                            switch (result) {
                                case 1:
                                    classifiedAs = "Drama";
                                    break;
                                case 2:
                                    classifiedAs = "Adventure";
                                    break;
                                case 3:
                                    classifiedAs = "Family";
                                    break;
                                case 4:
                                    classifiedAs = "Action";
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

                            Movie firstMovie = new Movie(userMovTitle, userMovActor, userMovDirector, duration, classifiedAs, classifiedAs, year);

                            bst.add(firstMovie);

                            break;


                        // REMOVE A DVD
                        case 2:
                            System.out.println("Which movie would you like to delete?");
                            Scanner scanMovToDelete = new Scanner(System.in);  // Create a Scanner object
                            String movToDelete = scanMovToDelete.nextLine();  // Read user input
                            bst.delete(movToDelete);


                            break;
                        //REGISTER A  NEW MEMBER
                        case 3:


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
                            Member newMember = new Member(fname, lname, addr, phone, password);

                            members.addMember(newMember);
                            programStatus = 2;

                            break;
                        //DISPLAY MEMBER PHONE NUMBER
                        case 4:
                            for(Member mem : members.members){
                                if (mem != null)
                                    System.out.println(mem.firstName + mem.lastName + "\n");
                            }
                            programStatus = 1;
                            break;
                        //END HERE
                        case 0:
                            programStatus = 1;
                            break;
                    }

                    break;
                /////////////////// MEMBER MENU /////////////
                case 3:
                    System.out.println("Enter member username: ");
                    Scanner scan4 = new Scanner(System.in);
                    String loginUsername = scan4.next();  // Read user input
                    if (loginUsername.equals("1")) {
                        System.out.println("Enter Password");
                        Scanner pin1 = new Scanner(System.in);
                        int pin = pin1.nextInt();  // Read user input
                        Member isMember = members.getMemberByPin(pin);
                        if (isMember != null) {


                            memberMenu();
                            Scanner scanMem = new Scanner(System.in);  // Create a Scanner object
                            int memResponse = scanMem.nextInt();  // Read user input
                            switch (memResponse) {
                                case 0:
                                    programStatus = 1;
                                    break;
                                case 1:
                                    bst.traverseInOrder(bst.root);
                                    System.out.println("\n\n");
                                    memberMenu();
                                    break;
                                case 2:
                                    System.out.println("Enter the title of the movie you would like to borrow: ");
                                    Scanner scanName = new Scanner(System.in);  // Create a Scanner object
                                    String rez = scanName.nextLine();  // Read user input

                                    Movie searchedMovie = bst.find(rez);
                                    if (searchedMovie != null) {
                                        isMember.borrowed.add(searchedMovie);
                                        searchedMovie.copies--;
                                        searchedMovie.rentalCount++;

                                        System.out.println(" Borrowed the movie: ");
                                        System.out.println(searchedMovie.title + "\n");
                                        System.out.println("it now has " + searchedMovie.copies + " copies available");



                                        memberMenu();
                                    }
                                    break;
                                case 3:

                                    System.out.println("User currently borrowing:  ");
                                    for(Movie mov : isMember.borrowed){

                                        System.out.println(mov.title + "  ");
                                    }
                                    System.out.println("Enter the title of the movie you would like to return: ");

                                    Scanner scanT = new Scanner(System.in);  // Create a Scanner object
                                    String scanToDelete = scanT.nextLine();  // Read user input

                                    Movie movieToDelete = bst.find(scanToDelete);
                                    if (movieToDelete != null) {
                                        isMember.borrowed.remove(movieToDelete);
                                    }
                                    System.out.println(" Returned the movie: ");
                                    System.out.println(movieToDelete.title + "\n");


                                    break;
                                case 4:
                                    System.out.println(" You are currently borrowing:  " + "\n");
                                    for (Movie mov : isMember.borrowed) {
                                        System.out.println(mov.title + "\n");
                                    }

                                    memberMenu();
                                    break;
                                case 5:
                                    System.out.println(" << display top 10  >> ");
                                    break;
                            }
                        }
                    }
            }
        }
    }
}




















     /*       if (programStatus == 1) {



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
                else if (response == 2){
                    programStatus = 3;
                }
            }*/
//            else if (programStatus == 2){

//                staffMenu();
//                Scanner scan = new Scanner(System.in);  // Create a Scanner object
//                int response = scan.nextInt();  // Read user input
//
//                if (response == 1) {
//
//                    System.out.println("Enter movie Title: ");
//                    Scanner scanTitle = new Scanner(System.in);  // Create a Scanner object
//                    String userMovTitle = scanTitle.nextLine();  // Read user input
//                    String currentMov = userMovTitle;
//                    System.out.println("Enter movie Actor(s): ");
//                    Scanner scanActor = new Scanner(System.in);  // Create a Scanner object
//                    String userMovActor = scanActor.nextLine();  // Read user input
//                    System.out.println("Enter movie Director: ");
//                    Scanner scanDirector = new Scanner(System.in);  // Create a Scanner object
//                    String userMovDirector = scanDirector.nextLine();  // Read user input
//                    System.out.println("Select the genre: ");
//                    System.out.println("1. Drama");
//                    System.out.println("2. Adventure");
//                    System.out.println("3. Family");
//                    System.out.println("4. Action");
//                    System.out.println("5. Sci-fi");
//                    System.out.println("6. Comedy");
//                    System.out.println("7. Thriller");
//                    System.out.println("8. Other");
//
//
//                    Scanner scanGenre = new Scanner(System.in);  // Create a Scanner object
//                    int selection = scanGenre.nextInt();  // Read user input
//                    String genre;
//                    switch(selection){
//                        case 1: genre = "Drama";
//                                break;
//                        case 2: genre = "Adventure";
//                            break;
//                        case 3: genre = "Family";
//                            break;
//                        case 4: genre = "Action";
//                            break;
//                        case 5: genre = "Sci-fi";
//                            break;
//                        case 6: genre = "Comedy";
//                            break;
//                        case 7: genre = "Thriller";
//                            break;
//                        case 8: genre = "Other";
//                            break;
//                    }
//
//                    System.out.println("Select the classification: ");
//                    System.out.println("1. General (G)");
//                    System.out.println("2. Parental Guidance (PG)");
//                    System.out.println("3. Mature (M 15+)");
//                    System.out.println("4. Mature Accompanied (MA 15+)");
//
//
//
//                    Scanner scanClassification = new Scanner(System.in);  // Create a Scanner object
//                    int result = scanClassification.nextInt();  // Read user input
//                    String classifiedAs = "x";
//                    switch(result){
//                        case 1: classifiedAs = "Drama";
//                                break;
//                        case 2: classifiedAs = "Adventure";
//                                 break;
//                        case 3: classifiedAs = "Family";
//                                 break;
//                        case 4: classifiedAs = "Action";
//                                  break;
//
//                    }
//                    System.out.println("Enter the duration (minutes):");
//                    Scanner scanDuration = new Scanner(System.in);  // Create a Scanner object
//                    int duration = scanDuration.nextInt();  // Read user input
//
//                    System.out.println("Enter the release date (year):");
//                    Scanner scanRelease = new Scanner(System.in);  // Create a Scanner object
//                    int year = scanRelease.nextInt();  // Read user input
//
//                    System.out.println("Number of copies available");
//                    Scanner scanCopies = new Scanner(System.in);  // Create a Scanner object
//                    int copies = scanCopies.nextInt();  // Read user input
//
//                    Movie firstMovie = new Movie (userMovTitle, userMovActor, userMovDirector, duration, classifiedAs, classifiedAs, year );
//
//                    bst.insert(firstMovie);
//
//
//
//
//
//
//                }
//                else if (response == 0){
//
//                    programStatus = 1;
//                }
//                else if (response == 2){
//                    System.out.println(" << Remove a movie DVD pop >> ");
//                }
//                else if (response == 3){
//                    System.out.println("Enter new member first name: ");
//                    Scanner scanFirst = new Scanner(System.in);  // Create a Scanner object
//                    String fname = scanFirst.next();  // Read user input
//                    System.out.println("Enter new member last name: ");
//                    Scanner scanLast = new Scanner(System.in);  // Create a Scanner object
//                    String lname = scanLast.next();  // Read user input
//                    System.out.println("Enter new member address: ");
//                    Scanner scanAddress = new Scanner(System.in);  // Create a Scanner object
//                    String addr = scanAddress.next();  // Read user input
//                    System.out.println("Enter new member phone number: ");
//                    Scanner scanPhone = new Scanner(System.in);  // Create a Scanner object
//                    int phone = scanPhone.nextInt();  // Read user input
//                    System.out.println("Enter new member password (4 digits): ");
//                    Scanner scanPass = new Scanner(System.in);  // Create a Scanner object
//                    int password = scanPass.nextInt();  // Read user input
//                    Member newMember = new Member(fname, lname, addr, phone, password);
//
//                    members.add(0, newMember);
//                    programStatus = 2;
//
//                }
//
//                else if (response == 4){
//
//
//
////                    MemberCollection.mergeSort(newy.memberArray, 0, (newy.memberArray.length - 1));
//                    System.out.println("Result " + Arrays.toString(members.memberArray));
//
//                   /* System.out.println("Which member Phone number would you like??");*/
///*                    Scanner scanMemIndex = new Scanner(System.in);  // Create a Scanner object
//                    String index = scanMemIndex.nextLine();
//
//                    System.out.println(newy.memberArray[index].firstName);*/
//
//                }
//
//            }
//            else if (programStatus == 3){
//                System.out.println("Enter member username: ");
//                Scanner scan4 = new Scanner(System.in);
//                String loginUsername = scan4.next();  // Read user input
//                if (loginUsername.equals("1")) {
//                    System.out.println("Enter Password");
//                    Scanner pin1 = new Scanner(System.in);
//                    int pin = pin1.nextInt();  // Read user input
//                    Member isMember = members.getMemberByPin(pin);
//                    if ( isMember != null){
//
//
//                        memberMenu();
//                        Scanner scan = new Scanner(System.in);  // Create a Scanner object
//                        int response = scan.nextInt();  // Read user input
//                        if (response == 0){
//                            programStatus = 1;
//                        }
//                        else if (response == 1){
//
//                            bst.traverseInOrder(bst.root);
//                            System.out.println("\n\n");
//                            memberMenu();
//
//
//                        }
//                        else if (response == 2){
//                            System.out.println("Enter the title of the movie you would like to borrow: ");
//                            Scanner scanName = new Scanner(System.in);  // Create a Scanner object
//                            String rez = scanName.nextLine();  // Read user input
//
//                            Movie searchedMovie = bst.find(rez);
//                            if (searchedMovie != null) {
//                                isMember.borrowed.add(searchedMovie);
//                                searchedMovie.copies--;
//                                searchedMovie.rentalCount++;
//                                System.out.println(isMember.borrowed);
//                                System.out.println(searchedMovie.copies);
//
//                                memberMenu();
//                            }
//
//                        }
//                        else if (response == 3){
//                            System.out.println(" << Return movie  // push >> ");
//                        }
//                        else if (response == 4){
//                            System.out.println(" You are currently borrowing:  " + "\n");
//                            for (Movie mov : isMember.borrowed){
//                                System.out.println(mov.title + "\n");
//                            }
//
//                            memberMenu();
//                        }
//                        else if (response == 5){
//                            System.out.println(" << display top 10  >> ");
//                        }
//
//                }
//                    else {
//                        System.out.println("Username or password incorrect");
//                        System.out.println("REDIRECTING");
//                        programStatus = 1;
//                    }






//
//                }
//            }
//
//
//
//
//
//
//
//
//
//        }}
//
//
//}
