package org.example.jobms.job.dto;

import lombok.Getter;
import lombok.Setter;
import org.example.jobms.job.external.Company;
import org.example.jobms.job.external.Review;
@Getter
@Setter
public class JobDTO {
    private Long id;
    private String title;
    private String description;
    private String minSalary;
    private String maxSalary;
    private String location;
    private Company company;
    private Review review;
}
