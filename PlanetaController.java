
public class PlanetaController{

    private PlanetaModel model;
    private PlanetaView view;

    public PlanetaController(PlanetaModel model, PlanetaView view) {
        this.model = model;
        this.view = view;
    }    

    public void setModel(PlanetaModel model) {
        this.model = model;
    }

    public void setView(PlanetaView view) {
        this.view = view;
    }

    public void exibirDados(){
        view.print(model.getNome(), model.getMassa(), model.isTemVida(), model.getLuas());
    }

}