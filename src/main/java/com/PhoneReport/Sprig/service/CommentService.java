package com.PhoneReport.Sprig.service;


import com.PhoneReport.Sprig.model.CommentModel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CommentService {

    CommentModel createComment(CommentModel commentModel);

    List<CommentModel> listComments();

    CommentModel commentByImei(Long imei);

    CommentModel updateComment(CommentModel commentModel, Long imei);

    String delete(Long imei);


}
