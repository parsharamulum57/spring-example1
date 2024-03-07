package com.ndevs.fridge.service.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.ndevs.fridge.dto.FridgeItem;
import com.ndevs.fridge.exception.NoItemFoundException;
import com.ndevs.fridge.service.FridgeService;

/**
 * 
 * @author Nishanth Dharmaraju
 *
 */
@Service
public class FridgeServiceImpl implements FridgeService {

	private static final int FRUIT = 1;
	private static final int DRINKS = 2;
	private static final int MEAT = 4;

	@Override
	public List<FridgeItem> getAllItems() {

		try {
			FridgeItem fruit = null;//new FridgeItem();
			fruit.setItemType(FRUIT);
			fruit.setName("Fruit");
			fruit.setQuantity(10);
			FridgeItem drinks = new FridgeItem();
			drinks.setItemType(DRINKS);
			drinks.setName("Drinks");
			drinks.setQuantity(20);
			FridgeItem meat = new FridgeItem();
			meat.setItemType(MEAT);
			meat.setName("Meat");
			meat.setQuantity(3);
			return Arrays.asList(fruit, drinks, meat);
		}
		catch (Exception e) {
			System.out.println(Arrays.toString(e.getStackTrace()));
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		return new ArrayList<>();
	}

	@Override
	public FridgeItem getItemByType(Integer itemType) throws NoItemFoundException {

		FridgeItem item = null;

		if (itemType.equals(FRUIT)) {
			item = new FridgeItem();
			item.setItemType(FRUIT);
			item.setName("Fruit");
			item.setQuantity(10);
		} else {
			throw new NoItemFoundException("No such item found");
		}

		return item;
	}

}
