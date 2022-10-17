import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalcTest {
@Test
    public void addTest(){
    //Given or Arrange
    Calc calc = new Calc();

    double expected = 10.0;
    double unepected = 8.0;
    //When or Act
   double actual = calc.add(5.0,5.0);
    //Then or Assert
    assertEquals(expected,actual,"This method should add two numbers together");
    assertNotEquals(unepected,actual,"should not equal 8.0");
}
@Test
    public void calculateAreaOfCircleTest(){
    Calc calc = new Calc();
    double expected = 1256.64;
    // when
    double actual = calc.calculateAreaOfCircle(20.0);

    //then
    assertEquals(expected,actual,.50);
}


@Test
    public void CheckIfParemeterIsNull(){
Calc calc = new Calc();
    //given
   // double expected =
    //when
    Double actual = calc.checkIfParameterIsNull(10.0);
    //then
    assertNull(actual,"This is the null test");
}

@Test
    public void isGreater(){
    //given
    Calc calc = new Calc();
    //when
    boolean actual = calc.isGreater(100,17);
    //then
    assertTrue(actual,"should be greater than test");
}

@Test
    public void mutiplyArrayElementsByNumberGiven(){
    //given
    Calc calc = new Calc();
    int[] array = {10,2,3,10,1,0,2,3,16,0,2};
    int[] expected = new int[]{100,20,30,100,10,0,20,30,160,0,20};
    //when
    int[] actual = calc.mutiplyArrayElementsByNumberGiven(array,10);
    //then
    assertArrayEquals(expected,actual);
}

@Test
    public void findMin(){
    //given
    Calc calc = new Calc();
    //when
    int[] array = {10,2,4,10,1,5,7,9,6,3,2};
    int [] expected = {1};
    //when
    int actual = calc.finMin(array);
    //then
    assertEquals(array,expected,"expect the min of the array");
}

}