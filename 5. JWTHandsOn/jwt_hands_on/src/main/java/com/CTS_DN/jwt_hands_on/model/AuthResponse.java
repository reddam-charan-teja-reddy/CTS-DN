package com.CTS_DN.jwt_hands_on.model;

/**
 * @author CTS_DN
 */
public class AuthResponse {

    private String jwt;

    public AuthResponse() {
    }

    public AuthResponse(String jwt) {
        this.jwt = jwt;
    }

    public String getJwt() {
        return jwt;
    }

    public void setJwt(String jwt) {
        this.jwt = jwt;
    }
}
