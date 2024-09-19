package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {
    //atributos
    private int cargaHoraria;

    //construtor
    public Curso() {
    }

    //metodos
    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }
    //getters and setters
    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    //to string

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }
}
