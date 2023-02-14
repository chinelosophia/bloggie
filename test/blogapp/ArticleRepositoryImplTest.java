package blogapp;
import data.models.Article;

import data.models.User;
import data.repositoryArticle.repository.ArticleRepository;
import data.repositoryArticle.repository.ArticleRepositoryImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ArticleRepositoryImplTest {
    private ArticleRepository articleRepository;
    private Article article;


    @BeforeEach
    public void setup(){

        articleRepository = new ArticleRepositoryImpl();
        article = new Article("i love me","it started when",1);
    }

@Test
    public void  SaveOneArticle_CountIsOneTest(){
        articleRepository.save(article);
        assertEquals(1, articleRepository.count());
}
@Test
    public void saveOneArticle_idOfUserIsOneTest() {
    Article savedArticle = articleRepository.save(article);
    assertEquals(1, savedArticle.getAuthorId());
}
@Test
public void saveTwoArticleWithSameId_CountIsOneTest(){
       // Article article1 = new Article("i love","started when",1);
      Article savedArticle = articleRepository.save(article);
      articleRepository.save(savedArticle);
    assertEquals(1,articleRepository.count());
    assertEquals(1,savedArticle.getArticleId());

}
@Test
   public void saveOneArticle_findArticleByTitleTest(){
       Article savedArticle = articleRepository.save(article);
       Article foundArticle = articleRepository.findByTitle("i love me");
        assertEquals(savedArticle,foundArticle);
}
@Test
    public void saveOneArticle_deleteOneArticleById_CountIsZeroTest() {
    Article savedArticle = articleRepository.save(article);
    assertEquals(1,articleRepository.count());
    articleRepository.deleteById(1);
    assertEquals(0, articleRepository.count());
    Article foundArticle = articleRepository.findByArticleId(1);
    assertNull(foundArticle);
    }
@Test
    public void saveOneArticle_deleteByTitle_CountIsZeroTest(){
        Article savedArticle = articleRepository.save(article);
        assertEquals("i love me",savedArticle.getTitle());
        Article deleteArticleByTitle = articleRepository.delete(article);
        assertEquals("i love me",deleteArticleByTitle.getTitle());
    }
    @Test
    public void saveTwoArticles_deleteAll_CountIsZeroTest(){
        Article article1 = new Article("i love","started when",1);
        articleRepository.save(article);
        articleRepository.save(article1);
        articleRepository.deleteAll();
        assertEquals(0,articleRepository.count());

    }
}