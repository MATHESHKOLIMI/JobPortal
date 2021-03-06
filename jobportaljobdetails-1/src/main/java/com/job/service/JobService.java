package com.job.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.job.model.Jobdetails;
import com.job.repository.JobRepository;


@Service
@Transactional
public class JobService implements JobServiceInterface{
	@Autowired
	JobRepository jobRepository;
	public List<Jobdetails> getAllJobdetails(){
		return (List<Jobdetails>) jobRepository.findAll();
	}
 public void saveJob(Jobdetails jobdetails)
 {
	 jobRepository.save(jobdetails);
 }
 public boolean updatejobdetails(Jobdetails jobdetails) {
	 return jobRepository.save(jobdetails)!=null;
	}
 
	public void deletejob(Integer Jobid) {
		
		jobRepository.deleteById(Jobid);
	}
}
