package com.cj.core.pojo;

import java.io.Serializable;
import java.util.Date;

public class TbItemParam implements Serializable {
    private static final long serialVersionUID = -4555621234472408076L;
    private Long id;

    private Long itemCatId;

    private Date created;

    private Date updated;

    private String paramData;
    
    //用来封装多方的字段.
    private TbItemCat tbItemCat;

    public TbItemCat getTbItemCat() {
		return tbItemCat;
	}

	public void setTbItemCat(TbItemCat tbItemCat) {
		this.tbItemCat = tbItemCat;
	}

	public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getItemCatId() {
        return itemCatId;
    }

    public void setItemCatId(Long itemCatId) {
        this.itemCatId = itemCatId;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

	public String getParamData() {
		return paramData;
	}

	public void setParamData(String paramData) {
		this.paramData = paramData;
	}

   
}