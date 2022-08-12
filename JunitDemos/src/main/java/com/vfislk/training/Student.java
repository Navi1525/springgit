package com.vfislk.training;

import com.vfislk.exception.InvalidNumException;
import com.vfislk.exception.NegValueException;

public class Student {

	
	public int calcTotal(int marks1,int marks2,int marks3)throws NegValueException, InvalidNumException {
		
		if(marks1<0 || marks2<0 || marks3 <0) {
			throw new NegValueException("Marks should be greater than zero");
		}
		if( marks1 > 100 || marks2 > 100 || marks3 > 100 ) {
			throw new InvalidNumException("Marks should not exceed 100");
		}
		return marks1+marks2+marks3;
	}
		
	public String getGrade(int[] marks) {
		int sum=0;
		if (marks ==null)
			return null;
			for (int mark:marks) {
		 sum+=mark;

		}int average=sum/marks.length ;
		if( average >= 90 ) {
			return "A";
		}if(( average >=80) && (average <90)){
			return "B";
		}if(( average >=70) && (average <80)){
			return "C";
		}if(( average >=60) && (average <70)){
		return  "D";
		}if(( average >=50) && (average <60)){
			return  "E";
		}if( average >=40) {
		return  "Fail";}

		return "Fail";
	}
}
