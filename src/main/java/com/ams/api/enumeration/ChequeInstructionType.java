/**
 * Project Name: Ngi-Microservices
 * File: ChequeInstructionType$
 * Author: Koushik Chandra Sarker
 * Date: 10/12/2023$ (MM/DD/YYYY)
 * Description: .
 * History:
 * - 10/12/2023$: Koushik Chandra Sarker - Initial version
 * - [Date]: [Author's Name] - [Modification description]
 */

package com.ams.api.enumeration;

import java.util.HashMap;
import java.util.Map;

public enum ChequeInstructionType {
    CHEQUE_LOST("L"),
    CHEQUE_STOPPED("S");

    /**
     * A map to cache labels and their associated ChequeInstructionType instances.
     * Note that this only works if the labels are all unique!
     */
    private static final Map<String, ChequeInstructionType> BY_VALUE = new HashMap<>();

    /** populate the BY_LABEL cache */
    static {
        for (ChequeInstructionType ChequeInstructionType : values()) {
            BY_VALUE.put(ChequeInstructionType.value, ChequeInstructionType);
        }
    }

    /** a final variable to store the value, which can't be changed */
    public final String value;

    /**
     * A private constructor that sets the label.
     * @param value
     */
    private ChequeInstructionType(String value) {
        this.value = value;
    }

    /**
     * This implementation finds the
     * label in the BY_LABEL cache.
     * @param label The label to look up
     * @return The ChequeInstructionType instance with the label, or null if not found.
     */
    public static ChequeInstructionType valueOfLabel(String label) {
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
