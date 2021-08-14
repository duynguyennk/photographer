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

import entity.Contact;

/**
 * This interface provides methods to query the necessary data from Contact
 * table in the database. <code>java.lang.Exception</code> throws when error
 * occurs
 * <p>
 * Bugs: none
 *
 * @author Nguyen Khanh Duy
 */
public interface ContactDAO {

    /**
     * This method gets all the contact information of the photographer from the
     * database. The result contain an <code>Contact</code> object with
     * telephone, email, facebookUrl, twitterUrl, googleUrl, about, address,
     * city, country, mapUrl, imgMain, iconFb, iconTw, iconGg attributes.
     *
     * @return a <code>Contact</code> objects.
     * @throws Exception if querying informations from database is error.
     */
    public Contact getContact() throws Exception;
}
