package lk.ijse.pos.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;


@Embeddable
public class OrderDetailPK  extends SuperEntity{
    @Column(name = "order_id")
    private int orderId;
    @Column(name = "item_code")
    private String itemCode;

    public OrderDetailPK() {

    }

    public OrderDetailPK(int orderId, String itemCode) {
        this.orderId = orderId;
        this.itemCode = itemCode;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    @Override
    public String toString() {
        return "OrderDetailPK{" +
                "orderId=" + orderId +
                ", itemCode='" + itemCode + '\'' +
                '}';
    }
}
