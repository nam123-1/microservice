package org.example.jobms.job;

import org.example.jobms.job.dto.JobDTO;

import java.util.List;

public interface JobService {
    List<JobDTO> findALL();
    void createJob(Job job);

    JobDTO getJobById(Long id);

    boolean deletedJobById(Long id);

    boolean updateJob(Long id, Job updateJob);


}
