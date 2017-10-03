package com.taufik.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.taufik.model.Mst_Anggota;
import com.taufik.service.ServicePeminjaman;

@RestController
@CrossOrigin
public class PeminjamanController {
	@Autowired 
	ServicePeminjaman service;
	@RequestMapping(value="/add/peminjaman",method=RequestMethod.POST)
	public String addPeminjam(@RequestBody Mst_Anggota anggota) {
		service.saveData(anggota);
		return "PinjamSukses";
	}
}
