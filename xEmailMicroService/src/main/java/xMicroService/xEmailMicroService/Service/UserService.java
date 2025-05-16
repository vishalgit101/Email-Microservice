package xMicroService.xEmailMicroService.Service;

import org.springframework.stereotype.Service;

import xMicroService.xEmailMicroService.Entity.UserWriteAccessData;
import xMicroService.xEmailMicroService.Entity.User;

@Service
public interface UserService { // Should be using DTO
	User saveUser(User user);
	Boolean verifyToken(String token);
	
	// Write access for an outside app
	void writeAcces(UserWriteAccessData userData);
	String confirmWriteToken(String token); // returns the userId of whose token got confirmed
}
