package third_trimester.Ahorcado.basedatos;

public class BD {
    //Variable donde almacenaremos todas las palabras para poder seleccionar una de ellas.
    protected String[] palabras;

    public BD(){
        //Constructor por defecto.

    }

    public String getRandomPalabra(){
        //Seleccionará una de las palabras de forma aleatoria y la devolverá.
        int random=(int)(Math.random()*this.palabras.length);
        return this.palabras[random];
    }
}

/*
Nivel 1 o principiante.

String[] lista = {"SOL", "LUNA", "CAMA", "FIN", "SAL", "GATO", "SEDA", "FOCO", "FOCA",
                "LORO", "TORO", "PATO", "PUMA", "FLOR", "COMA", "ROCA", "BOL", "LOBO", "LEON",
                "TIPO", "CELO", "PINO", "NUBE", "SER", "ENTE", "REAL", "OSO", "FILA", "REO",
                "ORCA", "PEZ", "FAZ", "MAPA"};
*/

/*
Nivel 2 o intermedio.

String[] lista = {"SOLAR", "LIMON", "LENTO", "RECTO", "CURVA", "ESTADO", "LUPULO", "CETRO", "MURAL",
                "PAJARO", "METODO", "PUNTAL", "LEMUR", "CEJAS", "GAFAS", "PERRO", "CAMARA", "CEUTA", "MADRID",
                "TIFON", "TIMON", "PIÑON", "PILON", "ESFERA", "CUADRO", "ESTOPA", "JUNCO", "JUNGLA", "TIGRE",
                "EXODO", "SALMON", "SUECO" };
*/

/*
Nivel 3 o experto.

String[] lista = {"SALARIO", "COCODRILO", "ELEFANTE", "ESCALADA", "BENCENO", "EXPLOSION", "INTERNET",
        "CERAMICA", "MURALLA", "ESTAMBUL", "EXOTICO", "INFANTE", "ELEGANTE", "RESTAURANTE", "LANGOSTA",
        "BIENVENIDO", "ELECTRODOMESTICO", "CENCERRADA", "BINOCULAR", "ESTANCIA", "ESPORADICO",
        "TRIPODE", "ASMATICO", "RINOCERONTE", "BASTION"};
*/