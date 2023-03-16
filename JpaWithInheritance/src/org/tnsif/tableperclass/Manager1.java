package org.tnsif.tableperclass;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="Manager1")
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public class Manager1 extends Employee1 {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer deptid;
	private String deptname;

	public Integer getDeptid() {
		return deptid;
	}

	public void setDeptid(Integer deptid) {
		this.deptid = deptid;
	}

	public String getDeptname() {
		return deptname;
	}

	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}

	public Integer getGetDept() {
		return getDeptid();
	}

	public void setGetDept(Integer getDept) {
		this.deptid = getDept;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	

}
Footer