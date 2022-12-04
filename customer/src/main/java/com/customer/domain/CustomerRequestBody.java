package com.customer.domain;

public record CustomerRequestBody(
        String firstName, String lastName, String email) {
}
