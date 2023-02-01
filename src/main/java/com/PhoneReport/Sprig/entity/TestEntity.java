package com.PhoneReport.Sprig.entity;


//import jakarta.persistence.*;
import javax.persistence.*;

import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "TEST_TBL")
public class TestEntity {

    @Id
    private Long imei;

    @Column(name = "WIFI")
    private boolean wifi;

    @Column(name = "BLUETOOTH")
    private boolean bluetooth;

    @Column(name = "GPS")
    private boolean gps;

    @Column(name = "BATTERY")
    private boolean battery;

    @Column(name = "PROXIMITY_SENSOR")
    private boolean proximity_sensor;

    @Column(name = "VIBRATIONS")
    private boolean vibrations;

    @Column(name = "BUTTONS")
    private boolean buttons;

    @Column(name = "MICROPHONES")
    private boolean microphones;

    @Column(name = "SPEAKERS")
    private boolean speakers;

    @Column(name = "CAMERAS")
    private boolean cameras;

    @Column(name = "FLASH")
    private boolean flash;

    @Column(name = "DISPLAY")
    private boolean display;

    @Column(name = "FACE_ID")
    private boolean face_id;

    @Column(name = "DATE")
    private Date date;

    public TestEntity() {
    }

    public TestEntity(Long imei, boolean wifi, boolean bluetooth, boolean gps, boolean battery, boolean proximity_sensor, boolean vibrations, boolean buttons, boolean microphones, boolean speakers, boolean cameras, boolean flash, boolean display, boolean face_id, Date date) {
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
        TestEntity that = (TestEntity) o;
        return wifi == that.wifi &&
                bluetooth == that.bluetooth &&
                gps == that.gps &&
                battery == that.battery &&
                proximity_sensor == that.proximity_sensor &&
                vibrations == that.vibrations &&
                buttons == that.buttons &&
                microphones == that.microphones &&
                speakers == that.speakers &&
                cameras == that.cameras &&
                flash == that.flash &&
                display == that.display &&
                face_id == that.face_id &&
                Objects.equals(imei, that.imei) &&
                Objects.equals(date, that.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imei, wifi, bluetooth, gps, battery, proximity_sensor, vibrations, buttons, microphones, speakers, cameras, flash, display, face_id, date);
    }

    @Override
    public String toString() {
        return "TestEntity{" +
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
