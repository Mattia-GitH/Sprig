package com.PhoneReport.Sprig.converter;

import com.PhoneReport.Sprig.entity.PhoneEntity;
import com.PhoneReport.Sprig.model.PhoneModel;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class PhoneConverter {

    public PhoneModel toModel(PhoneEntity entity) {
        PhoneModel model = new PhoneModel();
        model.setImei(entity.getImei());
        model.setModel(entity.getModel());
        model.setGb(entity.getGb());
        model.setColor(entity.getColor());
        return model;
    }

    public List<PhoneModel> listToModels(List<PhoneEntity> entityList) {
        return entityList.stream().map(this::toModel).collect(Collectors.toList());
    }

    public PhoneEntity toEntity(PhoneModel model) {
        PhoneEntity entity = new PhoneEntity();
        entity.setImei(model.getImei());
        entity.setModel(model.getModel());
        entity.setGb(model.getGb());
        entity.setColor(model.getColor());
        return entity;
    }

    public List<PhoneEntity> listToEntities(List<PhoneModel> modelList) {
        return modelList.stream().map(this::toEntity).collect(Collectors.toList());
    }
}
