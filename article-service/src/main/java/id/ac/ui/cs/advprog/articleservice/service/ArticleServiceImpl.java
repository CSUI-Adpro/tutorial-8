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
        // TODO: Lengkapi kode berikut
        return null;
    }

    @Override
    public Article findArticleById(Integer id) {
        // TODO: Lengkapi kode berikut
        return null;
    }

    @Override
    public Article createArticle(CreateArticleDTO request) {
        // TODO: Lengkapi kode berikut
        return null;
    }

    @Override
    public void deleteArticle(Integer id) {
        // TODO: Lengkapi kode berikut
    }
}
