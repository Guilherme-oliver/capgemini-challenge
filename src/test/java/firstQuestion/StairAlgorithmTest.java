package firstQuestion;

import org.junit.jupiter.api.Test;

public class StairAlgorithmTest {


    @Test
    public void should_build_stair(){
        StairAlgorithm stairAlgorithm = new StairAlgorithm();
        stairAlgorithm.buildStair(6);

    }

    @Test
    public void should_not_build_stair(){
        StairAlgorithm stairAlgorithm = new StairAlgorithm();
        stairAlgorithm.buildStair(0);
    }




}
