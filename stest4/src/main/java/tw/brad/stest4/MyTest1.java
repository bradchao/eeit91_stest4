package tw.brad.stest4;

import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

public class MyTest1 implements ApplicationRunner{
	private Timer timer;
	
	@Autowired
	private HotelRepository hotelRepository;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("Hello, World");
		
		timer = new Timer();
		//timer.schedule(new MyTask(), 3*1000, 10*1000);
		
	}

	private class MyTask extends TimerTask {
		private int i;
		@Override
		public void run() {
			List<Hotel> list = hotelRepository.findByAddrStartingWith("台南");
			System.out.println(list.size());
			for (Hotel hotel : list) {
				System.out.printf("%s : %s\n", hotel.getName(), hotel.getAddr());
			}
			System.out.println("------");
		}
	}
	
}
