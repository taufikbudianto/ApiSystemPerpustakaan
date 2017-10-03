package com.taufik.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="detail_header_anggota")
public class Detail_HeaderAnggota {
	@Id
	@GeneratedValue
	private int id;
	private int tipeiuran;
	private int idbuku;
	private long jumlah;
	private String createdby;
	private Date createdon;
	private String modifiedby;
	private Date modifiedon;
	
	@ManyToOne
	@JoinColumn(name="headerid")
	private Header_anggota headeranggota;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getTipeiuran() {
		return tipeiuran;
	}

	public void setTipeiuran(int tipeiuran) {
		this.tipeiuran = tipeiuran;
	}

	public int getIdbuku() {
		return idbuku;
	}

	public void setIdbuku(int idbuku) {
		this.idbuku = idbuku;
	}

	public long getJumlah() {
		return jumlah;
	}

	public void setJumlah(long jumlah) {
		this.jumlah = jumlah;
	}

	public String getCreatedby() {
		return createdby;
	}

	public void setCreatedby(String createdby) {
		this.createdby = createdby;
	}

	public Date getCreatedon() {
		return createdon;
	}

	public void setCreatedon(Date createdon) {
		this.createdon = createdon;
	}

	public String getModifiedby() {
		return modifiedby;
	}

	public void setModifiedby(String modifiedby) {
		this.modifiedby = modifiedby;
	}

	public Date getModifiedon() {
		return modifiedon;
	}

	public void setModifiedon(Date modifiedon) {
		this.modifiedon = modifiedon;
	}

	public Header_anggota getHeaderanggota() {
		return headeranggota;
	}

	public void setHeaderanggota(Header_anggota headeranggota) {
		this.headeranggota = headeranggota;
	}
	
	
}
