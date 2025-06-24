import java.util.*;

public class Main {

    public static void main(String[] args) {
      
        PlanetaModel planeta = new PlanetaModel("Terra", 5.97224, true, 1);
        PlanetaView view = new PlanetaView();
        PlanetaController controller = new PlanetaController(planeta, view);
        controller.exibirDados();
    }
}
