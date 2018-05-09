package com.notework.nw.entity.view;

import java.util.List;

import com.notework.nw.entity.Preset;
import com.notework.nw.entity.Tag;

public class PresetView extends Preset {

	private List<Tag> tagList;

	public PresetView(int id, String name, String memberId, String description) {
		super(id, name, memberId, description);
	}
	public List<Tag> getTagList() {
		return tagList;
	}
	public void setTagList(List<Tag> tagList) {
		this.tagList = tagList;
	}
}
