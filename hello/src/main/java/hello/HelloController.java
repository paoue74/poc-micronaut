package hello;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("hello")
public class HelloController {

  @Get("/{text}")
  String sayHello(String text) {
    return  "Hello " + text + "!!!";
  }

}
