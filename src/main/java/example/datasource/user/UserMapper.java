package example.datasource.user;

import example.model.user.User;
import example.model.user.UserId;
import example.model.user.UserSummary;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by haljik on 15/06/04.
 */
public interface UserMapper {

    User findBy(@Param("id") UserId id);

    List<UserSummary> list();

    void register(@Param("user") User user);

    void update(@Param("user") User user);

    void delete(@Param("user") User user);
}
