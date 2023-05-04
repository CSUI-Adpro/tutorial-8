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
        // TODO DONE: Membuat Comment baru dengan data yang ditentukan
        Comment response = null;
        response = commentService.create(commentRequest, postId);
        if(response != null) {
            return ResponseEntity.ok(response);
        }
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
    }

    @GetMapping("/get-all-comments/{postId}")
    public ResponseEntity<List<Comment>> findAllByPostId(@PathVariable Integer postId) {
        // TODO DONE: Mengembalikan semua Comment sesuai Id postingan yang ada di database
        List<Comment> response = null;
        response = commentService.findAllByPostId(postId);
        return ResponseEntity.ok(response);
    }

    @DeleteMapping("/delete-comment/{id}")
    public ResponseEntity<String> delete(@PathVariable Integer id) {
        // TODO DONE: Menghapus Comment dengan id yang ditentukan
        commentService.delete(id);
        return ResponseEntity.ok(String.format("Deleted Comment with id %d", id));
    }

}
