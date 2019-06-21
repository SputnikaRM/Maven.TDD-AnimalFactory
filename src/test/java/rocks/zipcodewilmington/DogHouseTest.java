package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Dog dog)`
    // TODO - Create tests for `Dog getDogById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfDogs()`


    @Test
    public void testAdd(){
        DogHouse.clear();
        DogHouse.add(new Dog("Dog",new Date(),123));

        Integer expected = 1;
        Integer actual = DogHouse.getNumberOfDogs();

        Assert.assertEquals(expected,actual);

    }
    @Test
    public void testRemoveById(){
        DogHouse.clear();
        DogHouse.add(new Dog("Dog",new Date(),123));
        DogHouse.remove(123);

        Integer expected = 0;
        Integer actual = DogHouse.getNumberOfDogs();

        Assert.assertEquals(expected,actual);
    }
    @Test
    public void testRemove(){
        DogHouse.clear();
        Dog testDog = new  Dog("Dog",new Date(), 123);
        DogHouse.remove(testDog);

        Integer expected = 0;
        Integer actual = DogHouse.getNumberOfDogs();

        Assert.assertEquals(expected,actual);
    }
    @Test
    public void testGetDogById(){
        DogHouse.clear();
        Dog testDog = new Dog("Spot",new Date(),123);
        DogHouse.add(testDog);

        Dog actualDog = DogHouse.getDogById(123);

        String expectedName = testDog.getName();
        Date expectedBirthDate = testDog.getBirthDate();
        Integer expectedId = testDog.getId();

        String actualName = actualDog.getName();
        Date actualBirthDate = actualDog.getBirthDate();
        Integer actualId = actualDog.getId();

        Assert.assertEquals(expectedName,actualName);
        Assert.assertEquals(expectedBirthDate,actualBirthDate);
        Assert.assertEquals(expectedId,actualId);
    }


    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        DogHouse.getNumberOfDogs();
    }
}
