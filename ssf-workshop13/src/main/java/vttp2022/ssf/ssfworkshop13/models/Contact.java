package vttp2022.ssf.ssfworkshop13.models;

import java.util.Random;

public class Contact {
    private String name;
    private String email;
    private int phoneNumber;
    private String id;

    public Contact(){
        this.id = this.generateId(8);
    }

    public Contact(String name, String email, int phoneNumber){
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public Contact(String id, String name, String email, int phoneNumber){
        this.id = id;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
    // two classes calling the same method, it will be one at a time.
    // synchronized don't allow for concurrent calls, queuing system for generating id
    private synchronized String generateId(int numChars){
        Random r = new Random();
        StringBuilder sb = new StringBuilder();
        while(sb.length() < numChars){
            sb.append(Integer.toHexString(r.nextInt()));

        }
       
        return sb.toString().substring(0, numChars);

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
    public int getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }



}
