package jp.co.tlzs.department.four.demo;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin
@RestController
public class TestController {
    @GetMapping("/test")
    public TestBean test() {
        return new TestBean("aaaa");
    }

}