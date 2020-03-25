package com.sikiedu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sikiedu.bean.ItemInfo;
import com.sikiedu.mapper.ItemMapper;

@Service
public class ItemServiceImpl implements ItemService {

	@Autowired
	private ItemMapper itemMapper;
	
	@Override
	public List<ItemInfo> getAllList() {
		return itemMapper.getAllList();
	}

}
