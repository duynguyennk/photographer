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

import entity.Image;
import java.util.List;

/**
 * This interface provides methods to query the necessary data from Image table
 * in the database. <code>java.lang.Exception</code> throws when error occurs
 * <p>
 * Bugs: none
 *
 * @author Nguyen Khanh Duy
 */
public interface ImageDAO {

    /**
     * This method counts the total number of <code>Image</code> from the
     * database. The result is the total number of Image from the database.
     *
     * @param galleryId is the id of the gallery that will be counted. It is an
     * int number.
     * @return the total number of Image. It is an int number.
     * @throws Exception if querying informations from database is error
     */
    public int countImage(int galleryId) throws Exception;

    /**
     * This method return the first <code>Image</code> object from database with
     * a specify id of gallery. The result contain a list of <code>Image</code>
     * objects with id, galleryId, image attributes.
     *
     * @param galleyId is the id of the gallery that the first image will be
     * returned. It is an int number.
     * @return the specified <code>Image</code> object with the inputted id
     * @throws Exception if querying informations from database is error
     */
    public Image getFirstImage(int galleyId) throws Exception;

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
    public List<Image> getListImagePaging(int pageIndex, int pageSize, int galleryId) throws Exception;

}
