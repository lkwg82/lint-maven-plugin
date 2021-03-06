package com.lewisd.maven.lint.model;

import javax.annotation.PostConstruct;

import com.lewisd.maven.lint.ModelBuilder;
import com.lewisd.maven.lint.ModelFactory;

public abstract class AbstractModelBuilder implements ModelBuilder {
	
	protected static final String MAVEN_PROJECT = "mavenProject";
	
	private ModelFactory modelFactory;

	public AbstractModelBuilder(final ModelFactory modelFactory) {
		this.modelFactory = modelFactory;
	}

	@PostConstruct
	public void init() {
		modelFactory.addModelBuilder(this);
	}


}
