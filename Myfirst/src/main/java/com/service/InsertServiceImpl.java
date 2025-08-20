package com.service;

import com.dao.InsertDaoImpl;
import com.validation.InsetValidation;

public  class InsertServiceImpl implements InsertService {
 private String result;
	@Override
	public String insertData(String ename, String eaddress, int esalary) {
		InsetValidation insValidation = new InsetValidation();
		result = insValidation.validate(ename, eaddress,esalary);
		if(result.equals("valid")) {
			InsertDaoImpl insDao = new InsertDaoImpl();
		result=insDao.insert(ename, eaddress, esalary);
		return result;
		}else {
			return result;
		}
		
	}

}
