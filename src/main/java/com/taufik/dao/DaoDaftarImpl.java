package com.taufik.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.taufik.model.Mst_Anggota;

@Repository
public class DaoDaftarImpl implements DaoAnggotaDaftar{

	@Autowired
	SessionFactory sf;
	
	Session session;
	
	@Override
	public void saveData(Mst_Anggota model) {
		// TODO Auto-generated method stub
		session=sf.openSession();
		session.beginTransaction();
		session.save(model);
		session.getTransaction().commit();
		
	}

	@Override
	public void updateData(Mst_Anggota model) {
		// TODO Auto-generated method stub
		session=sf.openSession();
		session.beginTransaction();
		session.update(model);
		session.getTransaction().commit();

	}

	@Override
	public List<Mst_Anggota> getAllData() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Mst_Anggota> getSingleData(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteData(int id) {
		// TODO Auto-generated method stub
		
	}

}
