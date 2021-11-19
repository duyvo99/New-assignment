package com.hcc.advWeb;

import java.util.ArrayList;

public class DetailInfosList {
	
private static ArrayList<DetailInfo> detailInfosList;
	
	public static ArrayList<DetailInfo> getDetailInfosList() {
		
		return detailInfosList;
	}
	public static void setDetailInfosList(ArrayList<DetailInfo> detailInfosList) {
		detailInfosList = detailInfosList;
	}

	public static ArrayList<DetailInfo> addDetailInfo(DetailInfo detailInfo) {
		getDetailInfosList().add(detailInfo);
		return detailInfosList;
	}

}
