package org.example.services;

import org.example.model.Comment;
import org.example.proxies.CommentNotificationProxy;
import org.example.repositories.CommentRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class CommentService {
    // private final CommentRepository commentRepository;
    // private final CommentNotificationProxy commentNotificationProxy;
    private Logger logger = Logger.getLogger(CommentService.class.getName());

    public CommentService(CommentRepository commentRepository, @Qualifier("PUSH") CommentNotificationProxy commentNotificationProxy){
//        this.commentRepository = commentRepository;
//        this.commentNotificationProxy = commentNotificationProxy;
//        System.out.println("CommentService instance created!!!");
    }

    public String publishComment(Comment comment){
//        commentRepository.storeComment(comment);
//        commentNotificationProxy.sendComment(comment);
        logger.info("Publishing comment: " + comment.getText());
        return "SUCCESS";
    }

//    public CommentRepository getCommentRepository(){
//        return this.commentRepository;
//    }
}
