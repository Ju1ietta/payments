package payments.entities;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

import java.sql.ResultSet;
import java.sql.SQLException;

public final class BankAccount {
    private Integer id;
    private Integer cardId;
    private Integer paymentId;
    private Integer number;
    private Double amount;
    private UserStatus status;

    public BankAccount(ResultSet resultSet) throws SQLException{
        setId(resultSet.getInt(1));
        setCardId(resultSet.getInt(2));
        setPaymentId(resultSet.getInt(3));
        setNumber(resultSet.getInt(4));
        setStatus(UserStatus.valueOf(resultSet.getString(5)));
        setAmount(resultSet.getDouble(6));
    }
    public BankAccount(){
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCardId() {
        return cardId;
    }

    public void setCardId(Integer cardId) {
        this.cardId = cardId;
    }

    public Integer getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(Integer paymentId) {
        this.paymentId = paymentId;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public UserStatus getStatus() {
        return status;
    }

    public void setStatus(UserStatus status) {
        this.status = status;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public boolean equals(Object object) {
        if (this == object) return true;

        if (object == null || getClass() != object.getClass()) return false;

        BankAccount that = (BankAccount) object;

        return new EqualsBuilder()
                .appendSuper(super.equals(object))
                .append(id, that.id)
                .append(cardId, that.cardId)
                .append(paymentId, that.paymentId)
                .append(number, that.number)
                .isEquals();
    }

    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .appendSuper(super.hashCode())
                .append(id)
                .append(cardId)
                .append(paymentId)
                .append(number)
                .toHashCode();
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "number=" + number +
                ", amount=" + amount +
                ", status=" + status +
                '}';
    }
}
