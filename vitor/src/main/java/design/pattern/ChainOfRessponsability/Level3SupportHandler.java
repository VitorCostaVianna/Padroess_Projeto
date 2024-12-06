/**
 * Level3SupportHandler is a concrete handler in the Chain of Responsibility pattern.
 * It handles requests with a priority of CRITICAL.
 * 
 * <p>This handler does not pass the request to any other handler as it is the last 
 * handler in the chain.</p>
 * 
 */
package design.pattern.ChainOfRessponsability;

public class Level3SupportHandler implements SupportHandler {

    public void setNextHandler(SupportHandler handler){
         // No next handler for Level 3
    }

    public void handleRequest(Request request){
        if (request.getPriority() == Priority.CRITICAL){
            System.out.println("Level 3 Support Handler is handling the request");
        } else{
            System.out.println("Request cannot be handled");
        }
        }
    
}
    

