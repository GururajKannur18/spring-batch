package com.prateek.listeners;

import org.springframework.batch.core.ExitStatus;
import org.springframework.batch.core.StepExecution;
import org.springframework.batch.core.StepExecutionListener;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class OrdersStepListeners implements StepExecutionListener{
	
	@Override
	public void beforeStep(StepExecution stepExecution) {
		log.info("pipe step listener called");
	    stepExecution.getExecutionContext().putString("customerNumber", "363");
	}

	@Override
	public ExitStatus afterStep(StepExecution stepExecution) {
		return null;
	}
}
