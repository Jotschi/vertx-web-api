package de.jotschi.vertx.endpoint.query.impl;

import de.jotschi.vertx.endpoint.query.QueryParameter;

public class QueryParameterImpl implements QueryParameter {

	protected String description;

	private String key;

	public QueryParameterImpl(String key) {
		this.key = key;
	}

	@Override
	public void description(String description) {
		this.description = description;
	}

	@Override
	public String description() {
		return description;
	}

	@Override
	public String key() {
		return key;
	}

	@Override
	public void example(String example) {
		// TODO Auto-generated method stub
	}

}
