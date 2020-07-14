package com.jiewen.qrcodepay.db;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.stmt.DeleteBuilder;
import com.j256.ormlite.stmt.QueryBuilder;
import com.j256.ormlite.stmt.Where;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by user on 2018/8/6.
 */

public class ReceivableDao {
    public static ReceivableDao mTransDaoInstance;

    private Dao<DataBean, Integer> mTransDao;

    public ReceivableDao() {
        try {
            mTransDao = DataBaseHelper.getInstance().getDao(DataBean.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static ReceivableDao getInstance() {
        if (mTransDaoInstance == null) {
            mTransDaoInstance = new ReceivableDao();
        }
        return mTransDaoInstance;
    }

    /**
     * 获得总条数
     */
    public long getAllCount() {
        long count = 0;
        try {
            count = mTransDao.countOf();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return count;
    }

    /**
     * 获得指定条数
     */
    public long getCount(String column, Date beginDate, Date endDate) {
        long count = 0;
        try {
            count = mTransDao.countOf();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return count;
    }

    /**
     * 单条插入数据
     */
    public void insertBean(DataBean bean) {
        try {
            mTransDao.create(bean);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 多条插入数据
     */
    public void insertBeans(List<DataBean> beanList) {
        try {
            mTransDao.create(beanList);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 查询所有数据
     */
    public List<DataBean> queryAllBean() {
        List<DataBean> beans = new ArrayList<>();
        try {
            beans = mTransDao.queryForAll();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return beans;
    }

    /**
     * 通过id查询数据
     */
    public DataBean queryBeanById(int id) {
        DataBean bean = null;
        try {
            bean = mTransDao.queryForId(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bean;
    }

    /**
     * 删除该id的数据
     */
    public void deleteBeanById(int id) {
        try {
            mTransDao.deleteById(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 删除这些id的数据
     */
    public void deleteBeanByIds(List<Integer> ids) {
        try {
            mTransDao.deleteIds(ids);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 删除所有
     */
    public void deleteAllBeans() {
        try {
            mTransDao.deleteBuilder().delete();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 批量删除
     */
    public void deleteListBeans(List<DataBean> list) {
        try {
            mTransDao.delete(list);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 删除一个
     */
    public void deleteBean(DataBean bean) {
        try {
            mTransDao.delete(bean);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 删除指定
     */
    public void deleteBeans(String columnName, Date date) {
        try {
            DeleteBuilder<DataBean, Integer> deleteBuilder = mTransDao.deleteBuilder();
            Where<DataBean, Integer> where = mTransDao.deleteBuilder().where();
            where.lt(columnName,date);
            deleteBuilder.delete();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 更新当前实体类数据
     */
    public void updateBean(DataBean bean) {
        try {
            mTransDao.update(bean);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 更新当前数据的id
     */
    public void updateBeanById(DataBean bean, int id) {
        try {
            mTransDao.updateId(bean, id);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<DataBean> query(String colunm,String value) throws Exception {
        QueryBuilder<DataBean, Integer> queryBuilder = mTransDao
                .queryBuilder();
        Where<DataBean, Integer> where = queryBuilder.where();
        where.eq(colunm, value);
        return queryBuilder.query();
    }

    public List<DataBean> query2(String colunm,int value) throws Exception {
        QueryBuilder<DataBean, Integer> queryBuilder = mTransDao
                .queryBuilder();
        Where<DataBean, Integer> where = queryBuilder.where();
        where.eq(colunm, value);
        return queryBuilder.query();
    }

    public List<DataBean> queryOr() throws Exception {
        QueryBuilder<DataBean, Integer> queryBuilder = mTransDao
                .queryBuilder();
        Where<DataBean, Integer> where = queryBuilder.where();
        where.eq("pay_status", "-1");
        where.and();
        where.eq("pay_status", "0");
        where.and();
        where.eq("pay_status", "2");
        return queryBuilder.query();
    }


    /**
     * 自定义查询
     */
    public List<DataBean> queryBy1() throws Exception {
        QueryBuilder<DataBean, Integer> queryBuilder = mTransDao
                .queryBuilder();
        Where<DataBean, Integer> where = queryBuilder.where();
        where.eq("id", 1);
        where.and();
        where.eq("name", "xxx");


        //或者
//        mTransDao.queryBuilder().
//                where().
//                eq("id", 1).and().
//                eq("name", "xxx");
        return queryBuilder.query();
    }

    /**
     * 查询失败的记录
     */
    public List<DataBean> queryByFail() throws SQLException {
        QueryBuilder<DataBean, Integer> queryBuilder = mTransDao
                .queryBuilder();
        Where<DataBean, Integer> where = queryBuilder.where();
        where.eq("success", false);
        return queryBuilder.query();
    }

    /**
     * 查询一段日期之间的数据
     * columnName:这里可以只receiveDate
     * */
    public List<DataBean> queryFailBy(String columnName, long beginTime, long EndTime) throws SQLException {
        QueryBuilder<DataBean, Integer> queryBuilder = mTransDao
                .queryBuilder();
        Where<DataBean, Integer> where = queryBuilder.where();
        where.eq("success", false);
        where.and();
        where.between(columnName,beginTime,EndTime);
        return queryBuilder.orderBy(columnName,false).query();//false代表倒序
    }

    public List<DataBean> queryBeforeDate(String columnName, long beginTime) throws SQLException {
        QueryBuilder<DataBean, Integer> queryBuilder = mTransDao
                .queryBuilder();
        Where<DataBean, Integer> where = queryBuilder.where();
        where.lt(columnName, beginTime);
        return queryBuilder.orderBy(columnName,false).query();//false代表倒序
    }

    /**
     * 按照字段查询数据
     *
     * */
    public List<DataBean> queryByColumnName(String columnName, String value) throws SQLException {
        QueryBuilder<DataBean, Integer> queryBuilder = mTransDao
                .queryBuilder();
        Where<DataBean, Integer> where = queryBuilder.where();
        where.eq(columnName,value);
        return queryBuilder.query();
    }

    public List<DataBean> queryByColumnNameNotNull(String columnName) throws SQLException {
        QueryBuilder<DataBean, Integer> queryBuilder = mTransDao
                .queryBuilder();
        Where<DataBean, Integer> where = queryBuilder.where();
        where.ne(columnName,"");
        return queryBuilder.query();
    }

    public QueryBuilder<DataBean, Integer> getQueryBuilder() throws SQLException {
        QueryBuilder<DataBean, Integer> queryBuilder = mTransDao
                .queryBuilder();
        return mTransDao.queryBuilder();
    }

    /**
     * 查询一段日期之间的数据
     * columnName:这里可以只receiveDate
     * */
    public List<DataBean> queryBy(String columnName, long beginTime, long EndTime) throws SQLException {
        QueryBuilder<DataBean, Integer> queryBuilder = mTransDao
                .queryBuilder();
        Where<DataBean, Integer> where = queryBuilder.where();
        where.between(columnName,beginTime,EndTime);
        return queryBuilder.orderBy(columnName,false).query();//false代表倒序
    }

    /**
     * 查询某个日期之间的数据
     * columnName:这里可以只receiveDate
     * */
    public List<DataBean> queryBy(String columnName, long receiveDate) throws SQLException {
        QueryBuilder<DataBean, Integer> queryBuilder = mTransDao
                .queryBuilder();
        Where<DataBean, Integer> where = queryBuilder.where();
        where.le(columnName,receiveDate);
        return queryBuilder.orderBy(columnName,false).query();//false代表倒序
    }

    /**
     * 查询一段日期之间的数据
     * columnName:这里可以只receiveDate
     * */
    public List<DataBean> queryBy(String columnName, long beginTime, long EndTime, long offset, long
            rowNums)
            throws SQLException {
        QueryBuilder<DataBean, Integer> queryBuilder = mTransDao
                .queryBuilder();
        Where<DataBean, Integer> where = queryBuilder.where();
        where.between(columnName,beginTime,EndTime);
        return queryBuilder.offset(offset).limit(rowNums).orderBy(columnName,false).query();//false代表倒序
    }

    /**
     * 按倒序查找全部
     * columnName:
     * */
    public List<DataBean> queryAllByDesc(String columnName) throws SQLException {
        QueryBuilder<DataBean, Integer> queryBuilder = mTransDao
                .queryBuilder();
        return queryBuilder.orderBy(columnName,false).query();
    }

    /**
     * 按倒序查找，从第几条(startRow)到开始，到查询多少条(rowNums)
     * columnName:
     * */
    public List<DataBean> queryByDesc(String columnName, long startRow, long rowNums) throws SQLException {
        QueryBuilder<DataBean, Integer> queryBuilder = mTransDao
                .queryBuilder();
        return queryBuilder.offset(startRow).limit(rowNums).orderBy(columnName,false).query();
    }

    /**
     * 查询两个字段之间的数据
     * columnName:
     * */
    public List<DataBean> queryBy2(String columnName, String str1, String str2) throws SQLException {
        QueryBuilder<DataBean, Integer> queryBuilder = mTransDao
                .queryBuilder();
        Where<DataBean, Integer> where = queryBuilder.where();
        where.between(columnName,str1,str2);
        return queryBuilder.query();
    }

    /**
     * 查询50条
     *
     * */
    public List<DataBean> queryBy3() throws SQLException {
        QueryBuilder<DataBean, Integer> queryBuilder = mTransDao
                .queryBuilder();
        Where<DataBean, Integer> where = queryBuilder.where();
        //where.
        return queryBuilder.query();
    }
}
