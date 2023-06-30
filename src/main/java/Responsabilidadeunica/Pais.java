package Responsabilidadeunica;

import java.util.ArrayList;
import java.util.List;

public class Pais {
    private String codigoISO;
    private String nome;
    private long populacao;
    private double dimensao;
    private List<Pais> fronteiras;

    public Pais(String codigoISO, String nome, long populacao, double dimensao) {
        this.codigoISO = codigoISO;
        this.nome = nome;
        this.populacao = populacao;
        this.dimensao = dimensao;
        this.fronteiras = new ArrayList<>();
    }

    public String getCodigoISO() {
        return codigoISO;
    }

    public void setCodigoISO(String codigoISO) {
        this.codigoISO = codigoISO;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getPopulacao() {
        return populacao;
    }

    public void setPopulacao(long populacao) {
        this.populacao = populacao;
    }

    public double getDimensao() {
        return dimensao;
    }

    public void setDimensao(double dimensao) {
        this.dimensao = dimensao;
    }

    public boolean isVizinho(Pais outroPais) {
        return fronteiras.contains(outroPais);
    }

    public double getDensidadePopulacional() {
        return populacao / dimensao;
    }

    public List<Pais> getVizinhosComuns(Pais outroPais) {
        List<Pais> vizinhosComuns = new ArrayList<>();
        for (Pais pais : fronteiras) {
            if (outroPais.fronteiras.contains(pais)) {
                vizinhosComuns.add(pais);
            }
        }
        return vizinhosComuns;
    }

    public void adicionarFronteira(Pais pais) {
        fronteiras.add(pais);
        pais.fronteiras.add(this);
    }

}