package com.travelplanner.travel.domain;

import com.travelplanner.travel.domain.item.Item;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
@Entity
@Getter @Setter
public class OrderItem {

    @Id
    @GeneratedValue
    @Column(name = "order_item_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "item_ID")
    private Item item;

    @ManyToOne
    @JoinColumn(name = "orderItems")
    private Order order;

    private int orderPrice; // 주문당시 가격
    private int count;      // 주문 수량

}