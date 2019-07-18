package Exceptions;

public class GreaterTen {

	public GreaterTen() {
		
	}

	public static void main(String[] args) {
		int a = 11;
		try {
			if(a>0 && a<=10) {
				throw new GreaterThanTenException("A Type");
			} else if(a>10 && a<=20) {
				throw new GreaterThanTenException("B Type");
			} else if(a>20 && a<=30) {
				throw new GreaterThanTenException("C Type");
			} else if(a>30 && a<=40) {
				throw new GreaterThanTenException("D Type");
			}
		} catch (GreaterThanTenException e) {
			e.printStackTrace();
		} finally {
			
		}
	}

}
