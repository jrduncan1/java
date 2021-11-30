public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app. 
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";
        
        // Menu variables (add yours below)
        double mochaPrice = 3.5;
        double dripPrice = 1;
        double lattePrice = 3.75;
        double cappuccinoPrice = 3.45;
    
        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";
    
        // Order completions (add yours below)
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = false;
        boolean isReadyOrder3 = false;
        boolean isReadyOrder4 = true;
    
        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        System.out.println(customer1 + pendingMessage);                 // Displays "Cindhuri, your order will be ready shortly"

        if(isReadyOrder4){
            System.out.println(customer4 + readyMessage);               // Displays "Noah, your order is ready"
            System.out.println(displayTotalMessage + cappuccinoPrice);  // Displays "Your total is $3.45"
        } else{
            System.out.println(customer4 + pendingMessage);             // Displays "Noah, your order will be ready shortly"
        }

        if(isReadyOrder2){
            System.out.println(displayTotalMessage + String.format("%.2f",(lattePrice*2)));   // Displays "Your total is $7.50"
            System.out.println(customer2 + readyMessage);               // Displays "Noah, your order is ready"
        } else{
            System.out.println(displayTotalMessage + String.format("%.2f",(lattePrice*2)));   // Displays "Your total is $7.50"
            System.out.println(customer2 + pendingMessage);             // Displays "Noah, your order will be ready shortly"
        }

        System.out.println(displayTotalMessage + (lattePrice - dripPrice));

    }
}
