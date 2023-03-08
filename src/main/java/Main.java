public class Main {
    public static void main(String[] args) {
        Car myCoolCar = new Car (4, 3, true, true);
        Car myKrookedCar = new Car (2, 5, true, true);


        CarInspectionService.whatsUpWithMyCar(myCoolCar);
        CarInspectionService.whatsUpWithMyCar(myKrookedCar);


    }

}
