public class SUV extends Cab
{
    int distance;

    // CONSTRUCTOR
    public SUV()
    {
        this.price=80;
    }
    public SUV(int distance)
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
