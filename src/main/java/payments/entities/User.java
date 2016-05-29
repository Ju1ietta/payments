package payments.entities;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
//import java.time.LocalDate;
//import java.time.ZoneId;

public final class User {

    private Integer id;
    private String eMail;
    private String name;
    private String surname;
    private String password;
    private Date dob;
    private UserRole role;

    public User(ResultSet resultSet) throws SQLException {
        setId(resultSet.getInt(1));
        seteMail(resultSet.getString(2));
        setName(resultSet.getString(3));
        setSurname(resultSet.getString(4));
        setPassword(resultSet.getString(5));
//        setDob(resultSet.getDate(6).toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
        setDob(resultSet.getDate(6));
        setRole(UserRole.valueOf(resultSet.getString(7)));
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
