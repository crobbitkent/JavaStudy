package org.restaurant.ui;

import java.util.Scanner;

import org.restaurant.domain.Restaurant;
import org.restaurant.service.*;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class RestaurantUI {
	@NonNull
	RestaurantService service;
	@NonNull
	Scanner scanner;
	
	
	public void find() {
		double lat = Double.parseDouble(communication("현재 위도를 입력하세요"));
		double lng = Double.parseDouble(communication("현재 경도를 입력하세요"));
		
		Restaurant[] result = service.findNearRestaurants(lat, lng);
		
		for(Restaurant res : result) {
			
		}
	}
	
	
	private String communication(String out) {
		System.out.println("현재 위도를 입력하세요");
		return scanner.nextLine();
	}
}
