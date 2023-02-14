package repositoriesComment;

import data.models.Article;
import data.models.Comment;
import data.models.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CommentRepositoryImplTest {
    private User user;
    private CommentRepositories commentRepositories;
    private Comment comment;

    @BeforeEach

    public void setUp(){
        commentRepositories  = new CommentRepositoryImpl();
        comment = new Comment("Story",1);
    }
   @Test
public void saveOneCommentTestIsOne(){
        commentRepositories.save(comment);
        assertEquals(1,commentRepositories.count());

}
@Test
private void saveOneComment_countIsOneTest(){
        commentRepositories.save(comment);
        assertEquals(1,commentRepositories.count());

    }
    @Test
    public void saveTwoArticleWithSameId_CountIsOneTest() {
        Comment savedComment = commentRepositories.save(comment);
        commentRepositories.save(savedComment);
        assertEquals(1, commentRepositories.count());
        assertEquals(1, savedComment.getArticleId());
    }

}