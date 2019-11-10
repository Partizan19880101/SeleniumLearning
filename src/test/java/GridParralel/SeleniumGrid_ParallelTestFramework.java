package GridParralel;

import java.net.MalformedURLException;
import org.testng.annotations.*;



public class SeleniumGrid_ParallelTestFramework extends TestSuiteBase {
	
	@BeforeClass
	public void beforeClass() throws MalformedURLException {
	}

	@Test
	public void searchFlights() throws Exception {
		search.clickFlightsTab();
		search.setOriginCity("New York");
		search.setDestinationCity("San Francisco");
		search.setDepartureDate("10/28/2019");
		search.setReturnDate("10/31/2019");
	}

	@AfterClass
	public void tearDown() throws Exception {
	}
}