package com.travelplanner.travel.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Delivery {

    @Id
    @GeneratedValue
    @Column(name = "delivery_id")
    private Long id;

    @OneToOne(mappedBy = "delivery")
    private Order order;

    @Embedded
    private Address address;

    @Enumerated(EnumType.STRING)  // enum쓸때 사용.     ORDINAL은 기본값(*숫자형->사용시주의)
    private DeliveryStatus status; // 배송전 : READY, 배송완료 : COMP
}
