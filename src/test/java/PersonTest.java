import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
//Dry principle
class PersonTest {
    Person person;
    @BeforeEach
    public void setUpBeforeEach(){
        person = new Person();
    }
    //@BeforeAll
    //public static void setUpBeforeAll(){
      //  System.out.println("whatever");
    //}
    @Test
    public void setNameTest(){
        //given

        String expected = "john";
        //when
        person.setName("john");
        //then
        Assertions.assertEquals(expected,person.getName());
    }

    @Test
    public void addNameTest(){
       //given
        int expected = 1;
        //when
        person.addName("Durran");
        //then
Assertions.assertEquals(expected,person.getSizeOfList());
    }

    @Test
    public  void removeName(){
        //given
       int expected = 0;
        //when
        person.addName("Aqil");
        person.removeName("Aqil");
        //then
        Assertions.assertEquals(expected,person.getSizeOfList());
    }

    @Test
    public void sameTest(){
        Assertions.assertSame(person.same1,person.same2);
    }
}
