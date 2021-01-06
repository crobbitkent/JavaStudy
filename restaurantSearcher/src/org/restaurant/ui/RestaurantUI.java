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
		double lat = Double.parseDouble(communication("���� ������ �Է��ϼ���"));
		double lng = Double.parseDouble(communication("���� �浵�� �Է��ϼ���"));
		
		Restaurant[] result = service.findNearRestaurants(lat, lng);
		
		for(Restaurant res : result) {
			
		}
	}
	
	
	private String communication(String out) {
		System.out.println("���� ������ �Է��ϼ���");
		return scanner.nextLine();
	}
}
