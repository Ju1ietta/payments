package main.com.java.course.entities;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import sun.util.resources.LocaleData;

public final class User {

    private Integer id;
    private String eMail;
    private String name;
    private String surname;
    private String password;
    private LocaleData dob;
    private UserRole role;

    public User(String eMail, String name, String surname, String password, LocaleData dob) {
        this.eMail = eMail;
        this.name = name;
        this.surname = surname;
        this.password = password;
        this.dob = dob;
    }
    public User(){
    }

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

    public LocaleData getDob() {
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

    public void setDob(LocaleData dob) {
        this.dob = dob;
    }

    public UserRole getRole() {
        return role;
    }

    public void setRole(UserRole role) {
        this.role = role;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        return new EqualsBuilder()
                .append(id, user.id)
                .append(eMail, user.eMail)
                .append(password, user.password)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(id)
                .append(eMail)
                .append(password)
                .toHashCode();
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
