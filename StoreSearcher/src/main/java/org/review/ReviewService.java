package org.review;

import org.store.Store;

import java.util.ArrayList;
import java.util.List;

public class ReviewService {
    public void register(Review review) {
    }

    public List<Review> getAllReviews(Store store) {
        List<Review> result = new ArrayList<>();
        Review r1 = Review.builder().reviewCode("R1").contents("킹왕짱.").score(4).store(store).build();
        Review r2 = Review.builder().reviewCode("R2").contents("ㄱㅊ하네요.").score(5).store(store).build();
        Review r3 = Review.builder().reviewCode("R3").contents("넘 비싸네요.").score(2).store(store).build();

        result.add(r1);
        result.add(r2);

        return result;
    }
}
