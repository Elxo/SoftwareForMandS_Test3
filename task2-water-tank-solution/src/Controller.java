public class Controller {
    int p = 0;

    void d(int L)
    {
        if (L < 4)
        {
            p = 1;
        }
        else if (L > 7)
        {
            p = 0;
        }
    }

    int l()
    {
        return p;
    }
}
