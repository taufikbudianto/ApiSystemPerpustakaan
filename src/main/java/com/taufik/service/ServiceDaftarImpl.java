package com.taufik.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.taufik.dao.DaoAnggotaDaftar;
import com.taufik.model.Mst_Anggota;

@Service
public class ServiceDaftarImpl implements ServiceAnggotaDaftar{

	@Autowired
	DaoAnggotaDaftar dao;
	
	@Override
	public void saveData(Mst_Anggota model) {
		// TODO Auto-generated method stub
		System.out.println("Jalankan Service");
		dao.saveData(model);
		
	}

	@Override
	public void updateData(Mst_Anggota model) {
		// TODO Auto-generated method stub
		System.out.println("Update data  : "+model.getId());
		dao.updateData(model);
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
