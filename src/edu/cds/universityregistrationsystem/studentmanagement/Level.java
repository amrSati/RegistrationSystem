package edu.cds.universityregistrationsystem.studentmanagement;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.Nullable;

/**
 *  States the level of the student
 *  based on international student level classification
 */
public enum Level {
    FRESHMAN("First"), SOPHOMORE("Second"),
    JUNIOR("Third"), SENIOR("Forth");

    private final String displayName;

    private Level(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }

    /**
     *  This method sets the student's level
     *  Based on the student classifications of credit hours
     * @param creditHrs
     * @return
     */
    @Contract(pure = true)
    public static @Nullable Level setLevel(int creditHrs) {
        if (creditHrs <= 29)    return Level.FRESHMAN;
        else if (creditHrs <= 59)    return Level.SOPHOMORE;
        else if (creditHrs <= 89)    return Level.JUNIOR;
        else if (creditHrs >= 90)    return Level.SENIOR;

        return null;
    }
}
