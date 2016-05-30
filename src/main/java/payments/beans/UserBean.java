package payments.beans;

import java.util.Date;

public final class UserBean {

    private Integer id;
    private String eMail;
    private String name;
    private String surname;
    private String password;
    private Date dob;
    private String role;

    public Integer getId() {
        return id;
    }

    public String geteMail() {
        return eMail;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPassword() {
        return password;
    }

    public Date getDob() {
        return dob;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setDob(java.sql.Date dob) {
        this.dob = dob;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "User{" +
                "eMail='" + eMail + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", password='" + password + '\'' +
                ", dob=" + dob +
                '}';
    }

}
