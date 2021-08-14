/*
 * Copyright(C) 2021, FPT University.
 * J3.L.P0017
 *
 * Record of change:
 * DATE            Version             AUTHOR           DESCRIPTION
 * 2021-06-15      1.0                 DuyNKHE140102    First Implement
 * 2021-06-21      2.0                 DuyNKHE140102    Second Implement
 */
package listener;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
import dao.impl.NumberOfViewDAOImpl;
import dao.NumberOfViewDAO;

/**
 * This class is an implementation of the HttpSessionListener interface. This
 * class has method to track the number of viewers access the web page.
 * <p>
 * Bugs:none
 *
 * @author Nguyen Khanh Duy
 */
public class SessionListener implements HttpSessionListener {

    /**
     * This method will be called when a session is created. This method will
     * update the total viewers in the database and push a list of total viewers
     * to session.
     *
     * @param se the session event. It is a
     * <code>javax.servlet.http.HttpSessionEvent</code>
     */
    @Override
    public void sessionCreated(HttpSessionEvent se) {
        try {
            NumberOfViewDAO numberOfViewDAO = new NumberOfViewDAOImpl();
            numberOfViewDAO.increaseTotalViewers();
            String totalViewers = String.format("%06d", numberOfViewDAO.getTotalViewers());
            List<String> listTotalViewers = new ArrayList<>();
            for (int i = totalViewers.length() - 1; i >= 0; i--) {
                listTotalViewers.add(totalViewers.charAt(i) + "");
            }
            HttpSession ses = se.getSession();
            ses.setAttribute("totalViewers", listTotalViewers);
        } catch (Exception ex) {
            Logger.getLogger(SessionListener.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method will be called when a session is destroyed
     *
     * @param se the session event. It is a
     * <code>javax.servlet.http.HttpSessionEvent</code>
     */
    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
