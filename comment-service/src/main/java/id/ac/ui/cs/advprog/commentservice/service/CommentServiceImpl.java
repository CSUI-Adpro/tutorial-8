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
    private String articleServiceURL = "http://localhost:8080/api/v1/article";

    @Autowired
    public CommentServiceImpl(CommentRepository commentRepository, RestTemplate restTemplate) {
        this.commentRepository = commentRepository;
        this.restTemplate = restTemplate;
    }

    public boolean getPostViaId(Integer postId) {
        // TODO DONE: Panggil service article untuk mengecek id article (post) yang bersesuaian

        // Mendapatkan object article
        String endpoint = "/get-post/";
        Object article = restTemplate.getForObject(
                String.format("%s%s%s", articleServiceURL, endpoint, postId), String.class
        );

        // Jika article tidak null, maka return true
        if (article != null) {
            return true;
        }
        return false;
    }

    @Override
    public Comment create(CommentRequest commentRequest, Integer postId) {
        // TODO DONE NOTED: Membuat Comment baru dengan data yang ditentukan
        Comment comment = null;
        if(getPostViaId(postId)) {
            comment = new Comment();
            comment.setAuthor(commentRequest.getAuthor());
            comment.setContent(commentRequest.getContent());
            comment.setPostId(postId);
            comment.setTimestamp(Timestamp.valueOf(LocalDateTime.now()));
            commentRepository.save(comment);
        }
        return comment;
    }

    @Override
    public List<Comment> findAllByPostId(Integer postId) {
        // TODO DONE: Mengembalikan semua Comment yang ada di database dengan postId yang ditentukan
        List<Comment> comments = null;
        comments = commentRepository.findAllByPostId(postId);
        return comments;
    }

    @Override
    public void delete(Integer id) {
        // TODO DONE: Menghapus Comment dengan id yang ditentukan
        commentRepository.deleteById(id);
    }
}
