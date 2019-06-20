package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.rmi.dgc.DGC;
import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`


    @Test
    public void constructorTest(){
        // Given (dog data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a dog is constructed)
        Dog testDog = new Dog(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the dog)
        String retrievedName = testDog.getName();
        Date retrievedBirthDate = testDog.getBirthDate();
        Integer retrievedId = testDog.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }
    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }

    @Test
    public void speakTest(){
        Dog testDog = new Dog(null,null,null);
        String expected = "bark!";

        String actual= testDog.speak();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void setBirthDateTest (){
        Date expected = new Date("08/07/2018");

        Dog testDog = new Dog(null,expected,null);

        Date actual= testDog.getBirthDate();

        Assert.assertEquals(expected,actual);

    }

    @Test
    public void eat(){
        Dog testDog = new Dog(null,null,null);
        Food testFood = new Food();

        int x = testDog.getNumberOfMealsEaten()+1;

        testDog.eat(testFood);

        int y = testDog.getNumberOfMealsEaten();

        Assert.assertEquals(x,y);

    }

    @Test
    public void testGetId(){
        Dog testDog = new Dog(null,null,455);
        Integer actual = testDog.getId();
        Integer expected = 455;

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testAnimalInheritance (){
        Dog testDog = new Dog(null,null,null);
        boolean expected = true;
        boolean actual = testDog instanceof Animal;

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testMammalInheritance(){
        Dog testDog = new Dog(null,null,null);
        boolean expected= true;
        boolean actual = testDog instanceof Mammal;

        Assert.assertEquals(expected,actual);
    }
}
