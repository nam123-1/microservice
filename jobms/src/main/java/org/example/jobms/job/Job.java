package org.example.jobms.job;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
//annotation của lombok tự tạo getter và setter
@NoArgsConstructor
//constructor không có tham số
@AllArgsConstructor
//constructor có tham số
@ToString
//in ra các đối tượng
@Builder
//Khởi tạo đối tượng
@Entity
//@Table(name = "job_table")
public class Job {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private String minSalary;
    private String maxSalary;
    private String location;
    private Long companyId;

}
