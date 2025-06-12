package school.hei.wc.model;

import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import org.jsoup.Jsoup;

public class WC implements Function<URL, Map<String, Integer>> {
  @Override
  public Map<String, Integer> apply(URL url) {
    Map<String, Integer> wordCounts = new HashMap<>();

    try {
      var doc = Jsoup.connect(url.toString()).get();
      var text = doc.body().text().toLowerCase();
      var words = text.split("\\W+");
      for (var word : words) {
        if (!word.isBlank()) {
          wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
        }
      }
    } catch (IOException e) {
      throw new RuntimeException(e);
    }

    return wordCounts;
  }
}
