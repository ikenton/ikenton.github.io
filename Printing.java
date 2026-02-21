import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
class Printing {
    public static void main(String[] args) {
        String[] imageSources = {"images/art/gaygodesses1.png", "images/art/CassadraAnkarna.png", "images/art/JaneGrey.png", "images/art/strikingLight.png", "images/art/selfportrait 2024.png", "images/art/blymanor2.png", "images/art/FearStreet.png", "images/art/Ada.png", "images/art/velrisasWings.png", "images/art/the ball.png", "images/art/ruth.png", "images/art/r.png", "images/art/pt-marlon-trailer.png", "images/art/pt-hugo-trailer.png", "images/art/pt-courtyard.png", "images/art/pt-cage-tent.png", "images/art/pt-bonnie trailer.png", "images/art/pita underneath.png", "images/art/pfpFinal.png", "images/art/nick.png", "images/art/maya.png", "images/art/july.png", "images/art/ivy.png", "images/art/fae.png", "images/art/ed2.png", "images/art/ed1.png", "images/art/charlie.png", "images/art/NLU-Background-1.png", "images/art/GillianTidestrider.png"," images/art/Coterie-Final-Product.png"," images/art/BreeAndSelFin.png"," images/art/ringmaster-trailer.png"};

        String fileName = "paths.txt";
       

try (FileWriter writer = new FileWriter(fileName, true)) { 
          	
          	// true for append mode
          	for(int i = 0; i < imageSources.length; i++){
                writer.write("<div class=\"grid-item\" >\n\t<img src = \""+imageSources[i]+"\" alt=\"image "+i+"\">\n</div>\n");
            }
		} 
      	catch (IOException e) {
    		System.out.println("An error occurred while appending"
                               + " to the file: " + e.getMessage());
		}


        
    }
    
}
