package com.thinkxfactor.zomatoplus.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thinkxfactor.zomatoplus.models.Items;
import com.thinkxfactor.zomatoplus.repo.ItemsRepository;
@RestController
@RequestMapping("/items")
	public class ItemsController {
	
		@Autowired
		private ItemsRepository itemsRepository;
		
		@PostMapping("/add")
		public Items additems(@RequestBody Items items)
		{
			Items persistedItems=itemsRepository.save(items);
			return persistedItems;
		}

		
	}
