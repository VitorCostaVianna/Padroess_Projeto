package design.pattern.ChainOfRessponsability;

/**
 * Defines the interface for handling requests.
 * Includes methods for handling requests ({@code handleRequest()}) 
 * and setting the next handler in the chain ({@code setNextHandler()}).
 */
public interface SupportHandler {
    void handleRequest(Request request);
    void setNextHandler(SupportHandler handler);
}
