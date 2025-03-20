public class Uber 
{
    Cab cab;

    // CONSTRUCTOR
    public Uber()
    { }
    public Uber(Cab cab)
    {
        this.cab=cab;
    }

    // DISPLAY METHOD
    public static void displayDetails(Cab cab)
    {
        // Mini mini = (Mini)cab;

        // System.out.println("\tPRICE : " + mini.price + " per km.");
        // System.out.println("\tDISTANCE : " + mini.distance + " km");
        // mini.fare();

    
        if (cab instanceof Mini)
        {
            Mini mini = (Mini) cab;
            System.out.println("\tPRICE : " + mini.price + " per km.");
            System.out.println("\tDISTANCE : " + mini.distance + " km");
            mini.fare();
        }
        else if (cab instanceof Sedan)
        {
            Sedan sedan = (Sedan) cab;
            System.out.println("\tPRICE : " + sedan.price + " per km.");
            System.out.println("\tDISTANCE : " + sedan.distance + " km");
            sedan.fare();
        }
        else if (cab instanceof SUV)
        {
            SUV suv = (SUV) cab;
            System.out.println("\tPRICE : " + suv.price + " per km.");
            System.out.println("\tDISTANCE : " + suv.distance + " km");
            suv.fare();
        }

        //JDK-17 onwards
        if (cab instanceof Mini mini)
        {
            System.out.println("\tPRICE : " + mini.price + " per km.");
            System.out.println("\tDISTANCE : " + mini.distance + " km");
            mini.fare();
        }
        else if (cab instanceof Sedan sedan)
        {
            System.out.println("\tPRICE : " + sedan.price + " per km.");
            System.out.println("\tDISTANCE : " + sedan.distance + " km");
            sedan.fare();
        }
        else if (cab instanceof SUV suv)
        {
            System.out.println("\tPRICE : " + suv.price + " per km.");
            System.out.println("\tDISTANCE : " + suv.distance + " km");
            suv.fare();
        }
    }
}
