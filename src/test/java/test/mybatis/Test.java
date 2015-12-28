package test.mybatis;

import example.model.user.User;
import example.model.user.UserId;
import example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by feng on 15/12/25.
 */
public class Test {
    public  static void main2(String[] args){

        Test test = new Test() ;
        //test.a() ;
        List<String> list = new ArrayList<String>() ;
        String str = "" ;
        System.out.println("Hello World");
        int start = 90 ;
        int size = 99 ;
        for (int i=start;i<=size;i++){
            //满20一组
            if(i!=start&&i%20==0){
                //System.out.println(i) ;
                str = str.substring(0,str.length()-1) ;
                //System.out.println(str) ;

                list.add(str);
                str = i+"/" ;
            }else{
                str = str+i+"/" ;
            }
            //最后一个
            if(i==size){
                str = str.substring(0,str.length()-1) ;
                list.add(str);
            }
        }
        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
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