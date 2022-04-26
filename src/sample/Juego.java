package sample;

public class Juego {
    int[][] panel = new int[3][3];
    int fichaColocada;
    int turno;

    public int[][] getPanel() {
        return panel;
    }

    public int getFichaColocada() {
        return fichaColocada;
    }

    public int getTurno() {
        return turno;
    }

    public Juego() {
        turno=((int) (Math.random()*2)+1);
    }

    public boolean posicionarFicha(int fila, int columna){
        if (panel[fila][columna]==0){
            panel[fila][columna]=turno;
            fichaColocada++;
            return true;
        }else{
            return false;
        }
    }
    
    public boolean comprobarFila(int fila){
        for (int j = 0; j < panel.length; j++) {
            if (panel[fila]!=turno){
                return false;
            }else{
                return true;
            }
        }
    }

    public boolean comprobarColumna(int columna){
        for (int i = 0; i < panel.length; i++) {
            if (panel[columna]!=turno){
                return false;
            }else{
                return true;
            }
        }
    }

    public boolean comprobarDiagonal(){
        //Diagonal principal

        for (int j = 0; j < panel.length; j++) {
            if (panel[i][j]!=turno){
                return false;
            }else{
                return true;
            }
        }

        //Diagonal secundaria

        for (int j = panel.length-1; j < 0; j--) {

        }
    }
}
