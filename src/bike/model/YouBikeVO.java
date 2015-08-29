package bike.model;

import java.io.Serializable;

public class YouBikeVO implements Serializable{
	private int no;
	private String district;
	private String stationName;
	private String address;
	private int tot;
	private Double lat;
	private Double lng;
	
	@Override
	public String toString() {
		return "{"+no+":"+district+":"+stationName+":"+address+":"+tot+":"+lat+":"+lng+"}";
	}
	@Override
	public boolean equals(Object obj) {
		if(obj!=null && (obj instanceof YouBikeVO)) {
			YouBikeVO temp = (YouBikeVO) obj;
			if(this.no == temp.no) {
				return true;
			}
		}
		return false;
	}
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getStationName() {
		return stationName;
	}
	public void setStationName(String stationName) {
		this.stationName = stationName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getTot() {
		return tot;
	}
	public void setTot(int tot) {
		this.tot = tot;
	}
	public Double getLat() {
		return lat;
	}
	public void setLat(Double lat) {
		this.lat = lat;
	}
	public Double getLng() {
		return lng;
	}
	public void setLng(Double lng) {
		this.lng = lng;
	}
}
