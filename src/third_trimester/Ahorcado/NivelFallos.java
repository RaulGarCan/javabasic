package third_trimester.Ahorcado;

public enum NivelFallos {
    INICIO( " __________\n" +
            "|\n" +
            "|\n" +
            "|\n" +
            "|\n" +
            "|\n" +
            "=============\n" +
            "=           ="),
    SOGA(" __________\n" +
            "|          | \n" +
            "|\n" +
            "|\n" +
            "|\n" +
            "|\n" +
            "=============\n" +
            "=           ="),
    CABEZA(" __________\n" +
            "|          | \n" +
            "|          0\n" +
            "|\n" +
            "|\n" +
            "|\n" +
            "=============\n" +
            "=           ="),
    CUERPO(" __________\n" +
            "|          | \n" +
            "|          0\n" +
            "|          |\n" +
            "|\n" +
            "|\n" +
            "=============\n" +
            "=           ="),
    BRAZO1(" __________\n" +
            "|          | \n" +
            "|          0\n" +
            "|        --|\n" +
            "|\n" +
            "|\n" +
            "=============\n" +
            "=           ="),
    BRAZO2(" __________\n" +
            "|          | \n" +
            "|          0\n" +
            "|        --|--\n" +
            "|\n" +
            "|\n" +
            "=============\n" +
            "=           ="),
    PIERNA1(" __________\n" +
            "|          | \n" +
            "|          0\n" +
            "|        --|--\n" +
            "|         /\n" +
            "|\n" +
            "=============\n" +
            "=           ="),
    AHORCADO(" __________\n" +
            "|          | \n" +
            "|          0\n" +
            "|        --|--\n" +
            "|         / \\\n" +
            "|\n" +
            "=============\n" +
            "=           =");
    private String dibujo;
    NivelFallos(String dibujo){
        this.dibujo=dibujo;
    }
    @Override
    public String toString() {
        return this.dibujo;
    }
}
