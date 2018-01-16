package com.wook.myapp.mockito;

import java.util.ArrayList;
import java.util.List;

public class SomeBusinessImpl {
    
	private DataService dataService;
    
	public SomeBusinessImpl(DataService dataService) {
        super();
        this.dataService = dataService;
    }



	public int findTheGreatestFromAllData() {

		int [] list = null;
		
		list = dataService.retrieveAllData();
		
		int checkGreatest=0;
		
		for (int lists : list) {
			if (checkGreatest < lists)
				checkGreatest=lists;
		}
		
		return checkGreatest;
	}
}