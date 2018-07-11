package sbp.microservice.limit.poc.sbpmicroservicelimitpoc;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import sbp.microservice.limit.poc.sbpmicroservicelimitpoc.bean.SbpMicroservicePocLimit;

@RestController
public class SbpMicroservicePocLimitController {

	@GetMapping("/microservicepoclimits")
	public SbpMicroservicePocLimit retrieveMicroservicePocLimit()
	{
		
	}

}
