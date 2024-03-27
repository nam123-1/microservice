package org.example.jobms.job.mapper;

import org.example.jobms.job.Job;
import org.example.jobms.job.dto.JobDTO;
import org.example.jobms.job.external.Company;

public class JobMapper {
    public static JobDTO mapToJobWithCompayDto(Job job, Company company){
        JobDTO jobDTO = new JobDTO();
        jobDTO.setId(job.getId());
        jobDTO.setTitle(job.getTitle());
        jobDTO.setDescription(job.getDescription());
        jobDTO.setLocation(job.getLocation());
        jobDTO.setMaxSalary(job.getMaxSalary());
        jobDTO.setMinSalary(job.getMinSalary());
        jobDTO.setCompany(company);
        return jobDTO;
    }

}
