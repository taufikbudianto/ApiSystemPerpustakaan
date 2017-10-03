package com.taufik.dao;

import java.util.List;

import javax.sql.DataSource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.taufik.model.Mst_Anggota;

@Repository
public class DaoPeminjamanImpl implements DaoPeminjaman {
	
	JdbcTemplate jdbctemplate;

	public DaoPeminjamanImpl(DataSource datasource) {
		// TODO Auto-generated constructor stub
		jdbctemplate = new JdbcTemplate(datasource);
	}
	@Autowired 
	SessionFactory sf;

	@Override
	public void saveData(Mst_Anggota model) {
		// TODO Auto-generated method stub
		Session session = sf.openSession();
		session.beginTransaction();
		session.saveOrUpdate(model);
		session.getTransaction().commit();
	}
	@Override
	public void updateData(Mst_Anggota model) {
		// TODO Auto-generated method stub
		
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
