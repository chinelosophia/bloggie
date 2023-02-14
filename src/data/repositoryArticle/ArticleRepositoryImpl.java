package data.repositoryArticle;

import data.models.Article;

import java.util.ArrayList;
import java.util.List;

public class ArticleRepositoryImpl implements ArticleRepository {
    private int count;
    private final List<Article> articles = new ArrayList<>();

    @Override
    public Article save(Article article) {
        boolean articleHasNotBeenSaved = article.getArticleId() == null;
        if (articleHasNotBeenSaved) {
            article.setArticleId(generateArticleId());
            articles.add(article);
            count++;
        }
        return article;
    }

    private String generateArticleId() {
        return String.valueOf(count++);
    }

    public List<Article> getArticles() {
        return articles;
    }

    @Override
    public Article findByAuthorId(String authorId) {
        for (Article article : articles) {
            if (article.getAuthorId() == authorId)
                return article;
        }

        return null;
    }

    @Override
    public Article findByArticleId(String articleId) {
        for (Article article : articles) {
            if (article.getArticleId() == articleId) return article;
        }
        return null;
    }

    @Override
    public Article findByTitle(String title) {
        for (Article article : articles) {
            if (article.getTitle() == title) return article;
        }
        return null;
    }


        @Override
        public long count () {
            return articles.size();
        }

        @Override
        public List<Article> findAll () {
            return null;
        }

        @Override
        public Article delete (Article articles){
            return null;
        }


        @Override
        public void deleteById (String articleId){
            for (Article article : articles) {
                if (article.getArticleId() == articleId) ;
                articles.remove(article);
                count--;
                break;
            }
        }

        @Override
        public void deleteByTitle (String title){
            for (Article article : articles) {
                if (article.getTitle() == title) ;
                articles.remove(article);
                count--;
                break;
            }

        }

        @Override
        public void deleteAll () {

        }
}