package org.restaurant.service;

import org.restaurant.domain.Restaurant;
import org.restaurant.repository.RestaurantDAO;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class RestaurantService {
	@NonNull
	private RestaurantDAO dao;
	
	// ���� ����� ���� 3���� ��ȯ                 // �浵 , ����
	public Restaurant[] findNearRestaurants(double lat, double lng) {
		Restaurant[] result = null;
		
		
				
				
		return result;
	}
	
}
