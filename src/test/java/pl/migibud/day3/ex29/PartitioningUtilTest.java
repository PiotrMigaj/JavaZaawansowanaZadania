package pl.migibud.day3.ex29;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class PartitioningUtilTest {

    @Test
    void shouldReturnFulfilSpecificationInPercentage(){
        //given
        Integer[] myInitialData = new Integer[]{1,2,3,4,8,7,10};
        int expectedResult = 57;
        //when
        int result = PartitioningUtil.getPercentageValuesThatFulfilSpecification(myInitialData,v->v%2==0);
        //then
        assertThat(result).isEqualTo(expectedResult);
    }

}