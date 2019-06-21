package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Cat cat)`
    // TODO - Create tests for `Cat getCatById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfCats()`

    @Test
    public void testAdd(){
        CatHouse.clear();
        CatHouse.add(new Cat("Cat",new Date(),123));
        Integer expectedCats =1;
        Integer actualCats= CatHouse.getNumberOfCats();

        Assert.assertEquals(expectedCats,actualCats);
    }

    @Test
    public void testRemoveById(){
        CatHouse.clear();
        Cat testCat = new Cat("Cat",new Date(),123);
        CatHouse.remove(123);
        Integer expected = 0;
        Integer actual = CatHouse.getNumberOfCats();

        Assert.assertEquals(expected,actual);

    }

    @Test
    public void testRemove(){
        CatHouse.clear();
        Cat testCat = new Cat("Cat",new Date(),123);
        CatHouse.remove(testCat);

        Integer expected =0;
        Integer actual = CatHouse.getNumberOfCats();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testGetCatById (){
         CatHouse.clear();
         Cat testCat = new Cat("Cat",new Date(),123);
         CatHouse.add(testCat);

         Cat actualCat = CatHouse.getCatById(123);

         String expectedName = testCat.getName();
         Date expectedDate = testCat.getBirthDate();
         Integer expectedId = testCat.getId();

         String actualName = actualCat.getName();
         Date actualDate = actualCat.getBirthDate();
         Integer actualId = actualCat.getId();



         Assert.assertEquals(actualName, expectedName);
         Assert.assertEquals(actualDate, expectedDate);
         Assert.assertEquals(actualId, expectedId);

    }

    @Test
    public void testGetNumberOfCats(){
        CatHouse.clear();
        Cat testCat = new Cat("Cat",new Date(),123);

        CatHouse.add(testCat);
        Integer actual = 1;
        Integer expected = CatHouse.getNumberOfCats();

        Assert.assertEquals(expected,actual);


}
}

