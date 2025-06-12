package school.hei.wc.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.net.MalformedURLException;
import java.net.URL;
import org.junit.jupiter.api.Test;

class WCTest {

  WC wc = new WC();

  @Test
  void fmaurica_website_mentions_fonenantsoa() throws MalformedURLException {
    var wordMap = wc.apply(new URL("https://lim.univ-reunion.fr/staff/fmaurica/"));
    assertEquals(wordMap.get("fonenantsoa"), 1);
  }
}
