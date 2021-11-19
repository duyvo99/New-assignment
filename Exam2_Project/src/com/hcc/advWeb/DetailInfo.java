package com.hcc.advWeb;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="INFO2")

public class DetailInfo {



	@Column(name="IMG")
	private String img;
	
	@Column(name="CAPTION")
	private String caption;
	
	@Id
	@Column(name="ID")
	private int id;

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public String getCaption() {
		return caption;
	}

	public void setCaption(String caption) {
		this.caption = caption;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public DetailInfo(String img, String caption, int id) {
		super();
		this.img = img;
		this.caption = caption;
		this.id = id;
	}
	
	public DetailInfo() {
		super();
	}

	@Override
	public String toString() {
		return "DetailInfo [img=" + img + ", caption=" + caption + ", id=" + id + "]";
	}

	
	
}
