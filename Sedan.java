public class Sedan extends Cab
{
    int distance;
    {
        super.price=50;
    }

    // CONSTRUCTOR
    public Sedan()
    { }
    public Sedan(int distance)
    {
        this.distance = distance;
    }

    // FARE METHOD
    public void fare()
    {
        System.out.println("TOTAL FARE : Rs" + price*distance);
    }
}
