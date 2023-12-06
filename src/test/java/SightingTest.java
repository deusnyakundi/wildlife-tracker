
import org.junit.jupiter.api.Test;}

@Test

public void SightingInstantiatesWithWildlifeId_True() {

        Sighting testSighting = setUpNewSighting();

        int testWildlifeId = 1;

        assertEquals(testWildlifeId, testSighting.getWildlifeId());

        }


@Test

public void SightingInstantiatesWithSightingZone_True() {

        Sighting testSighting = setUpNewSighting();

        String testSightingZone = "Zone A";

        assertEquals(testSightingZone,testSighting.getSightingZone());

        }




private Sighting setUpNewSighting() {

@@ -32,6 +38,4 @@ private Sighting setUpNewSighting() {

        }









        }