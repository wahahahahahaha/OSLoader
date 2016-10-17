package org.client;

import java.awt.Image;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

import org.util.Utilities;


public class Constants {
	public static final double CLIENT_VERSION = 0.01;
	public static final double CLIENT_TEST = 0.01;
	public static String User;
	public static String Dev;
	
	public static final String VERSION_FILE = System.getProperty("user.home") + "/OSLoader/Version.txt";
	
	public static double getCurrentVersion(){
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(VERSION_FILE)));
			return Double.parseDouble(br.readLine());
		} catch (Exception e) {
			return 0.1;
		}
	}
	
	public static double version = getCurrentVersion();
	
	public static final String CLIENT_TITLE = "Ratz Client";

	public static final int APPLET_WIDTH = 765;
	public static final int APPLET_HEIGHT = 503;
	
	public static final String HOME_PATH = (new File(System.getProperty("user.home")).exists() ? System.getProperty("user.home") : "/root") + "/OSLoader";

	public static String SITE_URL = "http://ratz-rs.net/";
	
	public static String OSRS_HOME = "http://oldschool.runescape.com/oldschool_index";
	public static String OSRS_FORUM = "http://services.runescape.com/m=forum/forums.ws#group63";
	public static String OSRS_WIKI = "http://2007.runescape.wikia.com/wiki/2007scape_Wiki";
	
	public static String OSL_FORUM = "";
	public static String OSL_GITHUB = "https://github.com/wahahahahahaha/OSLoader";
	public static String OSL_ISSUES = "https://github.com/wahahahahahaha/OSLoader/issues";
	
    public static final String RS3_HISCORES_URL = "http://services.runescape.com/m=hiscore/index_lite.ws?player=";
    public static final String OLDSCHOOL_HISCORES_URL = "http://services.runescape.com/m=hiscore_oldschool/index_lite.ws?player=";
    public static final String RS3_HISCORES_IRON = "http://services.runescape.com/m=hiscore_ironman/index_lite.ws?player=";
    public static final String OLDSCHOOL_HISCORES_IRON = "http://services.runescape.com/m=hiscore_oldschool_ironman/index_lite.ws?player=";
 
	
	
	/**
	 * Images
	 * **/
	
	public final static Image icon256 = Utilities.getLocalImage("/resources/logo/logo@256x256.png");
	public final static Image icon128 = Utilities.getLocalImage("/resources/logo/logo@128x128.png");
	public final static Image icon64 = Utilities.getLocalImage("/resources/logo/logo@64x64.png");
	public final static Image icon32 = Utilities.getLocalImage("/resources/logo/logo@32x32.png");
	public final static Image icon16 = Utilities.getLocalImage("/resources/logo/logo@16x16.png");
	
	public static final int[] WORLDS = {301, 302, 303, 304, 305, 306, 308, 309, 310,
		311, 312, 313, 314, 316, 317, 318, 319, 320, 321, 322, 326, 327, 328, 329, 330,
		333, 334, 335, 336, 338, 341, 342, 343, 344, 346, 349, 350, 351,
		354, 358, 359, 360, 362, 365, 367, 368, 369, 370, 373, 374, 375, 376,
		377, 378, 386};
}
