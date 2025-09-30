package org.ulpgc.is1.model;

public abstract class Contact {
    public abstract String getName();
    public String email;
    public String telephone;
    public Address address;

    public Contact(String email, String telephone, Address address) {
        this.email = email;
        this.telephone = telephone;
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}