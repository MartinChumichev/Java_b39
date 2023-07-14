package ru.stqa.pft.addressbook.model;

import java.util.Objects;

public class ContactData {
    public int id;
    private String firstname;
    private String lastname;
    private String address;
    private String nickname;
    private String company;
    private String homeNumber;
    private String mobileNumber;
    private String email;
    private String secondAddress;
    private String group;

    public ContactData(int id, String firstname, String lastname, String address,
                       String nickname, String company, String homeNumber, String mobileNumber, String email, String secondAddress, String group) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.address = address;
        this.nickname = nickname;
        this.company = company;
        this.homeNumber = homeNumber;
        this.mobileNumber = mobileNumber;
        this.email = email;
        this.secondAddress = secondAddress;
        this.group = group;
    }

    public ContactData(String firstname, String lastname, String address,
                       String nickname, String company, String homeNumber, String mobileNumber, String email, String secondAddress, String group) {
        this.id = Integer.MAX_VALUE;
        this.firstname = firstname;
        this.lastname = lastname;
        this.address = address;
        this.nickname = nickname;
        this.company = company;
        this.homeNumber = homeNumber;
        this.mobileNumber = mobileNumber;
        this.email = email;
        this.secondAddress = secondAddress;
        this.group = group;
    }

    public String getFirstname() {
        return firstname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getGroup() {
        return group;
    }

    @Override
    public String toString() {
        return "ContactData{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ContactData that = (ContactData) o;

        if (!Objects.equals(firstname, that.firstname)) return false;
        return Objects.equals(lastname, that.lastname);
    }

    @Override
    public int hashCode() {
        int result = firstname != null ? firstname.hashCode() : 0;
        result = 31 * result + (lastname != null ? lastname.hashCode() : 0);
        return result;
    }
}
