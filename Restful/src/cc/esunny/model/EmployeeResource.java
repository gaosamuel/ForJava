package cc.esunny.model;
import cc.esunny.model.*;
import javax.ws.rs.*;
import com.sun.jersey.*;

@Path("Employee")
@Produces("application/xml")
public class EmployeeResource 
{
	@GET	
	@Path("/getUser")	
	public Employee getEmployee() 
	{		
		Employee employee = new Employee();
		employee.setID("1");
		employee.setName("Samuel");
		
		return employee;
	}

}
