package data.repositoryArticle;
import data.models.Article;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ArticleRepositoryImplTest {
    private ArticleRepository articleRepository;
    private Article article;


    @BeforeEach
    public void setup(){
        articleRepository = new ArticleRepositoryImpl();
        article = new Article("i love me","it started when");
    article.setArticleId("11");
    article.setAuthorId("22");
    article.setBody("it started when");
    article.setTitle("i love me");
    }

@Test
    public void  articleOneUserCountIsOneTest(){
        articleRepository.save(article);
        assertEquals(1, articleRepository.count());
}
@Test
    public void saveTwoArticleCountIsOneTest(){
        Article savedArticle = articleRepository.save(article);
        assertEquals(1, articleRepository.count());

        savedArticle.setLastName("babes");
        assertEquals(1,articleRepository.count());
}
@Test
public void saveOneArticle_findByArticleIdTest(){
      Article savedArticle = articleRepository.save(article);
      assertEquals("11",savedArticle.getArticleId());

}
@Test
    public void saveOneArticle_findArticleByTitle(){
        Article savedArticle = articleRepository.save(article);
        assertEquals("i love me",savedArticle.getTitle());
}
@Test
    public void saveOneArticle_deleteOneUserById_CountIsZeroTest() {
    Article savedArticle = articleRepository.save(article);
    assertEquals("11", savedArticle.getArticleId());
    Article deleteArticleById = articleRepository.delete(article);
    assertEquals(0, deleteArticleById.getArticleId());

}
@Test
    public void saveOneArticle_deleteByTitle_CountIsZeroTest(){
        Article savedArticle = articleRepository.save(article);
        assertEquals("i love me",savedArticle.getTitle());
        Article deleteArticleByTitle = articleRepository.delete(article);
        assertEquals("i love me",deleteArticleByTitle.getTitle());
}


}