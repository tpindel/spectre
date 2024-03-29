package com.spectre.core.acceptance;

import org.jbehave.core.annotations.Configure;
import org.jbehave.core.annotations.UsingEmbedder;
import org.jbehave.core.annotations.UsingPaths;
import org.jbehave.core.annotations.spring.UsingSpring;
import org.jbehave.core.failures.FailingUponPendingStep;
import org.jbehave.core.junit.spring.SpringAnnotatedPathRunner;
import org.jbehave.core.reporters.StoryReporterBuilder;
import org.junit.runner.RunWith;

import com.spectre.core.acceptance.SpringEnabledScenarioRunnerIT.MyReportBuilder;

@RunWith(SpringAnnotatedPathRunner.class)
@UsingPaths(searchIn = "src/test/resources")
@Configure(storyReporterBuilder = MyReportBuilder.class, pendingStepStrategy = FailingUponPendingStep.class)
@UsingEmbedder
@UsingSpring(resources = { "classpath:acceptanceTestsContext.xml" })
public class SpringEnabledScenarioRunnerIT {

    public static class MyReportBuilder extends StoryReporterBuilder {
        public MyReportBuilder() {
            withFailureTrace(true).withFormats(org.jbehave.core.reporters.Format.CONSOLE);
        }
    }
}
