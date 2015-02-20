package hello;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.*;


@RestController
public class ArticleController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    ArrayList<Article> articles = new ArrayList<Article>();

    public ArticleController(){
      articles.add(new Article(counter.incrementAndGet(), "Hello world !"));
    }

    @RequestMapping(method=RequestMethod.GET, value="/article/{id}")
    public Article getArticle(@PathVariable long id) {
       for(Article a: articles){
        if(a.getId() == id){
          return a;
        }
       }
      return null;
     }

    @RequestMapping(method=RequestMethod.POST, value="/article")
    public void update(@RequestBody Article article) {
      articles.add(article);
    }
}