import com.ke.safaricom.Endagered;
import org.junit.Rule;
import org.junit.Test;

import static org.junit.Assert.*;

public class EndageredTest {
    @Rule
    public DatabaseRule databaseRule = new DatabaseRule();

    @Test
    public void EndageredInstantiatesCorrectly_True() {
        Endagered testEndagered = setUpNewEndagered();
        assertTrue(testEndagered instanceof Endagered);
    }

    private Endagered setUpNewEndagered() {
        return new Endagered("young", "healthy","lioness");
    }

    @Test
    public void testAnimalInstantiatesWithAge_True() {
        Endagered testEndagered = setUpNewEndagered();
        String testEndageredAge = "young";
        assertEquals(testEndageredAge, testEndagered.getAge());
    }

    @Test
    public void testAnimalInstantiatesWithName_True() {
        Endagered testEndagered = setUpNewEndagered();
        String testEndageredName = "lioness";
        assertEquals(testEndageredName, testEndagered.getName());
    }

    @Test
    public void equalsReturnsTrueIfAttributesAreEqual() {
        Endagered testEndagered = setUpNewEndagered();
        Endagered testEndageredTwo = setUpNewEndagered();
        assertEquals(testEndagered, testEndageredTwo);
    }

    @Test
    public void save_insertsObjectIntoDatabase_Animal() {
        Endagered testEndagered = setUpNewEndagered();
        testEndagered.save();
        System.out.println(testEndagered.getType());
        System.out.println(Endagered.all().get(0).getType());
        assertEquals(Endagered.all().get(0), testEndagered);
    }