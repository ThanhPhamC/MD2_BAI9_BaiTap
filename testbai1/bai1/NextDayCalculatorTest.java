package bai1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NextDayCalculatorTest {

    @Test
    void getNextDay() {
        int[] arrDay=new int[3];
        arrDay[0]=1;
        arrDay[1]=1;
        arrDay[2]=2018;
        int[] expectarrDay={2,1,2018};
        int[] result=NextDayCalculator.nextDay(1,1,2018);
        assertArrayEquals(expectarrDay,result);
    }
}