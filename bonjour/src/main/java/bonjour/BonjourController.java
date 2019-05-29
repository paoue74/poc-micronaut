package bonjour;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("/bonjour")
public class BonjourController {

  @Get("/{text}")
  String direBonjour(String text) {
    return "Bonjour " + text + "!!!";
  }
}
