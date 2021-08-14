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
 * The <code>Gallery</code> class represents character of <code>Gallery</code>.
 * The class contains constructor, getter, setter, toString of
 * <code>Gallery</code> object.
 * <p>
 * Bugs: none
 *
 * @author Nguyen Khanh Duy
 */
public class Gallery {

    private int id;
    private String name;
    private String description;
    private String image;

    /**
     * Initializes a newly created <code>Gallery</code> object from a
     * parameterless constructor
     */
    public Gallery() {
    }

    /**
     * Constructs an <code>Gallery</code> object with the given id, name,
     * description, image attributes.
     *
     * @param id is the id of the Gallery. It is a int number.
     * @param name is the name of Gallery. It is a <code>java.lang.String</code>
     * @param description is the description of Gallery. It is a
     * <code>java.lang.String</code>
     * @param image is the image of Gallery. It is a
     * <code>java.lang.String</code>
     */
    public Gallery(int id, String name, String description, String image) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.image = image;
    }

    /**
     * Gets the id value of this <code>Gallery</code> object.
     *
     * @return the id of this <code>Gallery</code> object
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the id value of this <code>Gallery</code> object to the specified
     * id.
     *
     * @param id is the id for the <code>Gallery</code> object. It is a int
     * number.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Gets the name value of this <code>Gallery</code> object.
     *
     * @return the name of this <code>Gallery</code> object
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name value of this <code>Gallery</code> object to the specified
     * name.
     *
     * @param name is the name for the <code>Gallery</code> object. It is a
     * <code>java.lang.String</code>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the description value of this <code>Gallery</code> object.
     *
     * @return the description of this <code>Gallery</code> object
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the description value of this <code>Gallery</code> object to the
     * specified description.
     *
     * @param description is the description for the <code>Gallery</code>
     * object. It is a <code>java.lang.String</code>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Gets the image value of this <code>Gallery</code> object.
     *
     * @return the image of this <code>Gallery</code> object
     */
    public String getImage() {
        return image;
    }

    /**
     * Sets the image value of this <code>Gallery</code> object to the specified
     * image.
     *
     * @param image is the image for the <code>Gallery</code> object. It is a
     * <code>java.lang.String</code>
     */
    public void setImage(String image) {
        this.image = image;
    }

    /**
     * Returns a String representing the specified <code>Gallery</code> object.
     *
     * @return a string representation of the specified <code>Gallery</code>.
     */
    @Override
    public String toString() {
        return "Gallery{" + "id=" + id + ", name=" + name + ", description=" + description + ", image=" + image + '}';
    }

}
