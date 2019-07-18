package com.neuedu.thread;

public class SaleTicket2 implements Runnable {
	
	private int num = 100;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		while(true) {
			if(num>0) {
				sale();
			}else{
				break;
			}
			
		}
		

	}
	
	//同步代码块
	public  void sale() {
		
		synchronized(this){//同步共享数据的修改代码
			if(num >0){
				
				System.out.println(Thread.currentThread().getName() +"卖票 ，票号 "+num);
	
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				num--;
				
				
			}
			
			
		}
		
//		System.out.println("其他在业务处理");
	}

}
