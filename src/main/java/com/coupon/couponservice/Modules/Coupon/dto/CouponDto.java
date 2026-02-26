package com.coupon.couponservice.Modules.Coupon.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CouponDto {
    private String id;
    private String code;
    private double discount;
    private String description;
    private LocalDateTime createdAt;
}
