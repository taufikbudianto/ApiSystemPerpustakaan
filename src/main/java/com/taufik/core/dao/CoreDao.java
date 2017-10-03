package com.taufik.core.dao;

import java.util.List;

public interface CoreDao<E> {
	
	public void saveData(E model);
	public void updateData(E model);
	public List<E> getAllData();
	public List<E> getSingleData(int id);
	public void deleteData(int id);
}
