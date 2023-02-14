package repositoriesComment;

import data.models.Comment;
import data.models.User;

import java.util.List;

public interface CommentRepositories {
    Comment save(Comment comment);
    Comment findById(int id);
    long count();
    List<Comment> findAll();
    void delete(Comment comment);
    void delete(int id);
    void deleteAll();

    Comment findByTitle(String title);


}


