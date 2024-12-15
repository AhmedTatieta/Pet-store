package pet.store.Controller.error;

import java.util.NoSuchElementException;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@RestControllerAdvice
@Slf4j

public class GlobalControllerErrorHandler {
  private enum logStatus ()
        STACK_TRACE, MESSAGE_ONLY
}

@Data
  private class Exception Message (
  private string message;
  private string statusReason;
  private int statusCode;
  private string timestamp;
  private string url;


  @ExceptionHandler(NoSuchElementException.class)
  @ResponseStatus (code= HttpStatus.NOT_FOUND)
public ExceptionMessage handleNoSuchElementException (
  NoSuchElementException ex, webRequest webRequest) {
	return buildException Message ( ex, httpStatus.NOT_FOUND, webRequest
			LogStatus.MESSAGE_ONLY); 
	
	string message = ex.toString();
	string statusReason = Status.getReasonPhrase();
	int statusCode = status.value();
	string url = null;
	string timestamp = 
       ZonedDateTime.now().format (DateTimeFormatter.RFC_1123_DATE_TIME);

	if(webRequset instanceof servlet webRequest swr) {
		url = swr.getRequest().getRequestURI();
	}
   if(LogStatus == LogStatus.MESSAGE_ONLY)
	   Log.error("Exception:()", ex.tostring());
  }
  else 
	  Log.error ("Exception:", ex); 
	}
  ExceptionMessage excMsg = new ExceptionMessage();
  
  excMsg.setMessage(message);
  excMsg.setStatuscode(statuscode);
  excMsg.setStatusReason(statusReason);
  excMsg.setTimestamp(timestamp);
  excMsg.seturl(url); 