package com.p2;

public class Mobile {


	String[] outdatedModels = {"note4","note5","note6","note7"};
	
	void searchoutdateModel(String compName, String...modelName) {
		for (int i =0;i<outdatedModels.length;i++) {
			for(int j =0;j<modelName.length;j++) {
				if(outdatedModels[i].equals(modelName[j])){
					System.out.println(modelName[j]+"_OUTDATED");
					break;
				}
//				else {
//					System.out.println(modelName[j]+"Not outdated");
//				}
			}
		}
	}

	
	
}
