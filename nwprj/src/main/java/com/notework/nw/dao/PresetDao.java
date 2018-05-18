package com.notework.nw.dao;

import java.util.List;

import com.notework.nw.entity.Preset;
import com.notework.nw.entity.view.PresetView;

public interface PresetDao {

	List<PresetView> getList(String memberId);
	
	PresetView get(Integer id);
	
	int insert(Preset preset);

}
