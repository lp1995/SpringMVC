package base;

import com.mello.spring.dao.rabc.UserDao;
import com.mello.spring.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"" +
        "classpath:config/spring-hibernate.xml",
        "classpath:config/spring-mvc.xml",
        "classpath:config/spring-dao.xml",
        "classpath:config/spring-service.xml",

})
public class BaseTest {

    @Autowired
    private UserDao userDao;
    @Test
    public void test(){
        List<User> users = userDao.getAllList();
        for(User user:users){
            System.out.println(user.getName());
        }
    }
}