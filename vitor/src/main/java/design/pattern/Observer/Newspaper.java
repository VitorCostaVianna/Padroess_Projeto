package design.pattern.Observer;

public class Newspaper implements Observer {

    @Override
    public void update(float temperature, float humidity) {
        System.out.println("Newspaper: " + temperature + "C degrees and " + humidity + "% humidity");
    }
    
}
