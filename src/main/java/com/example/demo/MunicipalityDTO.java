package com.example.demo;

public class MunicipalityDTO {

    private Long id;
    private String nameAr;
    private String nameEn;
    private String logoUrl;
    private String phone;
    private String email;
    private String addressText;
    private Double geoLat;
    private Double geoLng;
    private Boolean isActive;
    private String createdAt;

    public MunicipalityDTO() {}

    public MunicipalityDTO(Long id, String nameAr, String nameEn, String logoUrl, String phone,
                           String email, String addressText, Double geoLat, Double geoLng,
                           Boolean isActive, String createdAt) {
        this.id = id;
        this.nameAr = nameAr;
        this.nameEn = nameEn;
        this.logoUrl = logoUrl;
        this.phone = phone;
        this.email = email;
        this.addressText = addressText;
        this.geoLat = geoLat;
        this.geoLng = geoLng;
        this.isActive = isActive;
        this.createdAt = createdAt;
    }


    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNameAr() { return nameAr; }
    public void setNameAr(String nameAr) { this.nameAr = nameAr; }

    public String getNameEn() { return nameEn; }
    public void setNameEn(String nameEn) { this.nameEn = nameEn; }

    public String getLogoUrl() { return logoUrl; }
    public void setLogoUrl(String logoUrl) { this.logoUrl = logoUrl; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getAddressText() { return addressText; }
    public void setAddressText(String addressText) { this.addressText = addressText; }

    public Double getGeoLat() { return geoLat; }
    public void setGeoLat(Double geoLat) { this.geoLat = geoLat; }

    public Double getGeoLng() { return geoLng; }
    public void setGeoLng(Double geoLng) { this.geoLng = geoLng; }

    public Boolean getIsActive() { return isActive; }
    public void setIsActive(Boolean isActive) { this.isActive = isActive; }

    public String getCreatedAt() { return createdAt; }
    public void setCreatedAt(String createdAt) { this.createdAt = createdAt; }
}