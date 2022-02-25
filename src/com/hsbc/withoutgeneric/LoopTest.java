package com.hsbc.withoutgeneric;
import java.util.HashMap;
import java.util.Map;

public class LoopTest {

	public static void main(String[] args) {

		CompInfoType[] compinfo = new CompInfoType[115];

		for (int i = 0; i < 115; i++) {
			compinfo[i] = new CompInfoType();
			String billId = "BId- " + i + 1;
			String mID = "MId " + i + 1;
			compinfo[i].setBillercde(billId);
			compinfo[i].setEpscoMerchantId(mID + " ");
			compinfo[i].setId(i + 1);
//			inner for loop to display all elements
//			if(i==114){
//				for (int j = 0; j < 115; j++) {
//					System.out.println("Company ID : " + compinfo[j].getId());
//					System.out.println(compinfo[j]);
//				}
//			}

		} // end of for loop

		// for loop for display all elements
		for (int i = 0; i < 115; i++) {
			System.out.println("Company ID : " + compinfo[i].getId());
			System.out.println(compinfo[i]);
		}

		Map<String, CompInfoType> map = new HashMap<String, CompInfoType>();
		for (int i = 0; i < 115; i++) {

			map.put(compinfo[i].getEpscoMerchantId(), compinfo[1]);
		}
		System.out.println(map.get(12));

	}
}
