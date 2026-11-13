public class Simulator {
    Network n = new Network();

    void nextStep()
    {
        this.n.d();
    }

    void printOutput(int t)
    {
        System.out.print("t = " + t);
        for (String s : this.n.l())
        {
            System.out.print("   " + s);
        }
        System.out.println();
    }

    void run()
    {
        printOutput(0);

        for (int t = 1; t <= 8; t++)
        {
            nextStep();
            printOutput(t);
        }
    }
}
