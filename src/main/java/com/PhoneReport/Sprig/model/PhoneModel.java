package com.PhoneReport.Sprig.model;

import java.util.Objects;

public class PhoneModel {
    private Long imei;
    private String model;
    private String gb;
    private String color;

    public PhoneModel() {
    }

    public PhoneModel(Long imei, String model, String gb, String color) {
        this.imei = imei;
        this.model = model;
        this.gb = gb;
        this.color = color;
    }

    public Long getImei() {
        return imei;
    }

    public void setImei(Long imei) {
        this.imei = imei;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getGb() {
        return gb;
    }

    public void setGb(String gb) {
        this.gb = gb;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PhoneModel that = (PhoneModel) o;
        return Objects.equals(imei, that.imei) && Objects.equals(model, that.model) && Objects.equals(gb, that.gb) && Objects.equals(color, that.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imei, model, gb, color);
    }

    @Override
    public String toString() {
        return "PhoneModel{" +
                "imei=" + imei +
                ", model='" + model + '\'' +
                ", gb='" + gb + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
