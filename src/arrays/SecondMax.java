package arrays;
import org.apache.log4j.*;
public class SecondMax {
	static Logger logger = Logger.getLogger(SecondMax.class);
	public static void main(String[] args) {
		int a[] = {-4567,-89999,345600,-1};
		int max1=a[0];
		int max2=a[1];
		for(int i=1;i<a.length;i++) {
			if(max1<a[i]) {
				max2 = max1;
				max1 = a[i];
			} else if(max2<a[i]) {
				max2=a[i];
			}
			logger.debug(max1+"  "+max2);
		}
		System.out.println("max1 = "+max1+",max2 = "+max2);
	}

}
