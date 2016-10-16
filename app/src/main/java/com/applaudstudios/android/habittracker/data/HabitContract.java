package com.applaudstudios.android.habittracker.data;

import android.provider.BaseColumns;

/**
 * Created by wjplaud83 on 10/13/16.
 */

public class HabitContract {

    // this is to prevent accidental instantiation of the contract class,
    // give it an empty constructor

    private HabitContract() {
    }

    /**
     * Inner class that defines constant values for the habit database table.
     * Each entry in the table represents a single time.
     */
    public static final class HabitEntry implements BaseColumns {

        /** Name of the database table for your habits */
        public final static TABLE_NAME ="habits";

        /**
         * unique ID number for the habit done (this is fort eh database table only)
         * TYPE: Integer
         */
        public final static String _ID = BaseColumns._ID;

        /**
         * Name (either yourself or something in tune with the habit
         * TYPE: Text
         */
        public final static String COLUMN_HABIT_NAME = "name";

        /**
         * Gender
         * TYPE: INTEGER
         */
        public final static String COLUMN_HABIT_GENDER = "Gender";

        /**
         * Type of exercise done
         * TYPE: Text
         */
        public final static String COLUMN_HABIT_EXERCISE = "Exercise";

        /**
         * your weight
         * TYPE: Integer
         */
        public final static String COLUMN_HABIT_WEIGHT = "Your weight";

        /**
         * Possible values for the gender of the person.
         */
        public static final int GENDER_UNKNOWN = 0;
        public static final int GENDER_MALE = 1;
        public static final int GENDER_FEMALE = 2;

    }
}
