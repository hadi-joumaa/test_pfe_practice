package com.example.demo;

public class UserDTO {

    private Long id;
    private String fullName;
    private String phone;
    private String email;
    private String role;
    private Boolean isVerified;
    private String status;
    private String avatarUrl;
    private Long municipalityId; 
    private String municipalityName; 
    private String createdAt;

    public UserDTO() {}

    public UserDTO(Long id, String fullName, String phone, String email, String role,
                   Boolean isVerified, String status, String avatarUrl, Long municipalityId,
                   String municipalityName, String createdAt) {
        this.id = id;
        this.fullName = fullName;
        this.phone = phone;
        this.email = email;
        this.role = role;
        this.isVerified = isVerified;
        this.status = status;
        this.avatarUrl = avatarUrl;
        this.municipalityId = municipalityId;
        this.municipalityName = municipalityName;
        this.createdAt = createdAt;
    }

    // ===== Getters & Setters =====

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getFullName() { return fullName; }
    public void setFullName(String fullName) { this.fullName = fullName; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getRole() { return role; }
    public void setRole(String role) { this.role = role; }

    public Boolean getIsVerified() { return isVerified; }
    public void setIsVerified(Boolean isVerified) { this.isVerified = isVerified; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public String getAvatarUrl() { return avatarUrl; }
    public void setAvatarUrl(String avatarUrl) { this.avatarUrl = avatarUrl; }

    public Long getMunicipalityId() { return municipalityId; }
    public void setMunicipalityId(Long municipalityId) { this.municipalityId = municipalityId; }

    public String getMunicipalityName() { return municipalityName; }
    public void setMunicipalityName(String municipalityName) { this.municipalityName = municipalityName; }

    public String getCreatedAt() { return createdAt; }
    public void setCreatedAt(String createdAt) { this.createdAt = createdAt; }
}