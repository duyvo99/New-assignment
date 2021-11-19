package com.hcc.advWeb;

import java.util.ArrayList;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class DetailInfoDAOImpl implements DetailInfoDAO {
	
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public DetailInfoDAOImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void addDetalInfo(DetailInfo detailInfo) {
		sessionFactory.getCurrentSession().saveOrUpdate(detailInfo);
		// TODO Auto-generated method stub

	}

	@Override
	public ArrayList<DetailInfo> getDetailInfoList() {
		ArrayList<DetailInfo> detailInfosList = 
				(ArrayList<DetailInfo>)sessionFactory.
				getCurrentSession().createQuery("FROM DetailInfo").list();
		return detailInfosList;
	}

	@Override
	public DetailInfo getDetailInfo(int Id) {
		DetailInfo student = (DetailInfo)sessionFactory.getCurrentSession().get(DetailInfo.class, Id);
		return student;
	}

	@Override
	public DetailInfo updateDetailInfo(DetailInfo detailInfo) {
		
		return null;
	}

}
