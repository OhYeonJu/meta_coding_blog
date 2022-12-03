package com.cos.blog.prac;

import com.cos.blog.model.Users;
import com.cos.blog.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DummyControllerTest {

    @Autowired // DummyControllerTest가 메모리에 올라갈 때 Autowierd도 같이 뜬다. // 의존성 주입
    private UserRepository userRepository;

    // http://localhost:8090/blog/dummy/join(요청)
    // http의 body에 username, password, email 데이터를 가지고 (요청)
    @PostMapping("/blog/dummy/join")
    public String join(Users user) { // key=value (약속된 규칙)
        System.out.println("id: " + user.getId());
        System.out.println("username" + user.getUsername());
        System.out.println("password" + user.getPassword());
        System.out.println("email" + user.getEmail());
        System.out.println("role: " + user.getRole());
        System.out.println("createDate: " + user.getCreateDate());

        userRepository.save(user);
        return "회원가입이 완료되었습니다.";
    }
}
