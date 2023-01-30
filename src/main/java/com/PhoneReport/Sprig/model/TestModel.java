package com.PhoneReport.Sprig.model;

import java.util.Date;
import java.util.Objects;

public class TestModel {

    private Long imei;
    private boolean wifi;
    private boolean bluetooth;
    private boolean gps;
    private boolean battery;
    private boolean proximity_sensor;
    private boolean vibrations;
    private boolean buttons;
    private boolean microphones;
    private boolean speakers;
    private boolean cameras;
    private boolean flash;
    private boolean display;
    private boolean face_id;
    private Date date;

    public TestModel() {
    }

    public TestModel(Long imei, boolean wifi, boolean bluetooth, boolean gps, boolean battery, boolean proximity_sensor, boolean vibrations, boolean buttons, boolean microphones, boolean speakers, boolean cameras, boolean flash, boolean display, boolean face_id, Date date) {
        this.imei = imei;
        this.wifi = wifi;
        this.bluetooth = bluetooth;
        this.gps = gps;
        this.battery = battery;
        this.proximity_sensor = proximity_sensor;
        this.vibrations = vibrations;
        this.buttons = buttons;
        this.microphones = microphones;
        this.speakers = speakers;
        this.cameras = cameras;
        this.flash = flash;
        this.display = display;
        this.face_id = face_id;
        this.date = date;
    }

    public Long getImei() {
        return imei;
    }

    public void setImei(Long imei) {
        this.imei = imei;
    }

    public boolean isWifi() {
        return wifi;
    }

    public void setWifi(boolean wifi) {
        this.wifi = wifi;
    }

    public boolean isBluetooth() {
        return bluetooth;
    }

    public void setBluetooth(boolean bluetooth) {
        this.bluetooth = bluetooth;
    }

    public boolean isGps() {
        return gps;
    }

    public void setGps(boolean gps) {
        this.gps = gps;
    }

    public boolean isBattery() {
        return battery;
    }

    public void setBattery(boolean battery) {
        this.battery = battery;
    }

    public boolean isProximity_sensor() {
        return proximity_sensor;
    }

    public void setProximity_sensor(boolean proximity_sensor) {
        this.proximity_sensor = proximity_sensor;
    }

    public boolean isVibrations() {
        return vibrations;
    }

    public void setVibrations(boolean vibrations) {
        this.vibrations = vibrations;
    }

    public boolean isButtons() {
        return buttons;
    }

    public void setButtons(boolean buttons) {
        this.buttons = buttons;
    }

    public boolean isMicrophones() {
        return microphones;
    }

    public void setMicrophones(boolean microphones) {
        this.microphones = microphones;
    }

    public boolean isSpeakers() {
        return speakers;
    }

    public void setSpeakers(boolean speakers) {
        this.speakers = speakers;
    }

    public boolean isCameras() {
        return cameras;
    }

    public void setCameras(boolean cameras) {
        this.cameras = cameras;
    }

    public boolean isFlash() {
        return flash;
    }

    public void setFlash(boolean flash) {
        this.flash = flash;
    }

    public boolean isDisplay() {
        return display;
    }

    public void setDisplay(boolean display) {
        this.display = display;
    }

    public boolean isFace_id() {
        return face_id;
    }

    public void setFace_id(boolean face_id) {
        this.face_id = face_id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TestModel testModel = (TestModel) o;
        return wifi == testModel.wifi &&
                bluetooth == testModel.bluetooth &&
                gps == testModel.gps &&
                battery == testModel.battery &&
                proximity_sensor == testModel.proximity_sensor &&
                vibrations == testModel.vibrations &&
                buttons == testModel.buttons &&
                microphones == testModel.microphones &&
                speakers == testModel.speakers &&
                cameras == testModel.cameras &&
                flash == testModel.flash &&
                display == testModel.display &&
                face_id == testModel.face_id &&
                Objects.equals(imei, testModel.imei) &&
                Objects.equals(date, testModel.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imei, wifi, bluetooth, gps, battery, proximity_sensor, vibrations, buttons, microphones, speakers, cameras, flash, display, face_id, date);
    }

    @Override
    public String toString() {
        return "TestModel{" +
                "imei=" + imei +
                ", wifi=" + wifi +
                ", bluetooth=" + bluetooth +
                ", gps=" + gps +
                ", battery=" + battery +
                ", proximity_sensor=" + proximity_sensor +
                ", vibrations=" + vibrations +
                ", buttons=" + buttons +
                ", microphones=" + microphones +
                ", speakers=" + speakers +
                ", cameras=" + cameras +
                ", flash=" + flash +
                ", display=" + display +
                ", face_id=" + face_id +
                ", date=" + date +
                '}';
    }
}
