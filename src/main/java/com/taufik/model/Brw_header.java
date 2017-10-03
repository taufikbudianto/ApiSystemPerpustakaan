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
@Table(name="brw_header")
public class Brw_header {
	@Id
	@GeneratedValue
	private int id;
	private String noregistrasi;
	private String noreferensi;
	private String status;
	private String tanggalpinjam;
	private String tanggalkembali;
	private String modifiedby;
	private String createdby;
	private Date createdon;
	private Date modifiedon;
	
	@OneToMany(mappedBy="header",cascade=CascadeType.ALL)
	private List<Brw_header_detail> detail;
	
	@OneToOne
	@JoinColumn(name="idanggota")
	private Mst_Anggota anggota;

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

	public String getNoreferensi() {
		return noreferensi;
	}

	public void setNoreferensi(String noreferensi) {
		this.noreferensi = noreferensi;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getTanggalpinjam() {
		return tanggalpinjam;
	}

	public void setTanggalpinjam(String tanggalpinjam) {
		this.tanggalpinjam = tanggalpinjam;
	}

	public String getTanggalkembali() {
		return tanggalkembali;
	}

	public void setTanggalkembali(String tanggalkembali) {
		this.tanggalkembali = tanggalkembali;
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

	public List<Brw_header_detail> getDetail() {
		return detail;
	}

	public void setDetail(List<Brw_header_detail> detail) {
		this.detail = detail;
		for(Brw_header_detail det : detail) {
			det.setHeader(this);
		}
	}

	public Mst_Anggota getAnggota() {
		return anggota;
	}

	public void setAnggota(Mst_Anggota anggota) {
		this.anggota = anggota;
	}
	
	
}
