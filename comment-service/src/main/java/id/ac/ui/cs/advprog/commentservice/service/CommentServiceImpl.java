package id.ac.ui.cs.advprog.commentservice.service;

import id.ac.ui.cs.advprog.commentservice.dto.CommentRequest;
import id.ac.ui.cs.advprog.commentservice.model.Comment;
import id.ac.ui.cs.advprog.commentservice.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class CommentServiceImpl implements CommentService {

    private final CommentRepository commentRepository;
    private final RestTemplate restTemplate;

    @Autowired
    public CommentServiceImpl(CommentRepository commentRepository, RestTemplate restTemplate) {
        this.commentRepository = commentRepository;
        this.restTemplate = restTemplate;
    }

    public boolean getPostViaId(Integer postId) {
        // TODO: Lengkapi kode berikut.
        // Panggil service article untuk mengecek id article (post) yang bersesuaian
        return false;
    }

    @Override
    public Comment create(CommentRequest commentRequest, Integer postId) {
        if(getPostViaId(postId)) {
            // TODO: Lengkapi kode berikut
        } return null;
    }

    @Override
    public List<Comment> findAllByPostId(Integer postId) {
        // TODO: Lengkapi kode berikut
        return null;
    }

    @Override
    public void delete(Integer id) {
        // TODO: Lengkapi kode berikut
    }
}