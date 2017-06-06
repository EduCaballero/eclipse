/**
 * Created by Raikish-sempai on 22/05/2017.
 * GitHub -> github.com/amcgamer/
 */
public class Horda {
    private String nombre;
    private int respawn;
    private int newRespawn = respawn;

    //Constructor
    public Horda(String nombre, int respawn) {
        this.nombre = nombre;
        this.respawn = respawn;
        caminar();
    }

    //Getter
    public String getNombre() {
        return nombre;
    }
    public int getRespawn() {
        return respawn;
    }
    //Setter
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setRespawn(int respawn) {
        this.respawn = respawn;
    }
    //Methods

    public void caminar(){
        respawn--;
        if(respawn == 0){
            morder();
        }
    }

    public void morder(){

        resetRespawn();
    }

    public void resetRespawn(){
        respawn = newRespawn;
    }

}
