package org.example.services;

import org.example.repositories.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    public CommentRepository commentRepository;

    public CommentRepository getCommentRepository(){
        return this.commentRepository;
    }
}
