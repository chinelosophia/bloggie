package data.repositoryArticle.repository;

import data.models.Article;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ArticleRepositoryImpl implements ArticleRepository{
    private final List<Article> articles = new ArrayList<>();
    private int count;

    @Override
    public Article save(Article article) {
        if(article.getArticleId()==0){
            article.setArticleId(count + 1);
        articles.add(article);
        count++;}
        return article;
    }


    @Override
    public Article findByAuthorId(int authorId) {
        for (Article article : articles)
            if (article.getAuthorId() == authorId)
                return article;
        return null;
    }


    @Override
    public Article findByArticleId(int articleId) {
        for (Article article : articles)
            if (article.getArticleId()== articleId)
        return article;
        return null;
    }

    @Override
    public Article findByTitle(String title) {
        for (Article article : articles)
            if(article.getTitle().equals(title))
        return article;
        return null;
    }

    @Override
    public long count() {
        return count;
    }

    @Override
    public List<Article> findAll() {
        return null;
    }

    @Override
    public Article delete(Article articles) {
        return null;
    }

    @Override
    public void deleteById(int articleId) {
        for(var article: articles){
            if (article.getArticleId()== articleId){
                articles.remove(article);
                break;
            }
        }
        count--;
    }

    @Override
    public void deleteByTitle(String title) {
        for (var article: articles){

            if (article.getTitle()==title){
                articles.remove(article);
                break;
            }
        }
count--;
    }

    @Override
    public void deleteAll() {
        articles.clear();
        count=0;
    }
}
