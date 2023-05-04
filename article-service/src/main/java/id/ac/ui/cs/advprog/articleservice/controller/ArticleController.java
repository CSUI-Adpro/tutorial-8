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
        // TODO DONE: Mengembalikan semua Article yang ada di database
        List<Article> response = null;
        response = articleService.getAllArticles();
        return ResponseEntity.ok(response);
    }

    @GetMapping(path = "/get-post/{id}")
    public ResponseEntity<Article> getArticleById(@PathVariable Integer id) {
        // TODO DONE: Mengembalikan Article dengan id yang ditentukan
        Article response = null;
        response = articleService.findArticleById(id);
        return ResponseEntity.ok(response);
    }

    @PostMapping(path = "/create-post")
    public ResponseEntity<Article> createArticle(@RequestBody CreateArticleDTO createArticleDTO) {
        // TODO DONE: Membuat Article baru dengan data yang ditentukan
        Article response = null;
        response = articleService.createArticle(createArticleDTO);
        return ResponseEntity.ok(response);
    }

    @DeleteMapping(path = "/delete-post/{id}")
    public ResponseEntity<String> deleteArticle(@PathVariable Integer id) {
        // TODO DONE: Menghapus Article dengan id yang ditentukan
        articleService.deleteArticle(id);
        return ResponseEntity.ok(String.format("Deleted Article with id %d", id));
    }
}
