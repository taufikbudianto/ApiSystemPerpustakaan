package com.taufik.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="header_anggota")
public class Header_anggota {
	@Id
	@GeneratedValue
	private int id;
	private String noregistrasi;
	private String createdby;
	private String modifiedby;
	private Date createdon;
	private Date modifiedon;
	
	@OneToOne
	@JoinColumn(name="idanggota")
	private Mst_Anggota anggota;
	
	@OneToMany(mappedBy="headeranggota",cascade=CascadeType.ALL)
	private List<Detail_HeaderAnggota> detail;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNoregistrasi() {
		return noregistrasi;
	}

	public void setNoregistrasi(String noregistrasi) {
		this.noregistrasi = noregistrasi;
	}

	public String getCreatedby() {
		return createdby;
	}

	public void setCreatedby(String createdby) {
		this.createdby = createdby;
	}

	public String getModifiedby() {
		return modifiedby;
	}

	public void setModifiedby(String modifiedby) {
		this.modifiedby = modifiedby;
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

	public Mst_Anggota getAnggota() {
		return anggota;
	}

	public void setAnggota(Mst_Anggota anggota) {
		this.anggota = anggota;
	}

	public List<Detail_HeaderAnggota> getDetail() {
		return detail;
	}

	public void setDetail(List<Detail_HeaderAnggota> detail) {
		this.detail = detail;
		for(Detail_HeaderAnggota det : detail) {
			det.setHeaderanggota(this);
		}
	}
}
