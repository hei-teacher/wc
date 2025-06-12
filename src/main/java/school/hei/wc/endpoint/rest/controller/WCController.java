package school.hei.wc.endpoint.rest.controller;

import java.net.MalformedURLException;
import java.net.URL;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import school.hei.wc.model.WC;

@RestController
public class WCController {

  private final WC wc = new WC();

  @GetMapping("/wc")
  public String wc(@RequestParam String url) throws MalformedURLException {
    var wordMap = wc.apply(new URL(url));
    var sortedWordCounts =
        wordMap.entrySet().stream()
            .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
            .toList();
    return sortedWordCounts.toString();
  }
}
