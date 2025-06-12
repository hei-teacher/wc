package school.hei.wc.conf;

import org.springframework.test.context.DynamicPropertyRegistry;
import school.hei.wc.PojaGenerated;

@PojaGenerated
public class EmailConf {

  void configureProperties(DynamicPropertyRegistry registry) {
    registry.add("aws.ses.source", () -> "dummy-ses-source");
  }
}
