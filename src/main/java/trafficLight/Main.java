package trafficLight;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        TrafficLight trafficLight = new TrafficLight();
        Time time = new Time();
        trafficLight.getLight(time.get());

    }
}
