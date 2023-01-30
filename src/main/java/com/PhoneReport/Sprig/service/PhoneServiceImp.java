package com.PhoneReport.Sprig.service;

import com.PhoneReport.Sprig.converter.PhoneConverter;
import com.PhoneReport.Sprig.entity.PhoneEntity;
import com.PhoneReport.Sprig.exception.PhoneNotFoundException;
import com.PhoneReport.Sprig.model.PhoneModel;
import com.PhoneReport.Sprig.repository.PhoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class PhoneServiceImp implements PhoneService {

    private final PhoneRepository repository;
    private final PhoneConverter converter;

    @Autowired
    public PhoneServiceImp(PhoneRepository repository, PhoneConverter converter) {
        this.repository = repository;
        this.converter = converter;
    }

    @Override
    public PhoneModel createPhone(PhoneModel phoneModel) {
        PhoneEntity toSave = repository.save(converter.toEntity(phoneModel));
        return converter.toModel(toSave);
    }

    @Override
    public List<PhoneModel> listPhones() {
        List<PhoneEntity> phoneEntities = repository.findAll();
        return converter.listToModels(phoneEntities);
    }

    @Override
    public PhoneModel phoneByImei(Long imei) {
        Optional<PhoneEntity> optional = repository.findById(imei);
        if (optional.isPresent()) {
            return converter.toModel(optional.get());
        } else {
            throw new PhoneNotFoundException("Phone not found: " + imei);
        }
    }

    @Override
    public PhoneModel updatePhone(PhoneModel phoneModel, Long imei) {
        Optional<PhoneEntity> optionalPhoneEntity = repository.findById(imei);
        if (optionalPhoneEntity.isPresent()) {
            PhoneEntity update = optionalPhoneEntity.get();
            update.setModel(phoneModel.getModel());
            update.setGb(phoneModel.getGb());
            update.setColor(phoneModel.getColor());
            repository.save(update);
            return converter.toModel(update);
        } else {
            throw new PhoneNotFoundException("Phone not found imei: " + imei);
        }
    }

    @Override
    public String delete(long imei) {
        Optional<PhoneEntity> phoneEntityOptional = repository.findById(imei);
        if (phoneEntityOptional.isPresent()) {
            repository.delete(phoneEntityOptional.get());
            return "Phone deleted " + phoneEntityOptional.get();
        } else {
            throw new PhoneNotFoundException("Phone not found imei: " + imei);
        }
    }
}
