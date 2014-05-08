package geo.ws.testing;

import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class TestGeoIP implements Runnable{
	/**
	 * Thread to run xService provider
	 */
	private Thread xThread = null;
	/**
	 * Thread used to run cdyne IP service provider
	 */
	private Thread gThread = null;
	/**
	 * determine which webservice has answered first
	 * 1 = WebServicex GeoIP Service
	 * 2 = Cdyne GeoIP Service
	 */
	public int who;
	
	public Webservicex servicex = null;
	
	public Cdyne cdyne = null;
	private String result; 
	
	private long startTime;
	private long endTime;
	
	public TestGeoIP(){
		String dest = JOptionPane.showInputDialog("Input the IP Destination Address : ");
		if(dest == null){
			System.exit(0);
		}
		servicex = new Webservicex(dest);
		cdyne = new Cdyne(dest);
		
		xThread = new Thread(servicex);
		gThread = new Thread(cdyne);
		
		startTime = System.currentTimeMillis();
		xThread.start();
		gThread.start();
	}
	
	
	/**
	 * ends {@link #xThread} and {@link #gThread}
	 */
	public void stop(){
		while(true){
			try {
				xThread.join();
				gThread.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		}
		xThread = null;
		gThread = null;
	}
	@Override
	public void run() {
		Thread thisThread = Thread.currentThread();
		while(true){
			System.out.println("...");
			if(servicex.hasAnswered){
				System.out.println("Enter " + servicex.getResult());
				who = 1;
				result = servicex.getResult();
				endTime = System.currentTimeMillis();
				stop();
				break;
			}else{
				if(cdyne.hasAnswered){
					who = 2;
					result = cdyne.getResult();
					endTime = System.currentTimeMillis();
					stop();
					break;
				}
			}
			continue;
				
		}
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException | InstantiationException
				| IllegalAccessException | UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}
		TestGeoIP test = new TestGeoIP();
		test.run();
		String str = null;
		/* Convert the time to seconds */
		long last = (test.endTime - test.startTime);
		System.out.println("last " + last);
		if(test.who == 1){
			//System.out.println("Web Servicex Geo IP : " + test.result + "\t Time = " + last/1000);
			str = "Web Servicex Geo IP : " + test.result + "\t Time = " + last;
		}else
			//System.out.println("Cdyne Geo IP : " + test.result + "\t Time = " + last/1000);
			str = "Cdyne Geo IP : " + test.result + "\t Time = " + last;
		JOptionPane.showMessageDialog(null, str);
	}
}
