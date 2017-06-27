package com.example.joseluis.rmw;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.BaseColumns;

/**
 * Created by Jose Luis on 26/06/2017.
 */

public class AyudaBD extends SQLiteOpenHelper {

    public static class DatosTabla implements BaseColumns {
        public static final String TABLE_NAME = "Usuarios";
        public static final String COLUMN_NAME_TITLE = "nick";
        public static final String COLUMN_NAME_SUBTITLE = "ciudad";

        private static final String TEXT_TYPE = " TEXT";
        private static final String COMMA_SEP = ",";
        private static final String SQL_CREATE_ENTRIES =
                "CREATE TABLE " + DatosTabla.TABLE_NAME + " (" +
                        DatosTabla._ID + " INTEGER PRIMARY KEY," +
                        DatosTabla.COLUMN_NAME_TITLE + TEXT_TYPE + " UNIQUE "+ COMMA_SEP +
                        DatosTabla.COLUMN_NAME_SUBTITLE + TEXT_TYPE + " )";

        private static final String SQL_DELETE_ENTRIES =
                "DROP TABLE IF EXISTS " + DatosTabla.TABLE_NAME;
    }

    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "MiBasedeDatos.db";

    public AyudaBD(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(DatosTabla.SQL_CREATE_ENTRIES);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL(DatosTabla.SQL_DELETE_ENTRIES);
        onCreate(sqLiteDatabase);
    }
}
