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
import dao.ContactDAO;
import entity.Contact;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * This class is an implementation of the ContactDAO interface and extends
 * DBContext class. This class has methods to query the necessary data from
 * Contact table in the database. The method will throw an object of
 * <code>java.lang.Exception</code> class if there is any error while querying
 * the data.
 * <p>
 * Bugs:none
 *
 * @author Nguyen Khanh Duy
 */
public class ContactDAOImpl extends DBContext implements ContactDAO {

    /**
     * This method gets all the contact information of the photographer from the
     * database. The result contain an <code>Contact</code> object with
     * telephone, email, facebookUrl, twitterUrl, googleUrl, about, address,
     * city, country, mapUrl, imgMain, iconFb, iconTw, iconGg attributes.
     *
     * @return a <code>Contact</code> objects.
     * @throws Exception if querying informations from database is error.
     */
    @Override
    public Contact getContact() throws Exception {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Contact contact = null;
        String sql = "select * from Contact";
        try {
            con = getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            if (rs.next()) {
                String telephone = rs.getString("telephone");
                String email = rs.getString("email");
                String facebookUrl = rs.getString("fb_url");
                String twitterUrl = rs.getString("tw_url");
                String googleUrl = rs.getString("gg_url");
                String about = rs.getString("about");
                String address = rs.getString("address");
                String city = rs.getString("city");
                String country = rs.getString("country");
                String mapUrl = rs.getString("map_url");
                String imgMain = rs.getString("img_main");
                String iconFb = rs.getString("icon_fb");
                String iconTw = rs.getString("icon_tw");
                String iconGg = rs.getString("icon_gg");
                contact = new Contact(telephone,
                        email,
                        facebookUrl,
                        twitterUrl,
                        googleUrl,
                        about,
                        address,
                        city,
                        country,
                        mapUrl,
                        imgMain,
                        iconFb,
                        iconTw,
                        iconGg);
            }
        } catch (Exception e) {
            throw e;
        } finally {
            closeResultSet(rs);
            closePreparedStatement(ps);
            closeConntection(con);
        }
        return contact;
    }
}
