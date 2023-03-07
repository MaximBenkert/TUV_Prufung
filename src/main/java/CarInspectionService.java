public class CarInspectionService {
    public static boolean doesCarHaveFourTires (Car myCar){
        return myCar.getNumberOfTires() == 4;
    }

    public static boolean doesCarHaveSeatbelt(Car myCar) {
    return myCar.isSeatBelt();
    }

    public static boolean doesCarHaveAirbag(Car myCar) {
        return myCar.isAirbag();
    }

    public static boolean doesCarHaveThreeOrFiveDoors(Car myCar) {
        return (myCar.getNumberOfDoors() == 3 || myCar.getNumberOfDoors() == 5);
    }

    public static boolean checkCar(Car myCar) {
        return doesCarHaveFourTires(myCar) && doesCarHaveSeatbelt(myCar) && doesCarHaveAirbag(myCar) && doesCarHaveThreeOrFiveDoors(myCar);
    }
}
