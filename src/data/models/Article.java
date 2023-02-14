package data.models;

import java.time.LocalDateTime;

public class Article {
    private int articleId;
    private String title;
    private String body;
    private User userId;
    private final LocalDateTime dateTimeCreated;

    public Article(int articleId, String title, String body, User userId) {
        this.title = title;
        this.body = body;
        this.userId = userId;
        this.dateTimeCreated = LocalDateTime.now();
        articleId +=1;
    }

    public int getArticleId() {
        return articleId;
    }

    public void setArticleId(int articleId) {
        this.articleId = articleId;
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

    public User getUserId() {
        return userId;
    }


    public void setId(int i) {
    }

    public void setAuthorId(int i) {
    }
}


