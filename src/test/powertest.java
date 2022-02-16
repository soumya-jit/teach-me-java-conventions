package powerpackage;


import org.junit.Test;

public class PowerTest {
    @Test
    public void oneRaisedToOneIsOne() {
        assert PowerFinder.powerCalculator(1,1) == 1;
    }

    @Test
    public void twoRaisedToOneIsTwo() {
        assert PowerFinder.powerCalculator(2,1) == 2;
    }

    @Test
    public void twoRaisedToTwoIsFour() {
        assert PowerFinder.powerCalculator(2, 2) == 4;
    }

    @Test
    public void threeRaisedToTwoIsNine() {
        assert PowerFinder.powerCalculator(3, 2) == 3*3;
    }
}
