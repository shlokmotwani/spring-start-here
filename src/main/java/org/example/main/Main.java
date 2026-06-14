package org.example.main;

import org.example.config.ProjectConfig;
import org.example.model.Comment;
import org.example.proxies.EmailCommentNotificationProxy;
import org.example.repositories.CommentRepository;
import org.example.repositories.DBCommentRepository;
import org.example.services.CommentService;
import org.example.services.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        CommentService commentService = context.getBean(CommentService.class);
        CommentRepository cr1 = commentService.getCommentRepository();
        CommentRepository cr2 = context.getBean(UserService.class).getCommentRepository();

        System.out.println(cr1 == cr2);


//        Comment comment = new Comment();
//        comment.setAuthor("Shlok");
//        comment.setText("I am learning Spring");
    }
}