package com.data.sorting.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortingServiceImpl implements SortingService{

	@Override
	public Map<String, Object> doSort(int [] arr) {
		// TODO Auto-generated method stub

		Map<String, Object> resultMap = new HashMap<String, Object>(); 
		int n = arr.length; 
		int swap = 0;
		resultMap.put("initialValue", arr);
		long startTime = System.currentTimeMillis();
        for (int i = 0; i < n-1; i++) 
            for (int j = 0; j < n-i-1; j++) 
                if (arr[j] > arr[j+1]) 
                { 
                    // swap arr[j+1] and arr[i] 
                    int temp = arr[j]; 
                    arr[j] = arr[j+1]; 
                    arr[j+1] = temp; 
                    swap++;
                } 
        long endtTime = System.currentTimeMillis();
        resultMap.put("sortedValue", endtTime - startTime);
        resultMap.put("sortedValue", arr);
        resultMap.put("swap", swap);
		return resultMap;
	}

}
