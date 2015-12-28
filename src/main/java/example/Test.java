package example;

import com.google.gson.Gson;
import example.model.user.User;
import example.model.user.UserId;
import example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by feng on 15/12/25.
 */
public class Test {
    public  static void main(String[] args){

        Test test = new Test() ;
        test.a() ;
        System.out.println("Hello World");
    }
    @Autowired
    UserService userService;

    public String a(){
        User user = new User() ;
        user.setId(new UserId("22@test.com"));
        userService.register(user);
        //UserSummaries userSummaries = userService.list() ;
        //System.out.println(userSummaries.toString());

        return "3" ;
    }

}



