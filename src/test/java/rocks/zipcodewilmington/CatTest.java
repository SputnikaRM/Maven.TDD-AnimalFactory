package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    // TODO - Create tests for `void setName(String name)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`



    @Test
            public void setName() {
        Cat testCat = new Cat("Spot", null, null);
        testCat.setName("dasha");

        String expected = "dasha";
        String actual = testCat.getName();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSpeak() {
        Cat testCat = new Cat(null,null,null );
        String expected = "meow!";

        String actual = testCat.speak();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testSetBirthDate(){
        Date expected = new Date("09/09/2012");

        Cat testCat = new Cat (null,expected,null);

        Date actual= testCat.getBirthDate();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void eat(){
        Cat testCat = new Cat(null,null,null);
        Food testFood = new Food();

        int x = testCat.getNumberOfMealsEaten ();

        testCat.eat(testFood);

        int y= testCat.getNumberOfMealsEaten();

        Assert.assertEquals(x+1,y);
    }

    @Test
    public void testGetID() {
        Cat testCat = new Cat(null,null,20);
       Integer actual= testCat.getId();
        Integer expected = 20;
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testAnimalInheritance () {
        Cat testCat = new Cat(null,null,null);
        boolean expected = true;
        boolean actual = testCat instanceof Animal;
        Assert.assertEquals(expected,actual);


    }

    @Test
    public void testMammalInheritance(){
        Cat testCat = new Cat (null,null,null);
        boolean expected =true;
        boolean actual=testCat instanceof Mammal;
        Assert.assertEquals(expected,actual);
    }


    @Test
    public void constructorTest() {


        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }


}
