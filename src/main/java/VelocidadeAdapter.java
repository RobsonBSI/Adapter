public class VelocidadeAdapter extends MetroSegundo {

    private Velocidade adaptarVelocidade;


    public VelocidadeAdapter(Velocidade velocidade) {
        this.adaptarVelocidade = velocidade;
    }

    public float mudarVelocidade() {

        adaptarVelocidade.setVelocidade((float) (this.getVelocidadeMS()*3.6));

        return adaptarVelocidade.getVelocidade();
    }

    public float reculperaVelocidade() {

        return  this.setVelocidadeMS((float) (adaptarVelocidade.getVelocidade()/3.6));


    }

}
