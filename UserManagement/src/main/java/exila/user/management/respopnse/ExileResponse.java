package exila.user.management.respopnse;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;

public class ExileResponse extends ResponseEntity{

	public ExileResponse(HttpStatus status) {
		super(status);
		// TODO Auto-generated constructor stub
	}

	public ExileResponse(MultiValueMap headers, HttpStatus status) {
		super(headers, status);
		// TODO Auto-generated constructor stub
	}

	public ExileResponse(Object body, HttpStatus status) {
		super(body, status);
		// TODO Auto-generated constructor stub
	}

	public ExileResponse(Object body, MultiValueMap headers, HttpStatus status) {
		super(body, headers, status);
		// TODO Auto-generated constructor stub
	}

	public ExileResponse(Object body, MultiValueMap headers, int rawStatus) {
		super(body, headers, rawStatus);
		// TODO Auto-generated constructor stub
	}
	

}
