package trafficLight;

public class TrafficLight {
    public Light light = new Light();

    public void getLight(double time) throws InterruptedException {
        if (time <= 1.9 && time >= 0.0) {
            light.colorView("Green");
            Thread.sleep(20000);
        } else if (time >= 1.9 && time <= 2.9) {
            light.colorView("Yellow");
            Thread.sleep(30000);
        } else if (time >= 2.9 && time >= 4.9) {
            light.colorView("Red");
            Thread.sleep(50000);
        }
    }
}
