package second_trimester.pruebas.RogeMon;

class Enemigo {
    private int vidaMax;
    private int vida;
    private int ataque;
    public Enemigo(){
        this.ataque = 3; // 3 att + ([2, 4] * etapa)
        this.vida = 50+(Main.etapa*(3+(int)(5*Math.random()))); // 50 hp + ([3, 7] * etapa)
        this.vidaMax = vida;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }
    public void reducirVida(int damage){
        this.vida -= damage;
        if (vida<0){
            setVida(0);
        }
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getVidaMax() {
        return vidaMax;
    }

    public void setVidaMax(int vidaMax) {
        this.vidaMax = vidaMax;
    }
}
