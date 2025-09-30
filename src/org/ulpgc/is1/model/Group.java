package org.ulpgc.is1.model;

import java.util.ArrayList;

public class Group {
    public final String name;
    private ArrayList<Contact> Grupo;

    public Group(String name) {
        this.name = name;
    }
    public void addContact(Contact contacto) {
        Grupo.add(contacto);
    }
    public void removeContact(Integer i) {
        Grupo.remove(i);
    }

    public String contactCount() {
        return Integer.toString(Grupo.size());
    }
}