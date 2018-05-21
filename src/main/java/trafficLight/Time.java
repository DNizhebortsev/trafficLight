package trafficLight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Time {
    public Light light = new Light();

    public double get() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        light.timeView();
        double time = Double.parseDouble(bufferedReader.readLine());
        return time;
    }
}