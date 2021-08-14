/*
 * Copyright(C) 2021, FPT University.
 * J3.L.P0017
 *
 * Record of change:
 * DATE            Version             AUTHOR           DESCRIPTION
 * 2021-06-15      1.0                 DuyNKHE140102    First Implement
 * 2021-06-21      2.0                 DuyNKHE140102    Second Implement
 */
package entity;

/**
 * The <code>Image</code> class represents character of <code>Image</code>. The
 * class contains constructor, getter, setter, toString of <code>Image</code>
 * object.
 * <p>
 * Bugs: none
 *
 * @author Nguyen Khanh Duy
 */
public class Image {

    private int id;
    private int galleryId;
    private String image;

    /**
     * Initializes a newly created <code>Image</code> object from a
     * parameterless constructor
     */
    public Image() {
    }

    /**
     * Constructs an <code>Image</code> object with the given id, galleryId,
     * image attributes.
     *
     * @param id is the id of the Image. It is a int number.
     * @param galleryId is the galleryId of Image. It is a int number.
     * @param image is the image of Image. It is a <code>java.lang.String</code>
     */
    public Image(int id, int galleryId, String image) {
        this.id = id;
        this.galleryId = galleryId;
        this.image = image;
    }

    /**
     * Gets the id value of this <code>Image</code> object.
     *
     * @return the id of this <code>Image</code> object
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the id value of this <code>Image</code> object to the specified id.
     *
     * @param id is the id for the <code>Image</code> object. It is a int
     * number.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Gets the galleryId value of this <code>Image</code> object.
     *
     * @return the galleryId of this <code>Image</code> object
     */
    public int getGalleryId() {
        return galleryId;
    }

    /**
     * Sets the galleryId value of this <code>Image</code> object to the
     * specified galleryId.
     *
     * @param galleryId is the galleryId for the <code>Image</code> object. It
     * is a int number.
     */
    public void setGalleryId(int galleryId) {
        this.galleryId = galleryId;
    }

    /**
     * Gets the image value of this <code>Image</code> object.
     *
     * @return the image of this <code>Image</code> object
     */
    public String getImage() {
        return image;
    }

    /**
     * Sets the image value of this <code>Image</code> object to the specified
     * image.
     *
     * @param image is the image for the <code>Image</code> object. It is a
     * <code>java.lang.String</code>
     */
    public void setImage(String image) {
        this.image = image;
    }

    /**
     * Returns a String representing the specified <code>Image</code> object.
     *
     * @return a string representation of the specified Image.
     */
    @Override
    public String toString() {
        return "Image{" + "id=" + id + ", galleryId=" + galleryId + ", image=" + image + '}';
    }

}
