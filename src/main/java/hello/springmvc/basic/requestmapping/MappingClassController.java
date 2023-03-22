package hello.springmvc.basic.requestmapping;

import org.springframework.web.bind.annotation.*;

@RestController // 컨트롤러 + 리스폰서 // controller : viewName으로 만 인식
@RequestMapping("/mapping/users") // url과 컨트롤러 연계
public class MappingClassController {

    @GetMapping //("/mapping/users")
    public String user() {return "get users";} // -> http 바디로 들어감

    @PostMapping  // @컨트롤러로 전체 쓰다가 애만 바꾸고 싶으면 @컨트롤러바디 사용
    public String addUser() {
        return "post user";
    }

    @GetMapping("/{userId}") // 아이디가 userid인 정보를 달라
    public String findUser(@PathVariable String userId) {
        return "get userId=" + userId;
    }

    @PatchMapping("/{userId}") //패치: 수정
    public String updateUser(@PathVariable String userId) {
        return "update userId=" + userId;
    }

    @DeleteMapping("/{userId}")
    public String deleteUser(@PathVariable String userId) {
        return "delete userId=" + userId;
    }

}
