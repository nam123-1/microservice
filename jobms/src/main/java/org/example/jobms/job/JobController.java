package org.example.jobms.job;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.jobms.job.dto.JobDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jobs")
public class JobController {
    private static final Logger Log = LogManager.getLogger(JobController.class);
    private JobService jobService;

    public JobController(JobService jobService) {
        this.jobService = jobService;
    }

    @GetMapping
    public ResponseEntity<List<JobDTO>> findAll() {
        Log.debug("Nhận danh sách...");
        // Cách viết return
        return ResponseEntity.ok(jobService.findALL());
    }

    @PostMapping
    public ResponseEntity<String> creatẹJob(@RequestBody Job job){
        Log.info(job);
        jobService.createJob(job);
        // Cách viết return 2
        return new ResponseEntity<>("Job added successfully!", HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<JobDTO> getJobById(@PathVariable Long id) {
        JobDTO jobDTO = jobService.getJobById(id);
        if (jobDTO != null)
            return new ResponseEntity<>(jobDTO, HttpStatus.OK);
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteJob(@PathVariable Long id){
        boolean deleted = jobService.deletedJobById(id);
        if (deleted)
            return new ResponseEntity<>("Job delete successfully!",HttpStatus.OK);
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PutMapping("/{id}")
    //@RequestMapping(value = "/jobs/{id}", method = RequestMethod.PUT)
    public ResponseEntity<String> updateJob(@PathVariable Long id, @RequestBody Job updateJob){
        boolean updated = jobService.updateJob(id,updateJob);
        if (updated)
            return new ResponseEntity<>("Job update successfully!",HttpStatus.OK);
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}

// GET /jobs: Nhận tất cả jobs
// GET /jobs/{id} : Nhận một job cụ thể theo ID
// POST /jobs: Tạo một job mới (nội dung yêu cầu phải chứa chi tiết công việc)
// DELETE /jobs/{id}: Xóa một job cụ thể theo ID
// PUT /jobs/{id}: Cập nhật một job theo ID (nội dung yêu cầu phải chứa chi tiết công việc được cập nhật)

// Example API URLs:
// GET {base_url}/jobs
// GET {base_url}/jobs/1
// POST {base_url}/jobs
// DELETE {base_url}/jobs/1
// PUT {base_url}/jobs/1


