package Serializable;

import java.io.Serializable;
/**
 * 
 * @author vijay
 *	
 */
public class SerializableObject implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3782294812883635908L;
	private transient int var1;
	private String var2;
	private String var3;
	
	public int getVar1() {
		return var1;
	}
	public void setVar1(int var1) {
		this.var1 = var1;
	}
	public String getVar2() {
		return var2;
	}
	public void setVar2(String var2) {
		this.var2 = var2;
	}
	public String getVar3() {
		return var3;
	}
	public void setVar3(String var3) {
		this.var3 = var3;
	}
}
