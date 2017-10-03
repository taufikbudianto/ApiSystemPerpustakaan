package com.taufik.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="brw_header_detail")
public class Brw_header_detail {
	@Id
	@GeneratedValue
	private int id;
	private int idBuku;
	private Date createdon;
	private Date modifiedon;
	private String modifiedby;
	private String createdby;
	
	@ManyToOne
	@JoinColumn(name="headerid")
	private Brw_header header;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdBuku() {
		return idBuku;
	}

	public void setIdBuku(int idBuku) {
		this.idBuku = idBuku;
	}

	public Date getCreatedon() {
		return createdon;
	}

	public void setCreatedon(Date createdon) {
		this.createdon = createdon;
	}

	public Date getModifiedon() {
		return modifiedon;
	}

	public void setModifiedon(Date modifiedon) {
		this.modifiedon = modifiedon;
	}

	public String getModifiedby() {
		return modifiedby;
	}

	public void setModifiedby(String modifiedby) {
		this.modifiedby = modifiedby;
	}

	public String getCreatedby() {
		return createdby;
	}

	public void setCreatedby(String createdby) {
		this.createdby = createdby;
	}

	public Brw_header getHeader() {
		return header;
	}

	public void setHeader(Brw_header header) {
		this.header = header;
	}
	
	
}
