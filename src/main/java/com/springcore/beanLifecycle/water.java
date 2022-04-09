package com.springcore.beanLifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class water {
	private String quality;

	public water() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getQuality() {
		return quality;
	}

	public void setQuality(String quality) {
		this.quality = quality;
	}

	@Override
	public String toString() {
		return "water [quality=" + quality + "]";
	}
	
	@PostConstruct
	public void start()
	{
		System.out.println("Start");
	}
	
	@PreDestroy
	public void destroy()
	{
		System.out.println("destroy");
	}
}
