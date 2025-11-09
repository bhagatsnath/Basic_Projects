/**
 * Author: Bhagat Sabari Nath
 */
import java.util.*;
public class Samsung {
        public void samsung_galaxys25Ultra(){
                //contains all details and specifications of Samsung Galaxy s25 Ultra
                PriceConverter convert = new PriceConverter();
                double price = 1299.00;
                System.out.println();
                System.out.println("----------------------------------------------------------------");
                System.out.println("This is the Smartphone info Page for the Samsung Galaxy S25 Ultra");
                System.out.printf("Price (USD): $%.2f",price);
                System.out.println();
                System.out.println("Size and Weight: ");
                System.out.println("Width: 3.06 inches (77.6 mm)\n" + //
                                   "Height: 6.41 inches (162.8 mm)\n" + //
                                   "Depth: 0.32 inch (8.2 mm)\n" + //
                                   "Weight: 7.69 ounces (218 grams)");
                System.out.println();
                System.out.println("Display: ");
                System.out.println( "Type: Dynamic LTPO AMOLED 2X\n" + //
                                                "Size: 6.9 inches (~92.5% screen-to-body ratio)\n" + //
                                                "Resolution: 1440 × 3120 pixels (QHD+), 19.5:9 aspect ratio\n" + //
                                                "Pixel Density: ~498 ppi\n" + //
                                                "Refresh Rate: 120 Hz adaptive\n" + //
                                                "Brightness: Up to 2600 nits (peak)\n" + //
                                                "HDR Support: HDR10+\n" + //
                                                "Protection: Corning Gorilla Armor 2\n" + //
                                                "Always-On Display: Supported");
                System.out.println();
                System.out.println("Splash, Water, and Dust Resistant: ");
                System.out.println("Rated IP68 (maximum depth of 1.5 meters up to 30 minutes)");
                System.out.println();
                convert.priceConverter(price);
        }
        public void samsung_galaxys25(){
                //contains all details and specifications of Samsung Galaxy s25 
                PriceConverter convert = new PriceConverter();
                double price = 799.00;
                System.out.println();
                System.out.println("----------------------------------------------------------------");
                System.out.println("This is the Smartphone info Page for the Samsung Galaxy S25");
                System.out.printf("Price (USD): $%.2f",price);
                System.out.println();
                System.out.println("Size and Weight: ");
                System.out.println("Width: 2.78 inches (70.5 mm)\n" + //
                                   "Height: 5.78 inches (149.9 mm)\n" + //
                                   "Depth: 0.28 inch (7.2 mm)\n" + //
                                   "Weight: 5.71 ounces (162 grams)");
                System.out.println();
                System.out.println("Display: ");
                System.out.println( "Size: 6.2 inches (full rectangle), about 6.0 inches accounting for rounded corners  \n" + //
                                                "Type: Dynamic LTPO AMOLED 2X  \n" + //
                                                "Refresh rate: 1–120 Hz (adaptive)  \n" + //
                                                "Resolution: 2340 × 1080 pixels (FHD+)  \n" + //
                                                "Brightness: Up to 2600 nits (peak)  \n" + //
                                                "Features: HDR10+, Always-On Display ");
                System.out.println();
                System.out.println("Splash, Water, and Dust Resistant: ");
                System.out.println("Rated IP68 (maximum depth of 1.5 meters up to 30 minutes)");
                System.out.println();
                convert.priceConverter(price);
        }
        public void samsung_galaxys25Plus(){
                //contains all details and specifications of Samsung Galaxy s25 plus
                PriceConverter convert = new PriceConverter();
                double price = 999.00;
                System.out.println();
                System.out.println("----------------------------------------------------------------");
                System.out.println("This is the Smartphone info Page for the Samsung Galaxy S25 Plus");
                System.out.printf("Price (USD): $%.2f",price);
                System.out.println();
                System.out.println("Size and Weight: ");
                System.out.println("Width: 2.98 inches (75.8 mm)\n" + //
                                   "Height: 6.24 inches (158.4 mm)\n" + //
                                   "Depth: 0.29 inch (7.3 mm)\n" + //
                                   "Weight: 6.7 ounces (190 grams)");
                System.out.println();
                System.out.println("Display: ");
                System.out.println( "Size: 6.7 inches (6.5 inches accounting for rounded corners)  \n" + //
                                                "Type: Dynamic AMOLED 2X (LTPO)  \n" + //
                                                "Resolution: 3120 × 1440 pixels (QHD+)  \n" + //
                                                "Refresh rate: 1–120 Hz adaptive  \n" + //
                                                "Brightness: Up to 2600 nits peak  \n" + //
                                                "Features: HDR10+ and Always-On Display ");
                System.out.println();
                System.out.println("Splash, Water, and Dust Resistant: ");
                System.out.println("Rated IP68 (maximum depth of 1.5 meters up to 30 minutes)");
                System.out.println();
                System.out.println();
                convert.priceConverter(price);
        }
}
