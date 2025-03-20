public class Mini extends Cab
{
    int distance;

    // CONSTRUCTOR
    public Mini()
    {
        super.price=10;
    }
    public Mini(int distance)
    {
        this();
        this.distance = distance;
    }

    // FARE METHOD
    public void fare()
    {
        System.out.println("TOTAL FARE : Rs" + price*distance);
    }
}
