import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarInspectionServiceTest {

    @org.junit.jupiter.api.Test
    void returnTrueWhenCarHasFourTires() {
        //GIVEN
        Car myCar = new Car (4,2,true,true);
        //WHEN
        boolean actual = CarInspectionService.doesCarHaveFourTires(myCar);
        //THEN
        boolean expected = true;
        assertEquals(expected, actual);

    }
    @Test
    void returnFalseWhenCarDoesNotHaveFourTires() {
        //GIVEN
        Car myCar = new Car (3,2,true,true);
        //WHEN
        boolean actual = CarInspectionService.doesCarHaveFourTires(myCar);
        //THEN
        boolean expected = false;
        assertEquals(expected, actual);

    }
    @Test
    void returnTrueWhenCarHasSeatbelt (){
        //GIVEN
        Car myCar = new Car (3,2,true,true);
        //WHEN
        boolean actual = CarInspectionService.doesCarHaveSeatbelt(myCar);
        //THEN
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    void returnFalseWhenCarDoesNotHaveSeatbelt (){
        //GIVEN
        Car myCar = new Car (3,2,false,true);
        //WHEN
        boolean actual = CarInspectionService.doesCarHaveSeatbelt(myCar);
        //THEN
        boolean expected = false;
        assertEquals(expected, actual);
    }
    @Test
    void returnTrueWhenCarHasAirbag (){
        //GIVEN
        Car myCar = new Car (3,2,true,true);
        //WHEN
        boolean actual = CarInspectionService.doesCarHaveAirbag(myCar);
        //THEN
        boolean expected = true;
        assertEquals(expected, actual);
    }
    @Test
    void returnFalseWhenCarDoesNotHaveAirbag (){
        //GIVEN
        Car myCar = new Car (3,2,true,false);
        //WHEN
        boolean actual = CarInspectionService.doesCarHaveAirbag(myCar);
        //THEN
        boolean expected = false;
        assertEquals(expected, actual);
    }


    @Test
    void returnTrueWhenCarHasThreeDoors() {
        //GIVEN
        Car myCar = new Car (3,3,true,true);
        //WHEN
        boolean actual = CarInspectionService.doesCarHaveThreeOrFiveDoors(myCar);
        //THEN
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    void returnTrueWhenCarHasFiveDoors() {
        //GIVEN
        Car myCar = new Car (3,5,true,true);
        //WHEN
        boolean actual = CarInspectionService.doesCarHaveThreeOrFiveDoors(myCar);
        //THEN
        boolean expected = true;
        assertEquals(expected, actual);
    }
    @Test
    void returnFalseWhenCarDoesNotHaveThreeOrFiveDoors() {
        //GIVEN
        Car myCar = new Car (3,4,true,true);
        //WHEN
        boolean actual = CarInspectionService.doesCarHaveThreeOrFiveDoors(myCar);
        //THEN
        boolean expected = false;
        assertEquals(expected, actual);
    }
    @Test
    void returnTrueWhenAllChecksPassed() {
        //GIVEN
        Car myCar = new Car (4,3,true,true);
        //WHEN
        boolean actual = CarInspectionService.checkCar(myCar);
        //THEN
        boolean expected = true;
        assertEquals(expected, actual);
    }
    @Test
    void returnFalseWhenAnyOfTheChecksDidNotPass() {
        //GIVEN
        Car myCar = new Car (8,3,true,true);
        //WHEN
        boolean actual = CarInspectionService.checkCar(myCar);
        //THEN
        boolean expected = false;
        assertEquals(expected, actual);
    }

}