import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);
            int ch;
            char wish;
            x:
            do {

                System.out.println("\nEnter your choice :\n1. Fast Food\n2. Chinese Food\n3. Exit\n");
                ch = sc.nextInt();
                switch (ch) {
                    case 1:
                        if (ch == 1)
                            Food.order(ch - 51,5);
                        else if (ch == 2)
                            Food.order(ch - 41, 4);
                        else if (ch == 3)
                            Food.order(ch - 31, 3);
                        else if (ch == 4)
                            Food.order(ch - 11, 2);
                        else
                            System.out.println("Unavailable");
                        break;
                    case 2:
                        if (ch == 1)
                            Food.order2(ch - 61,5);
                        else if (ch == 2)
                            Food.order2(ch - 41, 4);
                        else if (ch == 3)
                            Food.order2(ch - 31, 3);
                        else if (ch == 4)
                            Food.order2(ch - 11, 2);
                        else
                            System.out.println("Unavailable");
                        break ;
                    case 3:
                        break x;


                }

                System.out.println("\nContinue : (y/n)");
                wish = sc.next().charAt(0);
                if (!(wish == 'y' || wish == 'Y' || wish == 'n' || wish == 'N')) {
                    System.out.println("Invalid Option");
                    System.out.println("\nContinue : (y/n)");
                    wish = sc.next().charAt(0);

                }

            } while (wish == 'y' || wish == 'Y');
        } catch (Exception e) {
            System.out.println("Not a valid input");
        }
    }
}
