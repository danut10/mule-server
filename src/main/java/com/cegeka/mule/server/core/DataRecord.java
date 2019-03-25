package com.cegeka.mule.server.core;

public abstract class DataRecord implements IDataRecord {

	protected Integer id;
	
	/*
	 * getters & setters
	 */
	
	public Integer getId() { return this.id; }
	public DataRecord setId(Integer id) { this.id = id; return this; }
	
}