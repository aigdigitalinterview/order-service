package com.docker.demo.entity;

import javax.persistence.*;

/**
 * Created by kshah on 8/15/16.
 */
@Entity
@Table(name = "orders")
public class Order {
    @Id
    @Column(name = "order_id")
    private Integer orderId;

    @Column(name = "product_id")
    private Integer productId;

    @Column(name = "amount")
    private float amount;

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Order)) return false;

        Order order = (Order) o;

        if (Float.compare(order.getAmount(), getAmount()) != 0) return false;
        if (!getOrderId().equals(order.getOrderId())) return false;
        return getProductId().equals(order.getProductId());

    }

    @Override
    public int hashCode() {
        int result = getOrderId().hashCode();
        result = 31 * result + getProductId().hashCode();
        result = 31 * result + (getAmount() != +0.0f ? Float.floatToIntBits(getAmount()) : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", productId=" + productId +
                ", amount=" + amount +
                '}';
    }
}
