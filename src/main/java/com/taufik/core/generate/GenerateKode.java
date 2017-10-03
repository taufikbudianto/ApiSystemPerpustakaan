package com.taufik.core.generate;

import java.util.Calendar;
import java.util.Date;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class GenerateKode {
	private JdbcTemplate jdbcTemplate;
	public GenerateKode(DataSource datasource) {
		// TODO Auto-generated constructor stub
		jdbcTemplate = new JdbcTemplate(datasource);
	}
	public String genIdAnggota(String noregOrId) {
		int rowCount = this.jdbcTemplate.queryForObject("select count(*) from header_anggota", Integer.class);
		Date dnow = new Date();
		Calendar calender  = Calendar.getInstance();
		calender.setTime(dnow);
		int year = calender.get(Calendar.YEAR);
		int month = calender.get(Calendar.MONTH);
		String bulan=null;
		if(month<10) {
			bulan = "0"+month;
		}else {
			bulan=String.valueOf(month);
		}
		String id = null;
		if (rowCount ==0) {
			if(noregOrId.equals("id")) {
				id = "perpus-"+year+bulan+"00"+1;
			}else {// TRXI2016050006
				id = "TRXI"+year+bulan+"00"+1;
			}
				
		}else {
			if(noregOrId.equals("id")) {
				String idBefore = this.jdbcTemplate.queryForObject("select id from mst_anggota order by createdon desc limit 1", String.class);
				String number = idBefore.substring((idBefore.length()-3),idBefore.length());
				String bln = idBefore.substring((idBefore.length()-4),(idBefore.length()-3));
				if(month ==Integer.parseInt(bln)) {
					if(Integer.parseInt(number)<9) {
						number ="00"+(Integer.parseInt(number)+1);
					}else if(Integer.parseInt(number)>=9 || Integer.parseInt(number)<99) {
						number ="0"+(Integer.parseInt(number)+1);
					}else {
						number ="0"+(Integer.parseInt(number)+1);
					}
					id = idBefore.substring(0,(idBefore.length()-3))+number;
				}else {
					id = "perpus-"+year+bulan+"00"+1;
				}
			}else {
				String idBefore = this.jdbcTemplate.queryForObject("select noregistrasi from header_anggota order by createdon desc limit 1", String.class);
				String number = idBefore.substring((idBefore.length()-3),idBefore.length());
				String bln = idBefore.substring((idBefore.length()-4),(idBefore.length()-3));
				if(month ==Integer.parseInt(bln)) {
					if(Integer.parseInt(number)<9) {
						number ="00"+(Integer.parseInt(number)+1);
					}else if(Integer.parseInt(number)>=9 || Integer.parseInt(number)<99) {
						number ="0"+(Integer.parseInt(number)+1);
					}else {
						number ="0"+(Integer.parseInt(number)+1);
					}
					id = idBefore.substring(0,(idBefore.length()-3))+number;
				}else {
					id = "TRXI"+year+bulan+"00"+1;
				}
			}
		}
		return id;
	}
}
