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
import dao.ImageDAO;
import entity.Image;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * This class is an implementation of the ImageDAO interface and extends
 * DBContext class. This class has methods to query the necessary data from
 * Image table in the database. The method will throw an object of
 * <code>java.lang.Exception</code> class if there is any error while querying
 * the data.
 * <p>
 * Bugs:none
 *
 * @author Nguyen Khanh Duy
 */
public class ImageDAOImpl extends DBContext implements ImageDAO {

    /**
     * This method counts the total number of <code>Image</code> from the
     * database. The result is the total number of Image from the database.
     *
     * @param galleryId is the id of the gallery that will be counted. It is an
     * int number.
     * @return the total number of Image. It is an int number.
     * @throws Exception if querying informations from database is error
     */
    @Override
    public int countImage(int galleryId) throws Exception {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        int totalImage = 0;
        String sql = "select count(*) from Image where gallery_id = ?";
        try {
            con = getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, galleryId);
            rs = ps.executeQuery();
            if (rs.next()) {
                totalImage = rs.getInt(1);
            }
        } catch (Exception e) {
            throw e;
        } finally {
            closeResultSet(rs);
            closePreparedStatement(ps);
            closeConntection(con);
        }
        return totalImage;
    }

    /**
     * This method return the first <code>Image</code> object from database with
     * a specify id of gallery. The result contain a list of <code>Image</code>
     * objects with id, galleryId, image attributes.
     *
     * @param galleryId is the id of the gallery that the first image will be
     * returned. It is an int number.
     * @return the specified <code>Image</code> object with the inputted id
     * @throws Exception if querying informations from database is error
     */
    @Override
    public Image getFirstImage(int galleryId) throws Exception {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Image image = null;
        String sql = "select top (?) * from Image where gallery_id = ?";
        try {
            con = getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, 1);
            ps.setInt(2, galleryId);
            rs = ps.executeQuery();
            if (rs.next()) {
                int id = rs.getInt("id");
                String imageUrl = rs.getString("image");
                image = new Image(id, galleryId, imageUrl);
            }
        } catch (Exception e) {
            throw e;
        } finally {
            closeResultSet(rs);
            closePreparedStatement(ps);
            closeConntection(con);
        }
        return image;
    }

    /**
     * This method gets paged list of all Images matching the pageIndex and
     * pageSize condition. The result contain a list of <code>Image</code>
     * objects with id, galleryId, image attributes.
     *
     * @param pageIndex the index of page that currently display. It is an int
     * number.
     * @param pageSize the total number of Image that will be displayed on a
     * page. It is an int number.
     * @param galleryId is the id of the gallery that will be paged. It is an
     * int number.
     * @return a list of <code>Image</code> objects. It is a
     * <code>java.util.List</code> object.
     * @throws Exception if querying informations from database is error
     */
    @Override
    public List<Image> getListImagePaging(int pageIndex, int pageSize, int galleryId) throws Exception {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        List<Image> listImage = new ArrayList<>();
        String sql = "select * from Image where gallery_id = ?\n"
                + "order by id\n"
                + "offset ? rows fetch next ? rows only";
        try {
            con = getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, galleryId);
            ps.setInt(2, pageSize * (pageIndex - 1));
            ps.setInt(3, pageSize);
            rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String imageUrl = rs.getString("image");
                Image image = new Image(id, galleryId, imageUrl);
                listImage.add(image);
            }
        } catch (Exception e) {
            throw e;
        } finally {
            closeResultSet(rs);
            closePreparedStatement(ps);
            closeConntection(con);
        }
        return listImage;
    }
}
