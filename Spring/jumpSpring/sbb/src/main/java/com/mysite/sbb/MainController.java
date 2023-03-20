package com.mysite.sbb;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller // 써야함
public class MainController {
    @GetMapping("/sbb")
    @ResponseBody // 이걸 그대로 보여주겠다 (안쓰면 사이트에 안뜸)
    public String index(){
        return "안녕하세요 sbb에 오신것을 환영합니다.";
    }

}
