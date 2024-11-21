package com.Attendance.AttendanceService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Attendance.AttendanceDao.AttendanceDao;
import com.Attendance.AttendanceEntity.AttendanceEntity;

@Service
public class AttendanceService {

	@Autowired
	AttendanceDao ad;

	public AttendanceEntity Post(AttendanceEntity a) {
	
		int val=a.getSem1marktheory()+a.getSem1markprac();
		a.setSem1total(val);
		int val2 =a.getSem2marktheory()+a.getSem2markprac();
		a.setSem2total(val2);
		
		float total1 =(a.getSem1total()+a.getSem2total())/2;
		a.setTotal(total1);
		return ad.Post(a);
	}

	public List<AttendanceEntity> Get() {
		
		return ad.Get();
	}

	public String Put(AttendanceEntity a) {
		
		return ad.Put(a);
	}
}
