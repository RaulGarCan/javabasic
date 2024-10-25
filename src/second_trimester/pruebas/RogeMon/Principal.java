package second_trimester.pruebas.RogeMon;

class Principal {
    private int vidaMax;
    private int vida;
    private int xp;
    private int ataque;
    private int monedas;
    private int usosDefensa;
    private int usosSubirAtaque;
    private int usosContraataque;
    private String movimientos;
    public Principal(){
        this.vida = 100;
        this.ataque = 5;
        this.movimientos = "Atacar | Defenderse ";
        this.vidaMax = vida;
    }
    public void reducirVida(int damage){
        this.vida -= damage;
        if (vida<0){
            setVida(0);
        }
    }
    public void ganarExperiencia(int experiencia){
        this.xp += experiencia;
        if (experiencia>=(100*(1+Main.etapa))){
            nuevaEtapa();
        }
    }
    public void aumentarVida(int damage){
        this.vida += (damage/2)+1;
        if (vida>vidaMax){
            setVida(vidaMax);
        }
    }
    public void addSubirAtaque(){
        this.movimientos += "| Subir Ataque";
    }
    public void addContraAtaque(){
        this.movimientos += " | Contraataque";
    }
    public void aumentarAtaque(int aumento){
        this.ataque+=aumento;
    }
    public void reiniciarAtaque(){
        setAtaque(5);
    }
    public void nuevaEtapa(){
        vida += 10;
        vidaMax += 10;
    }
    public int getVida() {
        return vida;
    }
    public void setVida(int vida) {
        this.vida = vida;
    }
    public int getXp() {
        return xp;
    }
    public void setXp(int xp) {
        this.xp = xp;
    }
    public int getAtaque() {
        return ataque;
    }
    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }
    public int getMonedas() {
        return monedas;
    }
    public void setMonedas(int monedas) {
        this.monedas = monedas;
    }
    public int getUsosDefensa() {
        return usosDefensa;
    }
    public void setUsosDefensa(int usosDefensa) {
        this.usosDefensa = usosDefensa;
    }
    public int getUsosSubirAtaque() {
        return usosSubirAtaque;
    }
    public void setUsosSubirAtaque(int usosSubirAtaque) {
        this.usosSubirAtaque = usosSubirAtaque;
    }
    public int getUsosContraataque() {
        return usosContraataque;
    }
    public void setUsosContraataque(int usosContraataque) {
        this.usosContraataque = usosContraataque;
    }
    public String getMovimientos() {
        return movimientos;
    }
    public void setMovimientos(String movimientos) {
        this.movimientos = movimientos;
    }
    public int getVidaMax() {
        return vidaMax;
    }
    public void setVidaMax(int vidaMax) {
        this.vidaMax = vidaMax;
    }
}
