package pixel.academy.setter_injection.common;

import org.springframework.stereotype.Component;

@Component
public class MexicanChef implements Chef {
    @Override
    public String getDailyRecipe() {
        return "Prepara tacos ... !";
    }
}
