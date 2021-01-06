package org.restaurant.service;

import org.restaurant.domain.Restaurant;
import org.restaurant.repository.RestaurantDAO;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class RestaurantService {
	@NonNull
	private RestaurantDAO dao;
	
	// 가장 가까운 맛집 3개를 반환                 // 경도 , 위도
	public Restaurant[] findNearRestaurants(double lat, double lng) {
		Restaurant[] result = null;
		
		
				
				
		return result;
	}
	
}
