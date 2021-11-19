package com.hcc.advWeb;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class DetailInfoServiceImpl implements DetailInfoService {

	@Autowired
	private DetailInfoDAO detailInfoDAO;
	
	public DetailInfoServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	@Transactional
	public void addDetalInfo(DetailInfo detailInfo) {
		detailInfoDAO.addDetalInfo(detailInfo);		
	}

	@Override
	@Transactional
	public ArrayList<DetailInfo> getDetailInfosList() {
		return detailInfoDAO.getDetailInfoList();
	}

	@Override
	@Transactional
	public DetailInfo getDetailInfo(int Id) {
		return detailInfoDAO.getDetailInfo(Id);
	}

	@Override
	@Transactional
	public DetailInfo updateDetailInfo(DetailInfo student) {
		return detailInfoDAO.updateDetailInfo(student);
	}

}
