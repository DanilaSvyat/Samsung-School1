package com.example.test02032023.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class StudentDbOpenHelper extends SQLiteOpenHelper {

    public StudentDbOpenHelper(@Nullable Context context) {
        super(
                context,
                StudentReaderContract.DATABASE_NAME,
                null,
                StudentReaderContract.DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(
                "CREATE TABLE IF NOT EXISTS " + StudentReaderContract.StudentEntry.TABLE_NAME + " (" +
                        StudentReaderContract.StudentEntry.COLUMN_ID + "INTEGER PRIMARY KEY AUTOINCREMENT, " +
                        StudentReaderContract.StudentEntry.COLUMN_NAME + " TEXT NOT NULL, " +
                        StudentReaderContract.StudentEntry.COLUMN_AGE + " INTEGER NOT NULL, " +
                        StudentReaderContract.StudentEntry.COLUMN_PHONE + " TEXT NOT NULL, " +
                        StudentReaderContract.StudentEntry.COLUMN_EMAIL + " TEXT );"
        );
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL(
                "DROP TABLE IF EXISTS " + StudentReaderContract.StudentEntry.TABLE_NAME + " ;"
        );
        onCreate(sqLiteDatabase);
    }
}
