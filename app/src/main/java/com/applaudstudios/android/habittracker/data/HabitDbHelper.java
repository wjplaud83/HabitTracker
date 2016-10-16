package com.applaudstudios.android.habittracker.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by wjplaud83 on 10/13/16.
 */

/**this is the database for the habit tracker app.*/
public class HabitDbHelper extends SQLiteOpenHelper {

    public static final String LOG_TAG = HabitDbHelper.class.getSimpleName();

    /**name fo the database(db) file*/
    private static final String DATABASE_NAME = "habits.db";

    /**database version. */
    private static final int DATABASE_VERSION = 1;

    /**
     * Constructs a new instnce of {@link HabitDbHelper}.
     *
     * @param context of the app
     * */
    public HabitDbHelper(Context context) { super(context, DATABASE_NAME, null, DATABASE_VERSION); }

    /***
     * This is called when the database in created for the first time
     */
    @Override
    public void onCreate(SQLiteDatabase db) {
        // Create a String that contains the SQL statement to create the habit table
        String SQL_CREATE_HABIT_TABLE = "CREATE TABLE " + HabitContract.HabitEntry.TABLE_NAME + " ("
                + HabitContract.HabitEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + HabitContract.HabitEntry.COLUMN_HABIT_NAME + " TEXT NOT NULL, "
                + HabitContract.HabitEntry.COLUMN_HABIT_GENDER + "INTEGER NOT NULL, "
                + HabitContract.HabitEntry.COLUMN_HABIT_EXERCISE + "TEXT, "
                + HabitContract.HabitEntry.COLUMN_HABIT_WEIGHT +  "INTEGER NOT NULL DEFAULT 0);";

        // Execute the SQL statement
        db.execSQL(SQL_CREATE_HABIT_TABLE);
    }

    /**
     * This is called when the database needs to be upgraded.
     * */
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // The database is still at version 1, so there's nothing to be done here.
    }
}
