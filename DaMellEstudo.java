/**

Um software de design gráfico precisa de um sistema para desenhar diferentes formas, 
como Círculo, Retângulo e Triângulo. Cada forma deve implementar uma interface que 
defina a funcionalidade básica de desenho, permitindo a adição de novas formas sem
modificar o código existente.
***/
interface SistemaDesenho{
    public void pontas();
}

class Circulo implements SistemaDesenho{
    public void pontas(){
        System.out.println("Círculo tem 0 pontas.");
    }
}

class Retangulo implements SistemaDesenho{
    public void pontas(){
        System.out.println("Retângulo tem 4 pontas.");
    }
}

class Triangulo implements SistemaDesenho{
    public void pontas(){
        System.out.println("Triângulo tem 3 pontas.");
    }
}

class Trigonometricos{
    SistemaDesenho sistema;

    public Trigonometricos(SistemaDesenho sistema){
        this.sistema = sistema;
    }

    public void grude(){
        sistema.pontas();
    }
}

public class Main{
    public static void main (String[] args){
        Trigonometricos circulo = new Trigonometricos(new Circulo());
        Trigonometricos triangulo = new Trigonometricos(new Triangulo());
        Trigonometricos retangulo = new Trigonometricos(new Retangulo());

        circulo.grude();
        triangulo.grude();
        retangulo.grude();
    }
}
