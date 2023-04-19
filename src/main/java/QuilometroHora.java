public class QuilometroHora  implements Velocidade{
   private float velocidadeKmH ;

    @Override
    public float getVelocidade() {
        return this.velocidadeKmH;
    }

    @Override
    public float setVelocidade(float velocidade) {
        return this.velocidadeKmH= velocidade;
    }
}
