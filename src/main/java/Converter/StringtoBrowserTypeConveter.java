package Converter;

import java.lang.reflect.Method;
import java.util.Map;

import org.aeonbits.owner.Converter;

import Enum.BrowserType;

public class StringtoBrowserTypeConveter implements Converter<BrowserType>{
	
//	@Override
//	public BrowserType convert(Method method, String browserName) {
//		return BrowserType.valueOf(browserName);
//		
//	}

	
	@Override
	public BrowserType convert(Method method, String browserName) {
		Map<String, BrowserType> stringBrowserTypeMap = Map.of("CHROME",BrowserType.CHROME,
				"FIREFOX",BrowserType.FIREFOX);
		
		// if user enter any other browser name other than the given , it will run in CHROME as Default
		
		return stringBrowserTypeMap.getOrDefault(browserName.toUpperCase(),BrowserType.CHROME);
		
	}

}
