package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo{
    //atributos
    private int cargaHoraria;
    private LocalDate data;

    //construtor
    public Mentoria() {
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20;
    }

    //getters and setters
    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    //to string
    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                ", data=" + data +
                '}';
    }
}
