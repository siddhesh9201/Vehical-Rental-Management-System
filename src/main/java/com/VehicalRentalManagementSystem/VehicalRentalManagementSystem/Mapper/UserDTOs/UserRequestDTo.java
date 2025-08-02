package com.VehicalRentalManagementSystem.VehicalRentalManagementSystem.Mapper.UserDTOs;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public class UserRequestDTo {

    @NotNull
    private String name;
    @Email
    private String email;
    private String password;
    private String role;
    @Pattern(regexp = "/^(?:\\+91|0)?[6-9]\\d{9}$/")
    private  String contactNumber;
    @NotNull
    private String licenseNumber;

    public @NotNull String getName() {
        return name;
    }

    public void setName(@NotNull String name) {
        this.name = name;
    }

    public @Email String getEmail() {
        return email;
    }

    public void setEmail(@Email String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public @Pattern(regexp = "/^(?:\\+91|0)?[6-9]\\d{9}$/") String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(@Pattern(regexp = "/^(?:\\+91|0)?[6-9]\\d{9}$/") String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public @NotNull String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(@NotNull String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }
}
