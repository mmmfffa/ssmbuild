import com.mf.pojo.Books;
import com.mf.service.BookServiceImpl;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.HashMap;
import java.util.List;

/**
 * @author mf
 * @create 2021-04-14-9:07
 */
public class MyTest {
    @Test
    public void test1(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookServiceImpl bookServiceImpl = context.getBean("BookServiceImpl", BookServiceImpl.class);
        List<Books> books = bookServiceImpl.selectAllBook();
        for (Books book : books) {
            System.out.println(book);
        }
        HashMap<Object, Object> objectObjectHashMap = new HashMap<>();
    }
}
