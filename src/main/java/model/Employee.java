package model;

import java.util.ArrayList;
public class Employee {

    private static ArrayList<Employee> employees = new ArrayList<>();
    private int id;
    private String name;
    private String email;
    private String password;
    private String about;
    private String token;
    private String country;
    private String location;
    private int lng;
    private int lat;
    private String dob;
    private int gender;
    private int userType;
    private int userStatus;
    private String profilePicture;
    private String coverPicture;
    private boolean enablefollowme;
    private boolean sendmenotifications;
    private boolean sendTextmessages;
    private boolean enabletagging;
    private String createdAt;
    private String updatedAt;
    private int livelng;
    private int livelat;
    private String liveLocation;
    private int creditBalance;
    private int myCash;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getLng() {
        return lng;
    }

    public void setLng(int lng) {
        this.lng = lng;
    }

    public int getLat() {
        return lat;
    }

    public void setLat(int lat) {
        this.lat = lat;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public int getUserType() {
        return userType;
    }

    public void setUserType(int userType) {
        this.userType = userType;
    }

    public int getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(int userStatus) {
        this.userStatus = userStatus;
    }

    public String getProfilePicture() {
        return profilePicture;
    }

    public void setProfilePicture(String profilePicture) {
        this.profilePicture = profilePicture;
    }

    public String getCoverPicture() {
        return coverPicture;
    }

    public void setCoverPicture(String coverPicture) {
        this.coverPicture = coverPicture;
    }

    public boolean isEnablefollowme() {
        return enablefollowme;
    }

    public void setEnablefollowme(boolean enablefollowme) {
        this.enablefollowme = enablefollowme;
    }

    public boolean isSendmenotifications() {
        return sendmenotifications;
    }

    public void setSendmenotifications(boolean sendmenotifications) {
        this.sendmenotifications = sendmenotifications;
    }

    public boolean isSendTextmessages() {
        return sendTextmessages;
    }

    public void setSendTextmessages(boolean sendTextmessages) {
        this.sendTextmessages = sendTextmessages;
    }

    public boolean isEnabletagging() {
        return enabletagging;
    }

    public void setEnabletagging(boolean enabletagging) {
        this.enabletagging = enabletagging;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public int getLivelng() {
        return livelng;
    }

    public void setLivelng(int livelng) {
        this.livelng = livelng;
    }

    public int getLivelat() {
        return livelat;
    }

    public void setLivelat(int livelat) {
        this.livelat = livelat;
    }

    public String getLiveLocation() {
        return liveLocation;
    }

    public void setLiveLocation(String liveLocation) {
        this.liveLocation = liveLocation;
    }

    public int getCreditBalance() {
        return creditBalance;
    }

    public void setCreditBalance(int creditBalance) {
        this.creditBalance = creditBalance;
    }

    public int getMyCash() {
        return myCash;
    }

    public void setMyCash(int myCash) {
        this.myCash = myCash;
    }

    public static ArrayList<Employee> getEmployees() {
        return employees;
    }

    public static void setEmployees(ArrayList<Employee> employees) {
        Employee.employees = employees;
    }

}
