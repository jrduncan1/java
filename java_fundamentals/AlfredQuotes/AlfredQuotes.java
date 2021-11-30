import java.util.Date;
public class AlfredQuotes {
    
    public String basicGreeting() {
        // Greetings Test
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name) {
        return String.format("Hello, %s. Lovely to see you.", name);
    }
    
    public String dateAnnouncement() {
        Date date = new Date();
        return "It is currently " + date;
    }
    
    public String respondBeforeAlexis(String conversation) {
        // YOUR CODE HERE
        int alexis = conversation.indexOf("Alexis");
        int alfred = conversation.indexOf("Alfred");

        if(alexis >= 0){
            return "Right away, sir. She certainly isn't sophisticated enough for that.";
        } else if(alfred >= 0){
            return "At your service. As you wish, naturally.";
        } else{
            return "Right. And with that I shall retire." ;
        }
    }
    
	// NINJA BONUS
	// See the specs to overload the guessGreeting method
    // SENSEI BONUS
    // Write your own AlfredQuote method using any of the String methods you have learned!
}

