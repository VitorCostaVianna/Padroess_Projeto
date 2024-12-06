/**
 * Level2SupportHandler is a concrete handler in the Chain of Responsibility pattern.
 * It handles requests with an intermediate priority level.
 * If the request priority is not intermediate, it passes the request to the next handler in the chain.
 */
package design.pattern.ChainOfRessponsability;

public class Level2SupportHandler implements SupportHandler {
    
    private SupportHandler nextHandler;

    public void setNextHandler(SupportHandler handler){
        this.nextHandler = handler;
    }

    public void handleRequest(Request request){
        if (request.getPriority() == Priority.INTERMEDIATE){
            System.out.println("Level 2 Support Handler is handling the request");
        } else if (nextHandler != null){
            nextHandler.handleRequest(request);
        }
    }
}
