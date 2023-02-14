package data.models;

import java.time.LocalDateTime;

public class Article {
    private int articleId;
    private  int authorId;
    private String title;
    private String body;
    private final LocalDateTime dateTimeCreated;

    public Article(String title, String body, int authorId) {
        this.title = title;
        this.body = body;
        this.dateTimeCreated = LocalDateTime.now();
        this.authorId = authorId;}
       //this.articleId = articleId;    }

    public int getArticleId() {
        return articleId;
    }

    public void setArticleId(int articleId) {
        this.articleId = articleId;
    }

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }


    public LocalDateTime getDateTimeCreated() {
        return dateTimeCreated;
    }
}


