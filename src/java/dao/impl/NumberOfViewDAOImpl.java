/*
 * Copyright(C) 2021, FPT University.
 * J3.L.P0017
 *
 * Record of change:
 * DATE            Version             AUTHOR           DESCRIPTION
 * 2021-06-15      1.0                 DuyNKHE140102    First Implement
 * 2021-06-21      2.0                 DuyNKHE140102    Second Implement
 */
package dao.impl;

import context.DBContext;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import dao.NumberOfViewDAO;

/**
 * This class is an implementation of the NumberOfViewDAO interface and extends
 DBContext class. This class has methods to query the necessary data from
 * Views table in the database. The method will throw an object of
 * <code>java.lang.Exception</code> class if there is any error while querying
 * the data.
 * <p>
 * Bugs:none
 *
 * @author Nguyen Khanh Duy
 */
public class NumberOfViewDAOImpl extends DBContext implements NumberOfViewDAO {

    /**
     * This method gets the total number of Viewers from the database. The
     * result is the total number of Viewers from the database.
     *
     * @return the total number of Viewers. It is an int number.
     * @throws Exception if querying informations from database is error
     */
    @Override
    public int getTotalViewers() throws Exception {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "select * from Views";
        int views = 0;
        try {
            con = getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            if (rs.next()) {
                views = rs.getInt("ViewsCount");
            }
        } catch (Exception e) {
            throw e;
        } finally {
            closeResultSet(rs);
            closePreparedStatement(ps);
            closeConntection(con);
        }
        return views;
    }

    /**
     * This method increases the total number of Viewers by 1 from the database.
     *
     * @throws Exception if querying informations from database is error
     */
    @Override
    public void increaseTotalViewers() throws Exception {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "UPDATE Views SET ViewsCount = ViewsCount + 1";
        try {
            con = getConnection();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
            closeResultSet(rs);
            closePreparedStatement(ps);
            closeConntection(con);
        }
    }
}
