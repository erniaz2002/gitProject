package sample;

import java.io.Serializable;

public class Student implements Serializable {

    private String name;
    private String surname;
    private String login;
    private String password;
    private String gender;

    public Student(Integer id, String name, String surname, String login, String password, String gender) {
    }

    public Student( String name, String surname, String login, String password, String gender) {

        this.name = name;
        this.surname = surname;
        this.login = login;
        this.password = password;
        this.gender = gender;
    }


    public String toString() {
        return " "+ name+" "+surname+" "+login+" "+password+" "+gender;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }}