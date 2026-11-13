import java.util.ArrayList;

public class Network {
    LightSensor sensor = new LightSensor();
    Lamp lamp = new Lamp();
    EnergyMeter meter = new EnergyMeter();

    int z(int L)
    {
        return L < 4 ? 1 : 0;
    }

    void d()
    {
        int L = sensor.l();
        int s = lamp.l();

        sensor.d();
        lamp.d(z(L));
        meter.d(s);
    }

    ArrayList<String> l()
    {
        ArrayList<String> temp = new ArrayList<String>();
        temp.add("Light L = " + sensor.l());
        temp.add("Lamp s = " + lamp.l());
        temp.add("Energy E = " + meter.l());
        return temp;
    }
}
