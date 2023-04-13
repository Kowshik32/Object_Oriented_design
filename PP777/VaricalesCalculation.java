public class VaricalesCalculation extends Calculation {
    int m=0;
    int c=0;
    int p=0;
    int mi=0;
    int mb=0;
    int mdb=0;
    int bb=0;
    int tf=0;
    int te=0;
    int ttx=0;
    int taf=0;

    @Override
    void calculate()
    {
        System.out.println("___________________________________");

        System.out.println("    \tDay Report Sheet\t    ");

        System.out.println("     \tVehicales List\t      ");

        System.out.println("___________________________________");

        System.out.println("1.Motorcycle         : "+m);
        System.out.println("2.Car/Jeep           : "+c);
        System.out.println("3.Pickup             : "+p);
        System.out.println("4.Micro bus          : "+mi);
        System.out.println("5.Minibus            : "+mb);
        System.out.println("6.Medium bus         : "+mdb);
        System.out.println("7.Big bus            : "+bb);
        System.out.println("8.Truck(upto5 tonnes : "+tf);
        System.out.println("9.Truck(5-8 tonnes)  : "+te);
        System.out.println("10.Truck (3 axle)    : "+ttx);
        System.out.println("11.Trailer(4 axle)   : "+taf);

        System.out.println("____________________________________");

        System.out.println("Toll Amount of Spacific Vehicals");

        System.out.println("__________________________________");

    }


}
