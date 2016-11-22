package com.gs.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Entity
public class Node extends BaseEntity {

	private static final long serialVersionUID = 1L;

	private int virtualId; // 虚拟主键
	private String Id; // 节点号
	private Date date; // 时间
	private short PH; // PH值
	private int temperature; // 温度
	private int Ion; // 离子浓度
	private int turbidity; // 浊度
	private int microbial; // 微生物量

	public Node() {
	}

	@Id
	@GeneratedValue
	public int getVirtualId() {
		return virtualId;
	}

	public void setVirtualId(int virtualId) {
		this.virtualId = virtualId;
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	@Temporal(TemporalType.TIMESTAMP)
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public short getPH() {
		return PH;
	}

	public void setPH(short pH) {
		PH = pH;
	}

	public int getTemperature() {
		return temperature;
	}

	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}

	public int getIon() {
		return Ion;
	}

	public void setIon(int ion) {
		Ion = ion;
	}

	public int getTurbidity() {
		return turbidity;
	}

	public void setTurbidity(int turbidity) {
		this.turbidity = turbidity;
	}

	public int getMicrobial() {
		return microbial;
	}

	public void setMicrobial(int microbial) {
		this.microbial = microbial;
	}

	@Override
	public Serializable key() {
		return this.Id;
	}

	@Override
	public String toString() {
		return "Node [Id=" + Id + ", PH=" + PH + ", temperature=" + temperature + ", Ion=" + Ion + ", turbidity="
				+ turbidity + ", microbial=" + microbial + ", date=" + date + "]";
	}

}
