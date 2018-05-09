package com.notework.nw.entity;

public class PresetTag {

	private int presetId;
	private String tagId;
	
	public int getPresetId() {
		return presetId;
	}
	public void setPresetId(int presetId) {
		this.presetId = presetId;
	}
	public String getTagId() {
		return tagId;
	}
	public void setTagId(String tagId) {
		this.tagId = tagId;
	}
	public PresetTag() {
		
	}
	public PresetTag(int presetId, String tagId) {
		this.presetId = presetId;
		this.tagId = tagId;
	}	
}
