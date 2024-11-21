package com.Attendance.AttendanceController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Attendance.AttendanceEntity.AttendanceEntity;
import com.Attendance.AttendanceService.AttendanceService;

@RestController
@RequestMapping(value="/attend")
public class AttendanceController {

	@Autowired
	AttendanceService as;
	
	@PostMapping(value="/post")
	public AttendanceEntity Post(@RequestBody AttendanceEntity a)
	{
		return as.Post(a);
	}
	
	@GetMapping(value="/get")
	public List<AttendanceEntity> Get()
	{
		return as.Get();
	}
	@PutMapping(value ="/put")
	public String Put(@RequestBody AttendanceEntity a )
	{
		return as.Put(a);
	}
}
