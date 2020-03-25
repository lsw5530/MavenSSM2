package com.sikiedu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sikiedu.bean.ItemInfo;
import com.sikiedu.bean.User;
import com.sikiedu.service.ItemService;

@Controller
public class UserController {

	@Autowired
	private ItemService itemService;
	
	@RequestMapping("/login")
	public String login(User u, Model model) {
		
		System.out.println("user = " + u);
		
		model.addAttribute("User", u);
		
		return "list";
	}
	
	@RequestMapping("/list")
	public String list(Model model) {
		
		List<ItemInfo> itemList = itemService.getAllList();
		
		for (ItemInfo itemInfo : itemList) {
			System.out.println("itemInfo = " + itemInfo);
		}
		
		model.addAttribute("itemList", itemList);
		
		return "item_list";
	}
	
}
