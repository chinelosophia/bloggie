package data.models;

import java.time.LocalDateTime;

public class Comment {
    private int id;
    private int articleId;
    private int userId;
    private String comment;
    private final LocalDateTime timeCreated = LocalDateTime.now();

    public Comment(String comment, int id){
        this.id =id;
        this.comment = comment;
        this.userId = userId;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getArticleId() {
        return articleId;
    }

    public void setArticleId(int articleId) {
        this.articleId = articleId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
