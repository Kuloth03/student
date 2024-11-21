package com.Attendance.AttendanceDao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Attendance.AttendanceRepository;
import com.Attendance.AttendanceEntity.AttendanceEntity;

@Repository
public class AttendanceDao {

	@Autowired 
	AttendanceRepository ar;

	public AttendanceEntity Post(AttendanceEntity a) {
	
		return ar.save(a);
	}

	public List<AttendanceEntity> Get() {
		
		return ar.findAll();
	}

	public String Put(AttendanceEntity a) {
		
		ar.save(a);
		
		return "update";
	}
}
