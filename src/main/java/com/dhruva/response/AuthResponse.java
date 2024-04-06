package com.dhruva.response;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class AuthResponse {
    private String jwt;
    private String message;
}
