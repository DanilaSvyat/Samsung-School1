package com.example.test02032023.db;

public class StudentReaderContract {
    private StudentReaderContract(){}

    public static final String DATABASE_NAME = "Student.db";
    public static final int DATABASE_VERSION = 1;

    public static class StudentEntry{
        public static final String TABLE_NAME = "student";

        public static final String COLUMN_ID = "id";
        public static final String COLUMN_NAME = "name";
        public static final String COLUMN_AGE = "age";
        public static final String COLUMN_PHONE = "phone";
        public static final String COLUMN_EMAIL = "email";
    }


}
