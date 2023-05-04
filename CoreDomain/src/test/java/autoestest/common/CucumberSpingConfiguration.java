package autoestest.common;

import autoestest.CoreDomainApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { CoreDomainApplication.class })
public class CucumberSpingConfiguration {}
