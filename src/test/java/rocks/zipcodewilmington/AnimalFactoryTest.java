package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`

    @Test
    public void testCreateDog(){
        // Given
        String givenName = "Spot";
        Date givenBirthdate = new Date();

        Dog testDog = new Dog(givenName,givenBirthdate,null);

        String expectedName = testDog.getName();
        Date expectedBirthDate = testDog.getBirthDate();

        Assert.assertEquals(givenName,expectedName);
        Assert.assertEquals(givenBirthdate,expectedBirthDate);
    }

    @Test
    public void testCreateCat(){
        String givenName = "Cat";
        Date givenBirthDate = new Date();

        Cat testCat = new Cat(givenName,givenBirthDate,null);

        String expectedName = testCat.getName();
        Date expectedBirthDate = testCat.getBirthDate();

        Assert.assertEquals(expectedName,givenName);
        Assert.assertEquals(expectedBirthDate,givenBirthDate);

    }
}
