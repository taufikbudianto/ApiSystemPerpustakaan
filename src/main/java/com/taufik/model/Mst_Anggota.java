package com.taufik.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="mst_anggota")
public class Mst_Anggota implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private String id;
	private String kodeanggota;
	private String nama;
	private String alamat;
	private String idprovinsi;
	private String idkota;
	private String idkecamatan;
	private String idkelurahan;
	private String email;
	private String notelp;
	private Date masaberlakukartu;
	private Date masaberlakuanggota;
	private Date createdon;
	private String createdby;
	private Date modifiedon;
	private String modifiedby;
	

	@OneToOne(mappedBy="anggota",cascade=CascadeType.ALL)
	private Header_anggota header;
	
	@OneToOne(mappedBy="anggota",cascade=CascadeType.ALL)
	private Brw_header headerbrw;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getKodeanggota() {
		return kodeanggota;
	}
	public void setKodeanggota(String kodeanggota) {
		this.kodeanggota = kodeanggota;
	}
	public String getNama() {
		return nama;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}
	public String getAlamat() {
		return alamat;
	}
	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}
	public String getIdprovinsi() {
		return idprovinsi;
	}
	public void setIdprovinsi(String idprovinsi) {
		this.idprovinsi = idprovinsi;
	}
	public String getIdkota() {
		return idkota;
	}
	public void setIdkota(String idkota) {
		this.idkota = idkota;
	}
	public String getIdkecamatan() {
		return idkecamatan;
	}
	public void setIdkecamatan(String idkecamatan) {
		this.idkecamatan = idkecamatan;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNotelp() {
		return notelp;
	}
	public void setNotelp(String notelp) {
		this.notelp = notelp;
	}
	public Date getMasaberlakukartu() {
		return masaberlakukartu;
	}
	public void setMasaberlakukartu(Date masaberlakukartu) {
		this.masaberlakukartu = masaberlakukartu;
	}
	public Date getMasaberlakuanggota() {
		return masaberlakuanggota;
	}
	public void setMasaberlakuanggota(Date masaberlakuanggota) {
		this.masaberlakuanggota = masaberlakuanggota;
	}
	public Date getCreatedon() {
		return createdon;
	}
	public void setCreatedon(Date createdon) {
		this.createdon = createdon;
	}
	public String getCreatedby() {
		return createdby;
	}
	public void setCreatedby(String createdby) {
		this.createdby = createdby;
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
	public Header_anggota getHeader() {
		return header;
	}
	public void setHeader(Header_anggota header) {
		this.header = header;
		header.setAnggota(this);
	}
	public String getIdkelurahan() {
		return idkelurahan;
	}
	public void setIdkelurahan(String idkelurahan) {
		this.idkelurahan = idkelurahan;
	}
	public Brw_header getHeaderbrw() {
		return headerbrw;
	}
	public void setHeaderbrw(Brw_header headerbrw) {
		this.headerbrw = headerbrw;
		headerbrw.setAnggota(this);
	}
	
	
}
