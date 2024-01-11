import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String title;
        String genre;
        int releaseYear;
        int choice;

        Scanner sc = new Scanner(System.in);

        System.out.println("\nMenu");;
        System.out.println("1. Add a game");
        System.out.println("2. Display library");
        System.out.println("3. Search game by title");
        System.out.println("4. Exit");
        choice = sc.nextInt();
        sc.nextLine();
        sc.nextLine();

        switch (choice) {
            case 1:
                System.out.println("Enter game title: ");
                title = sc.nextLine();
                System.out.println("Enter game genre: ");
                genre = sc.nextLine();
                System.out.println("Enter release year: ");
                releaseYear = sc.nextInt();
                sc.nextLine();

                VideoGame newGame = VideoGame
        }


    }
}