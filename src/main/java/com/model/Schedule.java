package com.model;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/*import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;*/

public class Schedule {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private int scheduleId;
	
	//@JsonDeserialize(using = LocalDateDeserializer.class)
	//@JsonSerialize(using = LocalDateSerializer.class)
	//@JsonFormat(shape=JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd") //2021-01-29
	private LocalDate matchDate;
	
	//@JsonFormat(pattern = "KK:mm a")
	private LocalTime startTime;
	
	//@JsonFormat(pattern = "KK:mm a")
	private LocalTime endTime;
    public Schedule()
    {
    	
    }
	public Schedule(int scheduleId, LocalDate matchDate, LocalTime startTime, LocalTime endTime) {
		super();
		this.scheduleId = scheduleId;
		this.matchDate = matchDate;
		this.startTime = startTime;
		this.endTime = endTime;
	}
	public int getScheduleId() {
		return scheduleId;
	}
	public void setScheduleId(int scheduleId) {
		this.scheduleId = scheduleId;
	}
	public LocalDate getMatchDate() {
		return matchDate;
	}
	public void setMatchDate(LocalDate matchDate) {
		this.matchDate = matchDate;
	}
	public LocalTime getStartTime() {
		return startTime;
	}
	public void setStartTime(LocalTime startTime) {
		this.startTime = startTime;
	}
	public LocalTime getEndTime() {
		return endTime;
	}
	public void setEndTime(LocalTime endTime) {
		this.endTime = endTime;
	}
    

}
