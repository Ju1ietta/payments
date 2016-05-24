package payments.entities;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

import java.util.Date;

public final class CreditCard {
    private Integer id;
    private Integer accountId;
    private Integer userId;
    private Integer number;
    private Integer csv;
    private Date    dateFrom;
    private Date    dateTo;
    private TypeCard type;

    public CreditCard(Integer id, Integer accountId, Integer userId, Integer number, Integer csv, Date dateFrom, Date dateTo, TypeCard type) {
        this.id = id;
        this.accountId = accountId;
        this.userId = userId;
        this.number = number;
        this.csv = csv;
        this.dateFrom = dateFrom;
        this.dateTo = dateTo;
        this.type = type;
    }
    public CreditCard(){
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

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Integer getCsv() {
        return csv;
    }

    public void setCsv(Integer csv) {
        this.csv = csv;
    }

    public Date getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(Date dateFrom) {
        this.dateFrom = dateFrom;
    }

    public Date getDateTo() {
        return dateTo;
    }

    public void setDateTo(Date dateTo) {
        this.dateTo = dateTo;
    }

    public TypeCard getType() {
        return type;
    }

    public void setType(TypeCard type) {
        this.type = type;
    }
    public boolean equals(Object object) {
        if (this == object) return true;

        if (object == null || getClass() != object.getClass()) return false;

        CreditCard that = (CreditCard) object;

        return new EqualsBuilder()
                .appendSuper(super.equals(object))
                .append(id, that.id)
                .append(accountId, that.accountId)
                .append(userId, that.userId)
                .append(number, that.number)
                .append(csv, that.csv)
                .isEquals();
    }

    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .appendSuper(super.hashCode())
                .append(id)
                .append(accountId)
                .append(userId)
                .append(number)
                .append(csv)
                .toHashCode();
    }
    @Override
    public String toString() {
        return "CreditCard{" +
                "number=" + number +
                ", csv=" + csv +
                ", dateFrom=" + dateFrom +
                ", dateTo=" + dateTo +
                ", type=" + type +
                '}';
    }
}
