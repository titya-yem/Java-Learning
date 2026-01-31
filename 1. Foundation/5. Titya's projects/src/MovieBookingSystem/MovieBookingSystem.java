package MovieBookingSystem;

import java.util.Scanner;

public class MovieBookingSystem {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        final String[][] movies = {
                {"The clock awaken", "30"},
                {"Tum Teav", "23"},
                {"The last reel", "45"}
        };

        while (true) {
            // Shows movies and remaining seats
            System.out.println("============================");
            for (String[] movie : movies)
                System.out.println(movie[0] + " - " + movie[1] + " seats");
            System.out.println("============================");

            System.out.print("\nPlease enter the movie name: ");
            String movieName = scanner.nextLine();

            System.out.print("Please enter the ticket: ");
            int movieTicket = scanner.nextInt();
            scanner.nextLine(); // clear buffer

            boolean foundMovie = false;

            system(movies, movieName, movieTicket, foundMovie);
        }
    }

    public static void system(String[][] movies, String movieName, int movieTicket, boolean foundMovie) {
        for (String[] seats : movies) {
            // NOTE: If statement check the movie's name if we have that movie,
            // we will get the seats of that movie convert to integer
            if (seats[0].equalsIgnoreCase(movieName)) {
                foundMovie = true; // Movie has been found

                int seatsAvailable = Integer.parseInt(seats[1]); // convert seats in Int

                if (movieTicket <= seatsAvailable) {  // Check if there are enough seats
                    seatsAvailable -= movieTicket; // If yes, subtract booked ticket with seats

                    seats[1] = String.valueOf(seatsAvailable); // Save updated seats back to array

                    System.out.println("====================");
                    System.out.println("\nBooking successful!");
                    System.out.println("Remaining seats: " + seatsAvailable);
                    System.out.println("====================");

                    System.out.println("Do you wanna coninue or exit ?");
                    System.out.println("1) continue \t2) exit");
                    byte option = scanner.nextByte();
                    switch (option) {
                        case 1:
                            System.out.println("\nPress Enter to continue...");
                            scanner.nextLine();
                            clearScreen();
                            break;
                        case 2:
                            System.exit(0); // terminal machine
                    }
                } else {
                    System.out.println("\nNot enough seats!");
                    System.out.println("\nPress Enter to continue...");
                    scanner.nextLine();
                }

                break; // break out of loop
            }
        }

        if (!foundMovie) {
            System.out.println("\nMovie not found!");
            System.out.println("\nPress Enter to continue...");
            scanner.nextLine();
            clearScreen();
        }
    }

    public static void clearScreen() {
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }
}
