import controller.Controller;

public class Main {
    public static void main(String[] args) {

        while (true){
            Controller.printMessage("Hello, welcome to my bakery, what is your name sir?");
            String name = Controller.readString();
            Customer customer = new Customer(name);

            Controller.printMessage( "Welcome " + name + "\nwhat kind of cake do you want?");
            Controller.printMessage("1 - Princess cake");
            Controller.printMessage("2 - Opera cake");
            Controller.printMessage("3 - Chocolate cake");
            Controller.printMessage("4 - Enter number 4 to exit system");

            int choice = Integer.parseInt(Controller.readString());

            switch (choice){
                case 1:
                    customer.orderPrincessCake();
                    break;
                case 2:
                    customer.orderOperaCake();
                    break;
                case 3:
                    customer.orderChocolateCake();
                    break;
                case 4:
                    return;
                default:
                    Controller.printMessage("Enter a valid number please!");
                    continue;
            }
            System.out.println("\n");
        }
    }
}