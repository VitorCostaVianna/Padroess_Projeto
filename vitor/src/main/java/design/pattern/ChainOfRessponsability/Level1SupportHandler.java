package design.pattern.ChainOfRessponsability;

/**
 * Handles the incoming request based on its priority.
 * If the request has a BASIC priority, it will be handled by this handler.
 * Otherwise, the request will be passed to the next handler in the chain, if available.
 *
 * @param request the request to be handled
 */
public class Level1SupportHandler implements SupportHandler {
    
    private SupportHandler nextHandler;

    public void setNextHandler(SupportHandler handler){
        this.nextHandler = handler;
    }

    public void handleRequest(Request request){
        if (request.getPriority() == Priority.BASIC){
            System.out.println("Level 1 Support Handler is handling the request");
        } else if (nextHandler != null){
            nextHandler.handleRequest(request);
        }
    }
}
