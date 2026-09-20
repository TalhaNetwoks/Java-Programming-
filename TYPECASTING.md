
public class prectiousclass4 {
    public static void main(String[] args) {
        // Declare variables of different data types in narrow way 
        // casting of data types in narrow way

        int number1 = 10;
        double number2 = 20;
        boolean isTrue = true; 
        int quantity = 5;
        double price = 10.5;
        boolean isAvailable = false;

        String quantity1 = String.valueOf(quantity);
        String price1 = String.valueOf(price);
        String isAvailable1 = String.valueOf(isAvailable);

        System.out.println("The value of quantity is: " + quantity1);
        System.out.println("The value of price is: " + price1); 
        System.out.println("The value of isAvailable is: " + isAvailable1);

        String number11 = String.valueOf(number1);
        String number22 = String.valueOf(number2);
        String isTrue1 = String.valueOf(isTrue);

        System.out.println("The value of number1 is: " + number11);
        System.out.println("The value of number2 is: " + number22); 
        System.out.println("The value of isTrue is: " + isTrue1);

    }
}
