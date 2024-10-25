package second_trimester.pruebas.RogeMon;

import java.util.Scanner;

class Main {
    public static int etapa = 0;
    public static boolean turno = true; // True = jugador | False = enemigo
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        Principal jugador = new Principal();
        boolean ejecucion = true;

        int contadorParaSalir = 0;
        int contadorPartidas = 0;
        int contadorOpciones = 0;
        int contadorDefaults = 0;
        int fixNextLines = 0;

        boolean defenderse = false; // Guarda si se defendió o no en el turno anterior
        int contadorDefensas = 3;
        boolean subirAtaque = false;
        boolean contraAtaque = false;

        do {
            // Menu
            System.out.println("\n¡Bienvenido a RogeMon! (Nombre sujeto a derechos de autor)");
            System.out.println("\n1.- Jugar");
            System.out.println("2.- Opciones");
            System.out.println("3.- Salir");
            //
            System.out.print("\nElige la opción: ");
            int opcion = userInput.nextInt();
            switch (opcion){
                case 1: // Juego
                    contadorPartidas++;
                    do {
                        System.out.println("\nEtapa actual: "+etapa+"\n");
                        Enemigo enemigo = new Enemigo();
                        while (enemigo.getVida()>0) {
                            if (turno) { // Turno jugador
                                System.out.println("Elige tu siguiente movimiento: " +jugador.getMovimientos());
                                if (fixNextLines==0) {
                                    userInput.nextLine();
                                    fixNextLines++;
                                }
                                String movimiento = userInput.nextLine().strip();
                                if (movimiento.equalsIgnoreCase("atacar")){
                                    int damage = jugador.getAtaque()+((int)((Math.random()*6)+5*etapa)); // Ataque del jugador = [ataque, 15] + (5 * etapa)
                                    //int damage = 100;
                                    System.out.println("\nHas hecho "+damage+" de daño a tu oponente.");
                                    enemigo.reducirVida(damage);
                                    System.out.println("Vida restante del oponente: "+enemigo.getVida()+"/"+enemigo.getVidaMax());
                                    if (jugador.getAtaque()!=5) {
                                        jugador.reiniciarAtaque();
                                    }
                                } else if ((movimiento.equalsIgnoreCase("defenderse")) && (contadorDefensas>0)) {
                                    System.out.println("Te estás defendiendo del próximo ataque.");
                                    contadorDefensas--;
                                    System.out.println("Defensas restantes: "+contadorDefensas+"/3");
                                    defenderse = true;
                                } else if ((movimiento.equalsIgnoreCase("subir ataque")) && (subirAtaque)) {
                                    int aumentoAtaque = 2+((int)(11*Math.random()));// Aumentar ataque [2,10]
                                    jugador.aumentarAtaque(aumentoAtaque);
                                    System.out.println("Tu ataque aumenta en: ");
                                } else if ((movimiento.equalsIgnoreCase("contraatacar")) && (contraAtaque)) {
                                    System.out.println("Has elegido contraatacar");
                                }
                            } else { // Turno enemigo
                                System.out.println("\nTurno del enemigo");
                                int ataqueEnemigo = (int)(2*Math.random()); // 50% de probabilidad de atacar
                                int damageEnemigo = enemigo.getAtaque()+((int)(Math.random()*5)+2*etapa); // Ataque del enemigo = [ataque, 7] + (2 * etapa)
                                if (ataqueEnemigo==0) {
                                    if (defenderse) {
                                        defenderse = false;
                                        jugador.aumentarVida(damageEnemigo);
                                        System.out.println("\nTe has curado " + ((damageEnemigo/2)+1) + " de vida. Vida restante: " + jugador.getVida() + "/" + jugador.getVidaMax());
                                    } else {
                                        jugador.reducirVida(damageEnemigo);
                                        System.out.println("\nEl enemigo te ha hecho " + damageEnemigo + " de daño. Vida restante: " + jugador.getVida() + "/" + jugador.getVidaMax());
                                    }
                                } else {
                                    System.out.println("El enemigo no ha realizado ningún ataque.");
                                }
                            }
                            turno = !turno;
                        }
                        if (contadorDefensas<3) {
                            contadorDefensas++;
                        }
                        int experienciaGanada = 7+(int)(7*Math.random()); // Experiencia ganada = [7, 13]
                        //int experienciaGanada = 90;
                        jugador.ganarExperiencia(experienciaGanada);
                        System.out.println("\n¡Has ganado "+experienciaGanada+" de experiencia!");
                        if (jugador.getXp()>=(100*(1+etapa))){
                            etapa++;
                            jugador.nuevaEtapa();
                            if (etapa==2){
                                subirAtaque = true; // Desbloquear subir ataque
                                jugador.addSubirAtaque();
                            } else if (etapa==3) {
                                contraAtaque = true; // Desbloquear contraataque
                                jugador.addContraAtaque();
                            }
                        }
                        System.out.println("Progreso hasta la siguiente etapa: "+jugador.getXp()+"/"+100*(1+etapa));
                        System.out.println("Vida actual: "+jugador.getVida()+"/"+ jugador.getVidaMax());
                        System.out.print("\n¿Quieres continuar? ");
                        if (!(userInput.next().strip().equalsIgnoreCase("si"))) {
                            System.out.println("Me la suda bastante tu respuesta, la verdad.");
                        }
                        fixNextLines = 0;
                        turno = true;
                    }while (jugador.getVida()>0);
                    System.out.println("Tu criatura en absoluto inspirada en Pokemon se ha ido a dormir (para siempre)");
                    break;
                case 2: // Opciones
                    if (contadorOpciones==0) {
                        System.out.println("\nNo sé hacer una interfaz gráfica y te crees que voy a hacer unas opciones??? JAJAJAJAJJAJA VAYA PUTO SUBNORMAL ERES");
                        contadorOpciones++;
                    } else {
                        System.out.println("\nDe hecho sí que las hay, elige dificultad bobo.");
                        System.out.println("\n1.- Fácil \n2.- Normal \n3.- Difícil");
                        System.out.print("\nDificultad: ");
                        opcion = userInput.nextInt();
                        switch (opcion){
                            default:
                                System.out.println("\nMe la suda lo que hayas elegido, me daba pereza implementar niveles de dificultad, esto es como los Souls.");
                                break;
                        }
                    }
                    break;
                case 3: // Salir
                    if (contadorParaSalir==3 && contadorPartidas==0){
                        System.out.println("\nVALE PESAO PUES VETE SIN PROBARLO, QUE TE DEN.");
                        ejecucion=false;
                    } else if(contadorParaSalir==0 && contadorPartidas==0) {
                        System.out.println("\n¡¿PERO COMO TE VAS A IR SIN ECHARTE NI UNA PARTIDA?!");
                        contadorParaSalir++;
                    } else if (contadorParaSalir==1 && contadorPartidas==0) {
                        System.out.println("\nPerdona por lo de antes, me puse algo violento, va anda juégate una aunque sea porfa.");
                        contadorParaSalir++;
                    } else if (contadorParaSalir==2 && contadorPartidas==0) {
                        System.out.println("\nTE PROMETO QUE NO TE VOY A DEJAR SALIR SI NO TE JUEGAS UNA COMO MÍNIMO EH.");
                        contadorParaSalir++;
                    } else {
                        System.out.print("\nSi abandonas todo tu progreso actual se perderá. ¿Estás seguro? ");
                        if (userInput.next().strip().equalsIgnoreCase("si")){
                            System.out.println("\n¡Hasta orta vez!");
                            ejecucion=false;
                        }
                    }
                    break;
                default:
                    if (contadorDefaults==5){
                        System.out.println("\nTe prometo que no había conocido a alguien tan subnormal hasta ahora...");
                        contadorDefaults++;
                        break;
                    }
                    System.out.println("\nEntiendo que no sabes leer, no pasa nada, inténtalo de nuevo.");
                    contadorDefaults++;
                    break;
            }
        }while (ejecucion);
    }
}
