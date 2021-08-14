/*
 * Copyright(C) 2021, FPT University.
 * J3.L.P0017
 *
 * Record of change:
 * DATE            Version             AUTHOR           DESCRIPTION
 * 2021-06-15      1.0                 DuyNKHE140102    First Implement
 * 2021-06-21      2.0                 DuyNKHE140102    Second Implement
 */
package controller;

import dao.ContactDAO;
import dao.impl.GalleryDAOImpl;
import entity.Gallery;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import dao.GalleryDAO;
import dao.impl.ContactDAOImpl;

/**
 * Through the data access layer, this class gets list of galleries, contact
 * information from the database by calling methods from GalleryDAO's object and
 * handles the paging process. After that, this class will push all the data to
 * "Home.jsp". This class will push to error page if any error occurs.
 * <p>
 * Bugs:none
 *
 * @author Nguyen Khanh Duy
 */
@WebServlet(name = "HomeController", urlPatterns = {"/home"})
public class HomeController extends HttpServlet {

    /**
     * This method gets list of galleries, contact information from the database
     * by calling methods from GalleryDAO's object, contactDAO's object and
     * handles the paging process then push all the data to "Home.jsp". This
     * method will push to error page if any error occurs. Processes requests
     * for both HTTP <code>GET</code> and <code>POST</code> methods.
     *
     * @param request stores attributes listGallery, contact, error,
     * errorDetail, listGalleryPaging, lastPage, index and send to a web page.
     * It is a <code>javax.servlet.http.HttpServletRequest</code>
     * @param response is used to response the request of HTTP request. It is a
     * <code>javax.servlet.http.HttpServletResponse</code>
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try {
            GalleryDAO galleryDAO = new GalleryDAOImpl();
            ContactDAO contactDAO = new ContactDAOImpl();
            request.setAttribute("listGallery", galleryDAO.getListGallery());
            request.setAttribute("contact", contactDAO.getContact());
            String pageIndex = request.getParameter("index");
            int index = (pageIndex != null) ? Integer.parseInt(pageIndex) : 1;
            int totalGallery = galleryDAO.countGallery();
            int pageSize = 3;
            int lastPage = totalGallery / pageSize;
            //Maximum number of page that website can display
            if (totalGallery % pageSize != 0) {
                lastPage++;
            }

            if (index > lastPage || index < 1) {
                request.setAttribute("error", "The page you’re looking for can’t be found.");
                request.getRequestDispatcher("Error.jsp").forward(request, response);
            }

            List<Gallery> listGalleryPaging = galleryDAO.getListGalleryPaging(index, pageSize);

            request.setAttribute("listGalleryPaging", listGalleryPaging);
            request.setAttribute("lastPage", lastPage);
            request.setAttribute("index", index);
            request.getRequestDispatcher("Home.jsp").forward(request, response);
        } catch (Exception e) {
            request.setAttribute("error", "The page you’re looking for can’t be found.");
            request.setAttribute("errorDetail", e.getMessage());
            request.getRequestDispatcher("Error.jsp").forward(request, response);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request stores attributes listGallery, contact, error,
     * errorDetail, listGalleryPaging, lastPage, index and send to a web page.
     * It is a <code>javax.servlet.http.HttpServletRequest</code>
     * @param response is used to response the request of HTTP request. It is a
     * <code>javax.servlet.http.HttpServletResponse</code>
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request stores attributes listGallery, contact, error,
     * errorDetail, listGalleryPaging, lastPage, index and send to a web page.
     * It is a <code>javax.servlet.http.HttpServletRequest</code>
     * @param response is used to response the request of HTTP request. It is a
     * <code>javax.servlet.http.HttpServletResponse</code>
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
