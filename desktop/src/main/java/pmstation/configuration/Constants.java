/*
 * pm-station-usb
 * 2017 (C) Copyright - https://github.com/rjaros87/pm-station-usb
 * License: GPL 3.0
 */

package pmstation.configuration;

import java.util.Locale;

import org.apache.commons.lang3.time.FastDateFormat;

public class Constants {
    
    public static final String PROJECT_NAME = "pm-station-usb";
    public static final String VERSION = "1.0.0"; 
    public static final String PROJECT_URL = "https://github.com/rjaros87/pm-station-usb";
    public static final Locale DEFAULT_LOCALE = Locale.getDefault(); 
    public static final String DEFAULT_ICON = "app-icon.png";
    
    public static final String UNITS = "\u03BCg/m\u00B3";
    
    // preferred Window size
    public static final int WINDOW_WIDTH = 740;
    public static final int WINDOW_HEIGHT = 480;
    // min Window size
    public static final int MIN_WINDOW_WIDTH = 484;
    public static final int MIN_WINDOW_HEIGHT = 180;
    
    public static final int CHART_MAX_SAMPLES = 30;
    
    public static final FastDateFormat DATE_FORMAT = FastDateFormat.getInstance("yyyy-MM-dd HH:mm:ss", DEFAULT_LOCALE);
    public static final int DEFAULT_INTERVAL = 3; // in sec
    public static final int MIN_INTERVAL = 2; // in sec
    public static final int MAX_INTERVAL = 3600; // in sec
    
}
