package com.raizlabs.android.dbflow.structure.database;

/**
 * Description:
 */
public interface DatabaseStatement {

    long executeUpdateDelete();

    void execute();

    void close();

    long simpleQueryForLong();

    String simpleQueryForString();

    long executeInsert();

    void bindString(int index, String name);

    void bindNull(int index);

    void bindLong(int index, long aLong);
}
