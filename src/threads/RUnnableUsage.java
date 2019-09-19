package threads;

public class RUnnableUsage {
	public static void main(String[] args) {
		performOps();
	}

	private static void performOps() {
		
		class BusinessLogicClass implements Runnable{
			int res = 1;
			public BusinessLogicClass() {
				
			}
			@Override
			public void run() {
				for(int i=1;i<=10;i++) {
					res = res * (int)(Math.random()*100);
					System.out.println(res);
				}
			}
			public int getRes() {
				return this.res;
			}
		}
		BusinessLogicClass blc = new BusinessLogicClass();
		Thread blct = new Thread(blc);
		blct.start();
		for(int i=0;i<=100;i++) {
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
	}
}
