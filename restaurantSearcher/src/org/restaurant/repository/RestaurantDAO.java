package org.restaurant.repository;

import org.restaurant.domain.Restaurant;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class RestaurantDAO {
	@NonNull
	private Restaurant[] restaurants;
	
	
}
