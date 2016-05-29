package payments.entities;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public final class Payment {
    private Integer id;
    private Integer accountId;
    private Date date;
    private double sum;

    public Payment(ResultSet resultSet) throws SQLException {
        setId(resultSet.getInt(1));
        setAccountId(resultSet.getInt(2));
        setDate(resultSet.getDate(3));
        setSum(resultSet.getDouble(4));
    }

    public Payment() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    public boolean equals(Object object) {
        if (this == object) return true;

        if (object == null || getClass() != object.getClass()) return false;

        Payment payment = (Payment) object;

        return new EqualsBuilder()
                .appendSuper(super.equals(object))
                .append(id, payment.id)
                .append(accountId, payment.accountId)
                .append(date, payment.date)
                .isEquals();
    }

    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .appendSuper(super.hashCode())
                .append(id)
                .append(accountId)
                .append(date)
                .toHashCode();
    }

    @Override
    public String toString() {
        return "Payment{" +
                "date=" + date +
                ", sum=" + sum +
                '}';
    }
}
