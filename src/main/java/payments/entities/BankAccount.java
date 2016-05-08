package payments.entities;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

public final class BankAccount {
    private Integer id;
    private Integer cardId;
    private Integer paymentId;
    private Integer number;
    private double amount;
    private UserStatus status;

    public BankAccount(Integer id, Integer cardId, Integer paymentId, Integer number, double amount, UserStatus status) {
        this.id = id;
        this.cardId = cardId;
        this.paymentId = paymentId;
        this.number = number;
        this.amount = amount;
        this.status = status;
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

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
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
