package id.ac.ui.cs.advprog.articleservice.controller;

import id.ac.ui.cs.advprog.articleservice.model.Article;
import id.ac.ui.cs.advprog.articleservice.model.dto.CreateArticleDTO;
import id.ac.ui.cs.advprog.articleservice.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/api/v1/article")
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @GetMapping(path = "/get-all-posts")
    public ResponseEntity<List<Article>> getAllArticles() {
        // TODO: Lengkapi kode berikut
        return ResponseEntity.ok(null);
    }

    @GetMapping(path = "/get-post/{id}")
    public ResponseEntity<Article> getArticleById(@PathVariable Integer id) {
        // TODO: Lengkapi kode berikut
        return ResponseEntity.ok(null);
    }

    @PostMapping(path = "/create-post")
    public ResponseEntity<Article> createArticle(@RequestBody CreateArticleDTO createArticleDTO) {
        // TODO: Lengkapi kode berikut
        return ResponseEntity.ok(null);
    }

    @DeleteMapping(path = "/delete-post/{id}")
    public ResponseEntity<String> deleteArticle(@PathVariable Integer id) {
        // TODO: Lengkapi kode berikut
        return ResponseEntity.ok(String.format("Deleted Article with id %d", id));
    }
}
