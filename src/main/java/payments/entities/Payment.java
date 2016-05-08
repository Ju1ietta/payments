package payments.entities;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import sun.util.resources.LocaleData;

public final class Payment {
    private Integer id;
    private Integer accountId;
    private LocaleData date;
    private double sum;

    public Payment(Integer id, Integer accountId, LocaleData date, double sum) {
        this.id = id;
        this.accountId = accountId;
        this.date = date;
        this.sum = sum;
    }
    public Payment(){
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

    public LocaleData getDate() {
        return date;
    }

    public void setDate(LocaleData date) {
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
