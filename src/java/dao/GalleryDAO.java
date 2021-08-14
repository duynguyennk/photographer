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

import entity.Gallery;
import java.util.List;

/**
 * This interface provides methods to query the necessary data from Gallery
 * table in the database. <code>java.lang.Exception</code> throws when error
 * occurs
 * <p>
 * Bugs: none
 *
 * @author Nguyen Khanh Duy
 */
public interface GalleryDAO {

    /**
     * This method counts the total number of Gallery from the database. The
     * result is the total number of Gallery from the database.
     *
     * @return the total number of Gallery. It is an int number.
     * @throws Exception if querying informations from database is error
     */
    public int countGallery() throws Exception;

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
    public List<Gallery> getListGalleryPaging(int pageIndex, int pageSize) throws Exception;

    /**
     * This method gets a list of all the Gallery from the database. The result
     * contain a list of <code>Gallery</code> objects with id, name,
     * description, image attributes.
     *
     * @return a list of <code>Gallery</code> objects. It is a
     * <code>java.util.List</code> object.
     * @throws Exception if querying informations from database is error.
     */
    public List<Gallery> getListGallery() throws Exception;

}
