package example;

import example.model.user.UserSummaries;
import example.service.UserService;
import org.apache.ibatis.session.SqlSessionFactory;
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
        UserSummaries userSummaries = userService.list() ;
        System.out.println(userSummaries.toString());
        return "3" ;
    }

}



