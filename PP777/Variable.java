public class Variable {
    private int Motorcycle;
    public void setMotorcycle(int motorcycle){
        this.Motorcycle = motorcycle;
    }
    public int getMotorcycle(){
        return Motorcycle;
    }

    int Car =750;
    int Pickup =1200;
    int Microbus =1300;
    int Minibus =1400;
    int Mediumbus =2000;
    int Bigbus = 2400;
    int TruckFivetonnes =1600;
    int TruckEighttonnes=2100;
    int Truck3axle=5500;
    int Trailer4axle=6000;

    int mtk=0;
    int ctk=0;
    int ptk=0;
    int mitk=0;
    int mbtk=0;
    int mdbtk=0;
    int bbtk=0;
    int tftk=0;
    int tetk=0;
    int ttxtk=0;
    int taftk=0;

    void SingleCalulate()
    {
        System.out.println("1.Motorcycle         : "+mtk+"   Tk");
        System.out.println("2.Car/Jeep           : "+ctk+"   Tk");
        System.out.println("3.Pickup             : "+ptk+"   Tk");
        System.out.println("4.Microbus           : "+mitk+"  Tk");
        System.out.println("5.Minibus            : "+mbtk+"  Tk");
        System.out.println("6.Medium bus         : "+mdbtk+" Tk");
        System.out.println("7.Big bus            : "+bbtk+"  Tk");
        System.out.println("8.Truck(upto5 tonnes : "+tftk+"  Tk");
        System.out.println("9.Truck(5-8 tonnes)  : "+tetk+"  Tk");
        System.out.println("10.Truck (3 axle)    : "+ttxtk+" Tk");
        System.out.println("11.Trailer(4 axle)   : "+taftk+" Tk");
    }
}
