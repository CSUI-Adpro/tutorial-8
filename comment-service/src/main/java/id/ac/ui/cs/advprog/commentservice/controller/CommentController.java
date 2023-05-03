package id.ac.ui.cs.advprog.commentservice.controller;

import id.ac.ui.cs.advprog.commentservice.dto.CommentRequest;
import id.ac.ui.cs.advprog.commentservice.model.Comment;
import id.ac.ui.cs.advprog.commentservice.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/comment")
public class CommentController {

    private final CommentService commentService;

    @Autowired
    public CommentController(CommentService commentService) {
        this.commentService = commentService;
    }

    @PostMapping("/create-comment/{postId}")
    public ResponseEntity<Comment> create(@RequestBody CommentRequest commentRequest, @PathVariable Integer postId) {
        // TODO: Lengkapi kode berikut
        Comment created = null;
        if(created != null) {
            return ResponseEntity.ok(created);
        } else
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
    }

    @GetMapping("/get-all-comments/{postId}")
    public ResponseEntity<List<Comment>> findAllByPostId(@PathVariable Integer postId) {
        // TODO: Lengkapi kode berikut
        return ResponseEntity.ok(null);
    }

    @DeleteMapping("/delete-comment/{id}")
    public ResponseEntity<String> delete(@PathVariable Integer id) {
        // TODO: Lengkapi kode berikut
        return ResponseEntity.ok(String.format("Deleted Comment with id %d", id));
    }

}
