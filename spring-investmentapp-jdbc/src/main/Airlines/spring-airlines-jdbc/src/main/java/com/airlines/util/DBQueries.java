package com.airlines.util;

public class DBQueries {

	public static final String INSERTQUERY = "INSERT INTO AIRLINES (source,destination,cost,airline_Id) values(?,?,?,?)";
	public static final String UPDATEQUERY = "UPDATE  AIRLINES SET cost=? WHERE AIRLINE_Id=?";
	public static final String deleteQUERY = "DELETE FROM AIRLINES WHERE AIRLINE_Id=?";

	public static final String SELECTQUERY = "SELECT * FROM AIRLINES";
	public static final String SELECTBYSOURCE = "SELECT * FROM AIRLINES WHERE SOURCE=?";
	public static final String SELECTBYCOST = "SELECT * FROM AIRLINES WHERE COSt=?";
	public static final String SELECTBYDESTINATION = "SELECT * FROM AIRLINES WHERE DESTINATION=?";
	public static final String SELECTBYID = "SELECT * FROM AIRLINES WHERE AIRLINE_ID=?";
	public static final String SELECTBYSOURCEANDDESTINATION = "SELECT * FROM AIRLINES WHERE SOURCE=? AND DESTINATION=?";

}