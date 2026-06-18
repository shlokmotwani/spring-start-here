package org.example.services;

import org.example.annotations.ToLog;
import org.example.model.Comment;
import org.example.proxies.CommentNotificationProxy;
import org.example.repositories.CommentRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class CommentService {
    private Logger logger = Logger.getLogger(CommentService.class.getName());

    @ToLog
    public String publishComment(Comment comment){
        logger.info("Publishing comment: " + comment.getText());
        return "SUCCESS";
    }
}
