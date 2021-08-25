package com.trip.report.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ATTRIBUTE_FIELDS")
public class AttributesFields {
	
	private int atbrId;
	private String name;
	private String caption;
	private String category;
	private int order;
	private String dataType;
	private int maxLength;
	private String defaultValue;
	private String picklistField;
	private String hidden;
	private String required;
	private String readOnly;
	
	public AttributesFields() {
	}

	public AttributesFields(String name, String caption, String category, int order, String dataType, int maxLength,
			String defaultValue, String picklistField, String hidden, String required, String readOnly) {
		super();
		this.name = name;
		this.caption = caption;
		this.category = category;
		this.order = order;
		this.dataType = dataType;
		this.maxLength = maxLength;
		this.defaultValue = defaultValue;
		this.picklistField = picklistField;
		this.hidden = hidden;
		this.required = required;
		this.readOnly = readOnly;
	}

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int getAtbrId() {
		return atbrId;
	}

	public void setAtbrId(int atbrId) {
		this.atbrId = atbrId;
	}
	
	
	@Column(name = "ATBR_NAME", nullable = false)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	@Column(name = "ATBR_CAPTION", nullable = true)
	public String getCaption() {
		return caption;
	}

	public void setCaption(String caption) {
		this.caption = caption;
	}

	
	@Column(name = "ATBR_CATEGORY", nullable = true)
	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	
	@Column(name = "ATBR_ORDER", nullable = true)
	public int getOrder() {
		return order;
	}

	public void setOrder(int order) {
		this.order = order;
	}

	
	@Column(name = "DATA_TYPE", nullable = true)
	public String getDataType() {
		return dataType;
	}

	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	
	@Column(name = "MAX_LENGTH", nullable = true)
	public int getMaxLength() {
		return maxLength;
	}

	public void setMaxLength(int maxLength) {
		this.maxLength = maxLength;
	}

	
	@Column(name = "DEFAULT_VALUE", nullable = true)
	public String getDefaultValue() {
		return defaultValue;
	}

	public void setDefaultValue(String defaultValue) {
		this.defaultValue = defaultValue;
	}

	
	@Column(name = "PICKLIST_FIELD", nullable = true)
	public String getPicklistField() {
		return picklistField;
	}

	public void setPicklistField(String picklistField) {
		this.picklistField = picklistField;
	}

	
	@Column(name = "IS_HIDDEN", nullable = true)
	public String getHidden() {
		return hidden;
	}

	public void setHidden(String hidden) {
		this.hidden = hidden;
	}

	
	@Column(name = "IS_REQUIRED", nullable = true)
	public String getRequired() {
		return required;
	}

	public void setRequired(String required) {
		this.required = required;
	}

	
	@Column(name = "READ_ONLY", nullable = true)
	public String getReadOnly() {
		return readOnly;
	}
	
	public void setReadOnly(String readOnly) {
		this.readOnly = readOnly;
	}
	

}
