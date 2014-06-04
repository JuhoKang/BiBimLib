package kr.re.ec.bibim.vo;

import java.io.Serializable;


public class FolderData implements Serializable{
		
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int folderid;
	private String name;
	private int userid;
	
	public int getFolderid() {
		return folderid;
	}
	public void setFolderid(int folderid) {
		this.folderid = folderid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	
}
