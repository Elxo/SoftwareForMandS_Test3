import java.util.ArrayList;

public class Network {
    Tank tank = new Tank();
    Controller controller = new Controller();

    void d()
    {
        int L = tank.l();
        int p = controller.l();

        tank.d(p);
        controller.d(L);
    }

    ArrayList<String> l()
    {
        ArrayList<String> temp = new ArrayList<String>();
        temp.add("Water L = " + tank.l());
        temp.add("Pump p = " + controller.l());
        return temp;
    }
}
