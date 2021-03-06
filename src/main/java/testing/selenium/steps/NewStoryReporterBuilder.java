package testing.selenium.steps;

import org.jbehave.core.reporters.StoryReporter;
import org.jbehave.core.reporters.StoryReporterBuilder;

public class NewStoryReporterBuilder extends StoryReporterBuilder {

	@Override
	public StoryReporter build(String storyPath) {
	    StoryReporter delegate = super.build(storyPath);
	    return new NewStoryReporter(delegate);
	}
}