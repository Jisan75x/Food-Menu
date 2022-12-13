import java.util.Scanner;

class Food {
    int itemno;
    int quantity;
    float price;

    Food(int itemno, int quantity,int itemno2) {
        this.itemno = itemno;
        this.quantity = quantity;
        switch (itemno) {
            case 1:
                price = quantity * 50;
                break;
            case 2:
                price = quantity * 60;
                break;
            case 3:
                price = quantity * 70;
                break;
            case 4:
                price = quantity * 30;
                break;
        }
        switch (itemno2){
            case 1:
                price = quantity * 50;
                break;
            case 2:
                price = quantity * 80;
                break;
            case 3:
                price = quantity * 100;
                break;
            case 4:
                price = quantity * 120;
                break;
        }
    }

       static void order(int rn, int rtype) {
        int i, q;
        char wish;
        try {
            System.out.println("\t  Menu:  \n\n1.Sandwich\t50Tk\n2.Pasta\t\t60Tk\n3.Noodles\t70Tk\n4.Coke\t\t30Tk\n");
            do {
                Scanner sc = new Scanner(System.in);
                i = sc.nextInt();
                System.out.print("Quantity- ");
                q = sc.nextInt();

                System.out.println("Do you want to order anything else ? (y/n)");
                wish = sc.next().charAt(0);
                if (wish == 'n' || wish == 'N'){
                    System.out.println("Total Bill : ");

                }
            } while (wish == 'y' || wish == 'Y');
        } catch (Exception e) {
            System.out.println("Cannot be done");
        }
    }

    static void order2(int rn, int rtype) {
        int i, q;
        char wish;
        try {
            System.out.println("\t   Menu:  \n\n1.Ramen\t\t50Tk\n2.Chowmin\t80Tk\n3.Momos\t\t100Tk\n4.Corn Soup\t120Tk\n");
            do {
                Scanner sc = new Scanner(System.in);
                i = sc.nextInt();
                System.out.print("Quantity- ");
                q = sc.nextInt();

                System.out.println("Do you want to order anything else ? (y/n)");
                wish = sc.next().charAt(0);
                if (wish == 'n' || wish == 'N'){
                    System.out.println("Total Bill : ");
                    ;

                }
            } while (wish == 'y' || wish == 'Y');
        } catch (Exception e) {
            System.out.println("Cannot be done");
        }
    }

}


