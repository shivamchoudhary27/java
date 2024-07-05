package com.aiims.antenatalcare.portal.entity;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User implements UserDetails {

    private static final long serialVersionUID = 1644876645964393771L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username; // Added username attribute

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        // TODO: Implement method to retrieve user's authorities
        return null;
    }

    @Override
    public String getPassword() {
        // TODO: Implement method to retrieve user's password
        return null;
    }

    @Override
    public String getUsername() {
        return username; // Return the username attribute
    }

    @Override
    public boolean isAccountNonExpired() {
        // TODO: Implement method to check if user's account is non-expired
        return false;
    }

    @Override
    public boolean isAccountNonLocked() {
        // TODO: Implement method to check if user's account is non-locked
        return false;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        // TODO: Implement method to check if user's credentials are non-expired
        return false;
    }

    @Override
    public boolean isEnabled() {
        // TODO: Implement method to check if user's account is enabled
        return false;
    }
}
