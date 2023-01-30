package com.PhoneReport.Sprig.service;

import com.PhoneReport.Sprig.converter.CommentConverter;
import com.PhoneReport.Sprig.entity.CommentEntity;
import com.PhoneReport.Sprig.exception.CommentNotFoundException;
import com.PhoneReport.Sprig.model.CommentModel;
import com.PhoneReport.Sprig.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CommentServiceImp implements CommentService {
    private final CommentRepository repository;
    private final CommentConverter converter;

    @Autowired
    public CommentServiceImp(CommentRepository repository, CommentConverter converter) {
        this.repository = repository;
        this.converter = converter;
    }

    public CommentModel createComment(CommentModel commentModel) {
        CommentEntity toSave = repository.save(converter.toEntity(commentModel));
        return converter.toModel(toSave);
    }

    public List<CommentModel> listComments() {
        List<CommentEntity> commentEntities = repository.findAll();
        return converter.listToModels(commentEntities);
    }

    public CommentModel commentByImei(Long imei) {
        Optional<CommentEntity> optional = repository.findById(imei);
        if (optional.isPresent()) {
            return converter.toModel(optional.get());
        } else {
            throw new CommentNotFoundException("Comment not found: " + imei);
        }
    }


    public CommentModel updateComment(CommentModel commentModel, Long imei) {
        Optional<CommentEntity> optionalCommentEntity = repository.findById(imei);
        if (optionalCommentEntity.isPresent()) {
            CommentEntity update = optionalCommentEntity.get();
            update.setProblem(commentModel.getProblem());
            update.setComment(commentModel.getComment());
            repository.save(update);
            return converter.toModel(update);
        } else {
            throw new CommentNotFoundException("Comment not found id: " + commentModel.getImei());
        }
    }

    public String delete(Long imei) {
        Optional<CommentEntity> commentEntityOptional = repository.findById(imei);
        if (commentEntityOptional.isPresent()) {
            repository.delete(commentEntityOptional.get());
            return "Comment deleted " + commentEntityOptional.get();
        } else {
            throw new CommentNotFoundException("Comment not found id: " + imei);
        }
    }
}
