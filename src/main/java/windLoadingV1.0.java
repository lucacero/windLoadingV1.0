import java.util.Scanner;
import java.lang.Math;
public class Main{
    public static void main(String[] args){

        System.out.println("Hello:");
        System.out.flush();

        Scanner scan = new Scanner(System.in);
        double height = 0.0;
        while(true){
        System.out.println("What is the height of your structure? Choose a number between 0 and 828:");
        String userInputHeight = scan.nextLine();
        
        if(Double.parseDouble(userInputHeight)>=0 && Double.parseDouble(userInputHeight)<=828){
            height =  Double.parseDouble(userInputHeight);
            break;
        }
        else{
            System.out.println("The given input is out of bounds. Please try again:");
        }
        }
        System.out.println("The height of your structure is:" + height);

        double width = 0.0;
        while(true){
        System.out.println("What is the width of your structure? Choose a number between 0 and 500:");
        String userInputWidth = scan.nextLine();
        
        if(Double.parseDouble(userInputWidth)>=0 && Double.parseDouble(userInputWidth)<=500){
            width = Double.parseDouble(userInputWidth);
            break;
        }
        else{
            System.out.println("The given input is out of bounds. Please try again:");
        }
        }
        System.out.println("The width of your structure is:" + width);

        double length = 0.0;
        while(true){
        System.out.println("What is the length of your structure? Choose a number between 0 and 1000:");
        String userInputLength = scan.nextLine();
        
        if(Double.parseDouble(userInputLength)>=0 && Double.parseDouble(userInputLength)<=1000){
            length = Double.parseDouble(userInputLength);
            break;
        }
        else{
            System.out.println("The given input is out of bounds. Please try again:");
        }
        }
        System.out.println("The length of your structure is:" + length);

        double windVelocity = 0.0;
        while(true){
        System.out.println("What is the wind velocity? Give a value between 0 and 407.163:");
        String userInputWindVelocity = scan.nextLine();
        
        if(Double.parseDouble(userInputWindVelocity)>=0 && Double.parseDouble(userInputWindVelocity)<=407.163){
            windVelocity = Double.parseDouble(userInputWindVelocity);
            windVelocity = windVelocity / 3.6;
            break;
        }
        else{
            System.out.println("The given input is out of bounds. Please try again:");
        }
        }
        System.out.println("The wind velocity is:" + windVelocity);

        double airDensity = 0.0;
        while(true){
        System.out.println("What is the air density? Give a value between 0.859 and 1.000:");
        String userInputAirDensity = scan.nextLine();
        
        if(Double.parseDouble(userInputAirDensity)>=0.859 && Double.parseDouble(userInputAirDensity)<=1.000){
            airDensity = Double.parseDouble(userInputAirDensity);
            airDensity = airDensity * 1.225;
            break;
        }
        else{
            System.out.println("The given input is out of bounds. Please try again:");
        }
        }
        System.out.println("The air density is:" + airDensity);      

        double alpha = 1.2;
        double beta = 0.6;
        double dragCoefficient = (alpha * (height/width) + beta * (height/length));
        System.out.println("The drag coefficient is:" + dragCoefficient);

        double windPressure = (0.5*(airDensity)*dragCoefficient*(windVelocity*windVelocity));
        System.out.println("The wind pressure is:" + windPressure);

        double crossSectionalArea = height * width;
        System.out.println("The cross sectional area is:" + crossSectionalArea);
        
        double windLoad = (windPressure*crossSectionalArea);
        System.out.println("The wind load is:" + windLoad);

        String Wood = "Wood";
        String Concrete = "Concrete";
        String Brick = "Brick";
        String Stone = "Stone";
        String Steel = "Steel";
        Scanner materialType = new Scanner(System.in);

        double averageShearStrength = 0.0;
        double loadCapacity = 0.0;
         double yieldStrength = 0.0;
         double elasticModulus = 0.0;
        double brinellHardness = 0.0;

        while(true){
        System.out.println("What is the material that your structure is supported by? Please type one of the following materials: Wood, Concrete, Brick, Stone, or Steel:");
        String userInputMaterial = materialType.nextLine();
        if(userInputMaterial.equals(Wood)){
            yieldStrength = 25.0;
            yieldStrength *= 1e6;
            System.out.println("The yield strength is:" + yieldStrength);

            while(true){
            System.out.println("What is the average shear strength of your wood? Choose a value between 2 and 15:");
            String userInputAverageShearStrength = scan.nextLine();

            if(Double.parseDouble(userInputAverageShearStrength)>=2 && Double.parseDouble(userInputAverageShearStrength)<=15){
                averageShearStrength = Double.parseDouble(userInputAverageShearStrength);
                averageShearStrength *= 1e6;
                break; 
            }
            else{
                System.out.println("The given input is out of bounds. Please try again:");
            }
            }
            System.out.println("The average shear strength is:" + averageShearStrength);

            while(true){
            System.out.println("What is the elastic modulus of your wood? Choose a value between 10 and 15:");
            String userInputElasticModulus = scan.nextLine();

            if(Double.parseDouble(userInputElasticModulus)>=10 && Double.parseDouble(userInputElasticModulus)<=15){
                elasticModulus = Double.parseDouble(userInputElasticModulus);
                elasticModulus *= 1e9;
                break;
            }
            else{
                System.out.println("The given input is out of bounds. Please try again:");
            }
            }
            System.out.println("The elastic modulus is:" + elasticModulus);

            while(true){
            System.out.println("What is the load capacity of your wood? Choose a value between 50 and 150:");
            String userInputLoadCapacity = scan.nextLine();

            if(Double.parseDouble(userInputLoadCapacity)>=50 && Double.parseDouble(userInputLoadCapacity)<=150){
                loadCapacity = Double.parseDouble(userInputLoadCapacity);
                loadCapacity *= 1e3;
                break;
            }
            else{
                System.out.println("The given input is out of bounds. Please try again:");
            }
            }
            System.out.println("The load capacity is:" + loadCapacity);
        }

        else if(userInputMaterial.equals(Concrete)){

            while(true){
            System.out.println("What is the yield strength of your concrete? Choose a value between 20 and 40:");
            String userInputYieldStrength = scan.nextLine();

            if(Double.parseDouble(userInputYieldStrength)>=20 && Double.parseDouble(userInputYieldStrength)<=40){
                yieldStrength = Double.parseDouble(userInputYieldStrength);
                yieldStrength *= 1e6;
                break;
            }
            else{
                 System.out.println("The given input is out of bounds. Please try again:");
            }
            }
            System.out.println("The yield strength is:" + yieldStrength);

            while(true){
            System.out.println("What is the average shear strength of your concrete? Choose a value between 10 and 15:");
            String userInputAverageShearStrength = scan.nextLine();

            if(Double.parseDouble(userInputAverageShearStrength)>=10 && Double.parseDouble(userInputAverageShearStrength)<=15){
                averageShearStrength = Double.parseDouble(userInputAverageShearStrength);
                averageShearStrength *= 1e6;
                break;
            }
            else{
                System.out.println("The given input is out of bounds. Please try again:");
            }
            }
            System.out.println("The average shear strength is:" + averageShearStrength);

            while(true){
            System.out.println("What is the elastic modulus of your concrete? Choose a value between 25 and 40:");
            String userInputElasticModulus = scan.nextLine();

            if(Double.parseDouble(userInputElasticModulus)>=25 && Double.parseDouble(userInputElasticModulus)<=40){
                elasticModulus = Double.parseDouble(userInputElasticModulus);
                elasticModulus *= 1e9;
                break;
            }
            else{
                System.out.println("The given input is out of bounds. Please try again:");
            }
            }
            System.out.println("The elastic modulus is:" + elasticModulus);

            while(true){
            System.out.println("What is the load capacity of your concrete? Choose a value between 200 and 1000:");
            String userInputLoadCapacity = scan.nextLine();

            if(Double.parseDouble(userInputLoadCapacity)>=200 && Double.parseDouble(userInputLoadCapacity)<=1000){
                loadCapacity = Double.parseDouble(userInputLoadCapacity);
                loadCapacity *= 1e3;
                break; 
            }
            else{
                System.out.println("The given input is out of bounds. Please try again:");
            }
            }
            System.out.println("The load capacity is:" + loadCapacity);
        }

        else if(userInputMaterial.equals(Brick)){

            while(true){
            System.out.println("What is the yield strength of your brick? Choose a value between 10 and 50:");
            String userInputYieldStrength = scan.nextLine();

            if(Double.parseDouble(userInputYieldStrength)>=10 && Double.parseDouble(userInputYieldStrength)<=50){
                yieldStrength = Double.parseDouble(userInputYieldStrength);
                yieldStrength *= 1e6;
                break;
            }
            else{
                 System.out.println("The given input is out of bounds. Please try again:");
            }
            }
            System.out.println("The yield strength is:" + yieldStrength);

            while(true){
            System.out.println("What is the average shear strength of your brick? Choose a value between 2 and 5:");
            String userInputAverageShearStrength = scan.nextLine();

            if(Double.parseDouble(userInputAverageShearStrength)>=2 && Double.parseDouble(userInputAverageShearStrength)<=5){
                averageShearStrength = Double.parseDouble(userInputAverageShearStrength);
                averageShearStrength *= 1e6;
                break;
            }
            else{
                System.out.println("The given input is out of bounds. Please try again:");
            }
            }
            System.out.println("The average shear strength is:" + averageShearStrength);

            while(true){
            System.out.println("What is the elastic modulus of your brick? Choose a value between 10 and 20:");
            String userInputElasticModulus = scan.nextLine();

            if(Double.parseDouble(userInputElasticModulus)>=10 && Double.parseDouble(userInputElasticModulus)<=20){
                elasticModulus = Double.parseDouble(userInputElasticModulus);
                elasticModulus *= 1e9;
                break;
            }
            else{
                System.out.println("The given input is out of bounds. Please try again:");
            }
            }
            System.out.println("The elastic modulus is:" + elasticModulus);

            while(true){
            System.out.println("What is the load capacity of your brick? Choose a value between 30 and 100:");
            String userInputLoadCapacity = scan.nextLine();

            if(Double.parseDouble(userInputLoadCapacity)>=30 && Double.parseDouble(userInputLoadCapacity)<=100){
                loadCapacity = Double.parseDouble(userInputLoadCapacity);
                loadCapacity *= 1e3;
                break;
            }
            else{
                System.out.println("The given input is out of bounds. Please try again:");
            }
            }
            System.out.println("The laod capacity is:" + loadCapacity);
        }

        else if(userInputMaterial.equals(Stone)){

            while(true){
            System.out.println("What is the yield strength of your stone? Choose a value between 50 and 200:");
            String userInputYieldStrength = scan.nextLine();

            if(Double.parseDouble(userInputYieldStrength)>=50 && Double.parseDouble(userInputYieldStrength)<=200){
                yieldStrength = Double.parseDouble(userInputYieldStrength);
                yieldStrength *= 1e6;
                break;
            }
            else{
                 System.out.println("The given input is out of bounds. Please try again:");
            }
            }
            System.out.println("The yield strength is:" + yieldStrength);

            while(true){
            System.out.println("What is the average shear strength of your stone? Choose a value between 5 and 25:");
            String userInputAverageShearStrength = scan.nextLine();

            if(Double.parseDouble(userInputAverageShearStrength)>=5 && Double.parseDouble(userInputAverageShearStrength)<=25){
                averageShearStrength = Double.parseDouble(userInputAverageShearStrength);
                averageShearStrength *= 1e6;
                break;
            }
            else{
                System.out.println("The given input is out of bounds. Please try again:");
            }
            }
            System.out.println("The average shear strength is:" + averageShearStrength);

            while(true){
            System.out.println("What is the elastic modulus of your stone? Choose a value between 20 and 70:");
            String userInputElasticModulus = scan.nextLine();

            if(Double.parseDouble(userInputElasticModulus)>=20 && Double.parseDouble(userInputElasticModulus)<=70){
                elasticModulus = Double.parseDouble(userInputElasticModulus);
                elasticModulus *= 1e9;
                break;
            }
            else{
                System.out.println("The given input is out of bounds. Please try again:");
            }
            }
            System.out.println("The elastic modulus is:" + elasticModulus);

            while(true){
            System.out.println("What is the load capacity of your stone? Choose a value between 50 and 200:");
            String userInputLoadCapacity = scan.nextLine();

            if(Double.parseDouble(userInputLoadCapacity)>=50 && Double.parseDouble(userInputLoadCapacity)<=200){
                loadCapacity = Double.parseDouble(userInputLoadCapacity);
                loadCapacity *= 1e3;
                break;
            }
            else{
                System.out.println("The given input is out of bounds. Please try again:");
            }
            }
            System.out.println("The load capacity is:" + loadCapacity);
        }

        else if(userInputMaterial.equals(Steel)){
            elasticModulus = 200.0;
            elasticModulus *= 1e9;
            System.out.print("The elastic modulus is:" + elasticModulus);
            
            while(true){
            System.out.println("What is the Brinell Hardness of your steel? Choose a value between 120 and 200:");
            String userInputBrinellHardness = scan.nextLine();

            if(Double.parseDouble(userInputBrinellHardness)>=120 && Double.parseDouble(userInputBrinellHardness)<=200){
                brinellHardness = Double.parseDouble(userInputBrinellHardness);
                yieldStrength = 3.45 * brinellHardness;
                yieldStrength *= 1e6;
                break;
            }
            else{ 
                System.out.println("The given input is out of bounds. Please try again:");
            }
            }          
            System.out.println("The yield strength is:" + yieldStrength);

            while(true){
            System.out.println("What is the average shear strength of your steel? Choose a value between 100 and 200:");
            String userInputAverageShearStrength = scan.nextLine();

            if(Double.parseDouble(userInputAverageShearStrength)>=100 && Double.parseDouble(userInputAverageShearStrength)<=200){
                averageShearStrength = Double.parseDouble(userInputAverageShearStrength);
                averageShearStrength *= 1e6;
                break;
            }
            else{
                System.out.println("The given input is out of bounds. Please try again:");
            }
            }
            System.out.println("The average shear strength is:" + averageShearStrength);

            while(true){
            System.out.println("What is the load capacity of your steel? Choose a value between 500 and 2000:");
            String userInputLoadCapacity = scan.nextLine();

            if(Double.parseDouble(userInputLoadCapacity)>=500 && Double.parseDouble(userInputLoadCapacity)<=2000){
                loadCapacity = Double.parseDouble(userInputLoadCapacity);
                loadCapacity *= 1e3;
                break;
            }
            else{
                System.out.println("The given input is out of bounds. Please try again:");
            }
            }
            System.out.println("The laod capacity is:" + loadCapacity);
            }
            
            else{
                System.out.print("Please re-type the material you chose to use:");
                continue; 
            }
        break; 
        }
           
        double safetyFactor = 0.0;
        while(true){
        System.out.println("What will your safety factor be? Choose a value between 1.5 and 4:");
        String userInputSafetyFactor = scan.nextLine();
    
        if(Double.parseDouble(userInputSafetyFactor)>=1.5 && Double.parseDouble(userInputSafetyFactor)<=4){
            safetyFactor = Double.parseDouble(userInputSafetyFactor);
            break;
        }
        else{
             System.out.println("The given input is out of bounds. Please try again:");
        }
        }
        System.out.println("The safety factor is:" + safetyFactor);

        double tensileStrength = yieldStrength * crossSectionalArea;
        System.out.println("The tensile strength is:" + tensileStrength);

        double shearStrength = averageShearStrength * crossSectionalArea;
        System.out.println("The shear strength is:" + shearStrength);

        int floors = (int)(height/4);
        System.out.println("There are" + floors + "floors in your building");

        double floorArea = length * width;
        System.out.println("The floor area is:" + floorArea);

        double floorLoad = 10.0;

        double totalLoad = (double)(floors * floorArea * floorLoad);
        System.out.println("The total load is:" + totalLoad);

        int beamAmount = (int)(totalLoad/loadCapacity);
        System.out.println("There are" + beamAmount + "beams in your building");

        double beamHeight = (double)(height/beamAmount);
        System.out.println("The beam height is:" + beamHeight);

        double beamWidth = beamHeight/2;
        System.out.println("The beam width is:" + beamWidth);

        double momentInertia = (beamWidth * (beamHeight*beamHeight*beamHeight))/12;
        System.out.println("The moment of inertia is:" + momentInertia);

        double maximumFlexuralStrength = (yieldStrength*momentInertia)/beamWidth;
        System.out.println("The maximum flexural strength is:" + maximumFlexuralStrength);
     
        double columnEffectiveLengthFactor = 1.0;
    
        double bucklingStrength = ((Math.PI*Math.PI) * elasticModulus * momentInertia)/((columnEffectiveLengthFactor * beamHeight) * (columnEffectiveLengthFactor * beamHeight));
        System.out.println("The buckling strength is:" + bucklingStrength);
    
        double safetyTensileStrength = tensileStrength/safetyFactor;
        System.out.println("The tensile strength with a safety facter of" + safetyFactor + "is:" + safetyTensileStrength);
    
        double safetyShearStrength = shearStrength/safetyFactor;
        System.out.println("The shear strength with a safey factor of" + safetyFactor + "is:" + safetyShearStrength);
    
        double safetyMaximumFlexuralStrength = maximumFlexuralStrength/safetyFactor;
        System.out.println("The maximum flexural strength with a safety factor of" + safetyFactor + "is:" + safetyMaximumFlexuralStrength);
    
        double safetyBucklingStrength = bucklingStrength/safetyFactor;
        System.out.println("The buckling strength with a safety factor of" + safetyFactor + "is:" + safetyBucklingStrength);

        if(windLoad >= tensileStrength && windLoad >= safetyTensileStrength) {
            System.out.println("Structural failure will occur due to a lack of tensile strength");
        } 
        else if(windLoad < tensileStrength && windLoad >= safetyTensileStrength) {
            System.out.println("The structure would survive, but is not deemed safe due to a lack of tensile strength");
        } 
        else {
            System.out.println("The structure is deemed safe, as the wind load is less than the tensile strength");
        }

        if(windLoad >= shearStrength && windLoad >= safetyShearStrength) {
            System.out.println("Structural failure will occur due to a lack of shear strength");
        } 
        else if(windLoad < shearStrength && windLoad >= safetyShearStrength) {
            System.out.println("The structure would survive, but is not deemed safe due to a lack of shear strength");
        } 
        else {
            System.out.println("The structure is deemed safe, as the wind load is less than the shear strength");
        }

        if(windLoad >= maximumFlexuralStrength && windLoad >= safetyMaximumFlexuralStrength) {
            System.out.println("Structural failure will occur due to a lack of maximum flexural strength");
        } 
        else if(windLoad < maximumFlexuralStrength && windLoad >= safetyMaximumFlexuralStrength) {
            System.out.println("The structure would survive, but is not deemed safe deu to a lack of maximum flexural strength");
        } 
        else {
            System.out.println("The structure is deemed safe, as the wind load is less than the maximum flexural strength");
        }

        if(windLoad >= bucklingStrength && windLoad >= safetyBucklingStrength) {
            System.out.println("Structural failure will occur due to a lack of buckling strength");
        } 
        else if(windLoad < bucklingStrength && windLoad >= safetyBucklingStrength) {
            System.out.println("The structure would survive, but is not deemed safe due to a lack of buckling strength");
        } 
        else {
            System.out.println("The structure is deemed safe, as the wind load is less than the buckling strength");
        }
    }
}
