package com.company;

public class Account {
    private String email;
    private String password;
    private String pin;

    public Account(String email, String password, String pin){
        this.email=email;
        this.password=password;
        this.pin=pin;
    }

    public Account(String email, String password){
        this.email=email;
        this.password=password;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getPin() {
        return pin;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }
}
