package org.ulpgc.is1.model;

import java.util.ArrayList;

public class Agenda {
    private ArrayList<Contact> Contacts;
    private ArrayList<Group> Groups;

    public Agenda() {

    }
    public void addPerson(String firstName, String lastName, String telephone, String email, String street, int number, int floor, String city) {
        Address a = new Address(street,number, floor, city);
        Person p = new Person(email,telephone,a,firstName,lastName);
        Contacts.add(p);
    }

    public void addCompany(String email, String telephone, Address address, String name, String description) {
        Company c = new Company(email,telephone,address,name,description);
        Contacts.add(c);
    }

    public void addGroup(String name) {
        Group g = new Group(name);
        Groups.add(g);
    }

    public ArrayList<Contact> getContactList() {
        return Contacts;
    }

    public ArrayList<Group> getGroupList() {
        return Groups;
    }

    public String contactCount() {
        return Integer.toString(Contacts.size());
    }
}