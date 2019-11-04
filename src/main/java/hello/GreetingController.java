package hello;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/nuwant/mocktest")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Greeting("UMB-8b9b4484-9674-4ebe-9006-9e3a9f163394","Processing Transaction",00,"Processing Transaction");
    }
}
