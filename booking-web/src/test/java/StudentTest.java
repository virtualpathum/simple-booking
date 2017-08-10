
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.lk.meeting.room.config.RootConfig;
import com.lk.meeting.room.resource.RoomResource;
import com.lk.meeting.room.service.RoomService;
import com.lk.meeting.room.web.controller.RoomController;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { RootConfig.class})
public class StudentTest {
	
	@Autowired
	RoomService studentService;

	@Test
	public void test() {
				
		RoomController sc = new RoomController();
		RoomResource resource = new RoomResource();
		resource.setIsProjectorAvailable(true);
		resource.setIsRoomAvailable(true);
		resource.setNumberOfSeats(10);
		resource.setRoomLocation("1st Floor");
		sc.create(resource);
	}

}
