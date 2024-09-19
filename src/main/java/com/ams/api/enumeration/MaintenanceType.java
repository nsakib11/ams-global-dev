package com.ams.api.enumeration;

import java.util.HashMap;
import java.util.Map;

public enum MaintenanceType {

    ADDITION("a"),
    MODIFICATION("m"),
    DELETION("d"),
    AUTHORIZE("z"),
    NONE(" "),
    AMEND("n"),
    CANCEL("k"),
    INQUIRE("i"),
    ADDITION_U("A"),
    MODIFICATION_U("M"),
    DELETION_U("D");


    /**
     * A map to cache labels and their associated MaintenanceType instances.
     * Note that this only works if the labels are all unique!
     */
    private static final Map<String, MaintenanceType> BY_VALUE = new HashMap<>();

    /** populate the BY_LABEL cache */
    static {
        for (MaintenanceType maintenanceType : values()) {
            BY_VALUE.put(maintenanceType.value, maintenanceType);
        }
    }

    /** a final variable to store the value, which can't be changed */
    public final String value;

    /**
     * A private constructor that sets the label.
     * @param value
     */
    private MaintenanceType(String value) {
        this.value = value;
    }

    /**
     * This implementation finds the
     * label in the BY_LABEL cache.
     * @param label The label to look up
     * @return The MaintenanceType instance with the label, or null if not found.
     */
    public static MaintenanceType valueOfLabel(String label) {
        return BY_VALUE.get(label);
    }

    /**
     * Override the toString() method to return the label instead of the declared name.
     * @return
     */
    @Override
    public String toString() {
        return this.value;
    }

    public String getValue() {
        return value;
    }

}
