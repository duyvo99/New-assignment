package com.hcc.advWeb;

import java.util.ArrayList;


public interface DetailInfoDAO {
	
	public void addDetalInfo(DetailInfo detailInfo);
	
	public ArrayList<DetailInfo> getDetailInfoList();
	
	public DetailInfo getDetailInfo(int Id);
	
	public DetailInfo updateDetailInfo(DetailInfo detailInfo);
}
