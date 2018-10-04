package com.example.opilane.namebook;

import java.io.Serializable;

// Muutsin klassi Serializableks annab võimaluse Person objekti kanda parameetrina edasi teise activity-sse.
public class Person implements Serializable {
    private String name, phone, email, text;

    public Person(String name, String phone, String email, String text) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.text = text;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getText() {
        return text;
    }

    public Person (String line) throws Exception{
        String[] elems = line.split("/f");
        if (elems.length !=4) throw new Exception("Illegal text for person");
        name = elems[0];
        phone = elems[1].trim();
        email = elems[2].trim();
        text = elems[3].trim();
    }

    public String getPerson(){
        StringBuilder builder = new StringBuilder(name);
        builder.append("\f");
        builder.append(phone.length() == 0 ? "\t" : phone);
        builder.append("\f");
        builder.append(email.length() == 0 ? "\t" : email);
        builder.append("\f");
        builder.append(text.length() == 0 ? "\t" : text);
        builder.append("\f");
        return builder.toString();
    }
    @Override
    public String toString() {
        return name;
    }
}
