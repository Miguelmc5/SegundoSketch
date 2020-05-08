// importamos la libreria proncipal
import processing.core.PApplet;
import processing.core.PImage;

/** Hereda de PApplet, que es la clase padre que tiene todos los métodos
 * y atributos para usar Processing
 * Desde este fichero si le damos al triangulito verde a la izquierda
 * podemos ejecutar esta clase sin ser 'main'
 */
public class Imagenes extends PApplet {
    // definimos atributos para todoa la clase
    // es la ventana de salida de la aplicacion
    // en Processing las aplicaciones se llaman sketchs
    int viewport_w = 640; // ancho en pixels
    int viewport_h = 360; // alto en pixels

    // truco para poder ejecutar nuestro código
    // en el entorno gráfico ya creado
    public static void main(String args[]) {
        PApplet.main("Imagenes");
    }

    // método que tiene las configuraciones iniciales
    @Override
    public void settings() {
        size(viewport_w, viewport_h, P2D);
        smooth(8);
    }
    // declaramos los objetos para poder tener acceso en toda la clase
    PImage alpaca2;
    PImage brazo;
    PImage damian;
    PImage michu;
    PImage bola;
    PImage brazo2;

    // en este metodo tambien podemos meter configuraciones iniciales de nuestro sketch
    @Override
    public void setup() {
        // Muevo el background para que se refresque el fondo y
        // no imprima la imagen con cada movimiento del ratón
        brazo = loadImage(dataPath("bailaorBrazo1.png"));
        damian = loadImage(dataPath("bailaorDamian.png"));
        michu = loadImage(dataPath("bailaor1Michu.png"));
        bola = loadImage(dataPath("disco.png"));
        brazo2 = loadImage(dataPath("bailaorBrazo1.png"));

    }
    // método principal.
    // ACUERDATE: esto se repite en bucle indefinidamente
    @Override
    public void draw() {
        background(0);

        if(mousePressed){
// ponemos random en los colores para que vaya cambiando aletoriamente de color de fondo cuando se mantiene clicado
            background(random(255),random(255),random(255));

            image(bola,770,2);

            image(damian,-350,-700,1840,2740);
            image(brazo,mouseX,-620);

            image(michu,730,-540,1320,2450);
            image(brazo2,mouseX+500,-600);

        }

    }
}
