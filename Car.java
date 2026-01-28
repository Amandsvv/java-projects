class CarBluePrint{
    String car_model;
    int no_tyres;
    int door;

    CarBluePrint(int no_tyres, int door){
        this.no_tyres = no_tyres;
        this.door = door;
    }
}
public class Car
{
    public static void main(String[] args) {
        CarBluePrint thar = new CarBluePrint(4,4);
        System.out.println(thar.no_tyres);
        System.out.println(thar.door);
    }
}