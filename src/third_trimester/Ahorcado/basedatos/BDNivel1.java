package third_trimester.Ahorcado.basedatos;

public class BDNivel1 extends BD{
    String[] lista = {"SOL", "LUNA", "CAMA", "FIN", "SAL", "GATO", "SEDA", "FOCO", "FOCA",
            "LORO", "TORO", "PATO", "PUMA", "FLOR", "COMA", "ROCA", "BOL", "LOBO", "LEON",
            "TIPO", "CELO", "PINO", "NUBE", "SER", "ENTE", "REAL", "OSO", "FILA", "REO",
            "ORCA", "PEZ", "FAZ", "MAPA"};
    public BDNivel1(){
        super.palabras = lista;
    }
}
