package pixel.academy.setter_injection.common;

import org.springframework.stereotype.Component;

@Component
public class FrenchChef implements Chef {
    @Override
    public String getDailyRecipe() {
        return "Preparez un Beun Bourguignon avec vin rouge et herbes!";
    }
}
