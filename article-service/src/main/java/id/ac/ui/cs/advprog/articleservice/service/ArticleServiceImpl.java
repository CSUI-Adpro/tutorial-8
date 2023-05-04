package id.ac.ui.cs.advprog.articleservice.service;

import id.ac.ui.cs.advprog.articleservice.model.Article;
import id.ac.ui.cs.advprog.articleservice.model.dto.CreateArticleDTO;
import id.ac.ui.cs.advprog.articleservice.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class ArticleServiceImpl implements ArticleService{

    @Autowired
    ArticleRepository articleRepository;

    @Override
    public List<Article> getAllArticles() {
        // TODO DONE: Mengembalikan semua Article yang ada di database
        List<Article> articles = null;
        articles = articleRepository.findAll();
        return articles;
    }

    @Override
    public Article findArticleById(Integer id) {
        // TODO DONE: Mengembalikan Article dengan id yang ditentukan
        Article article = null;
        article = articleRepository.findArticleById(id);
        return article;
    }

    @Override
    public Article createArticle(CreateArticleDTO request) {
        // TODO DONE: Membuat Article baru dengan data yang ditentukan
        Article article = null;
        article = new Article();
        article.setAuthor(request.getAuthor());
        article.setTitle(request.getTitle());
        article.setContent(request.getContent());
        article.setTimestamp(Timestamp.valueOf(LocalDateTime.now()));
        articleRepository.save(article);
        return article;
    }

    @Override
    public void deleteArticle(Integer id) {
        // TODO DONE: Menghapus Article dengan id yang ditentukan
        articleRepository.deleteById(id);
    }
}
