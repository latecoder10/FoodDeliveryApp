package com.food.modules;

public class Users {
    private int userId;

    private String userName;
    private String password;
    private String email;

    private String address;
    private UserType userType;  // Use the enum as the type for this field


    // Enum defined within the class
    public enum UserType {
        CUSTOMER, STAFF, ADMIN
    }
    

    public Users() {
		super();
	}

	// Constructor
    public Users(int userId, String userName, String password, String email,
                String address, UserType userType) {
        this.userId = userId;

        this.userName = userName;
        this.password = password;
        this.email = email;

        this.address = address;
        this.userType = userType;

    }

    // Getters and Setters
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

 

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }

   
    
    
    @Override
    public String toString() {
        return "Menu{" +
                "userId=" + userId +
        
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
         
                ", address='" + address + '\'' +
                ", userType=" + userType +
    
                '}';
    }

    
}
