package com.PhoneReport.Sprig.controller;

import com.PhoneReport.Sprig.model.CommentModel;
import com.PhoneReport.Sprig.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class CommentController {

    private final CommentService commentService;

    @Autowired
    public CommentController(CommentService commentService) {
        this.commentService = commentService;
    }

    @RequestMapping("comments")
    public String commentList(Model model){
        List<CommentModel> commentModelList = commentService.listComments();
        model.addAttribute("commentList", commentModelList);

        return "comments";
    }

    @RequestMapping("/create_comment")
    public String addComment(Model model){
        CommentModel commentModel = new CommentModel();
        model.addAttribute("comment",commentModel);

        return "newComment";
    }

    @RequestMapping(value = "/save_comment", method = RequestMethod.POST)
    public String saveComment(@ModelAttribute("comment") CommentModel commentModel){
        commentService.createComment(commentModel);

        return "comments";
    }

    @RequestMapping("comment/edit/{imei}")
    public String editComment(Model model, @PathVariable(name = "imei") Long imei) {
        CommentModel commentModel = commentService.commentByImei(imei);
        model.addAttribute("comment", commentModel);

        return "editComment";
    }

    @RequestMapping(value = "comment/update/{imei}", method = RequestMethod.POST)
    public String updateComment(@PathVariable(name = "imei") Long imei, @ModelAttribute("comment") CommentModel commentModel) {
        commentService.updateComment(commentModel, imei);

        return "comments";
    }

    @RequestMapping(value="comment/delete/{imei}",method = RequestMethod.GET)
    public String delete(@PathVariable Long imei){
        commentService.delete(imei);
        return "comments";
    }
}
