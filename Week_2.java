import java.util.Scanner;

public class Week_2 {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("What is your order number?");
        int orderNum = input.nextInt();
        System.out.println("What is your name?");
        String name = input.next();
        System.out.println("How long would you like the desk to be in inches?");
        int length = input.nextInt();
        System.out.println("What width would you like the desk to be in inches?");
        int width = input.nextInt();
        System.out.println("Would you like mahogany, oak, or pine?");
        String woodType = input.next();
        System.out.println("How many drawers would you like?");
        int numDrawers = input.nextInt();

        int total = 200;
        int surface = length * width;
        if (surface > 750){
            total += 50;
        }
        if (woodType.equals("mahogany")){
            total += 150;
        }
        if (woodType.equals("oak")){
            total += 125;
        }
        total += numDrawers * 30;
        System.out.println("Order Number: " + orderNum);
        System.out.println("Name: " + name);
        System.out.println("Desk Length: " + length);
        System.out.println("Desk Width: " + width);
        System.out.println("Wood Type: " + woodType);
        System.out.println("Number of drawers: " + numDrawers);
        System.out.println("Your total is " + total);

        input.close();
    }


}
