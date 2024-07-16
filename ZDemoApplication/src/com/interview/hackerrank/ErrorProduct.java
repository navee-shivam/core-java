package com.interview.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ErrorProduct {

	public static void main(String[] args) {
		List<Float> pp = new ArrayList<>();
		pp.add((float) 15);
		pp.add((float) 300.90);
		pp.add((float) 23.44);
		List<Float> sp = new ArrayList<>();
		sp.add((float) 300.90);
		sp.add((float) 23.44);
		sp.add((float) 10);
		System.out.println(
				priceCheck(Arrays.asList("choc", "chee", "toma"), pp, Arrays.asList("chee", "toma", "choc"), sp));

	}

	public static int priceCheck(List<String> products, List<Float> productPrices, List<String> productSold,
			List<Float> soldPrice) {
		int count = 0;
		if (products.size() != productPrices.size() || productSold.size() != soldPrice.size())
			return -1;

		Map<String, Float> productMap = new HashMap<>();
		Map<String, Float> soldMap = new HashMap<>();
		for (int index = 0; index < products.size(); index++) {
			productMap.put(products.get(index), productPrices.get(index));
		}
		for (int index = 0; index < productSold.size(); index++) {
			soldMap.put(productSold.get(index), soldPrice.get(index));
		}
		for (Map.Entry<String, Float> entryMap : soldMap.entrySet()) {
			String key = entryMap.getKey();
			if (Float.compare(entryMap.getValue(), productMap.get(key)) != 0)
				count += 1;

		}

		System.out.println(productMap);
		System.out.println(soldMap);

		return count;
	}

}
