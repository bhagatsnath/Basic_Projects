# Projects developed during my course of learning java
I am Bhagat Sabari Nath. I am a high school student and my github profile conatins projects and exercises that I developed during my grade 11/12 Java course. These projects starts from using the basic understandings that I have built up over the initial few months of learning java, and slowly over time my projects would get more advanced and logical as I further my knowledge of concepts and logic I learn over the course of my life.

Please visit my [Profile](https://sites.google.com/view/bhagat-sabari-nath/home)

--------

### Project 1 Program: iStore

This program demonstrates an online shopping system where users can create an account and purchase Apple products. It begins by welcoming the user and asking whether they already have an iAccount. If not, the program guides them through creating one. The prgram prompts the user to enter their name, email, and password, with password confirmation. After creating an account or confirmation of an existing account, the user is directed to a login page where they must enter valid credentials. After successful login, the initialize() method displays a list of available Apple products with their prices, such as iPhones and MacBooks. The user can then select a product, enter the quantity, and the program calculates the subtotal, tax (13%), and total cost. This program was created during my initial learning of java, and it demonstrates user input handling, conditional logic, loops, and formatted output in Java to create a realistic shopping experience.

--------

### Project 2 Program: Smartphone Info Page

This Program is a portal for viewing smartphone specifications that are available within the program. The program is accessed though the "Smartphone_Info_Page.java" with the main method. Its primary function is to welcome the user and enter a continuous loop that prompts for the desired smartphone brand, such as "Apple" or "Samsung," until the user enters "STOP". The main method handles the initial prompt and input dispatch, and static helper methods like apple() and samsung() for navigating the sub-menus for each brand. When a brand is selected, the corresponding helper method creates an instance of the specific brand's class (Apple.java and Samsung.java) and displays a menu of available phone models, such as the iPhone 16 series or Galaxy S25 series. Upon selecting a model, the brand's object calls its method (e.g.  "apple_iPhone16()" or "samsung_galaxys25Ultra()"), which prints the phone's detailed specifications, price, and then calls the priceConverter method in PriceConverter.java to offer currency conversion. This structure effectively manages the flow of the entire program, guriding the user from the main menu down to the specific information pages. Finally, the program exits gracefully when the user types "STOP."
