package example.service.user

import example.TestConfiguration
import example.model.user.BirthDate
import example.model.user.Name
import example.model.user.Password
import example.model.user.PhoneNumber
import example.model.user.User
import example.model.user.UserId
import example.service.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.SpringApplicationContextLoader
import org.springframework.jdbc.core.JdbcTemplate
import org.springframework.test.context.ActiveProfiles
import org.springframework.test.context.ContextConfiguration
import spock.lang.Specification

import java.time.LocalDate

/**
 * Created by haljik on 15/06/04.
 */
@ContextConfiguration(loader = SpringApplicationContextLoader.class, classes = TestConfiguration.class)
@ActiveProfiles("test")
class UserServiceSpec extends Specification {

    @Autowired
    UserService service;

    @Autowired
    JdbcTemplate jdbcTemplate;

    def setup() {
        jdbcTemplate.execute("DELETE FROM USERS.USERS")
        jdbcTemplate.execute("""
                INSERT INTO USERS.USERS(USER_ID, NAME, PASSWORD) VALUES
                ('seiji.kawakami@sora-works.com', '河上 晴司','password1234'),
                ('someone@ddd-alliance.org', 'DDD ALLIANCE','password5678')
                """)
    }


    def "用户ID取得能"() {
        given:
        def id = new UserId('seiji.kawakami@sora-works.com')
        when:
        def user = service.findById(id)
        then:
        user.isPresent()
        def actual = user.get()
        actual.id.value == id.value
        actual.name.value == '河上 晴司'
        actual.hasSamePassword(new Password("password1234"))
    }

    def "取得全部用户"() {
        when:
        def users = service.list();
        System.out.println("size---->:"+users.list().size()) ;
        then:
        users.list().size() == 2;
    }

    def "用户可以注册"() {
        given:
        def user = new User()
        def id = new UserId("hogefuga@example.com")
        def name = new Name()
        def birthDate = new BirthDate()
        def phoneNumber = new PhoneNumber()
        user.id = id
        name.value = "Hoge Fuga"
        user.name = name
        birthDate.year = 1989
        birthDate.month = 11
        birthDate.day = 21
        user.birthDate = birthDate
        phoneNumber.value = "0120-888-888"
        user.phoneNumber = phoneNumber
        when:
        service.register(user)
        then:
        def actual = service.findById(id).get()
        actual.id.value == "hogefuga@example.com"
        actual.name.value == "Hoge Fuga"
        actual.birthDate.value.isEqual(LocalDate.of(1989, 11, 21)) == true
        actual.phoneNumber.value == "0120-888-888"

    }

    def "用户可以删除" () {
        given:
        def user = new User()
        user.id = new UserId("seiji.kawakami@sora-works.com")
        when:
        service.delete(user)
        def deleteUser = service.findById(user.id)
        then:
        !deleteUser.isPresent()
    }
}
