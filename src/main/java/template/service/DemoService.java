package template.service;

import jakarta.enterprise.context.ApplicationScoped;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import template.data.DemoRecord;

@ApplicationScoped
public class DemoService {

    private static final Logger log = LoggerFactory.getLogger(DemoService.class);

    public DemoService() {}

    public DemoRecord getDemoRecord() {
        log.info("get demo record");
        return new DemoRecord("Hello World!");
    }
}
