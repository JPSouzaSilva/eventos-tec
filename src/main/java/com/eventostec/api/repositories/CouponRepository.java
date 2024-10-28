package com.eventostec.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eventostec.api.domain.coupon.Coupon;
import java.util.UUID;

public interface CouponRepository extends JpaRepository<Coupon, UUID> {

} 