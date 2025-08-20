package com.service;

import java.util.List;

import com.dao.ReadDao;
import com.model.ReadPojo;

public class ReadService {
	private boolean result;
 @SuppressWarnings("finally")
public boolean readService(int eid) {
	 try {
	List<ReadPojo> list =new ReadDao().readDao(eid);
	int size = list.size();
	if(size >0) {
		for(ReadPojo r :list) {
			System.out.println(r.toString());
		}
		result =true;
	}
	} catch (Exception e) {
	e.printStackTrace();
	}finally {
		return result;
	}
 }
}
