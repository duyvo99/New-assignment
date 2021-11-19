package com.hcc.advWeb;

import java.util.ArrayList;

public interface DetailInfoService {
	
	public void addDetalInfo(DetailInfo detailInfo);
	
	public ArrayList<DetailInfo> getDetailInfosList();
	
	public DetailInfo getDetailInfo(int Id);
	
	public DetailInfo updateDetailInfo(DetailInfo detailInfo);
}

