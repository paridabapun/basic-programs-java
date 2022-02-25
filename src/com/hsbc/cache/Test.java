package com.hsbc.cache;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {
public static void main(String[] args) {
	
	Company [] companyArray=new Company[16];
	populateCompanyArray(companyArray);
	
	
//	form unique merchant List
	Map<String,FinalCompany> uniqueMerchantIdMap=new HashMap<String, FinalCompany>();
	FinalCompany finalCompany=null;
	for(int i=0;i<companyArray.length;i++){
		Company company=companyArray[i];
		if(null==uniqueMerchantIdMap.get(company.getId())){
			finalCompany=new FinalCompany();
			finalCompany.setId(company.getId());
			List billtypeList=new ArrayList();
			billtypeList.add(company.getBillType());
			finalCompany.setBillType(billtypeList);
			uniqueMerchantIdMap.put(company.getId(),finalCompany);
		}
		else{
			finalCompany=(FinalCompany)uniqueMerchantIdMap.get(company.getId());
			List billtypeList=finalCompany.getBillType();
			billtypeList.add(company.getBillType());
			uniqueMerchantIdMap.put(company.getId(), finalCompany);
			}
	}
	System.out.println("Done =============");
	
}
private static void populateCompanyArray(Company []companyArray){
	
	Company company=new  Company();
	company.setId("0");
	company.setBillType("b1");
	companyArray[0]=company;
}
}
