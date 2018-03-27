package com.zuora.test.models;

import com.zuora.test.exam.util.JsonUtils;

public class Deal {
	private Long id;
	private String name;
	private String description;
	private Object expected_value;
	private Object pipeline_id;
	private String milestone;
	private Integer probability;
	private Object close_date;
	private Long created_time;
	private String owner_id;
	private Object[] contacts;
	private Object[] contact_ids;
	private Object[] custom_data;
	
	public Deal(String name) {
		this.name = name;		
	}	

	public Deal id(Long id) {
		this.id = id;
		return this;
	}
	
	public Long getId() {
		return this.id;
	}
	
	public Deal name(String name) {
		this.name = name;
		return this;
	}
	
	public String getName() {
		return this.name;
	}
	
	public Deal description(String description) {
		this.description = description;
		return this;
	}
	
	public String getDescription() {
		return this.description;
	}
	
	public Deal expected_value(Object expected_value) {
		this.expected_value = expected_value;
		return this;
	}
	
	public Object getExpected_value() {
		return this.expected_value;
	}
	
	public Deal pipeline_id(Object pipeline_id) {
		this.pipeline_id = pipeline_id;
		return this;
	}
	
	public Object getPipeline_id() {
		return this.pipeline_id;
	}
	
	public Deal milestone(String milestone) {
		this.milestone = milestone;
		return this;
	}
	
	public String getMilestone() {
		return this.milestone;
	}
	
	public Deal probability(Integer probability) {
		this.probability = probability;
		return this;
	}
	
	public Integer getProbability() {
		return this.probability;
	}
	
	public Deal close_date(Object close_date) {
		this.close_date = close_date;
		return this;
	}
	
	public Object getClose_date() {
		return this.close_date;
	}
	
	public Deal created_time(Long created_time) {
		this.created_time = created_time;
		return this;
	}
	
	public Long getCreated_time() {
		return this.created_time;
	}
	
	public Deal owner_id(String owner_id) {
		this.owner_id = owner_id;
		return this;
	}
	
	public String getOwner_id() {
		return this.owner_id;
	}
	
	public Deal contacts(Object... contacts) {
		this.contacts = contacts;
		return this;
	}
	
	public Object[] getContacts() {
		return this.contacts;
	}
	
	public Deal contact_ids(Object... contact_ids) {
		this.contact_ids = contact_ids;
		return this;
	}
	
	public Object[] getContact_ids() {
		return this.contact_ids;
	}
	
	public Deal custom_data(Object... custom_data) {
		this.custom_data = custom_data;
		return this;
	}
	
	public Object[] getCustom_data() {
		return this.custom_data;
	}
	
	public String toString() {
		return JsonUtils.toString(this);
	}	

}
