package com.eventostec.api.domain.coupon;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;
import java.util.Date;

import com.eventostec.api.domain.event.Event;


@Table(name = "coupon")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Coupon {
    @Id
    @GeneratedValue
    private UUID id;

    private String code;

    private Integer discount;

    private Date valid;

    @ManyToOne // Um evento pode ter varios coupons
    @JoinColumn(name = "event_id")
    private Event event;
}
