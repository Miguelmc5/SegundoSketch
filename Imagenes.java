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
    // declaramos el objeto para poder tener acceso en toda la clase
    PImage alpaca2;
    // en este metodo tambien podemos meter configuraciones iniciales de nuestro sketch
    @Override
    public void setup() {
        // Quito el background para que se refresque el fondo y
        // no imprima la imagen con cada movimiento del ratón
        alpaca2 = loadImage(dataPath("alpaca2.jpg"));

    }
    // método principal.
    // ACUERDATE: esto se repite en bucle indefinidamente
    @Override
    public void draw() {
        background(200,100,0);

        //cambiamos el tono de color de la imagen(en este caso en rojo)
        tint(255,0,0);

        // cargamos la imagen en la ventana en cada iteración del bucle
        // posicionamos la imagen segun el movimiento del ratón
        image(alpaca2,mouseX,mouseY);

    }
}
