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
 * The <code>Contact</code> class represents character of <code>Contact</code>.
 * The class contains constructor, getter, setter, toString of
 * <code>Contact</code> object.
 * <p>
 * Bugs: none
 *
 * @author Nguyen Khanh Duy
 */
public class Contact {

    private String telephone;
    private String email;
    private String facebookUrl;
    private String twitterUrl;
    private String googleUrl;
    private String about;
    private String address;
    private String city;
    private String country;
    private String mapUrl;
    private String imgMain;
    private String iconFb;
    private String iconTw;
    private String iconGg;

    /**
     * Initializes a newly created <code>Contact</code> object from a
     * parameterless constructor
     */
    public Contact() {
    }

    /**
     * Constructs an <code>Contact</code> object with the given telephone,
     * email, facebookUrl, twitterUrl, googleUrl, about, address, city, country,
     * mapUrl, imgMain, iconFb, iconTw, iconGg attributes.
     *
     * @param telephone is the telephone of the Contact. It is a
     * <code>java.lang.String</code>
     * @param email is the email of Contact. It is a
     * <code>java.lang.String</code>
     * @param facebookUrl is the Facebook's URL of Contact. It is a
     * <code>java.lang.String</code>
     * @param twitterUrl is the Twitter's URL of Contact. It is a
     * <code>java.lang.String</code>
     * @param googleUrl is the Google's URL of Contact. It is a
     * <code>java.lang.String</code>
     * @param about is the about description of Contact. It is a
     * <code>java.lang.String</code>
     * @param address is the address of Contact. It is a
     * <code>java.lang.String</code>
     * @param city is the city of Contact. It is a <code>java.lang.String</code>
     * @param country is the country of Contact. It is a
     * <code>java.lang.String</code>
     * @param mapUrl is the Google Map's URL of Contact. It is a
     * <code>java.lang.String</code>
     * @param imgMain is the main image of Contact. It is a
     * <code>java.lang.String</code>
     * @param iconFb is the Facebook's icon of Contact. It is a
     * <code>java.lang.String</code>
     * @param iconTw is the Twitter's icon of Contact. It is a
     * <code>java.lang.String</code>
     * @param iconGg is the Google's icon of Contact. It is a
     * <code>java.lang.String</code>
     */
    public Contact(String telephone, String email, String facebookUrl, String twitterUrl, String googleUrl, String about, String address, String city, String country, String mapUrl, String imgMain, String iconFb, String iconTw, String iconGg) {
        this.telephone = telephone;
        this.email = email;
        this.facebookUrl = facebookUrl;
        this.twitterUrl = twitterUrl;
        this.googleUrl = googleUrl;
        this.about = about;
        this.address = address;
        this.city = city;
        this.country = country;
        this.mapUrl = mapUrl;
        this.imgMain = imgMain;
        this.iconFb = iconFb;
        this.iconTw = iconTw;
        this.iconGg = iconGg;
    }

    /**
     * Gets the telephone value of this <code>Contact</code> object.
     *
     * @return the telephone of this <code>Contact</code> object
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * Sets the telephone value of this <code>Contact</code> object to the
     * specified telephone.
     *
     * @param telephone is the telephone for the <code>Contact</code> object. It
     * is a <code>java.lang.String</code>
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    /**
     * Gets the email value of this <code>Contact</code> object.
     *
     * @return the email of this <code>Contact</code> object
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the email value of this <code>Contact</code> object to the specified
     * email.
     *
     * @param email is the email for the <code>Contact</code> object. It is a
     * <code>java.lang.String</code>
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Gets the facebookUrl value of this <code>Contact</code> object.
     *
     * @return the facebookUrl of this <code>Contact</code> object
     */
    public String getFacebookUrl() {
        return facebookUrl;
    }

    /**
     * Sets the facebookUrl value of this <code>Contact</code> object to the
     * specified facebookUrl.
     *
     * @param facebookUrl is the facebookUrl for the <code>Contact</code>
     * object. It is a <code>java.lang.String</code>
     */
    public void setFacebookUrl(String facebookUrl) {
        this.facebookUrl = facebookUrl;
    }

    /**
     * Gets the twitterUrl value of this <code>Contact</code> object.
     *
     * @return the twitterUrl of this <code>Contact</code> object
     */
    public String getTwitterUrl() {
        return twitterUrl;
    }

    /**
     * Sets the twitterUrl value of this <code>Contact</code> object to the
     * specified twitterUrk.
     *
     * @param twitterUrl is the twitterUrl for the <code>Contact</code> object.
     * It is a <code>java.lang.String</code>
     */
    public void setTwitterUrl(String twitterUrl) {
        this.twitterUrl = twitterUrl;
    }

    /**
     * Gets the googleUrl value of this <code>Contact</code> object.
     *
     * @return the googleUrl of this <code>Contact</code> object
     */
    public String getGoogleUrl() {
        return googleUrl;
    }

