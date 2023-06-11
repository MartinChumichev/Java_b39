package ru.stqa.pft.addressbook.model;

public class ContactData {
    private final String firstname;
    private final String middlename;
    private final String lastname;
    private final String address;
    private final String nickname;
    private final String company;
    private final String homeNumber;
    private final String mobileNumber;
    private final String email;
    private final String secondAddress;

    public ContactData(String firstname, String middlename, String lastname, String address, String nickname, String company, String homeNumber, String mobileNumber, String email, String secondAddress) {
        this.firstname = firstname;
        this.middlename = middlename;
        this.lastname = lastname;
        this.address = address;
        this.nickname = nickname;
        this.company = company;
        this.homeNumber = homeNumber;
        this.mobileNumber = mobileNumber;
        this.email = email;
        this.secondAddress = secondAddress;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getMiddlename() {
        return middlename;
    }

    public String getLastname() {
        return lastname;
    }

    public String getAddress() {
        return address;
    }

    public String getNickname() {
        return nickname;
    }

    public String getCompany() {
        return company;
    }

    public String getHomeNumber() {
        return homeNumber;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getSecondAddress() {
        return secondAddress;
    }
}
