interface ExportadorRelatorio {
    void exportar(String conteudo);
}

class ExportadorPDF implements ExportadorRelatorio {
    public void exportar(String conteudo) {
        System.out.println("Exportando relatório em formato PDF: " + conteudo);
    }
}

class ExportadorCSV implements ExportadorRelatorio {
    public void exportar(String conteudo) {
        System.out.println("Exportando relatório em formato CSV: " + conteudo);
    }
}

class Relatorio{
    private final ExportadorRelatorio exportador;

    public Relatorio(ExportadorRelatorio exportador){
        this.exportador = exportador;
    }

    public void gerar(String conteudo) {
        exportador.exportar(conteudo);
    }
}

public class Export{
    public static void main(String [] args){
        Relatorio relatorioPDF = new Relatorio(new ExportadorPDF());
        relatorioPDF.gerar("Relatório Anual: ");
    }
}