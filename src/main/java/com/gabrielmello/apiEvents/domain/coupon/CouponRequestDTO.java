package com.gabrielmello.apiEvents.domain.coupon;

public record CouponRequestDTO(String code, Integer discount, Long valid) {
}
