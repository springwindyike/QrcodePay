package com.jiewen.qrcodepay.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.j256.ormlite.android.apptools.OrmLiteSqliteOpenHelper;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

public class DataBaseHelper extends OrmLiteSqliteOpenHelper {
    private static final String TABLE_NAME = "yiyangtong.db";

    private static Context mApplicationContext;

    private static DataBaseHelper instance;

    private Map<String, Dao> daoMaps = new HashMap<>();

    private DataBaseHelper(Context context) {
        super(context, TABLE_NAME, null, 3);
    }

    @Override
    public void onCreate(SQLiteDatabase database, ConnectionSource connectionSource) {
//        Log.d("database_onCreate","onCreate");
        try {
            TableUtils.createTableIfNotExists(connectionSource, DataBean.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase database, ConnectionSource connectionSource, int oldVersion, int newVersion) {
        try {
            TableUtils.dropTable(connectionSource, DataBean.class, true);
            onCreate(database, connectionSource);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void initOrmLite(Context context) {
        mApplicationContext = context;
        getInstance();
    }

    /**
     * 单例获取该Helper
     */
    public static DataBaseHelper getInstance() {
        if (instance == null) {
            synInit(mApplicationContext);
        }
        return instance;
    }

    private synchronized static void synInit(Context context) {
        if (instance == null) {
            instance = new DataBaseHelper(context);
        }
    }

    /**
     * 获得Dao
     *
     * @return
     * @throws SQLException
     */
    public synchronized Dao getDao(Class clazz) throws SQLException {
        Dao dao = null;
        String className = clazz.getSimpleName();

        if (daoMaps.containsKey(className)) {
            dao = daoMaps.get(className);
        } else {
            dao = super.getDao(clazz);
            daoMaps.put(className, dao);
        }
        return dao;
    }

    /**
     * 释放资源
     */
    @Override
    public void close() {
        super.close();
        for (String key : daoMaps.keySet()) {
            Dao dao = daoMaps.get(key);
            dao = null;
        }
    }
}
