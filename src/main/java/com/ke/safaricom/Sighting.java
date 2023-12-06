package com.ke.safaricom;

import java.security.Timestamp;

public class Sighting {
    private int wildlifeId;
    private String sightingZone;
    private String rangerName;

    public Sighting(int wildlifeId, String sightingZone, String rangerName, Timestamp sightingTime) {
        this.wildlifeId = wildlifeId;
        this.sightingZone = sightingZone;
        this.rangerName = rangerName;

    }

    @
    @ -19,4+21,8@@

    public int getWildlifeId() {
        public String getSightingZone () {
            return sightingZone;
        }

        public String getRangerName () {
            return rangerName;
        }
    }
}