package com.PhoneReport.Sprig.converter;

import com.PhoneReport.Sprig.entity.TestEntity;
import com.PhoneReport.Sprig.model.TestModel;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class TestConverter {

    public TestModel toModel(TestEntity entity) {
        TestModel model = new TestModel();
        model.setImei(entity.getImei());
        model.setWifi(entity.isWifi());
        model.setBluetooth(entity.isBluetooth());
        model.setGps(entity.isGps());
        model.setBattery(entity.isBattery());
        model.setProximity_sensor(entity.isProximity_sensor());
        model.setVibrations(entity.isVibrations());
        model.setButtons(entity.isButtons());
        model.setMicrophones(entity.isMicrophones());
        model.setSpeakers(entity.isSpeakers());
        model.setCameras(entity.isCameras());
        model.setFlash(entity.isFlash());
        model.setDisplay(entity.isDisplay());
        model.setFace_id(entity.isFace_id());
        model.setDate(entity.getDate());
        return model;
    }

    public List<TestModel> listToModels(List<TestEntity> entityList) {
        return entityList.stream().map(this::toModel).collect(Collectors.toList());
    }

    public TestEntity toEntity(TestModel model) {
        TestEntity entity = new TestEntity();
        entity.setImei(model.getImei());
        entity.setWifi(model.isWifi());
        entity.setBluetooth(model.isBluetooth());
        entity.setGps(model.isGps());
        entity.setBattery(model.isBattery());
        entity.setProximity_sensor(model.isProximity_sensor());
        entity.setVibrations(model.isVibrations());
        entity.setButtons(model.isButtons());
        entity.setMicrophones(model.isMicrophones());
        entity.setSpeakers(model.isSpeakers());
        entity.setCameras(model.isCameras());
        entity.setFlash(model.isFlash());
        entity.setDisplay(model.isDisplay());
        entity.setFace_id(model.isFace_id());
        entity.setDate(model.getDate());
        return entity;
    }

    public List<TestEntity> listToEntities(List<TestModel> modelList) {
        return modelList.stream().map(this::toEntity).collect(Collectors.toList());
    }
}
