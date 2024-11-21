package com.Attendance;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Attendance.AttendanceEntity.AttendanceEntity;

public interface AttendanceRepository extends JpaRepository<AttendanceEntity,Integer>{

}
