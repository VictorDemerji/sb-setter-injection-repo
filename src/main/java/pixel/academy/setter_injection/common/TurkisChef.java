package pixel.academy.setter_injection.common;

import org.springframework.stereotype.Component;

@Component
public class TurkisChef implements Chef {
    @Override
    public String getDailyRecipe() {
        return "Prepara un kebab cu carne de miel, servit cu pilaf de orez si iaurt!";
    }
}
