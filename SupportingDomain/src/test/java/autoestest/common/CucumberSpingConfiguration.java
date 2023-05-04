package autoestest.common;

import autoestest.SupportingDomainApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { SupportingDomainApplication.class })
public class CucumberSpingConfiguration {}
