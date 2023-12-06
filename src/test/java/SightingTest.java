package com.ke.safaricom;
import org.junit.jupiter.api.Test;}

@Test

public void SightingInstantiatesWithWildlifeId_True() {

        Sighting testSighting = setUpNewSighting();

        int testWildlifeId = 1;

        assertEquals(testWildlifeId, testSighting.getWildlifeId());

        }
@Test
public void SightingInstantiatesWithRangerName_True() {
        Sighting testSighting = setUpNewSighting();
        String testRangerName = "John Doe";
        assertEquals(testRangerName,testSighting.getRangerName());
        }

@Test
public void SightingInstantiatesWithSightingZone_True() {
        Sighting testSighting = setUpNewSighting();
        String testSightingZone = "Zone A";
        assertEquals(testSightingZone, testSighting.getSightingZone());
        }

private Sighting setUpNewSighting() {
        Timestamp timestamp = new Timestamp(new Date().getTime());
        return new Sighting(1, "Zone A", "John Doe", timestamp);
        }



}