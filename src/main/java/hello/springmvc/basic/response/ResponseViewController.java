package hello.springmvc.basic.response;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ResponseViewController {

    @RequestMapping("/response-view-v1")
    public ModelAndView responseViewV1() {
        ModelAndView mav = new ModelAndView("response/hello")
                .addObject("data", "hello!");  // 키,값 - html에서 ${data}로 불러옴
        return mav;
    }

    @RequestMapping("/response-view-v2")
    public String responseViewV2(Model model) {
        model.addAttribute("data", "hello!");
        return "response/hello";  //뷰네임만 받환  ,v1이랑 결국 같음
    }

    @RequestMapping("/response/hello") // 경로랑 리턴이랑 일치
    public void responseViewV3(Model model) {
        model.addAttribute("data", "hello!");
    }

}
