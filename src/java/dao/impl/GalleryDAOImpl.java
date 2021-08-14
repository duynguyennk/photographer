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
import entity.Gallery;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import dao.GalleryDAO;

/**
 * This class is an implementation of the GalleryDAO interface and extends
 * DBContext class. This class has methods to query the necessary data from
 * Gallery table in the database. The method will throw an object of
 * <code>java.lang.Exception</code> class if there is any error while querying
 * the data.
 * <p>
 * Bugs:none
 *
 * @author Nguyen Khanh Duy
 */
public class GalleryDAOImpl extends DBContext implements GalleryDAO {

    /**
     * This method counts the total number of Gallery from the database. The
     * result is the total number of Gallery from the database.
     *
     * @return the total number of Gallery. It is an int number.
     * @throws Exception if querying informations from database is error
     */
    @Override
    public int countGallery() throws Exception {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        int totalGallery = 0;
        String sql = "select count(*) from Gallery";
        try {
            con = getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            if (rs.next()) {
                totalGallery = rs.getInt(1);
            }
        } catch (Exception e) {
            throw e;
        } finally {
            closeResultSet(rs);
            closePreparedStatement(ps);
            closeConntection(con);
        }
        return totalGallery;
    }

    /**
     * This method gets a list of all the Gallery from the database. The result
     * contain a list of <code>Gallery</code> objects with id, name,
     * description, image attributes.
     *
     * @return a list of <code>Gallery</code> objects. It is a
     * <code>java.util.List</code> object.
     * @throws Exception if querying informations from database is error.
     */
    @Override
    public List<Gallery> getListGallery() throws Exception {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        List<Gallery> listGallery = new ArrayList<>();
        String sql = "select * from Gallery";
        try {
            con = getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String description = rs.getString("description");
                String image = rs.getString("image");
                Gallery gallery = new Gallery(id, name, description, image);
                listGallery.add(gallery);
            }
        } catch (Exception e) {
            throw e;
        } finally {
            closeResultSet(rs);
            closePreparedStatement(ps);
            closeConntection(con);
        }
        return listGallery;
    }

    /**
     * This method gets paged list of all Galleries matching the pageIndex and
     * pageSize condition. The result contain a list of <code>Gallery</code>
     * objects with id, name, description, image attributes.
     *
     * @param pageIndex the index of page that currently display. It is an int
     * number.
     * @param pageSize the total number of Gallery that will be displayed on a
     * page. It is an int number.
     * @return a list of <code>Gallery</code> objects. It is a
     * <code>java.util.List</code> object.
     * @throws Exception if querying informations from database is error
     */
    @Override
    public List<Gallery> getListGalleryPaging(int pageIndex, int pageSize) throws Exception {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        List<Gallery> listGallery = new ArrayList<>();
        String sql = "select * from Gallery order by id "
                + "offset ? rows fetch next ? rows only";
        try {
            con = getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, pageSize * (pageIndex - 1));
            ps.setInt(2, pageSize);
            rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String description = rs.getString("description");
                String image = rs.getString("image");
                Gallery gallery = new Gallery(id, name, description, image);
                listGallery.add(gallery);
            }
        } catch (Exception e) {
            throw e;
        } finally {
            closeResultSet(rs);
            closePreparedStatement(ps);
            closeConntection(con);
        }
        return listGallery;
    }

}
