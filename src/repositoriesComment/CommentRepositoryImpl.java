package repositoriesComment;

import data.models.Comment;
import data.models.User;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CommentRepositoryImpl implements CommentRepositories {

    private List<Comment>comments=new ArrayList<>();
    int count;
    @Override

    public Comment save(Comment comment) {
      if(comment.getId() ==0){
          comment.setId(count+1);
         comments.add(comment);
         count++;
         return comment;}

        return null;
    }

    @Override
    public Comment findById(int id) {
        for (Comment comment: comments){
            if (comment.getId()==id)
        return comment;}
        return null;
    }

    @Override
    public long count() {
        return count;
    }

    @Override
    public List<Comment> findAll() {
        return null;
    }

    @Override
    public void delete(Comment comment) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public Comment findByTitle(String title) {
        for (Comment comment : comments){
            if(comments.getTitle()== title){
                return comment;}

        }
        return null;
    }



    }


