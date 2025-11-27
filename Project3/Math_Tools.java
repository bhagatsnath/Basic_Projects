/**
 * Author: Bhagat Sabari Nath
 */
import java.util.*;
public class Math_Tools {
    static Scanner sc = new Scanner(System.in);
    public void Unit_Converter(){
        System.out.println("-------------------------------------------------------");
        System.out.println("Welcome to the Unit Converter \n");
        while (true){
            System.out.println("Units available: inch, meter, pound, kilogram, and yard");
            System.out.println("Press 0 to Cancel");
            System.out.print("What unit are you converting from: ");
            String unit = sc.next();
            if (unit.equals("0")){
                break;
            }
            double value = -1.0;
            while (true){
                System.out.print("What is the magnitude of the value: ");
                try {
                    value = sc.nextDouble();
                }
                catch (Exception e){
                    sc.next();
                }
                if (value >= 0){
                    break;
                }
                else if (value < 0){
                    System.out.println("Enter a Valid Answer");
                }
            }
            if (value == 0){
                break;
            }
            System.out.print("What unit are you converting to: ");
            String unit1 = sc.next();
            if (unit1.equals("0")){
                break;
            }
            System.out.println("-------------------------------------------------------");
            //Coditional Statements to determine the output for which units the user is converting from.
            if (unit.equals("in")||unit.equals("inch")||unit.equals("inches")){
                if (unit1.equals("in")||unit1.equals("inch")||unit1.equals("inches")){
                    System.out.println("The Value in Inches is "+value+" inches\n");
                }
                else if (unit1.equals("m")||unit1.equals("meter")||unit1.equals("meters")){
                    System.out.println("The Value in Meters is "+(value*0.025)+" meters\n");
                }
                else if (unit1.equals("lb")||unit1.equals("pound")||unit1.equals("pounds")){
                    System.out.println("Cannot Convert a Measurement of Length into a Measurement of Mass! ");
                    System.out.println();
                }
                else if (unit1.equals("kg")||unit1.equals("kilogram")||unit1.equals("kilograms")){
                    System.out.println("Cannot Convert a Measurement of Length into a Measurement of Mass! ");
                    System.out.println();
                }
                else if (unit1.equals("yd")||unit1.equals("yard")||unit1.equals("yards")){
                    System.out.println("The Value in yards is "+(value*0.028)+" yards");
                    System.out.println();
                }
                else {
                    System.out.println("Enter a Valid Answer! ");
                    System.out.println();
                }
                System.out.println("-------------------------------------------------------");
            }
            else if (unit.equals("m")||unit.equals("meter")||unit.equals("meters")){
                if (unit1.equals("in")||unit1.equals("inch")||unit1.equals("inches")){
                    System.out.println("The Value in Inches is "+(value*39.37)+" inches");
                    System.out.println();
                }
                else if (unit1.equals("m")||unit1.equals("meter")||unit1.equals("meters")){
                    System.out.println("The Value in Meters is "+(value)+" meters");
                    System.out.println();
                }
                else if (unit1.equals("lb")||unit1.equals("pound")||unit1.equals("pounds")){
                    System.out.println("Cannot Convert a Measurement of Length into a Measurement of Mass! ");
                    System.out.println();
                }
                else if (unit1.equals("kg")||unit1.equals("kilogram")||unit1.equals("kilograms")){
                    System.out.println("Cannot Convert a Measurement of Length into a Measurement of Mass! ");
                    System.out.println();
                }
                else if (unit1.equals("yd")||unit1.equals("yard")||unit1.equals("yards")){
                    System.out.println("The Value in yards is "+(value*1.094)+" yards");
                    System.out.println();
                }
                else {
                    System.out.println("Enter a Valid Answer! ");
                    System.out.println();
                }
                System.out.println("-------------------------------------------------------");
            }
            else if (unit.equals("lb")||unit.equals("pound")||unit.equals("pounds")){
                if (unit1.equals("in")||unit1.equals("inch")||unit1.equals("inches")){
                    System.out.println("Cannot Convert a Measurement of Mass into a Measurement of Length! ");
                    System.out.println();
                }
                else if (unit1.equals("m")||unit1.equals("meter")||unit1.equals("meters")){
                    System.out.println("Cannot Convert a Measurement of Mass into a Measurement of Length! ");
                    System.out.println();
                }
                else if (unit1.equals("lb")||unit1.equals("pound")||unit1.equals("pounds")){
                    System.out.println("The Value in pounds is "+(value)+" pounds");
                    System.out.println();
                }
                else if (unit1.equals("kg")||unit1.equals("kilogram")||unit1.equals("kilograms")){
                    System.out.println("The value in kilograms is "+(value*0.45)+"kg ");
                    System.out.println();
                }
                else if (unit1.equals("yd")||unit1.equals("yard")||unit1.equals("yards")){
                    System.out.println("Cannot Convert a Measurement of Mass into a Measurement of Length! ");
                    System.out.println();
                }
                else {
                    System.out.println("Enter a Valid Answer! ");
                    System.out.println();
                }
                System.out.println("-------------------------------------------------------");
            }
            else if (unit.equals("kg")||unit.equals("kilogram")||unit.equals("kilograms")){
                if (unit1.equals("in")||unit1.equals("inch")||unit1.equals("inches")){
                    System.out.println("Cannot Convert a Measurement of Mass into a Measurement of Length! ");
                    System.out.println();
                }
                else if (unit1.equals("m")||unit1.equals("meter")||unit1.equals("meters")){
                    System.out.println("Cannot Convert a Measurement of Mass into a Measurement of Length! ");
                    System.out.println();
                }
                else if (unit1.equals("lb")||unit1.equals("pound")||unit1.equals("pounds")){
                    System.out.println("The Value in pounds is "+(value*2.2)+" pounds");
                    System.out.println();
                }
                else if (unit1.equals("kg")||unit1.equals("kilogram")||unit1.equals("kilograms")){
                    System.out.println("The value in kilograms is "+(value)+"kg ");
                    System.out.println();
                }
                else if (unit1.equals("yd")||unit1.equals("yard")||unit1.equals("yards")){
                    System.out.println("Cannot Convert a Measurement of Mass into a Measurement of Length! ");
                    System.out.println();
                }
                else {
                    System.out.println("Enter a Valid Answer! ");
                    System.out.println();
                }
                System.out.println("-------------------------------------------------------");
            }
            else if (unit.equals("yd")||unit.equals("yard")||unit.equals("yards")){
                if (unit1.equals("in")||unit1.equals("inch")||unit1.equals("inches")){
                    System.out.println(" The Value in inches is "+(value*36)+"in");
                    System.out.println();
                }
                else if (unit1.equals("m")||unit1.equals("meter")||unit1.equals("meters")){
                    System.out.println(" The Value in meters is "+(value*0.91)+"m");
                    System.out.println();
                }
                else if (unit1.equals("lb")||unit1.equals("pound")||unit1.equals("pounds")){
                    System.out.println("Cannot Convert a Measurement of Length into a Measurement of Mass! ");
                    System.out.println();
                }
                else if (unit1.equals("kg")||unit1.equals("kilogram")||unit1.equals("kilograms")){
                    System.out.println("Cannot Convert a Measurement of Length into a Measurement of Mass! ");
                    System.out.println();
                }
                else if (unit1.equals("yd")||unit1.equals("yard")||unit1.equals("yards")){
                    System.out.println(" The Value in yards is "+(value)+"yd");
                    System.out.println();
                }
                else {
                    System.out.println("Enter a Valid Answer! ");
                    System.out.println();
                }
                System.out.println("-------------------------------------------------------");
            }
            else{
                System.out.println("Enter a Valid Answer");
                System.out.println();
                System.out.println("-------------------------------------------------------");
            }
        }
    }
    public void rootsCalculator(){
        while (true){
            System.out.println("-------------------------------------------------------");
            System.out.println("\nWelcome to the Roots Calculator \n");
            System.out.println("From the Quadratic Formula, enter the values for a, b, and c");
            System.out.println("Press 0 to cancel");
            double a = Double.NaN;
            while (true){
                System.out.print("a: ");
                try {
                    a = sc.nextDouble();
                }
                catch (Exception e){
                    sc.next();
                    System.out.println("Enter a Valid Answer! ");
                }
                if (Double.isFinite(a)){
                    break;
                }
            }
            if (a==0){
                System.out.println();
                break;
            }
            double b = Double.NaN;
            while (true){
                System.out.print("b: ");
                try {
                    b = sc.nextDouble();
                }
                catch (Exception e){
                    sc.next();
                    System.out.println("Enter a Valid Answer! ");
                }
                if (Double.isFinite(b)){
                    break;
                }
            }
            if (b==0){
                System.out.println();
                break;
            }
            double c = Double.NaN;
            while (true){
                System.out.print("c: ");
                try {
                    c = sc.nextDouble();
                }
                catch (Exception e){
                    sc.next();
                    System.out.println("Enter a Valid Answer! ");
                }
                if (Double.isFinite(c)){
                    break;
                }
            }
            if (c==0){
                System.out.println();
                break;
            }
            //calculations
            double discriminant = Math.sqrt(((b*b)-(4*a*c)));
            double x1 = ((-1*b)+discriminant)/2*a;
            double x2 = ((-1*b)-discriminant)/2*a;
            if (Double.isNaN(discriminant)){
                System.out.println("There are no Real Solutions");
                System.out.println("-------------------------------------------------------");
            }
            else {
                System.out.println("The root for this Quadratic Relation are "+x1+" and "+x2);
                System.out.println("-------------------------------------------------------");
            }
        }
    }
    public void volumeCalculator(){
        while (true){
            System.out.println("-------------------------------------------------------");
            System.out.println("Welcome to Volume Calculator");
            System.out.println("Available Shapes: Sphere, Cone, Cylinder, and Cuboid");
            System.out.print("Select one of the available shapes (Press 0 to cancel): ");
            String oshape = sc.next();
            String shape = oshape.toLowerCase();
            if (shape.equals("sphere")){
                double r = -1.0;
                while (true){
                    System.out.print("Enter the radius of the Sphere in cm: ");
                    try{
                        r = sc.nextDouble();
                    }
                    catch (Exception e){
                        sc.next();
                    }
                    if (r<0){
                        System.out.println("Enter a Valid Answer!\n");
                    }
                    else{
                        break;
                    }
                }
                if (r==0){
                    break;
                }
                double volume = (4.0/3)*3.14159265358979323846*(r*r*r);
                System.out.printf("The Volume of the Sphere is %.5f",volume);
                System.out.println("cm cubed ");
            }
            else if (shape.equals("cone")){
                double h = -1.0;
                while(true){
                    System.out.print("Enter the height of the cone in cm: ");
                    try{
                        h = sc.nextDouble();
                    }
                    catch (Exception e){
                        sc.next();
                    }
                    if (h<0){
                        System.out.println("Enter a Valid Answer!\n");
                    }
                    else{
                        break;
                    }
                }
                if (h==0){
                    break;
                }
                double r = -1.0;
                while (true){
                    System.out.print("Enter the radius of the cone in cm: ");
                    try{
                        r = sc.nextDouble();
                    }
                    catch (Exception e){
                        sc.next();
                    }
                    if (r<0){
                        System.out.println("Enter a Valid Answer!\n");
                    }
                    else{
                        break;
                    }
                }
                if (r==0){
                    break;
                }
                double volume = (1.0/3)*3.14159265358979323846*(r*r)*h;
                System.out.printf("The Volume of the Cone is %.5f",volume);
                System.out.println("cm cubed ");
            }
            else if (shape.equals("cylinder")){
                double h = -1.0;
                while (true){
                    System.out.print("Enter the Height of the Cylinder in cm: ");
                    try{
                        h=sc.nextDouble();
                    }
                    catch (Exception e){
                        sc.next();
                    }
                    if (h<0){
                        System.out.println("Enter a Valid Answer!\n");
                    }
                    else{
                        break;
                    }
                }
                if (h==0){
                    break;
                }
                double r = -1.0;
                while (true){
                    System.out.print("Enter the radius of the cylinder in cm: ");
                    try{
                        r = sc.nextDouble();
                    }
                    catch (Exception e){
                        sc.next();
                    }
                    if (r<0){
                        System.out.println("Enter a Valid Answer!\n");
                    }
                    else{
                        break;
                    }
                }
                if (r==0){
                    break;
                }
                double volume = 3.14159265358979323846*(r*r)*h;
                System.out.printf("The Volume of the Cylinder is %.5f",volume);
                System.out.println("cm cubed ");
            }
            else if (shape.equals("cuboid")){
                double l = -1.0;
                while (true){
                    System.out.print("Enter the Length of the Cuboid in cm: ");
                    try{
                        l = sc.nextDouble();
                    }
                    catch (Exception e){
                        sc.next();
                    }
                    if (l<0){
                        System.out.println("Enter a Valid Answer!\n");
                    }
                    else{
                        break;
                    }
                }
                if (l==0){
                    break;
                }
                double w = -1.0;
                while (true){
                    System.out.print("Enter the Width of the Cuboid in cm: ");
                    try{
                        w=sc.nextDouble();
                    }
                    catch (Exception e){
                        sc.next();
                    }
                    if (w<0){
                        System.out.println("Enter a Valid Answer!\n");
                    }
                    else{
                        break;
                    }
                }
                if (w==0){
                    break;
                }
                double h = -1.0;
                while (true){
                    System.out.print("Enter the Height of the Cuboid in cm: ");
                    try{
                        h=sc.nextDouble();
                    }
                    catch (Exception e){
                        sc.next();
                    }
                    if (h<0){
                        System.out.println("Enter a Valid Answer!\n");
                    }
                    else{
                        break;
                    }
                }
                if (h==0){
                    break;
                }
                double volume = l*w*h;
                System.out.printf("The Volume of the Cuboid is %.5f",volume);
                System.out.println("cm cubed ");
            }
            else if (shape.equals("0")){
                break;
            }
            else{
                System.out.println("That Shape is not available!");
            }
        }
    }
    public void areaCalculator(){
        while (true){
            System.out.println("-------------------------------------------------------");
            System.out.println("Welcome to Area Calculator");
            System.out.println("Available Shapes: Circle, Rectangle, Trapezoid, and Triangle");
            System.out.print("Select one of the available shapes (Press 0 to cancel): ");
            String oshape = sc.next();
            String shape = oshape.toLowerCase();
            if (shape.equals("circle")){
                double r = -1.0;
                while (true){
                    System.out.print("Enter the radius of the circle in cm: ");
                    try{
                        r = sc.nextDouble();
                    }
                    catch (Exception e){
                        sc.next();
                    }
                    if (r<0){
                        System.out.println("Enter a Valid Answer!\n");
                    }
                    else{
                        break;
                    }
                }
                if (r==0){
                    break;
                }
                double area = 3.14159265358979323846*(r*r);
                System.out.printf("The Area of the Circle is %.5f",area);
                System.out.println("cm squared");
            }
            else if (shape.equals("rectangle")){
                double l = -1.0;
                while(true){
                    System.out.print("Enter the Length of the rectangle in cm: ");
                    try{
                        l=sc.nextDouble();
                    }
                    catch (Exception e){
                        sc.next();
                    }
                    if (l<0){
                        System.out.println("Enter a Valid Answer!\n");
                    }
                    else{
                        break;
                    }
                }
                if (l==0){
                    break;
                }
                double w = -1.0;
                while(true){
                    System.out.print("Enter the Width of the Rectangle in cm: ");
                    try{
                        w=sc.nextDouble();
                    }
                    catch (Exception e){
                        sc.next();
                    }
                    if (w<0){
                        System.out.println("Enter a Valid Answer!\n");
                    }
                    else{
                        break;
                    }
                }
                if (w==0){
                    break;
                }
                double area = l*w;
                System.out.printf("The Area of the Rectangle is %.5f",area);
                System.out.println("cm squared");
            }
            else if (shape.equals("trapezoid")){
                double t = -1.0;
                while(true){
                    System.out.print("Enter the length of the Top of the Trapezoid in cm: ");
                    try{
                        t=sc.nextDouble();
                    }
                    catch (Exception e){
                        sc.next();
                    }
                    if (t<0){
                        System.out.println("Enter a Valid Answer!\n");
                    }
                    else{
                        break;
                    }
                }
                if (t==0){
                    break;
                }
                double b = -1.0;
                while(true){
                    System.out.print("Enter the length of the Bottom of the Trapezoid in cm: ");
                    try{
                        b = sc.nextDouble();
                    }
                    catch (Exception e){
                        sc.next();
                    }
                    if (b<0){
                        System.out.println("Enter a Valid Answer!\n");
                    }
                    else{
                        break;
                    }
                }
                if (b==0){
                    break;
                }
                double h = -1.0;
                while(true){
                    System.out.print("Enter the Height of the Trapezoid in cm: ");
                    try{
                        h=sc.nextDouble();
                    }
                    catch(Exception e){
                        sc.next();
                    }
                    if (h<0){
                        System.out.println("Enter a Valid Answer!\n");
                    }
                    else{
                        break;
                    }
                }
                if (h==0){
                    break;
                }
                double area = ((t+b)/2.0)*h;
                System.out.printf("The Area of the Trapezoid is %.5f",area);
                System.out.println("cm squared");
            }
            else if (shape.equals("triangle")){
                double b = -1.0;
                while(true){
                    System.out.print("Enter the Length of the Triangle in cm: ");
                    try{
                        b=sc.nextDouble();
                    }
                    catch(Exception e){
                        sc.next();
                    }
                    if (b<0){
                        System.out.println("Enter a Valid Answer!\n");
                    }
                    else{
                        break;
                    }
                }
                if (b==0){
                    break;
                }
                double h = -1.0;
                while(true){
                    System.out.print("Enter the Height of the Triangle in cm: ");
                    try{
                        h=sc.nextDouble();
                    }
                    catch(Exception e){
                        sc.next();
                    }
                    if (h<0){
                        System.out.println("Enter a Valid Answer!\n");
                    }
                    else{
                        break;
                    }
                }
                if (h==0){
                    break;
                }
                double area = 0.5*b*h;
                System.out.printf("The Area of the Triangle is %.5f",area);
                System.out.println("cm squared");
            }
            else{
                System.out.println("That Shape is not available");
            }
        }
    }
}
