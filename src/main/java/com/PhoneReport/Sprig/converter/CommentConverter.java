package com.PhoneReport.Sprig.converter;

import com.PhoneReport.Sprig.entity.CommentEntity;
import com.PhoneReport.Sprig.model.CommentModel;
import org.springframework.stereotype.Component;


import java.util.List;
import java.util.stream.Collectors;

@Component
public class CommentConverter {

    public CommentModel toModel(CommentEntity entity) {
        CommentModel model = new CommentModel();
        model.setImei(entity.getImei());
        model.setDate(entity.getDate());
        model.setProblem(entity.getProblem());
        model.setComment(entity.getComment());
        return model;
    }

    public CommentEntity toEntity(CommentModel model) {
        CommentEntity entity = new CommentEntity();
        entity.setImei(model.getImei());
        entity.setDate(model.getDate());
        entity.setProblem(model.getProblem());
        entity.setComment(model.getComment());
        return entity;
    }

    public List<CommentModel> listToModels(List<CommentEntity> entityList) {
        return entityList.stream().map(this::toModel).collect(Collectors.toList());
    }

    public List<CommentEntity> listToEntities(List<CommentModel> modelList) {
        return modelList.stream().map(this::toEntity).collect(Collectors.toList());
    }
}
