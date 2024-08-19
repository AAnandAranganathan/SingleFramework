package Config;

import org.aeonbits.owner.Config;

import Converter.StringtoBrowserTypeConveter;
import Enum.BrowserType;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
	"system:properties",
	"system:env",
	"file:${user.dir}/src/test/resources/config.properties"
	
})

public interface FrameworkConfig extends Config {

	//@DefaultValue("chrome");
	@DefaultValue("CHROME")
	@ConverterClass(StringtoBrowserTypeConveter.class)
	//String browser();
	BrowserType browser();
}
