package org.example.uberreviewservice.service;

import org.example.uberreviewservice.models.Review;
import org.example.uberreviewservice.repository.ReviewRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

@Service
public class ReviewService implements CommandLineRunner {
    private final ReviewRepository reviewRepository;

    public ReviewService(ReviewRepository reviewRepository) {
        this.reviewRepository = reviewRepository;
    }
    @Override
     public void run(String ...args) throws Exception{
        Review r = Review.builder()
                .content("Content")
                .rating(5.0)
                .build();
        reviewRepository.save(r);
    }
}
