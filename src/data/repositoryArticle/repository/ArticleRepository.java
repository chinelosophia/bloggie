package data.repositoryArticle.repository;

import data.models.Article;

import java.util.List;

public interface ArticleRepository {
    Article save(Article articles);
    Article findByAuthorId(int authorId);
    Article findByArticleId(int articleId);
    Article findByTitle(String title);
    long count();
    List<Article> findAll();
    Article delete(Article articles);
    void deleteById(int articleId);
    void deleteByTitle(String title);
    void deleteAll();
}
