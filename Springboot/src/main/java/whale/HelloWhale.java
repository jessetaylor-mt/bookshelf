package whale;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonIgnore;


@RestController
public class HelloWhale {

    @RequestMapping(value="/", method=RequestMethod.GET, produces="application/json")
    @ResponseBody
    public String home() {
    	String success = "This application is running!";
        return success;
    }
    
    @RequestMapping(value="/add/{value1}/{value2}", method=RequestMethod.GET, produces="application/json")
    @ResponseBody
    public long add(@PathVariable("value1") long value1, @PathVariable("value2") long value2) {
        return value1 + value2;
    }
    
    @RequestMapping(value="/multiply", method=RequestMethod.GET, produces="application/json")
    @ResponseBody
    public long multiply(@RequestParam("value1") long value1, @RequestParam("value2") long value2) {
        return value1 * value2;
    }
    
    @RequestMapping(value="/aquarium", method=RequestMethod.GET)
    @ResponseBody
    public aquariumDTO fishes() {
        return new aquariumDTO("goldfish", "carp", "dolphin");
    }
    
    private class aquariumDTO {
    	@JsonIgnore private String smallFish;
    	private String mediumFish;
    	private String bigFish;
    	
    	public aquariumDTO(String smallFish, String mediumFish, String bigFish) {
    		this.smallFish = smallFish;
    		this.mediumFish = mediumFish;
    		this.bigFish = bigFish;
    	}
    	
    	public String getMediumFish() { return mediumFish; }
    	public String getBigFish() { return bigFish; }
    }

}
