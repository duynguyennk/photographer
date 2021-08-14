/*
 * Copyright(C) 2021, FPT University.
 * J3.L.P0017
 *
 * Record of change:
 * DATE            Version             AUTHOR           DESCRIPTION
 * 2021-06-15      1.0                 DuyNKHE140102    First Implement
 * 2021-06-21      2.0                 DuyNKHE140102    Second Implement
 */
package dao;

/**
 * This interface provides methods to query the necessary data from Views table
 * in the database. <code>java.lang.Exception</code> throws when error occurs
 * <p>
 * Bugs: none
 *
 * @author Nguyen Khanh Duy
 */
public interface NumberOfViewDAO {

    /**
     * This method gets the total number of Viewers from the database. The
     * result is the total number of Viewers from the database.
     *
     * @return the total number of Viewers. It is an int number.
     * @throws Exception if querying informations from database is error
     */
    public int getTotalViewers() throws Exception;

    /**
     * This method increases the total number of Viewers by 1 from the database.
     *
     * @throws Exception if querying informations from database is error
     */
    public void increaseTotalViewers() throws Exception;
}
