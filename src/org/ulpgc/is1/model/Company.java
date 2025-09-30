package org.ulpgc.is1.model;

public class Company extends Contact {
    public String name;
    public String description;

    public Company(String email, String telephone, Address address, String name, String description) {
        super(email, telephone, address);
        this.name = name;
        this.description = description;
    }

    @Override
    public String getName() {
        return name;
    }
}
