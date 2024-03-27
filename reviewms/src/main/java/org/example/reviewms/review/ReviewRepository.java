package org.example.reviewms.review;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReviewRepository<R> extends JpaRepository<Review, Long> {
    List<Review> findByCompanyId(Long companyId);
}
