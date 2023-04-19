public class Fisico {

    Velocidade velocidade;
    VelocidadeAdapter persistencia;

    public Fisico() {
        velocidade = new QuilometroHora();
        persistencia = new VelocidadeAdapter(velocidade);
    }

    public void setVelocidade(float velocidadeMS) {
        persistencia.setVelocidadeMS(velocidadeMS);
        persistencia.mudarVelocidade();
    }

    public float getVelocidade() {
        return persistencia.mudarVelocidade();
    }
    public  float  getVel () {
        return  persistencia.reculperaVelocidade();
    }


}