    /**
     * Sets the googleUrl value of this <code>Contact</code> object to the
     * specified googleUrl.
     *
     * @param googleUrl is the googleUrl for the <code>Contact</code> object. It
     * is a <code>java.lang.String</code>
     */
    public void setGoogleUrl(String googleUrl) {
        this.googleUrl = googleUrl;
    }

    /**
     * Gets the about value of this <code>Contact</code> object.
     *
     * @return the about of this <code>Contact</code> object
     */
    public String getAbout() {
        return about;
    }

    /**
     * Sets the about value of this <code>Contact</code> object to the specified
     * about.
     *
     * @param about is the about for the <code>Contact</code> object. It is a
     * <code>java.lang.String</code>
     */
    public void setAbout(String about) {
        this.about = about;
    }

    /**
     * Gets the address value of this <code>Contact</code> object.
     *
     * @return the address of this <code>Contact</code> object
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the address value of this <code>Contact</code> object to the
     * specified address.
     *
     * @param address is the address for the <code>Contact</code> object. It is
     * a <code>java.lang.String</code>
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Gets the city value of this <code>Contact</code> object.
     *
     * @return the city of this <code>Contact</code> object
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the city value of this <code>Contact</code> object to the specified
     * city.
     *
     * @param city is the city for the <code>Contact</code> object. It is a
     * <code>java.lang.String</code>
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * Gets the country value of this <code>Contact</code> object.
     *
     * @return the country of this <code>Contact</code> object
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the country value of this <code>Contact</code> object to the
     * specified country.
     *
     * @param country is the country for the <code>Contact</code> object. It is
     * a <code>java.lang.String</code>
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * Gets the mapUrl value of this <code>Contact</code> object.
     *
     * @return the mapUrl of this <code>Contact</code> object
     */
    public String getMapUrl() {
        return mapUrl;
    }

    /**
     * Sets the mapUrl value of this <code>Contact</code> object to the
     * specified mapUrl.
     *
     * @param mapUrl is the mapUrl for the <code>Contact</code> object. It is a
     * <code>java.lang.String</code>
     */
    public void setMapUrl(String mapUrl) {
        this.mapUrl = mapUrl;
    }

    /**
     * Gets the imgMain value of this <code>Contact</code> object.
     *
     * @return the imgMain of this <code>Contact</code> object
     */
    public String getImgMain() {
        return imgMain;
    }

    /**
     * Sets the imgMain value of this <code>Contact</code> object to the
     * specified imgMain.
     *
     * @param imgMain is the imgMain for the <code>Contact</code> object. It is
     * a <code>java.lang.String</code>
     */
    public void setImgMain(String imgMain) {
        this.imgMain = imgMain;
    }

    /**
     * Gets the iconFb value of this <code>Contact</code> object.
     *
     * @return the iconFb of this <code>Contact</code> object
     */
    public String getIconFb() {
        return iconFb;
    }

    /**
     * Sets the iconFb value of this <code>Contact</code> object to the
     * specified iconFb.
     *
     * @param iconFb is the iconFb for the <code>Contact</code> object. It is a
     * <code>java.lang.String</code>
     */
    public void setIconFb(String iconFb) {
        this.iconFb = iconFb;
    }

    /**
     * Gets the iconTw value of this <code>Contact</code> object.
     *
     * @return the iconTw of this <code>Contact</code> object
     */
    public String getIconTw() {
        return iconTw;
    }

    /**
     * Sets the iconTw value of this <code>Contact</code> object to the
     * specified iconTw.
     *
     * @param iconTw is the iconTw for the <code>Contact</code> object. It is a
     * <code>java.lang.String</code>
     */
    public void setIconTw(String iconTw) {
        this.iconTw = iconTw;
    }

    /**
     * Gets the iconGg value of this <code>Contact</code> object.
     *
     * @return the iconGg of this <code>Contact</code> object
     */
    public String getIconGg() {
        return iconGg;
    }

    /**
     * Sets the iconGg value of this <code>Contact</code> object to the
     * specified iconGg.
     *
     * @param iconGg is the iconGg for the <code>Contact</code> object. It is a
     * <code>java.lang.String</code>
     */
    public void setIconGg(String iconGg) {
        this.iconGg = iconGg;
    }

    /**
     * Returns a String representing the specified <code>Contact</code> object.
     *
     * @return a string representation of the specified Contact.
     */
    @Override
    public String toString() {
        return "Contact{" + "telephone=" + telephone + ", email=" + email + ", facebookUrl=" + facebookUrl + ", twitterUrl=" + twitterUrl + ", googleUrl=" + googleUrl + ", about=" + about + ", address=" + address + ", city=" + city + ", country=" + country + ", mapUrl=" + mapUrl + ", imgMain=" + imgMain + ", iconFb=" + iconFb + ", iconTw=" + iconTw + ", iconGg=" + iconGg + '}';
    }

}
