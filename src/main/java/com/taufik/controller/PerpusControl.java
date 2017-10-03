package com.taufik.controller;
import java.util.Calendar;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.taufik.core.generate.GenerateKode;
import com.taufik.model.Detail_HeaderAnggota;
import com.taufik.model.Mst_Anggota;
import com.taufik.service.ServiceAnggotaDaftar;

@RestController
@CrossOrigin
public class PerpusControl {
	@Autowired
	ServiceAnggotaDaftar service;
	
	@Autowired
	GenerateKode kode;
	
	@RequestMapping(value="/test")
	public ModelAndView showData() {
		
		return new ModelAndView("test");
	}
	
	@RequestMapping(value="/save/anggota",method=RequestMethod.POST)
	public String saveAnggota(@RequestBody Mst_Anggota anggota) {
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.MONTH, +3);
		Calendar cal2 = Calendar.getInstance();
		cal2.add(Calendar.YEAR, 1);
		Date dNow = new Date();
		Date cardAktif = cal.getTime();
		Date angAktif = cal2.getTime();
		//table Master
		anggota.setMasaberlakuanggota(angAktif);
		anggota.setMasaberlakukartu(cardAktif);
		anggota.setId(kode.genIdAnggota("id"));
		anggota.setCreatedby("Taufik");
		anggota.setModifiedon(dNow);
		anggota.setKodeanggota(kode.genIdAnggota("id"));
		
		//table Header
		anggota.getHeader().setCreatedon(dNow);
		anggota.getHeader().setModifiedon(dNow);
		anggota.getHeader().setCreatedby("Taufik");
		anggota.getHeader().setNoregistrasi(kode.genIdAnggota("noreg"));
		anggota.setCreatedon(dNow);
		
		//detail header
		for(Detail_HeaderAnggota det : anggota.getHeader().getDetail()) {
			det.setCreatedon(dNow);
			det.setModifiedon(dNow);
			det.setCreatedby("Taufik");
		}
		
		service.saveData(anggota);
		return "save";
	}
	
	@RequestMapping(value="/update/anggota",method=RequestMethod.POST)
	public String updateAnggota(@RequestBody Mst_Anggota anggota) {
		System.out.println(anggota.getNama());
		System.out.println(anggota.getHeader().getNoregistrasi());
		for(Detail_HeaderAnggota dt : anggota.getHeader().getDetail()) {
			System.out.println(dt.getId());
			System.out.println(dt.getJumlah());
		}
	
		service.updateData(anggota);
		
		return "save";
	}
}
