package com.hsbc.withoutgeneric;

public class CompInfoType {
	
	
	private int id;
	private String billercde;
	private String epscoMerchantId;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBillercde() {
		return billercde;
	}
	public void setBillercde(String billercde) {
		this.billercde = billercde;
	}
	public String getEpscoMerchantId() {
		return epscoMerchantId;
	}
	public void setEpscoMerchantId(String epscoMerchantId) {
		this.epscoMerchantId = epscoMerchantId;
	}
	@Override
	public String toString() {
		return "CompInfoType [id=" + id + ", billercde=" + billercde + ", epscoMerchantId=" + epscoMerchantId + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((billercde == null) ? 0 : billercde.hashCode());
		result = prime * result + ((epscoMerchantId == null) ? 0 : epscoMerchantId.hashCode());
		result = prime * result + id;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CompInfoType other = (CompInfoType) obj;
		if (billercde == null) {
			if (other.billercde != null)
				return false;
		} else if (!billercde.equals(other.billercde))
			return false;
		if (epscoMerchantId == null) {
			if (other.epscoMerchantId != null)
				return false;
		} else if (!epscoMerchantId.equals(other.epscoMerchantId))
			return false;
		if (id != other.id)
			return false;
		return true;
	}
	
	

}
