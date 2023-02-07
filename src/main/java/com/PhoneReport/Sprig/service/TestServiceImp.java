package com.PhoneReport.Sprig.service;

import com.PhoneReport.Sprig.converter.TestConverter;
import com.PhoneReport.Sprig.entity.TestEntity;
import com.PhoneReport.Sprig.exception.TestNotFoundException;
import com.PhoneReport.Sprig.model.TestModel;
import com.PhoneReport.Sprig.repository.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

@Service
public class TestServiceImp implements TestService {
    private final TestRepository repository;
    private final TestConverter converter;

    @Autowired
    public TestServiceImp(TestRepository repository, TestConverter converter) {
        this.repository = repository;
        this.converter = converter;
    }

    @Override
    public TestModel createTest(TestModel testModel) {
        TestEntity toSave = repository.save(converter.toEntity(testModel));
        return converter.toModel(toSave);
    }

    @Override
    public List<TestModel> listTests() {
        List<TestEntity> testEntities = repository.findAll();
        return converter.listToModels(testEntities);
    }

    @Override
    public TestModel testByImei(Long imei) {
        Optional<TestEntity> optional = repository.findById(imei);
        if (optional.isPresent()) {
            return converter.toModel(optional.get());
        } else {
            throw new TestNotFoundException("Test not found: " + imei);
        }
    }

    @Override
    public TestModel updateTest(TestModel testModel, Long imei) {
        Optional<TestEntity> optionalTestEntity = repository.findById(imei);
        if (optionalTestEntity.isPresent()) {
            TestEntity update = optionalTestEntity.get();
            update.setWifi(testModel.isWifi());
            update.setBluetooth(testModel.isBluetooth());
            update.setGps(testModel.isGps());
            update.setBattery(testModel.isBattery());
            update.setProximity_sensor(testModel.isProximity_sensor());
            update.setVibrations(testModel.isVibrations());
            update.setButtons(testModel.isButtons());
            update.setMicrophones(testModel.isMicrophones());
            update.setSpeakers(testModel.isSpeakers());
            update.setCameras(testModel.isCameras());
            update.setFlash(testModel.isFlash());
            update.setDisplay(testModel.isDisplay());
            update.setFace_id(testModel.isFace_id());
            repository.save(update);
            return converter.toModel(update);
        } else {
            throw new TestNotFoundException("Test not found imei:" + imei);
        }
    }

    @Override
    public String delete(long imei) {
        Optional<TestEntity> testEntity = repository.findById(imei);
        if (testEntity.isPresent()) {
            repository.delete(testEntity.get());
            return "User deleted " + testEntity.get();
        } else {
            throw new TestNotFoundException("Test not found id: " + imei);
        }
    }
}