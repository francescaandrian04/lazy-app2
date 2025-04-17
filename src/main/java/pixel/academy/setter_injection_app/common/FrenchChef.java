package pixel.academy.setter_injection_app.common;


import org.springframework.stereotype.Component;

@Component
public class FrenchChef implements Chef {

   @Override
   public String getDailyRecipe() {
       return "Preparez un Beouf avec vin rouge et herbes";
   }

}
